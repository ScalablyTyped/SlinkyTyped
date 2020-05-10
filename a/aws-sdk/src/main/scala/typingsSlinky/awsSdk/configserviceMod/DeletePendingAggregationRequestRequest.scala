package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePendingAggregationRequestRequest extends js.Object {
  /**
    * The 12-digit account ID of the account requesting to aggregate data.
    */
  var RequesterAccountId: AccountId = js.native
  /**
    * The region requesting to aggregate data.
    */
  var RequesterAwsRegion: AwsRegion = js.native
}

object DeletePendingAggregationRequestRequest {
  @scala.inline
  def apply(RequesterAccountId: AccountId, RequesterAwsRegion: AwsRegion): DeletePendingAggregationRequestRequest = {
    val __obj = js.Dynamic.literal(RequesterAccountId = RequesterAccountId.asInstanceOf[js.Any], RequesterAwsRegion = RequesterAwsRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePendingAggregationRequestRequest]
  }
  @scala.inline
  implicit class DeletePendingAggregationRequestRequestOps[Self <: DeletePendingAggregationRequestRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequesterAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequesterAwsRegion(value: AwsRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterAwsRegion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

