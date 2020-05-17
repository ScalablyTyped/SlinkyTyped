package typingsSlinky.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimatedBoolean extends js.Object {
  var animated: Boolean = js.native
}

object AnimatedBoolean {
  @scala.inline
  def apply(animated: Boolean): AnimatedBoolean = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedBoolean]
  }
  @scala.inline
  implicit class AnimatedBooleanOps[Self <: AnimatedBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

