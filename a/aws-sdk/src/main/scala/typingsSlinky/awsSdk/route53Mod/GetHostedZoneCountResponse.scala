package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHostedZoneCountResponse extends js.Object {
  /**
    * The total number of public and private hosted zones that are associated with the current AWS account.
    */
  var HostedZoneCount: typingsSlinky.awsSdk.route53Mod.HostedZoneCount = js.native
}

object GetHostedZoneCountResponse {
  @scala.inline
  def apply(HostedZoneCount: HostedZoneCount): GetHostedZoneCountResponse = {
    val __obj = js.Dynamic.literal(HostedZoneCount = HostedZoneCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostedZoneCountResponse]
  }
  @scala.inline
  implicit class GetHostedZoneCountResponseOps[Self <: GetHostedZoneCountResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostedZoneCount(value: HostedZoneCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostedZoneCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

