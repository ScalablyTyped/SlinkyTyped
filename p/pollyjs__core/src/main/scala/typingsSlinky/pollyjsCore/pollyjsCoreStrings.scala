package typingsSlinky.pollyjsCore

import typingsSlinky.pollyjsCore.mod.ACTION
import typingsSlinky.pollyjsCore.mod.EXPIRY_STRATEGY
import typingsSlinky.pollyjsCore.mod.MODE
import typingsSlinky.pollyjsCore.mod.PollyEvent
import typingsSlinky.pollyjsCore.mod.RecordingRouteEvent
import typingsSlinky.pollyjsCore.mod.ResponseRouteEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pollyjsCoreStrings {
  
  @js.native
  sealed trait abort extends StObject
  @scala.inline
  def abort: abort = "abort".asInstanceOf[abort]
  
  @js.native
  sealed trait beforePersist extends RecordingRouteEvent
  @scala.inline
  def beforePersist: beforePersist = "beforePersist".asInstanceOf[beforePersist]
  
  @js.native
  sealed trait beforeReplay extends RecordingRouteEvent
  @scala.inline
  def beforeReplay: beforeReplay = "beforeReplay".asInstanceOf[beforeReplay]
  
  @js.native
  sealed trait beforeResponse extends ResponseRouteEvent
  @scala.inline
  def beforeResponse: beforeResponse = "beforeResponse".asInstanceOf[beforeResponse]
  
  @js.native
  sealed trait create extends PollyEvent
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait error extends EXPIRY_STRATEGY
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait intercept extends ACTION
  @scala.inline
  def intercept: intercept = "intercept".asInstanceOf[intercept]
  
  @js.native
  sealed trait passthrough
    extends ACTION
       with MODE
  @scala.inline
  def passthrough: passthrough = "passthrough".asInstanceOf[passthrough]
  
  @js.native
  sealed trait record
    extends ACTION
       with EXPIRY_STRATEGY
       with MODE
  @scala.inline
  def record: record = "record".asInstanceOf[record]
  
  @js.native
  sealed trait register extends PollyEvent
  @scala.inline
  def register: register = "register".asInstanceOf[register]
  
  @js.native
  sealed trait replay
    extends ACTION
       with MODE
  @scala.inline
  def replay: replay = "replay".asInstanceOf[replay]
  
  @js.native
  sealed trait request extends StObject
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  
  @js.native
  sealed trait response extends ResponseRouteEvent
  @scala.inline
  def response: response = "response".asInstanceOf[response]
  
  @js.native
  sealed trait stop extends PollyEvent
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
  
  @js.native
  sealed trait stopped extends MODE
  @scala.inline
  def stopped: stopped = "stopped".asInstanceOf[stopped]
  
  @js.native
  sealed trait warn extends EXPIRY_STRATEGY
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}
