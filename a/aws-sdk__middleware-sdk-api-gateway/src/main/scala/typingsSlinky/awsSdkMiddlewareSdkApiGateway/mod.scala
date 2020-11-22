package typingsSlinky.awsSdkMiddlewareSdkApiGateway

import typingsSlinky.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.BuildMiddleware
import typingsSlinky.awsSdkTypes.middlewareMod.Pluggable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-sdk-api-gateway", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def acceptHeaderMiddleware(): BuildMiddleware[_, _] = js.native
  
  val acceptHeaderMiddlewareOptions: BuildHandlerOptions = js.native
  
  def getAcceptHeaderPlugin(unused: js.Any): Pluggable[_, _] = js.native
}
