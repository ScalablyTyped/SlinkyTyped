package typingsSlinky.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayRequest extends js.Object {
  var customData: js.Object = js.native
}

object PlayRequest {
  @scala.inline
  def apply(customData: js.Object): PlayRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayRequest]
  }
  @scala.inline
  implicit class PlayRequestOps[Self <: PlayRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

