package typingsSlinky.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProtectionStatusResponse extends js.Object {
  /**
    * The ID of the AWS Firewall administrator account for this policy.
    */
  var AdminAccountId: js.UndefOr[AWSAccountId] = js.native
  /**
    * Details about the attack, including the following:   Attack type   Account ID   ARN of the resource attacked   Start time of the attack   End time of the attack (ongoing attacks will not have an end time)   The details are in JSON format. 
    */
  var Data: js.UndefOr[ProtectionData] = js.native
  /**
    * If you have more objects than the number that you specified for MaxResults in the request, the response includes a NextToken value. To list more objects, submit another GetProtectionStatus request, and specify the NextToken value from the response in the NextToken value in the next request. AWS SDKs provide auto-pagination that identify NextToken in a response and make subsequent request calls automatically on your behalf. However, this feature is not supported by GetProtectionStatus. You must submit subsequent requests with NextToken using your own processes. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The service type that is protected by the policy. Currently, this is always SHIELD_ADVANCED.
    */
  var ServiceType: js.UndefOr[SecurityServiceType] = js.native
}

object GetProtectionStatusResponse {
  @scala.inline
  def apply(): GetProtectionStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProtectionStatusResponse]
  }
  @scala.inline
  implicit class GetProtectionStatusResponseOps[Self <: GetProtectionStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdminAccountId(value: AWSAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdminAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdminAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdminAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: ProtectionData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
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
    @scala.inline
    def withServiceType(value: SecurityServiceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceType")(js.undefined)
        ret
    }
  }
  
}

