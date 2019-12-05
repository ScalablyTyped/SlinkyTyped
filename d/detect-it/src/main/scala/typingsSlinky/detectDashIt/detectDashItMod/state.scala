package typingsSlinky.detectDashIt.detectDashItMod

import typingsSlinky.detectDashHover.detectDashHoverMod.detectHover
import typingsSlinky.detectDashPassiveDashEvents.detectDashPassiveDashEventsMod.detectPassiveEvents
import typingsSlinky.detectDashPointer.detectDashPointerMod.detectPointer
import typingsSlinky.detectDashTouchDashEvents.detectDashTouchDashEventsMod.detectTouchEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait state extends js.Object {
  var detectHover: typingsSlinky.detectDashHover.detectDashHoverMod.detectHover
  var detectPassiveEvents: typingsSlinky.detectDashPassiveDashEvents.detectDashPassiveDashEventsMod.detectPassiveEvents
  var detectPointer: typingsSlinky.detectDashPointer.detectDashPointerMod.detectPointer
  var detectTouchEvents: typingsSlinky.detectDashTouchDashEvents.detectDashTouchDashEventsMod.detectTouchEvents
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

