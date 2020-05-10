package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQualificationTypesResponse extends js.Object {
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  The number of Qualification types on this page in the filtered results list, equivalent to the number of types this operation returns. 
    */
  var NumResults: js.UndefOr[Integer] = js.native
  /**
    *  The list of QualificationType elements returned by the query. 
    */
  var QualificationTypes: js.UndefOr[QualificationTypeList] = js.native
}

object ListQualificationTypesResponse {
  @scala.inline
  def apply(): ListQualificationTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQualificationTypesResponse]
  }
  @scala.inline
  implicit class ListQualificationTypesResponseOps[Self <: ListQualificationTypesResponse] (val x: Self) extends AnyVal {
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
    def withQualificationTypes(value: QualificationTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualificationTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualificationTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualificationTypes")(js.undefined)
        ret
    }
  }
  
}

