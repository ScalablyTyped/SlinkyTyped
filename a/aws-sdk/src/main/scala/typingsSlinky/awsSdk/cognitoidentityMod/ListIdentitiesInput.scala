package typingsSlinky.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIdentitiesInput extends js.Object {
  /**
    * An optional boolean parameter that allows you to hide disabled identities. If omitted, the ListIdentities API will include disabled identities in the response.
    */
  var HideDisabled: js.UndefOr[typingsSlinky.awsSdk.cognitoidentityMod.HideDisabled] = js.native
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typingsSlinky.awsSdk.cognitoidentityMod.IdentityPoolId = js.native
  /**
    * The maximum number of identities to return.
    */
  var MaxResults: QueryLimit = js.native
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.native
}

object ListIdentitiesInput {
  @scala.inline
  def apply(IdentityPoolId: IdentityPoolId, MaxResults: QueryLimit): ListIdentitiesInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], MaxResults = MaxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentitiesInput]
  }
  @scala.inline
  implicit class ListIdentitiesInputOps[Self <: ListIdentitiesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentityPoolId(value: IdentityPoolId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: QueryLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideDisabled(value: HideDisabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HideDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HideDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationKey): Self = {
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

