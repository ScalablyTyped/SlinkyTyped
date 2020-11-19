package typingsSlinky.reactDnd.monitorsMod

import typingsSlinky.dndCore.interfacesMod.Unsubscribe
import typingsSlinky.reactDnd.anon.HandlerIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitorEventEmitter extends js.Object {
  
  def subscribeToStateChange(fn: js.Function0[Unit]): Unsubscribe = js.native
  def subscribeToStateChange(fn: js.Function0[Unit], options: HandlerIds): Unsubscribe = js.native
}
