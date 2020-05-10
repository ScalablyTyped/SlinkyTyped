package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProblemsResponse extends js.Object {
  /**
    * The token used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The list of problems. 
    */
  var ProblemList: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.ProblemList] = js.native
}

object ListProblemsResponse {
  @scala.inline
  def apply(): ListProblemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProblemsResponse]
  }
  @scala.inline
  implicit class ListProblemsResponseOps[Self <: ListProblemsResponse] (val x: Self) extends AnyVal {
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
    def withProblemList(value: ProblemList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProblemList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProblemList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProblemList")(js.undefined)
        ret
    }
  }
  
}

