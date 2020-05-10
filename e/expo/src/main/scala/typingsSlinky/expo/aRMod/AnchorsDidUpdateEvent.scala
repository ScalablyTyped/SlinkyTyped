package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorsDidUpdateEvent extends js.Object {
  var anchors: js.Array[Anchor] = js.native
  var eventType: AnchorEventType = js.native
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
    def withAnchors(value: js.Array[Anchor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventType(value: AnchorEventType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

