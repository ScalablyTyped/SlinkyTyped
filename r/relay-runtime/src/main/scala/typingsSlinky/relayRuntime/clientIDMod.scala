package typingsSlinky.relayRuntime

import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DataID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-runtime/lib/store/ClientID", JSImport.Namespace)
@js.native
object clientIDMod extends js.Object {
  
  def generateClientID(id: DataID, storageKey: String): DataID = js.native
  def generateClientID(id: DataID, storageKey: String, index: Double): DataID = js.native
  
  def generateUniqueClientID(): DataID = js.native
  
  def isClientID(id: DataID): Boolean = js.native
}
