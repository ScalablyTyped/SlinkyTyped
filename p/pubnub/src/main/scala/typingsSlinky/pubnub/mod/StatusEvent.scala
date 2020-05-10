package typingsSlinky.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusEvent extends js.Object {
  var affectedChannelGroups: js.Array[String] = js.native
   // see Pubnub.Operations
  var affectedChannels: js.Array[String] = js.native
  var category: String = js.native
  var currentTimetoken: Double | String = js.native
  var lastTimetoken: Double | String = js.native
   // see Pubnub.Categories
  var operation: String = js.native
  var subscribedChannels: js.Array[String] = js.native
}

object StatusEvent {
  @scala.inline
  def apply(
    affectedChannelGroups: js.Array[String],
    affectedChannels: js.Array[String],
    category: String,
    currentTimetoken: Double | String,
    lastTimetoken: Double | String,
    operation: String,
    subscribedChannels: js.Array[String]
  ): StatusEvent = {
    val __obj = js.Dynamic.literal(affectedChannelGroups = affectedChannelGroups.asInstanceOf[js.Any], affectedChannels = affectedChannels.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], currentTimetoken = currentTimetoken.asInstanceOf[js.Any], lastTimetoken = lastTimetoken.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], subscribedChannels = subscribedChannels.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusEvent]
  }
  @scala.inline
  implicit class StatusEventOps[Self <: StatusEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAffectedChannelGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affectedChannelGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAffectedChannels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affectedChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTimetoken(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTimetoken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastTimetoken(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTimetoken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscribedChannels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribedChannels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

