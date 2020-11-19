package typingsSlinky.awsSdkNodeHttpHandler

import typingsSlinky.node.httpMod.ClientRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/node-http-handler/build/set-socket-timeout", JSImport.Namespace)
@js.native
object setSocketTimeoutMod extends js.Object {
  
  def setSocketTimeout(request: ClientRequest, reject: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def setSocketTimeout(request: ClientRequest, reject: js.Function1[/* err */ js.Error, Unit], timeoutInMs: Double): Unit = js.native
}
