package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEmailIdentitiesResponse extends js.Object {
  /**
    * An array that includes all of the email identities associated with your AWS account.
    */
  var EmailIdentities: js.UndefOr[IdentityInfoList] = js.native
  /**
    * A token that indicates that there are additional configuration sets to list. To view additional configuration sets, issue another request to ListEmailIdentities, and pass this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.NextToken] = js.native
}

object ListEmailIdentitiesResponse {
  @scala.inline
  def apply(): ListEmailIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEmailIdentitiesResponse]
  }
  @scala.inline
  implicit class ListEmailIdentitiesResponseOps[Self <: ListEmailIdentitiesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailIdentities(value: IdentityInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailIdentities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailIdentities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailIdentities")(js.undefined)
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

