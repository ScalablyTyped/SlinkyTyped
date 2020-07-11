package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorsDidUpdateEvent extends js.Object {
  var anchors: js.Array[Anchor]
  var eventType: AnchorEventType
}

object AnchorsDidUpdateEvent {
  @scala.inline
  def apply(anchors: js.Array[Anchor], eventType: AnchorEventType): AnchorsDidUpdateEvent = {
    val __obj = js.Dynamic.literal(anchors = anchors.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorsDidUpdateEvent]
  }
  @scala.inline
  implicit class AnchorsDidUpdateEventOps[Self <: AnchorsDidUpdateEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnchorsVarargs(value: Anchor*): Self = this.set("anchors", js.Array(value :_*))
    @scala.inline
    def setAnchors(value: js.Array[Anchor]): Self = this.set("anchors", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventType(value: AnchorEventType): Self = this.set("eventType", value.asInstanceOf[js.Any])
  }
  
}

