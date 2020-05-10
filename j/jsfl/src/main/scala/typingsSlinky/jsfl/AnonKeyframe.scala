package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKeyframe extends js.Object {
  var keyframe: FlashFrame = js.native
  var layer: FlashLayer = js.native
  var parent: js.Any = js.native
  var timeline: FlashTimeline = js.native
}

object AnonKeyframe {
  @scala.inline
  def apply(keyframe: FlashFrame, layer: FlashLayer, parent: js.Any, timeline: FlashTimeline): AnonKeyframe = {
    val __obj = js.Dynamic.literal(keyframe = keyframe.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyframe]
  }
  @scala.inline
  implicit class AnonKeyframeOps[Self <: AnonKeyframe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyframe(value: FlashFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyframe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayer(value: FlashLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeline(value: FlashTimeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

