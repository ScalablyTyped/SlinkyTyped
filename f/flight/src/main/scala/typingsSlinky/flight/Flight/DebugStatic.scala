package typingsSlinky.flight.Flight

import typingsSlinky.flight.anon.LogAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugStatic extends js.Object {
  var events: LogAll
}

object DebugStatic {
  @scala.inline
  def apply(events: LogAll): DebugStatic = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugStatic]
  }
}

