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

trait status extends js.Object {
  var ERROR: error
  var FINISHED: finished
  var IDLE: idle
  var PAUSED: paused
  var READY: ready
  var RUNNING: running
  var SKIPPED: skipped
  var WAITING: waiting
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
}

