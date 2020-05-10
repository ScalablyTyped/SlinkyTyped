package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTestGridSessionsRequest extends js.Object {
  /**
    * Return only sessions created after this time.
    */
  var creationTimeAfter: js.UndefOr[js.Date] = js.native
  /**
    * Return only sessions created before this time.
    */
  var creationTimeBefore: js.UndefOr[js.Date] = js.native
  /**
    * Return only sessions that ended after this time.
    */
  var endTimeAfter: js.UndefOr[js.Date] = js.native
  /**
    * Return only sessions that ended before this time.
    */
  var endTimeBefore: js.UndefOr[js.Date] = js.native
  /**
    * Return only this many results at a time.
    */
  var maxResult: js.UndefOr[MaxPageSize] = js.native
  /**
    * Pagination token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * ARN of a TestGridProject.
    */
  var projectArn: DeviceFarmArn = js.native
  /**
    * Return only sessions in this state.
    */
  var status: js.UndefOr[TestGridSessionStatus] = js.native
}

object ListTestGridSessionsRequest {
  @scala.inline
  def apply(projectArn: DeviceFarmArn): ListTestGridSessionsRequest = {
    val __obj = js.Dynamic.literal(projectArn = projectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTestGridSessionsRequest]
  }
  @scala.inline
  implicit class ListTestGridSessionsRequestOps[Self <: ListTestGridSessionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectArn(value: DeviceFarmArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationTimeAfter(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimeAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimeAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimeAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTimeBefore(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimeBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimeBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimeBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTimeAfter(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimeAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTimeAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimeAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTimeBefore(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimeBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTimeBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimeBefore")(js.undefined)
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
    @scala.inline
    def withStatus(value: TestGridSessionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

