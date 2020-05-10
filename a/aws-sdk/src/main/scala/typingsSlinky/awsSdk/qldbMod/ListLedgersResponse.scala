package typingsSlinky.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLedgersResponse extends js.Object {
  /**
    * The array of ledger summaries that are associated with the current AWS account and Region.
    */
  var Ledgers: js.UndefOr[LedgerList] = js.native
  /**
    * A pagination token, indicating whether there are more results available:   If NextToken is empty, then the last page of results has been processed and there are no more results to be retrieved.   If NextToken is not empty, then there are more results available. To retrieve the next page of results, use the value of NextToken in a subsequent ListLedgers call.  
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.qldbMod.NextToken] = js.native
}

object ListLedgersResponse {
  @scala.inline
  def apply(): ListLedgersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLedgersResponse]
  }
  @scala.inline
  implicit class ListLedgersResponseOps[Self <: ListLedgersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLedgers(value: LedgerList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ledgers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLedgers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ledgers")(js.undefined)
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

