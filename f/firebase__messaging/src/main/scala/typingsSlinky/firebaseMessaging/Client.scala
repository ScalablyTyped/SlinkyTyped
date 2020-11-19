package typingsSlinky.firebaseMessaging

import typingsSlinky.std.ClientTypes
import typingsSlinky.std.Transferable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends js.Object {
  
  val id: String = js.native
  
  def postMessage(message: js.Any): Unit = js.native
  def postMessage(message: js.Any, transfer: js.Array[Transferable]): Unit = js.native
  
  val `type`: ClientTypes = js.native
  
  val url: String = js.native
}
