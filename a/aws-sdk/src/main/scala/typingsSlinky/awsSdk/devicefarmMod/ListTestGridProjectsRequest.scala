package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTestGridProjectsRequest extends js.Object {
  /**
    * Return no more than this number of results.
    */
  var maxResult: js.UndefOr[MaxPageSize] = js.native
  /**
    * From a response, used to continue a paginated listing. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListTestGridProjectsRequest {
  @scala.inline
  def apply(): ListTestGridProjectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTestGridProjectsRequest]
  }
  @scala.inline
  implicit class ListTestGridProjectsRequestOps[Self <: ListTestGridProjectsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxResult(value: MaxPageSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResult")(js.undefined)
        ret
    }
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
  }
  
}

