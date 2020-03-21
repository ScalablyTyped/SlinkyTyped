package typingsSlinky.ismobilejs.isMobileMod

import typingsSlinky.ismobilejs.AnonBlackberry
import typingsSlinky.ismobilejs.AnonDevice
import typingsSlinky.ismobilejs.AnonPhone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait isMobileResult extends js.Object {
  var amazon: AnonPhone
  var android: AnonPhone
  var any: Boolean
  var apple: AnonDevice
  var other: AnonBlackberry
  var phone: Boolean
  var tablet: Boolean
  var windows: AnonPhone
}

object isMobileResult {
  @scala.inline
  def apply(
    amazon: AnonPhone,
    android: AnonPhone,
    any: Boolean,
    apple: AnonDevice,
    other: AnonBlackberry,
    phone: Boolean,
    tablet: Boolean,
    windows: AnonPhone
  ): isMobileResult = {
    val __obj = js.Dynamic.literal(amazon = amazon.asInstanceOf[js.Any], android = android.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], apple = apple.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[isMobileResult]
  }
}

