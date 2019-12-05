package typingsSlinky.nano.nanoMod

import typingsSlinky.nano.nanoStrings.continuous
import typingsSlinky.nano.nanoStrings.eventsource
import typingsSlinky.nano.nanoStrings.longpoll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates
trait UpdatesParams extends js.Object {
  var feed: longpoll | continuous | eventsource
  var heartbeat: Boolean
  var since: String
  var timeout: Double
}

object UpdatesParams {
  @scala.inline
  def apply(feed: longpoll | continuous | eventsource, heartbeat: Boolean, since: String, timeout: Double): UpdatesParams = {
    val __obj = js.Dynamic.literal(feed = feed.asInstanceOf[js.Any], heartbeat = heartbeat.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdatesParams]
  }
}

