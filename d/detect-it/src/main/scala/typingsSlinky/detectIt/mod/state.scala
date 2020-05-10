package typingsSlinky.detectIt.mod

import typingsSlinky.detectHover.mod.detectHover
import typingsSlinky.detectPassiveEvents.mod.detectPassiveEvents
import typingsSlinky.detectPointer.mod.detectPointer
import typingsSlinky.detectTouchEvents.mod.detectTouchEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait state extends js.Object {
  var detectHover: typingsSlinky.detectHover.mod.detectHover = js.native
  var detectPassiveEvents: typingsSlinky.detectPassiveEvents.mod.detectPassiveEvents = js.native
  var detectPointer: typingsSlinky.detectPointer.mod.detectPointer = js.native
  var detectTouchEvents: typingsSlinky.detectTouchEvents.mod.detectTouchEvents = js.native
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
  @scala.inline
  implicit class stateOps[Self <: state] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectHover(value: detectHover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetectPassiveEvents(value: detectPassiveEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectPassiveEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetectPointer(value: detectPointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectPointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetectTouchEvents(value: detectTouchEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectTouchEvents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

