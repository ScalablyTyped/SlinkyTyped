package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWorkersWithQualificationTypeResponse extends js.Object {
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  The number of Qualifications on this page in the filtered results list, equivalent to the number of Qualifications being returned by this call.
    */
  var NumResults: js.UndefOr[Integer] = js.native
  /**
    *  The list of Qualification elements returned by this call. 
    */
  var Qualifications: js.UndefOr[QualificationList] = js.native
}

object ListWorkersWithQualificationTypeResponse {
  @scala.inline
  def apply(): ListWorkersWithQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkersWithQualificationTypeResponse]
  }
  @scala.inline
  implicit class ListWorkersWithQualificationTypeResponseOps[Self <: ListWorkersWithQualificationTypeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withQualifications(value: QualificationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Qualifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Qualifications")(js.undefined)
        ret
    }
  }
  
}

