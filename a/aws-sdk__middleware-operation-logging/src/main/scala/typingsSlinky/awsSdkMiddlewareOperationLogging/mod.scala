package typingsSlinky.awsSdkMiddlewareOperationLogging

import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-operation-logging", "logOperationInfoMiddleware")
  @js.native
  def logOperationInfoMiddleware[Input /* <: js.Object */, Output /* <: MetadataBearer */](next: Handler[Input, Output], hasLoggerModel: HandlerExecutionContext): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HandlerArguments<Input> */ /* args */ js.Any, 
    js.Promise[Output]
  ] = js.native
}
