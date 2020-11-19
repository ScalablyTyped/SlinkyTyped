package typingsSlinky.awsSdkMiddlewareSdkApiGateway

import typingsSlinky.awsSdkTypes.middlewareMod.BuildHandler
import typingsSlinky.awsSdkTypes.middlewareMod.BuildHandlerArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-sdk-api-gateway", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def acceptsHeader(next: BuildHandler[_, _, js.typedarray.Uint8Array]): js.Function1[/* args */ BuildHandlerArguments[_, _], js.Promise[_]] = js.native
}
