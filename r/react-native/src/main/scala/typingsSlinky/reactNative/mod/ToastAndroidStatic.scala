package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastAndroidStatic extends js.Object {
  var BOTTOM: Double = js.native
  var CENTER: Double = js.native
  var LONG: Double = js.native
  // Toast duration constants
  var SHORT: Double = js.native
  // Toast gravity constants
  var TOP: Double = js.native
  /**
    * String message: A string with the text to toast
    * int duration: The duration of the toast.
    * May be ToastAndroid.SHORT or ToastAndroid.LONG
    */
  def show(message: String, duration: Double): Unit = js.native
  /** `gravity` may be ToastAndroid.TOP, ToastAndroid.BOTTOM, ToastAndroid.CENTER */
  def showWithGravity(message: String, duration: Double, gravity: Double): Unit = js.native
}

object ToastAndroidStatic {
  @scala.inline
  def apply(
    BOTTOM: Double,
    CENTER: Double,
    LONG: Double,
    SHORT: Double,
    TOP: Double,
    show: (String, Double) => Unit,
    showWithGravity: (String, Double, Double) => Unit
  ): ToastAndroidStatic = {
    val __obj = js.Dynamic.literal(BOTTOM = BOTTOM.asInstanceOf[js.Any], CENTER = CENTER.asInstanceOf[js.Any], LONG = LONG.asInstanceOf[js.Any], SHORT = SHORT.asInstanceOf[js.Any], TOP = TOP.asInstanceOf[js.Any], show = js.Any.fromFunction2(show), showWithGravity = js.Any.fromFunction3(showWithGravity))
    __obj.asInstanceOf[ToastAndroidStatic]
  }
  @scala.inline
  implicit class ToastAndroidStaticOps[Self <: ToastAndroidStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBOTTOM(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCENTER(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CENTER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLONG(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LONG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHORT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHORT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOP(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow(value: (String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShowWithGravity(value: (String, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWithGravity")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

