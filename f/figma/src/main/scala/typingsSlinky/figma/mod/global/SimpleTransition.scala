package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.DISSOLVE
import typingsSlinky.figma.figmaStrings.SMART_ANIMATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleTransition extends Transition {
  val duration: Double = js.native
  val easing: Easing = js.native
  val `type`: DISSOLVE | SMART_ANIMATE = js.native
}

object SimpleTransition {
  @scala.inline
  def apply(duration: Double, easing: Easing, `type`: DISSOLVE | SMART_ANIMATE): SimpleTransition = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleTransition]
  }
  @scala.inline
  implicit class SimpleTransitionOps[Self <: SimpleTransition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEasing(value: Easing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: DISSOLVE | SMART_ANIMATE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

