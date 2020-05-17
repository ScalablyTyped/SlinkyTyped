package typingsSlinky.ismobilejs.isMobileMod

import typingsSlinky.ismobilejs.anon.Blackberry
import typingsSlinky.ismobilejs.anon.Device
import typingsSlinky.ismobilejs.anon.Phone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait isMobileResult extends js.Object {
  var amazon: Phone = js.native
  var android: Phone = js.native
  var any: Boolean = js.native
  var apple: Device = js.native
  var other: Blackberry = js.native
  var phone: Boolean = js.native
  var tablet: Boolean = js.native
  var windows: Phone = js.native
}

object isMobileResult {
  @scala.inline
  def apply(
    amazon: Phone,
    android: Phone,
    any: Boolean,
    apple: Device,
    other: Blackberry,
    phone: Boolean,
    tablet: Boolean,
    windows: Phone
  ): isMobileResult = {
    val __obj = js.Dynamic.literal(amazon = amazon.asInstanceOf[js.Any], android = android.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], apple = apple.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[isMobileResult]
  }
  @scala.inline
  implicit class isMobileResultOps[Self <: isMobileResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmazon(value: Phone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amazon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroid(value: Phone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAny(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("any")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApple(value: Device): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOther(value: Blackberry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTablet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindows(value: Phone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

