package typingsSlinky.nano.mod

import typingsSlinky.nano.nanoStrings.continuous
import typingsSlinky.nano.nanoStrings.eventsource
import typingsSlinky.nano.nanoStrings.longpoll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates
@js.native
trait UpdatesParams extends StObject {
  
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
  implicit class UpdatesParamsMutableBuilder[Self <: UpdatesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeed(value: longpoll | continuous | eventsource): Self = StObject.set(x, "feed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeartbeat(value: Boolean): Self = StObject.set(x, "heartbeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
