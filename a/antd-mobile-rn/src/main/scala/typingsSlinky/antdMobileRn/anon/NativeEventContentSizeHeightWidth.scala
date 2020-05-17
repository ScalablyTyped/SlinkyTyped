package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeEventContentSizeHeightWidth extends js.Object {
  var nativeEvent: ContentSizeHeightWidth = js.native
}

object NativeEventContentSizeHeightWidth {
  @scala.inline
  def apply(nativeEvent: ContentSizeHeightWidth): NativeEventContentSizeHeightWidth = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeEventContentSizeHeightWidth]
  }
  @scala.inline
  implicit class NativeEventContentSizeHeightWidthOps[Self <: NativeEventContentSizeHeightWidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNativeEvent(value: ContentSizeHeightWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

