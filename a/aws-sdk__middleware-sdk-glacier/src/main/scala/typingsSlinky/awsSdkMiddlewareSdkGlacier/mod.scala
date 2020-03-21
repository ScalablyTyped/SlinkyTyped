package typingsSlinky.awsSdkMiddlewareSdkGlacier

import typingsSlinky.awsSdkTypes.middlewareMod.BuildHandler
import typingsSlinky.awsSdkTypes.middlewareMod.BuildHandlerArguments
import typingsSlinky.awsSdkTypes.middlewareMod.HandlerExecutionContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/middleware-sdk-glacier", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def addGlacierApiVersion(next: BuildHandler[_, _, _], context: HandlerExecutionContext): js.Function1[/* args */ BuildHandlerArguments[_, _], js.Promise[_]] = js.native
}

