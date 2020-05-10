package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTestGridSessionsResult extends js.Object {
  /**
    * Pagination token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The sessions that match the criteria in a ListTestGridSessionsRequest. 
    */
  var testGridSessions: js.UndefOr[TestGridSessions] = js.native
}

object ListTestGridSessionsResult {
  @scala.inline
  def apply(): ListTestGridSessionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTestGridSessionsResult]
  }
  @scala.inline
  implicit class ListTestGridSessionsResultOps[Self <: ListTestGridSessionsResult] (val x: Self) extends AnyVal {
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
    def withTestGridSessions(value: TestGridSessions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testGridSessions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestGridSessions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testGridSessions")(js.undefined)
        ret
    }
  }
  
}

