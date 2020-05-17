package typingsSlinky.jsfl.anon

import typingsSlinky.jsfl.FlashFrame
import typingsSlinky.jsfl.FlashLayer
import typingsSlinky.jsfl.FlashTimeline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keyframe extends js.Object {
  var keyframe: FlashFrame = js.native
  var layer: FlashLayer = js.native
  var parent: js.Any = js.native
  var timeline: FlashTimeline = js.native
}

object Keyframe {
  @scala.inline
  def apply(keyframe: FlashFrame, layer: FlashLayer, parent: js.Any, timeline: FlashTimeline): Keyframe = {
    val __obj = js.Dynamic.literal(keyframe = keyframe.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyframe]
  }
  @scala.inline
  implicit class KeyframeOps[Self <: Keyframe] (val x: Self) extends AnyVal {
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

