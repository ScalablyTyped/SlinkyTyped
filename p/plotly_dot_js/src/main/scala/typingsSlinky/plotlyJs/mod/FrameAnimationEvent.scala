package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.AnonFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameAnimationEvent extends js.Object {
  var animation: AnonFrame = js.native
  var frame: Frame = js.native
  var name: String = js.native
}

object FrameAnimationEvent {
  @scala.inline
  def apply(animation: AnonFrame, frame: Frame, name: String): FrameAnimationEvent = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameAnimationEvent]
  }
  @scala.inline
  implicit class FrameAnimationEventOps[Self <: FrameAnimationEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: AnonFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrame(value: Frame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

