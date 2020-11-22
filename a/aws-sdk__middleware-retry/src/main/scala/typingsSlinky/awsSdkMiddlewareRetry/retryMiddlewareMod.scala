package typingsSlinky.awsSdkMiddlewareRetry

import typingsSlinky.awsSdkMiddlewareRetry.configurationsMod.RetryResolvedConfig
import typingsSlinky.awsSdkTypes.middlewareMod.AbsoluteLocation
import typingsSlinky.awsSdkTypes.middlewareMod.FinalizeHandler
import typingsSlinky.awsSdkTypes.middlewareMod.FinalizeRequestHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Pluggable
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-retry/dist/cjs/retryMiddleware", JSImport.Namespace)
@js.native
object retryMiddlewareMod extends js.Object {
  
  def getRetryPlugin(options: RetryResolvedConfig): Pluggable[_, _] = js.native
  
  def retryMiddleware(options: RetryResolvedConfig): js.Function1[/* next */ FinalizeHandler[_, MetadataBearer], FinalizeHandler[_, MetadataBearer]] = js.native
  
  val retryMiddlewareOptions: FinalizeRequestHandlerOptions with AbsoluteLocation = js.native
}
