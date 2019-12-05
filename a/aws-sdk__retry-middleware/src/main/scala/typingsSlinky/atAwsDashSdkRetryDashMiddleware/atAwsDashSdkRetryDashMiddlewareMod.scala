package typingsSlinky.atAwsDashSdkRetryDashMiddleware

import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.FinalizeHandler
import typingsSlinky.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typingsSlinky.atAwsDashSdkTypes.buildUtilMod.DelayDecider
import typingsSlinky.atAwsDashSdkTypes.buildUtilMod.RetryDecider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/retry-middleware", JSImport.Namespace)
@js.native
object atAwsDashSdkRetryDashMiddlewareMod extends js.Object {
  def defaultDelayDecider(delayBase: Double, attempts: Double): Double = js.native
  def defaultRetryDecider(): RetryDecider = js.native
  def defaultRetryDecider(retryClockSkewErrors: Boolean): RetryDecider = js.native
  def retryMiddleware(maxRetries: Double): js.Function1[
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

