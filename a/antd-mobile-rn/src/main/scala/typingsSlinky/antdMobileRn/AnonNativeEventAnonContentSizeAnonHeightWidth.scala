package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNativeEventAnonContentSizeAnonHeightWidth extends js.Object {
  var nativeEvent: AnonContentSizeAnonHeightWidth = js.native
}

object AnonNativeEventAnonContentSizeAnonHeightWidth {
  @scala.inline
  def apply(nativeEvent: AnonContentSizeAnonHeightWidth): AnonNativeEventAnonContentSizeAnonHeightWidth = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNativeEventAnonContentSizeAnonHeightWidth]
  }
  @scala.inline
  implicit class AnonNativeEventAnonContentSizeAnonHeightWidthOps[Self <: AnonNativeEventAnonContentSizeAnonHeightWidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNativeEvent(value: AnonContentSizeAnonHeightWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

