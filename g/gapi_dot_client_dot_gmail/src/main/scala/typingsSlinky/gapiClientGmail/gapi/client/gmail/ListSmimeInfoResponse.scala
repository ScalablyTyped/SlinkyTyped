package typingsSlinky.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSmimeInfoResponse extends js.Object {
  /** List of SmimeInfo. */
  var smimeInfo: js.UndefOr[js.Array[SmimeInfo]] = js.native
}

object ListSmimeInfoResponse {
  @scala.inline
  def apply(): ListSmimeInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSmimeInfoResponse]
  }
  @scala.inline
  implicit class ListSmimeInfoResponseOps[Self <: ListSmimeInfoResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSmimeInfo(value: js.Array[SmimeInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smimeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmimeInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smimeInfo")(js.undefined)
        ret
    }
  }
  
}

