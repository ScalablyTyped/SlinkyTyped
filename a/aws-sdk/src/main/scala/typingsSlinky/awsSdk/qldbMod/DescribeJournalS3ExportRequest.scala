package typingsSlinky.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJournalS3ExportRequest extends js.Object {
  /**
    * The unique ID of the journal export job that you want to describe.
    */
  var ExportId: UniqueId = js.native
  /**
    * The name of the ledger.
    */
  var Name: LedgerName = js.native
}

object DescribeJournalS3ExportRequest {
  @scala.inline
  def apply(ExportId: UniqueId, Name: LedgerName): DescribeJournalS3ExportRequest = {
    val __obj = js.Dynamic.literal(ExportId = ExportId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJournalS3ExportRequest]
  }
  @scala.inline
  implicit class DescribeJournalS3ExportRequestOps[Self <: DescribeJournalS3ExportRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportId(value: UniqueId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: LedgerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

