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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCLOSE(value: close): Self = this.set("CLOSE", value.asInstanceOf[js.Any])
    @scala.inline
    def setGO(value: go): Self = this.set("GO", value.asInstanceOf[js.Any])
    @scala.inline
    def setINDEX(value: index): Self = this.set("INDEX", value.asInstanceOf[js.Any])
    @scala.inline
    def setINIT(value: init): Self = this.set("INIT", value.asInstanceOf[js.Any])
    @scala.inline
    def setNEXT(value: next): Self = this.set("NEXT", value.asInstanceOf[js.Any])
    @scala.inline
    def setPREV(value: prev): Self = this.set("PREV", value.asInstanceOf[js.Any])
    @scala.inline
    def setRESET(value: reset): Self = this.set("RESET", value.asInstanceOf[js.Any])
    @scala.inline
    def setRESTART(value: restart): Self = this.set("RESTART", value.asInstanceOf[js.Any])
    @scala.inline
    def setSKIP(value: skip): Self = this.set("SKIP", value.asInstanceOf[js.Any])
    @scala.inline
    def setSTART(value: start): Self = this.set("START", value.asInstanceOf[js.Any])
    @scala.inline
    def setSTOP(value: stop): Self = this.set("STOP", value.asInstanceOf[js.Any])
    @scala.inline
    def setUPDATE(value: update): Self = this.set("UPDATE", value.asInstanceOf[js.Any])
  }
  
}

