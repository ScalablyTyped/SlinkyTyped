package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveBroadcastStatistics extends js.Object {
  var concurrentViewers: js.UndefOr[String] = js.native
  var totalChatCount: js.UndefOr[String] = js.native
}

object LiveBroadcastStatistics {
  @scala.inline
  def apply(): LiveBroadcastStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveBroadcastStatistics]
  }
  @scala.inline
  implicit class LiveBroadcastStatisticsOps[Self <: LiveBroadcastStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcurrentViewers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrentViewers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrentViewers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrentViewers")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalChatCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalChatCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalChatCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalChatCount")(js.undefined)
        ret
    }
  }
  
}

