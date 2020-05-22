package typingsSlinky.nteractTransformVdom.objectToReactMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VDOMEl extends js.Object {
  var attributes: Attributes
  var children: TagMod[Any] | VDOMEl | (js.Array[TagMod[Any] | VDOMEl])
  var eventHandlers: js.UndefOr[EventHandlers] = js.undefined
  var key: Double | String | Null
  var tagName: String
}

object VDOMEl {
  @scala.inline
  def apply(
    attributes: Attributes,
    tagName: String,
    children: TagMod[Any] | VDOMEl | (js.Array[TagMod[Any] | VDOMEl]) = null,
    eventHandlers: EventHandlers = null,
    key: Double | String = null
  ): VDOMEl = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (eventHandlers != null) __obj.updateDynamic("eventHandlers")(eventHandlers.asInstanceOf[js.Any])
    __obj.asInstanceOf[VDOMEl]
  }
}

