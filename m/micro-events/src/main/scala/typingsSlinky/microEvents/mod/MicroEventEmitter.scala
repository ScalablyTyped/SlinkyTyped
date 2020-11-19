package typingsSlinky.microEvents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MicroEventEmitter extends js.Object {
  
  /** Trigger event */
  def emit(`type`: String, arguments: js.Any*): MicroEventEmitter = js.native
  
  /** Max listeners count */
  var maxListeners: Double = js.native
  
  /** Detach listener */
  def off(`type`: String): MicroEventEmitter = js.native
  def off(`type`: String, handler: EventHandler): MicroEventEmitter = js.native
  
  /** Attach listener */
  def on(`type`: String, handler: EventHandler): MicroEventEmitter = js.native
}
