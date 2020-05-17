package typingsSlinky.reactNative.anon

import typingsSlinky.reactNative.mod.LayoutAnimationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EaseInEaseOut extends js.Object {
  var easeInEaseOut: LayoutAnimationConfig = js.native
  var linear: LayoutAnimationConfig = js.native
  var spring: LayoutAnimationConfig = js.native
}

object EaseInEaseOut {
  @scala.inline
  def apply(easeInEaseOut: LayoutAnimationConfig, linear: LayoutAnimationConfig, spring: LayoutAnimationConfig): EaseInEaseOut = {
    val __obj = js.Dynamic.literal(easeInEaseOut = easeInEaseOut.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], spring = spring.asInstanceOf[js.Any])
    __obj.asInstanceOf[EaseInEaseOut]
  }
  @scala.inline
  implicit class EaseInEaseOutOps[Self <: EaseInEaseOut] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEaseInEaseOut(value: LayoutAnimationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInEaseOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinear(value: LayoutAnimationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpring(value: LayoutAnimationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spring")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

