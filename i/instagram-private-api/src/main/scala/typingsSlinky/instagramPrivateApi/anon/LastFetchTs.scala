package typingsSlinky.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LastFetchTs extends js.Object {
  var broadcastId: String = js.native
  var lastFetchTs: Double | String = js.native
  var lastSeenTs: Double | String = js.native
  var lastTotalCount: Double | String = js.native
}

object LastFetchTs {
  @scala.inline
  def apply(
    broadcastId: String,
    lastFetchTs: Double | String,
    lastSeenTs: Double | String,
    lastTotalCount: Double | String
  ): LastFetchTs = {
    val __obj = js.Dynamic.literal(broadcastId = broadcastId.asInstanceOf[js.Any], lastFetchTs = lastFetchTs.asInstanceOf[js.Any], lastSeenTs = lastSeenTs.asInstanceOf[js.Any], lastTotalCount = lastTotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastFetchTs]
  }
  @scala.inline
  implicit class LastFetchTsOps[Self <: LastFetchTs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBroadcastId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcastId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastFetchTs(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastFetchTs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastSeenTs(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSeenTs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastTotalCount(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTotalCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

