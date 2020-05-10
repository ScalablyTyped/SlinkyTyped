package typingsSlinky.reactJoyride.mod

import typingsSlinky.reactJoyride.reactJoyrideStrings.error
import typingsSlinky.reactJoyride.reactJoyrideStrings.finished
import typingsSlinky.reactJoyride.reactJoyrideStrings.idle
import typingsSlinky.reactJoyride.reactJoyrideStrings.paused
import typingsSlinky.reactJoyride.reactJoyrideStrings.ready
import typingsSlinky.reactJoyride.reactJoyrideStrings.running
import typingsSlinky.reactJoyride.reactJoyrideStrings.skipped
import typingsSlinky.reactJoyride.reactJoyrideStrings.waiting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait status extends js.Object {
  var ERROR: error = js.native
  var FINISHED: finished = js.native
  var IDLE: idle = js.native
  var PAUSED: paused = js.native
  var READY: ready = js.native
  var RUNNING: running = js.native
  var SKIPPED: skipped = js.native
  var WAITING: waiting = js.native
}

object status {
  @scala.inline
  def apply(
    ERROR: error,
    FINISHED: finished,
    IDLE: idle,
    PAUSED: paused,
    READY: ready,
    RUNNING: running,
    SKIPPED: skipped,
    WAITING: waiting
  ): status = {
    val __obj = js.Dynamic.literal(ERROR = ERROR.asInstanceOf[js.Any], FINISHED = FINISHED.asInstanceOf[js.Any], IDLE = IDLE.asInstanceOf[js.Any], PAUSED = PAUSED.asInstanceOf[js.Any], READY = READY.asInstanceOf[js.Any], RUNNING = RUNNING.asInstanceOf[js.Any], SKIPPED = SKIPPED.asInstanceOf[js.Any], WAITING = WAITING.asInstanceOf[js.Any])
    __obj.asInstanceOf[status]
  }
  @scala.inline
  implicit class statusOps[Self <: status] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withERROR(value: error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFINISHED(value: finished): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FINISHED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIDLE(value: idle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IDLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPAUSED(value: paused): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PAUSED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREADY(value: ready): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("READY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRUNNING(value: running): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RUNNING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSKIPPED(value: skipped): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SKIPPED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWAITING(value: waiting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WAITING")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

