package typingsSlinky.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends js.Object {
  var all: StatsMessageTypes = js.native
  var apiRequests: StatsRequestCount = js.native
  var channels: StatsResourceCount = js.native
  var connections: StatsConnectionTypes = js.native
  var inbound: StatsMessageTraffic = js.native
  var intervalId: String = js.native
  var outbound: StatsMessageTraffic = js.native
  var persisted: StatsMessageTypes = js.native
  var tokenRequests: StatsRequestCount = js.native
}

object Stats {
  @scala.inline
  def apply(
    all: StatsMessageTypes,
    apiRequests: StatsRequestCount,
    channels: StatsResourceCount,
    connections: StatsConnectionTypes,
    inbound: StatsMessageTraffic,
    intervalId: String,
    outbound: StatsMessageTraffic,
    persisted: StatsMessageTypes,
    tokenRequests: StatsRequestCount
  ): Stats = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], apiRequests = apiRequests.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], connections = connections.asInstanceOf[js.Any], inbound = inbound.asInstanceOf[js.Any], intervalId = intervalId.asInstanceOf[js.Any], outbound = outbound.asInstanceOf[js.Any], persisted = persisted.asInstanceOf[js.Any], tokenRequests = tokenRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: StatsMessageTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiRequests(value: StatsRequestCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannels(value: StatsResourceCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnections(value: StatsConnectionTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInbound(value: StatsMessageTraffic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inbound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntervalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutbound(value: StatsMessageTraffic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outbound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersisted(value: StatsMessageTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persisted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenRequests(value: StatsRequestCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenRequests")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

