package typingsSlinky.reactNativeTextInputMask

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNativeEventAnonContentSizeAnonHeight extends js.Object {
  var nativeEvent: AnonContentSizeAnonHeight = js.native
}

object AnonNativeEventAnonContentSizeAnonHeight {
  @scala.inline
  def apply(nativeEvent: AnonContentSizeAnonHeight): AnonNativeEventAnonContentSizeAnonHeight = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNativeEventAnonContentSizeAnonHeight]
  }
  @scala.inline
  implicit class AnonNativeEventAnonContentSizeAnonHeightOps[Self <: AnonNativeEventAnonContentSizeAnonHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNativeEvent(value: AnonContentSizeAnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

