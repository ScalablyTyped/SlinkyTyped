package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWebsiteCertificateAuthorityRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsSlinky.awsSdk.worklinkMod.FleetArn = js.native
  /**
    * A unique identifier for the certificate authority.
    */
  var WebsiteCaId: Id = js.native
}

object DescribeWebsiteCertificateAuthorityRequest {
  @scala.inline
  def apply(FleetArn: FleetArn, WebsiteCaId: Id): DescribeWebsiteCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any], WebsiteCaId = WebsiteCaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWebsiteCertificateAuthorityRequest]
  }
  @scala.inline
  implicit class DescribeWebsiteCertificateAuthorityRequestOps[Self <: DescribeWebsiteCertificateAuthorityRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFleetArn(value: FleetArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebsiteCaId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebsiteCaId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

