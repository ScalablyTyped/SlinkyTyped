package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTestGridProjectsResult extends js.Object {
  /**
    * Used for pagination. Pass into ListTestGridProjects to get more results in a paginated request.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The list of TestGridProjects, based on a ListTestGridProjectsRequest.
    */
  var testGridProjects: js.UndefOr[TestGridProjects] = js.native
}

object ListTestGridProjectsResult {
  @scala.inline
  def apply(): ListTestGridProjectsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTestGridProjectsResult]
  }
  @scala.inline
  implicit class ListTestGridProjectsResultOps[Self <: ListTestGridProjectsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTestGridProjects(value: TestGridProjects): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testGridProjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestGridProjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testGridProjects")(js.undefined)
        ret
    }
  }
  
}

