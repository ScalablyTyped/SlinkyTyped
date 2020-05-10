package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectivityInfoResponse extends js.Object {
  /**
    * Connectivity info list.
    */
  var ConnectivityInfo: js.UndefOr[listOfConnectivityInfo] = js.native
  /**
    * A message about the connectivity info request.
    */
  var Message: js.UndefOr[string] = js.native
}

object GetConnectivityInfoResponse {
  @scala.inline
  def apply(): GetConnectivityInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectivityInfoResponse]
  }
  @scala.inline
  implicit class GetConnectivityInfoResponseOps[Self <: GetConnectivityInfoResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectivityInfo(value: listOfConnectivityInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectivityInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectivityInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectivityInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
  }
  
}

