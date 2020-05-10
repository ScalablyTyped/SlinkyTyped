package typingsSlinky.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIdentityPoolsResponse extends js.Object {
  /**
    * The identity pools returned by the ListIdentityPools action.
    */
  var IdentityPools: js.UndefOr[IdentityPoolsList] = js.native
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.native
}

object ListIdentityPoolsResponse {
  @scala.inline
  def apply(): ListIdentityPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIdentityPoolsResponse]
  }
  @scala.inline
  implicit class ListIdentityPoolsResponseOps[Self <: ListIdentityPoolsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentityPools(value: IdentityPoolsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityPools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPools")(js.undefined)
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

