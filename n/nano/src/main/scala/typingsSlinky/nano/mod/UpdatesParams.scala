package typingsSlinky.nano.mod

import typingsSlinky.nano.nanoStrings.continuous
import typingsSlinky.nano.nanoStrings.eventsource
import typingsSlinky.nano.nanoStrings.longpoll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates
@js.native
trait UpdatesParams extends js.Object {
  var feed: longpoll | continuous | eventsource = js.native
  var heartbeat: Boolean = js.native
  var since: String = js.native
  var timeout: Double = js.native
}

object UpdatesParams {
  @scala.inline
  def apply(feed: longpoll | continuous | eventsource, heartbeat: Boolean, since: String, timeout: Double): UpdatesParams = {
    val __obj = js.Dynamic.literal(feed = feed.asInstanceOf[js.Any], heartbeat = heartbeat.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatesParams]
  }
  @scala.inline
  implicit class UpdatesParamsOps[Self <: UpdatesParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeed(value: longpoll | continuous | eventsource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeartbeat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

