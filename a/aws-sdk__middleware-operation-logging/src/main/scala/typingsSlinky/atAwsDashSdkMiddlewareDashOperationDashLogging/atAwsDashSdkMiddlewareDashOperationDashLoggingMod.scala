package typingsSlinky.atAwsDashSdkMiddlewareDashOperationDashLogging

import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.HandlerArguments
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.HandlerExecutionContext
import typingsSlinky.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/middleware-operation-logging", JSImport.Namespace)
@js.native
object atAwsDashSdkMiddlewareDashOperationDashLoggingMod extends js.Object {
  def logOperationInfoMiddleware[Input /* <: js.Object */, Output /* <: MetadataBearer */](next: Handler[Input, Output], hasLoggerModel: HandlerExecutionContext): js.Function1[/* args */ HandlerArguments[Input], js.Promise[Output]] = js.native
}

