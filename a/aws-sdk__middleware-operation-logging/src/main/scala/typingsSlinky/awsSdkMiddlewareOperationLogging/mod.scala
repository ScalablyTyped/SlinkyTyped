package typingsSlinky.awsSdkMiddlewareOperationLogging

import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.middlewareMod.HandlerArguments
import typingsSlinky.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-operation-logging", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def logOperationInfoMiddleware[Input /* <: js.Object */, Output /* <: MetadataBearer */](next: Handler[Input, Output], hasLoggerModel: HandlerExecutionContext): js.Function1[/* args */ HandlerArguments[Input], js.Promise[Output]] = js.native
}
