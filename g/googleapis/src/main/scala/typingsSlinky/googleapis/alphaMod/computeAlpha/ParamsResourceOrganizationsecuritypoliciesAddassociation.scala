package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceOrganizationsecuritypoliciesAddassociation extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Indicates whether or not to replace it if an association of the
    * attachment already exists. This is false by default, in which case an
    * error will be returned if an assocation already exists.
    */
  var replaceExistingAssociation: js.UndefOr[Boolean] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSecurityPolicyAssociation] = js.native
  /**
    * An optional request ID to identify requests. Specify a unique request ID
    * so that if you must retry your request, the server will know to ignore
    * the request if it has already been completed.  For example, consider a
    * situation where you make an initial request and the request times out. If
    * you make the request again with the same request ID, the server can check
    * if original operation with the same request ID was received, and if so,
    * will ignore the second request. This prevents clients from accidentally
    * creating duplicate commitments.  The request ID must be a valid UUID with
    * the exception that zero UUID is not supported
    * (00000000-0000-0000-0000-000000000000).
    */
  var requestId: js.UndefOr[String] = js.native
  /**
    * Name of the security policy to update.
    */
  var securityPolicy: js.UndefOr[String] = js.native
}

object ParamsResourceOrganizationsecuritypoliciesAddassociation {
  @scala.inline
  def apply(): ParamsResourceOrganizationsecuritypoliciesAddassociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsecuritypoliciesAddassociation]
  }
  @scala.inline
  implicit class ParamsResourceOrganizationsecuritypoliciesAddassociationOps[Self <: ParamsResourceOrganizationsecuritypoliciesAddassociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceExistingAssociation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceExistingAssociation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceExistingAssociation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceExistingAssociation")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestBody(value: SchemaSecurityPolicyAssociation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityPolicy")(js.undefined)
        ret
    }
  }
  
}

