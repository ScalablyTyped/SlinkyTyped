package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.eventMod.Event
import typingsSlinky.firebaseDatabase.queryMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvents extends js.Object {
  var events: js.Array[Event]
  var removed: js.Array[Query]
}

object AnonEvents {
  @scala.inline
  def apply(events: js.Array[Event], removed: js.Array[Query]): AnonEvents = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEvents]
  }
}

