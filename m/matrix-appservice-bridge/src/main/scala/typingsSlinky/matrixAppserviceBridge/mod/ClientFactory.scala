package typingsSlinky.matrixAppserviceBridge.mod

import typingsSlinky.matrixJsSdk.mod.MatrixClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "ClientFactory")
@js.native
class ClientFactory protected () extends js.Object {
  def this(options: js.Any) = this()
  
  def configure(baseUrl: String, appServiceToken: String, appServiceUserId: String): Unit = js.native
  
  def getClientAs(): MatrixClient = js.native
  def getClientAs(userId: js.UndefOr[scala.Nothing], request: Request): MatrixClient = js.native
  def getClientAs(userId: String): MatrixClient = js.native
  def getClientAs(userId: String, request: Request): MatrixClient = js.native
  
  def setLogFunction(func: js.Function1[/* args */ js.Any, _]): Unit = js.native
}
