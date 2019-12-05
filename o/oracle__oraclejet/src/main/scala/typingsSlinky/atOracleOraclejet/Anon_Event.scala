package typingsSlinky.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event
  extends /* propName */ StringDictionary[js.Any] {
  var event: Event
}

object Anon_Event {
  @scala.inline
  def apply(event: Event, StringDictionary: /* propName */ StringDictionary[js.Any] = null): Anon_Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Event]
  }
}

