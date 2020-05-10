package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTestGridSessionActionsRequest extends js.Object {
  /**
    * The maximum number of sessions to return per response.
    */
  var maxResult: js.UndefOr[MaxPageSize] = js.native
  /**
    * Pagination token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The ARN of the session to retrieve.
    */
  var sessionArn: DeviceFarmArn = js.native
}

object ListTestGridSessionActionsRequest {
  @scala.inline
  def apply(sessionArn: DeviceFarmArn): ListTestGridSessionActionsRequest = {
    val __obj = js.Dynamic.literal(sessionArn = sessionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTestGridSessionActionsRequest]
  }
  @scala.inline
  implicit class ListTestGridSessionActionsRequestOps[Self <: ListTestGridSessionActionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSessionArn(value: DeviceFarmArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionArn")(value.asInstanceOf[js.Any])
        ret
    }
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

