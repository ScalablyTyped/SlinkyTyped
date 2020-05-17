package typingsSlinky.rcMenu.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Amazon extends js.Object {
  var amazon: Phone = js.native
  var android: Phone = js.native
  var any: js.Any = js.native
  var apple: Device = js.native
  var other: Blackberry = js.native
  var phone: js.Any = js.native
  var tablet: js.Any = js.native
  var windows: Phone = js.native
}

object Amazon {
  @scala.inline
  def apply(
    amazon: Phone,
    android: Phone,
    any: js.Any,
    apple: Device,
    other: Blackberry,
    phone: js.Any,
    tablet: js.Any,
    windows: Phone
  ): Amazon = {
    val __obj = js.Dynamic.literal(amazon = amazon.asInstanceOf[js.Any], android = android.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], apple = apple.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amazon]
  }
  @scala.inline
  implicit class AmazonOps[Self <: Amazon] (val x: Self) extends AnyVal {
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
    def withAny(value: js.Any): Self = {
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
    def withPhone(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTablet(value: js.Any): Self = {
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

