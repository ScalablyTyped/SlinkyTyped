package typingsSlinky.awsSdkRetryMiddleware

import typingsSlinky.awsSdkTypes.middlewareMod.FinalizeHandler
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.utilMod.DelayDecider
import typingsSlinky.awsSdkTypes.utilMod.RetryDecider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/retry-middleware", JSImport.Namespace)
@js.native
object mod extends js.Object {
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

