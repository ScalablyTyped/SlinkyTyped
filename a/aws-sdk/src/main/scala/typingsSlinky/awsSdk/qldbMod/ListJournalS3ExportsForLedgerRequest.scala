package typingsSlinky.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJournalS3ExportsForLedgerRequest extends js.Object {
  /**
    * The maximum number of results to return in a single ListJournalS3ExportsForLedger request. (The actual number of results returned might be fewer.)
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.qldbMod.MaxResults] = js.native
  /**
    * The name of the ledger.
    */
  var Name: LedgerName = js.native
  /**
    * A pagination token, indicating that you want to retrieve the next page of results. If you received a value for NextToken in the response from a previous ListJournalS3ExportsForLedger call, then you should use that value as input here.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.qldbMod.NextToken] = js.native
}

object ListJournalS3ExportsForLedgerRequest {
  @scala.inline
  def apply(Name: LedgerName): ListJournalS3ExportsForLedgerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJournalS3ExportsForLedgerRequest]
  }
  @scala.inline
  implicit class ListJournalS3ExportsForLedgerRequestOps[Self <: ListJournalS3ExportsForLedgerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: LedgerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
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

