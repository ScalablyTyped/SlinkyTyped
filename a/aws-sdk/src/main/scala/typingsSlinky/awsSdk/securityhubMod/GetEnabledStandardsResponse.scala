package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEnabledStandardsResponse extends js.Object {
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.NextToken] = js.native
  /**
    * The list of StandardsSubscriptions objects that include information about the enabled standards.
    */
  var StandardsSubscriptions: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.StandardsSubscriptions] = js.native
}

object GetEnabledStandardsResponse {
  @scala.inline
  def apply(): GetEnabledStandardsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEnabledStandardsResponse]
  }
  @scala.inline
  implicit class GetEnabledStandardsResponseOps[Self <: GetEnabledStandardsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withStandardsSubscriptions(value: StandardsSubscriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardsSubscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardsSubscriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardsSubscriptions")(js.undefined)
        ret
    }
  }
  
}

