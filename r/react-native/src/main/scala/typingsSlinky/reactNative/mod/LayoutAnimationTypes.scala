package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutAnimationTypes extends js.Object {
  var easeIn: String = js.native
  var easeInEaseOut: String = js.native
  var easeOut: String = js.native
  var keyboard: String = js.native
  var linear: String = js.native
  var spring: String = js.native
}

object LayoutAnimationTypes {
  @scala.inline
  def apply(
    easeIn: String,
    easeInEaseOut: String,
    easeOut: String,
    keyboard: String,
    linear: String,
    spring: String
  ): LayoutAnimationTypes = {
    val __obj = js.Dynamic.literal(easeIn = easeIn.asInstanceOf[js.Any], easeInEaseOut = easeInEaseOut.asInstanceOf[js.Any], easeOut = easeOut.asInstanceOf[js.Any], keyboard = keyboard.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], spring = spring.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutAnimationTypes]
  }
  @scala.inline
  implicit class LayoutAnimationTypesOps[Self <: LayoutAnimationTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEaseIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseInEaseOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeInEaseOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboard(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpring(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spring")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

