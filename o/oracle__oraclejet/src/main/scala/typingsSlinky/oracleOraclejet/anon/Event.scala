package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event
  extends /* key */ StringDictionary[js.Any] {
  var event: org.scalajs.dom.raw.Event
}

object Event {
  @scala.inline
  def apply(event: org.scalajs.dom.raw.Event, StringDictionary: /* name */ StringDictionary[js.Any] = null): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Event]
  }
}

