package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQualificationRequestsRequest extends js.Object {
  /**
    *  The maximum number of results to return in a single call. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.native
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The ID of the QualificationType.
    */
  var QualificationTypeId: js.UndefOr[EntityId] = js.native
}

object ListQualificationRequestsRequest {
  @scala.inline
  def apply(): ListQualificationRequestsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQualificationRequestsRequest]
  }
  @scala.inline
  implicit class ListQualificationRequestsRequestOps[Self <: ListQualificationRequestsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxResults(value: ResultSize): Self = {
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
    def withQualificationTypeId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualificationTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualificationTypeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualificationTypeId")(js.undefined)
        ret
    }
  }
  
}

