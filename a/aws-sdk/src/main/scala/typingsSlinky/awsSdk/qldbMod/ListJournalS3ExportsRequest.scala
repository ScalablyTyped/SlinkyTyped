package typingsSlinky.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJournalS3ExportsRequest extends js.Object {
  /**
    * The maximum number of results to return in a single ListJournalS3Exports request. (The actual number of results returned might be fewer.)
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.qldbMod.MaxResults] = js.native
  /**
    * A pagination token, indicating that you want to retrieve the next page of results. If you received a value for NextToken in the response from a previous ListJournalS3Exports call, then you should use that value as input here.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.qldbMod.NextToken] = js.native
}

object ListJournalS3ExportsRequest {
  @scala.inline
  def apply(): ListJournalS3ExportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJournalS3ExportsRequest]
  }
  @scala.inline
  implicit class ListJournalS3ExportsRequestOps[Self <: ListJournalS3ExportsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

