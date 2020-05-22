package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends Message {
  /* Properties */
  var application: String
  var timestamp: js.Date
}

object Event {
  @scala.inline
  def apply(application: String, timestamp: js.Date, `type`: String, asterisk_id: String = null): Event = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

