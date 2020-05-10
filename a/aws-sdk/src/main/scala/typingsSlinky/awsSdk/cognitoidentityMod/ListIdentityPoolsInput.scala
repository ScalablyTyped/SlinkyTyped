package typingsSlinky.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIdentityPoolsInput extends js.Object {
  /**
    * The maximum number of identities to return.
    */
  var MaxResults: QueryLimit = js.native
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.native
}

object ListIdentityPoolsInput {
  @scala.inline
  def apply(MaxResults: QueryLimit): ListIdentityPoolsInput = {
    val __obj = js.Dynamic.literal(MaxResults = MaxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentityPoolsInput]
  }
  @scala.inline
  implicit class ListIdentityPoolsInputOps[Self <: ListIdentityPoolsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxResults(value: QueryLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
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

