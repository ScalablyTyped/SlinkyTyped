package typingsSlinky.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJournalS3ExportsResponse extends js.Object {
  /**
    * The array of journal export job descriptions for all ledgers that are associated with the current AWS account and Region.
    */
  var JournalS3Exports: js.UndefOr[JournalS3ExportList] = js.native
  /**
    *   If NextToken is empty, then the last page of results has been processed and there are no more results to be retrieved.   If NextToken is not empty, then there are more results available. To retrieve the next page of results, use the value of NextToken in a subsequent ListJournalS3Exports call.  
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.qldbMod.NextToken] = js.native
}

object ListJournalS3ExportsResponse {
  @scala.inline
  def apply(): ListJournalS3ExportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJournalS3ExportsResponse]
  }
  @scala.inline
  implicit class ListJournalS3ExportsResponseOps[Self <: ListJournalS3ExportsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJournalS3Exports(value: JournalS3ExportList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JournalS3Exports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJournalS3Exports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JournalS3Exports")(js.undefined)
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

