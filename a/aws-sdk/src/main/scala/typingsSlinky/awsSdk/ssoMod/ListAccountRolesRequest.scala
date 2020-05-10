package typingsSlinky.awsSdk.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAccountRolesRequest extends js.Object {
  /**
    * The token issued by the CreateToken API call. For more information, see CreateToken in the AWS SSO OIDC API Reference Guide.
    */
  var accessToken: AccessTokenType = js.native
  /**
    * The identifier for the AWS account that is assigned to the user.
    */
  var accountId: AccountIdType = js.native
  /**
    * The number of items that clients can request per page.
    */
  var maxResults: js.UndefOr[MaxResultType] = js.native
  /**
    * The page token from the previous response output when you request subsequent pages.
    */
  var nextToken: js.UndefOr[NextTokenType] = js.native
}

object ListAccountRolesRequest {
  @scala.inline
  def apply(accessToken: AccessTokenType, accountId: AccountIdType): ListAccountRolesRequest = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], accountId = accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccountRolesRequest]
  }
  @scala.inline
  implicit class ListAccountRolesRequestOps[Self <: ListAccountRolesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessToken(value: AccessTokenType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountId(value: AccountIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextTokenType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

