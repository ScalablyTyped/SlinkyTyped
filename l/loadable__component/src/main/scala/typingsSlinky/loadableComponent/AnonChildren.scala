package typingsSlinky.loadableComponent

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren[TModule] extends js.Object {
  var children: js.UndefOr[js.Function1[/* module */ TModule, TagMod[Any]]] = js.undefined
  var fallback: js.UndefOr[ReactElement] = js.undefined
  var ref: js.UndefOr[Ref[TModule]] = js.undefined
}

object AnonChildren {
  @scala.inline
  def apply[TModule](
    children: /* module */ TModule => TagMod[Any] = null,
    fallback: ReactElement = null,
    ref: Ref[TModule] = null
  ): AnonChildren[TModule] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren[TModule]]
  }
}

