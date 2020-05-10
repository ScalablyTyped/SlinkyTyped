package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRecordHistoryOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * The records, in reverse chronological order.
    */
  var RecordDetails: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.RecordDetails] = js.native
}

object ListRecordHistoryOutput {
  @scala.inline
  def apply(): ListRecordHistoryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecordHistoryOutput]
  }
  @scala.inline
  implicit class ListRecordHistoryOutputOps[Self <: ListRecordHistoryOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: PageToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordDetails(value: RecordDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordDetails")(js.undefined)
        ret
    }
  }
  
}

