package typingsSlinky.detectIt.mod

import typingsSlinky.detectHover.mod.detectHover
import typingsSlinky.detectPassiveEvents.mod.detectPassiveEvents
import typingsSlinky.detectPointer.mod.detectPointer
import typingsSlinky.detectTouchEvents.mod.detectTouchEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait state extends js.Object {
  var detectHover: typingsSlinky.detectHover.mod.detectHover
  var detectPassiveEvents: typingsSlinky.detectPassiveEvents.mod.detectPassiveEvents
  var detectPointer: typingsSlinky.detectPointer.mod.detectPointer
  var detectTouchEvents: typingsSlinky.detectTouchEvents.mod.detectTouchEvents
}

object state {
  @scala.inline
  def apply(
    detectHover: detectHover,
    detectPassiveEvents: detectPassiveEvents,
    detectPointer: detectPointer,
    detectTouchEvents: detectTouchEvents
  ): state = {
    val __obj = js.Dynamic.literal(detectHover = detectHover.asInstanceOf[js.Any], detectPassiveEvents = detectPassiveEvents.asInstanceOf[js.Any], detectPointer = detectPointer.asInstanceOf[js.Any], detectTouchEvents = detectTouchEvents.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[state]
  }
}

