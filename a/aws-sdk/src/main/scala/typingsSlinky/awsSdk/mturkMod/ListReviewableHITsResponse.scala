package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReviewableHITsResponse extends js.Object {
  /**
    *  The list of HIT elements returned by the query.
    */
  var HITs: js.UndefOr[HITList] = js.native
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  The number of HITs on this page in the filtered results list, equivalent to the number of HITs being returned by this call. 
    */
  var NumResults: js.UndefOr[Integer] = js.native
}

object ListReviewableHITsResponse {
  @scala.inline
  def apply(): ListReviewableHITsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReviewableHITsResponse]
  }
  @scala.inline
  implicit class ListReviewableHITsResponseOps[Self <: ListReviewableHITsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHITs(value: HITList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHITs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITs")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
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
    def withNumResults(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumResults")(js.undefined)
        ret
    }
  }
  
}

