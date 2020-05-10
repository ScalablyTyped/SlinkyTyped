package typingsSlinky.rmcInputNumber

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRegisteredStyleBrand extends js.Object {
  var __registeredStyleBrand: ViewStyle | TextStyle | ImageStyle = js.native
}

object AnonRegisteredStyleBrand {
  @scala.inline
  def apply(__registeredStyleBrand: ViewStyle | TextStyle | ImageStyle): AnonRegisteredStyleBrand = {
    val __obj = js.Dynamic.literal(__registeredStyleBrand = __registeredStyleBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRegisteredStyleBrand]
  }
  @scala.inline
  implicit class AnonRegisteredStyleBrandOps[Self <: AnonRegisteredStyleBrand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__registeredStyleBrand(value: ViewStyle | TextStyle | ImageStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__registeredStyleBrand")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

