package typingsSlinky.rcMenu.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Amazon extends js.Object {
  var amazon: Phone
  var android: Phone
  var any: js.Any
  var apple: Device
  var other: Blackberry
  var phone: js.Any
  var tablet: js.Any
  var windows: Phone
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmazon(value: Phone): Self = this.set("amazon", value.asInstanceOf[js.Any])
    @scala.inline
    def setAndroid(value: Phone): Self = this.set("android", value.asInstanceOf[js.Any])
    @scala.inline
    def setAny(value: js.Any): Self = this.set("any", value.asInstanceOf[js.Any])
    @scala.inline
    def setApple(value: Device): Self = this.set("apple", value.asInstanceOf[js.Any])
    @scala.inline
    def setOther(value: Blackberry): Self = this.set("other", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhone(value: js.Any): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def setTablet(value: js.Any): Self = this.set("tablet", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindows(value: Phone): Self = this.set("windows", value.asInstanceOf[js.Any])
  }
  
}

