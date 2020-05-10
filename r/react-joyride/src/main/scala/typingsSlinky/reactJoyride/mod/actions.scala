package typingsSlinky.reactJoyride.mod

import typingsSlinky.reactJoyride.reactJoyrideStrings.close
import typingsSlinky.reactJoyride.reactJoyrideStrings.go
import typingsSlinky.reactJoyride.reactJoyrideStrings.index
import typingsSlinky.reactJoyride.reactJoyrideStrings.init
import typingsSlinky.reactJoyride.reactJoyrideStrings.next
import typingsSlinky.reactJoyride.reactJoyrideStrings.prev
import typingsSlinky.reactJoyride.reactJoyrideStrings.reset
import typingsSlinky.reactJoyride.reactJoyrideStrings.restart
import typingsSlinky.reactJoyride.reactJoyrideStrings.skip
import typingsSlinky.reactJoyride.reactJoyrideStrings.start
import typingsSlinky.reactJoyride.reactJoyrideStrings.stop
import typingsSlinky.reactJoyride.reactJoyrideStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait actions extends js.Object {
  var CLOSE: close = js.native
  var GO: go = js.native
  var INDEX: index = js.native
  var INIT: init = js.native
  var NEXT: next = js.native
  var PREV: prev = js.native
  var RESET: reset = js.native
  var RESTART: restart = js.native
  var SKIP: skip = js.native
  var START: start = js.native
  var STOP: stop = js.native
  var UPDATE: update = js.native
}

object actions {
  @scala.inline
  def apply(
    CLOSE: close,
    GO: go,
    INDEX: index,
    INIT: init,
    NEXT: next,
    PREV: prev,
    RESET: reset,
    RESTART: restart,
    SKIP: skip,
    START: start,
    STOP: stop,
    UPDATE: update
  ): actions = {
    val __obj = js.Dynamic.literal(CLOSE = CLOSE.asInstanceOf[js.Any], GO = GO.asInstanceOf[js.Any], INDEX = INDEX.asInstanceOf[js.Any], INIT = INIT.asInstanceOf[js.Any], NEXT = NEXT.asInstanceOf[js.Any], PREV = PREV.asInstanceOf[js.Any], RESET = RESET.asInstanceOf[js.Any], RESTART = RESTART.asInstanceOf[js.Any], SKIP = SKIP.asInstanceOf[js.Any], START = START.asInstanceOf[js.Any], STOP = STOP.asInstanceOf[js.Any], UPDATE = UPDATE.asInstanceOf[js.Any])
    __obj.asInstanceOf[actions]
  }
  @scala.inline
  implicit class actionsOps[Self <: actions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCLOSE(value: close): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLOSE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGO(value: go): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINDEX(value: index): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INDEX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINIT(value: init): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INIT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNEXT(value: next): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NEXT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPREV(value: prev): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PREV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRESET(value: reset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RESET")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRESTART(value: restart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RESTART")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSKIP(value: skip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SKIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTART(value: start): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("START")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTOP(value: stop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STOP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUPDATE(value: update): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UPDATE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

