package typingsSlinky.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiverDisplayStatus extends js.Object {
  var appImages: js.Array[Image] = js.native
  var statusText: String = js.native
}

object ReceiverDisplayStatus {
  @scala.inline
  def apply(appImages: js.Array[Image], statusText: String): ReceiverDisplayStatus = {
    val __obj = js.Dynamic.literal(appImages = appImages.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiverDisplayStatus]
  }
  @scala.inline
  implicit class ReceiverDisplayStatusOps[Self <: ReceiverDisplayStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppImages(value: js.Array[Image]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

