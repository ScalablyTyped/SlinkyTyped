package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAWSServiceAccessForOrganizationResponse extends js.Object {
  /**
    * A list of the service principals for the services that are enabled to integrate with your organization. Each principal is a structure that includes the name and the date that it was enabled for integration with AWS Organizations.
    */
  var EnabledServicePrincipals: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.EnabledServicePrincipals] = js.native
  /**
    * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.NextToken] = js.native
}

object ListAWSServiceAccessForOrganizationResponse {
  @scala.inline
  def apply(): ListAWSServiceAccessForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAWSServiceAccessForOrganizationResponse]
  }
  @scala.inline
  implicit class ListAWSServiceAccessForOrganizationResponseOps[Self <: ListAWSServiceAccessForOrganizationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabledServicePrincipals(value: EnabledServicePrincipals): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnabledServicePrincipals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledServicePrincipals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnabledServicePrincipals")(js.undefined)
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

