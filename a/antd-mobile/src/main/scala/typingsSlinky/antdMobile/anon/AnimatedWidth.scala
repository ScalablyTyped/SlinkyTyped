package typingsSlinky.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimatedWidth extends js.Object {
  var animatedWidth: Double = js.native
  var overflowWidth: Double = js.native
}

object AnimatedWidth {
  @scala.inline
  def apply(animatedWidth: Double, overflowWidth: Double): AnimatedWidth = {
    val __obj = js.Dynamic.literal(animatedWidth = animatedWidth.asInstanceOf[js.Any], overflowWidth = overflowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedWidth]
  }
  @scala.inline
  implicit class AnimatedWidthOps[Self <: AnimatedWidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimatedWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animatedWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverflowWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

