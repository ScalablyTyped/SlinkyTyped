package typingsSlinky.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalEvent extends js.Object {
  var originalEvent: org.scalajs.dom.raw.Event
  var query: String
}

object OriginalEvent {
  @scala.inline
  def apply(originalEvent: org.scalajs.dom.raw.Event, query: String): OriginalEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEvent]
  }
}

