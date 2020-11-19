package typingsSlinky.awsSdkMiddlewareExpectContinue

import typingsSlinky.awsSdkTypes.middlewareMod.BuildHandler
import typingsSlinky.awsSdkTypes.middlewareMod.BuildHandlerArguments
import typingsSlinky.awsSdkTypes.middlewareMod.HandlerExecutionContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-expect-continue", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addExpectContinue(next: BuildHandler[_, _, _], context: HandlerExecutionContext): js.Function1[/* args */ BuildHandlerArguments[_, _], js.Promise[_]] = js.native
}
