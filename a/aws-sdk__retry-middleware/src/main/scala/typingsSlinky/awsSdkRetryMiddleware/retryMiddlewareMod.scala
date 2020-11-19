package typingsSlinky.awsSdkRetryMiddleware

import typingsSlinky.awsSdkTypes.middlewareMod.FinalizeHandler
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.utilMod.DelayDecider
import typingsSlinky.awsSdkTypes.utilMod.RetryDecider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/retry-middleware/build/retryMiddleware", JSImport.Namespace)
@js.native
object retryMiddlewareMod extends js.Object {
  
  def retryMiddleware(maxRetries: Double): js.Function1[
    /* next */ FinalizeHandler[_, MetadataBearer, _], 
    FinalizeHandler[_, MetadataBearer, _]
  ] = js.native
  def retryMiddleware(maxRetries: Double, retryDecider: js.UndefOr[scala.Nothing], delayDecider: DelayDecider): js.Function1[
    /* next */ FinalizeHandler[_, MetadataBearer, _], 
    FinalizeHandler[_, MetadataBearer, _]
  ] = js.native
  def retryMiddleware(maxRetries: Double, retryDecider: RetryDecider): js.Function1[
    /* next */ FinalizeHandler[_, MetadataBearer, _], 
    FinalizeHandler[_, MetadataBearer, _]
  ] = js.native
  def retryMiddleware(maxRetries: Double, retryDecider: RetryDecider, delayDecider: DelayDecider): js.Function1[
    /* next */ FinalizeHandler[_, MetadataBearer, _], 
    FinalizeHandler[_, MetadataBearer, _]
  ] = js.native
}
