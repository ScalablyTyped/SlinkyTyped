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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait actions extends StObject {
  
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
  implicit class actionsMutableBuilder[Self <: actions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCLOSE(value: close): Self = StObject.set(x, "CLOSE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGO(value: go): Self = StObject.set(x, "GO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINDEX(value: index): Self = StObject.set(x, "INDEX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINIT(value: init): Self = StObject.set(x, "INIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNEXT(value: next): Self = StObject.set(x, "NEXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPREV(value: prev): Self = StObject.set(x, "PREV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRESET(value: reset): Self = StObject.set(x, "RESET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRESTART(value: restart): Self = StObject.set(x, "RESTART", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSKIP(value: skip): Self = StObject.set(x, "SKIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTART(value: start): Self = StObject.set(x, "START", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTOP(value: stop): Self = StObject.set(x, "STOP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUPDATE(value: update): Self = StObject.set(x, "UPDATE", value.asInstanceOf[js.Any])
  }
}
