package typingsSlinky.reactIntl.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props3[V /* <: Record[String, _] */] extends MessageDescriptor {
  var children: js.UndefOr[js.Function1[/* nodes */ ReactNodeArray, TagMod[Any]]] = js.undefined
  var tagName: js.UndefOr[ReactElement] = js.undefined
  var values: js.UndefOr[V] = js.undefined
}

object Props3 {
  @scala.inline
  def apply[V /* <: Record[String, _] */](
    children: /* nodes */ ReactNodeArray => TagMod[Any] = null,
    defaultMessage: String = null,
    description: String | js.Object = null,
    id: String | Double = null,
    tagName: ReactElement = null,
    values: V = null
  ): Props3[V] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (defaultMessage != null) __obj.updateDynamic("defaultMessage")(defaultMessage.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props3[V]]
  }
}

