package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBlacklistReportsRequest extends js.Object {
  /**
    * A list of IP addresses that you want to retrieve blacklist information about. You can only specify the dedicated IP addresses that you use to send email using Amazon SES or Amazon Pinpoint.
    */
  var BlacklistItemNames: typingsSlinky.awsSdk.sesv2Mod.BlacklistItemNames = js.native
}

object GetBlacklistReportsRequest {
  @scala.inline
  def apply(BlacklistItemNames: BlacklistItemNames): GetBlacklistReportsRequest = {
    val __obj = js.Dynamic.literal(BlacklistItemNames = BlacklistItemNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlacklistReportsRequest]
  }
  @scala.inline
  implicit class GetBlacklistReportsRequestOps[Self <: GetBlacklistReportsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlacklistItemNames(value: BlacklistItemNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlacklistItemNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

