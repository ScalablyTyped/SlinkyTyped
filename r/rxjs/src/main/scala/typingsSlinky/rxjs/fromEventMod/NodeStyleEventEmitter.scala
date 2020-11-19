package typingsSlinky.rxjs.fromEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeStyleEventEmitter
  extends EventTargetLike[js.Any] {
  
  def addListener(eventName: String, handler: NodeEventHandler): this.type = js.native
  def addListener(eventName: js.Symbol, handler: NodeEventHandler): this.type = js.native
  
  def removeListener(eventName: String, handler: NodeEventHandler): this.type = js.native
  def removeListener(eventName: js.Symbol, handler: NodeEventHandler): this.type = js.native
}
