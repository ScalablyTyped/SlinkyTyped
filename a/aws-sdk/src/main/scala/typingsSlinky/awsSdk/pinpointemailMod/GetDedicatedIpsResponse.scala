package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDedicatedIpsResponse extends js.Object {
  /**
    * A list of dedicated IP addresses that are reserved for use by your Amazon Pinpoint account.
    */
  var DedicatedIps: js.UndefOr[DedicatedIpList] = js.native
  /**
    * A token that indicates that there are additional dedicated IP addresses to list. To view additional addresses, issue another request to GetDedicatedIps, passing this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.NextToken] = js.native
}

object GetDedicatedIpsResponse {
  @scala.inline
  def apply(): GetDedicatedIpsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDedicatedIpsResponse]
  }
  @scala.inline
  implicit class GetDedicatedIpsResponseOps[Self <: GetDedicatedIpsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDedicatedIps(value: DedicatedIpList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DedicatedIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDedicatedIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DedicatedIps")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

