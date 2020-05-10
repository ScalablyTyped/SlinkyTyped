package typingsSlinky.awsLambda.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventBridgeEvent[TDetailType /* <: String */, TDetail] extends js.Object {
  var account: String = js.native
  var detail: TDetail = js.native
  var `detail-type`: TDetailType = js.native
  var id: String = js.native
  var region: String = js.native
  var resources: js.Array[String] = js.native
  var source: String = js.native
  var time: String = js.native
  var version: String = js.native
}

object EventBridgeEvent {
  @scala.inline
  def apply[TDetailType, TDetail](
    account: String,
    detail: TDetail,
    `detail-type`: TDetailType,
    id: String,
    region: String,
    resources: js.Array[String],
    source: String,
    time: String,
    version: String
  ): EventBridgeEvent[TDetailType, TDetail] = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventBridgeEvent[TDetailType, TDetail]]
  }
  @scala.inline
  implicit class EventBridgeEventOps[Self[tdetailtype, tdetail] <: EventBridgeEvent[tdetailtype, tdetail], TDetailType, TDetail] (val x: Self[TDetailType, TDetail]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TDetailType, TDetail] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TDetailType, TDetail]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TDetailType, TDetail]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TDetailType, TDetail]) with Other]
    @scala.inline
    def withAccount(value: String): Self[TDetailType, TDetail] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetail(value: TDetail): Self[TDetailType, TDetail] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDetail-type`(value: TDetailType): Self[TDetailType, TDetail] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self[TDetailType, TDetail] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self[TDetailType, TDetail] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResources(value: js.Array[String]): Self[TDetailType, TDetail] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self[TDetailType, TDetail] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: String): Self[TDetailType, TDetail] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self[TDetailType, TDetail] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

