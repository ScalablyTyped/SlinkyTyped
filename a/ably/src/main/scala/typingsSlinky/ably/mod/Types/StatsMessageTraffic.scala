package typingsSlinky.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatsMessageTraffic extends js.Object {
  var all: StatsMessageTypes = js.native
  var realtime: StatsMessageTypes = js.native
  var rest: StatsMessageTypes = js.native
  var webhook: StatsMessageTypes = js.native
}

object StatsMessageTraffic {
  @scala.inline
  def apply(
    all: StatsMessageTypes,
    realtime: StatsMessageTypes,
    rest: StatsMessageTypes,
    webhook: StatsMessageTypes
  ): StatsMessageTraffic = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], realtime = realtime.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], webhook = webhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsMessageTraffic]
  }
  @scala.inline
  implicit class StatsMessageTrafficOps[Self <: StatsMessageTraffic] (val x: Self) extends AnyVal {
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
    def withRealtime(value: StatsMessageTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRest(value: StatsMessageTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebhook(value: StatsMessageTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhook")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

