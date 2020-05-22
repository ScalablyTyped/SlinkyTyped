package typingsSlinky.jsfl.anon

import typingsSlinky.jsfl.FlashFrame
import typingsSlinky.jsfl.FlashLayer
import typingsSlinky.jsfl.FlashTimeline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyframe extends js.Object {
  var keyframe: FlashFrame
  var layer: FlashLayer
  var parent: js.Any
  var timeline: FlashTimeline
}

object Keyframe {
  @scala.inline
  def apply(keyframe: FlashFrame, layer: FlashLayer, parent: js.Any, timeline: FlashTimeline): Keyframe = {
    val __obj = js.Dynamic.literal(keyframe = keyframe.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyframe]
  }
}

