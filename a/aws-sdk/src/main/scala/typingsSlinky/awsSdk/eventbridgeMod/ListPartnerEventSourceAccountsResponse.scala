package typingsSlinky.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPartnerEventSourceAccountsResponse extends js.Object {
  /**
    * A token you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.eventbridgeMod.NextToken] = js.native
  /**
    * The list of partner event sources returned by the operation.
    */
  var PartnerEventSourceAccounts: js.UndefOr[PartnerEventSourceAccountList] = js.native
}

object ListPartnerEventSourceAccountsResponse {
  @scala.inline
  def apply(): ListPartnerEventSourceAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPartnerEventSourceAccountsResponse]
  }
  @scala.inline
  implicit class ListPartnerEventSourceAccountsResponseOps[Self <: ListPartnerEventSourceAccountsResponse] (val x: Self) extends AnyVal {
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
    def withPartnerEventSourceAccounts(value: PartnerEventSourceAccountList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartnerEventSourceAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartnerEventSourceAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartnerEventSourceAccounts")(js.undefined)
        ret
    }
  }
  
}

