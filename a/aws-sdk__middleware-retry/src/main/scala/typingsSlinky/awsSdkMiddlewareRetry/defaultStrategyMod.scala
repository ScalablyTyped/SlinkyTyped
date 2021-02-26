package typingsSlinky.awsSdkMiddlewareRetry

import typingsSlinky.awsSdkSmithyClient.sdkErrorMod.SdkError
import typingsSlinky.awsSdkTypes.utilMod.Provider
import typingsSlinky.awsSdkTypes.utilMod.RetryStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultStrategyMod {
  
  @JSImport("@aws-sdk/middleware-retry/dist/cjs/defaultStrategy", "DEFAULT_MAX_ATTEMPTS")
  @js.native
  val DEFAULT_MAX_ATTEMPTS: /* 3 */ Double = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist/cjs/defaultStrategy", "DEFAULT_RETRY_MODE")
  @js.native
  val DEFAULT_RETRY_MODE: /* "standard" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist/cjs/defaultStrategy", "StandardRetryStrategy")
  @js.native
  class StandardRetryStrategy protected () extends RetryStrategy {
    def this(maxAttemptsProvider: Provider[Double]) = this()
    def this(maxAttemptsProvider: Provider[Double], options: StandardRetryStrategyOptions) = this()
    
    var delayDecider: js.Any = js.native
    
    var getMaxAttempts: js.Any = js.native
    
    val maxAttemptsProvider: js.Any = js.native
    
    var retryDecider: js.Any = js.native
    
    var retryQuota: js.Any = js.native
    
    var shouldRetry: js.Any = js.native
  }
  
  type DelayDecider = js.Function2[/* delayBase */ Double, /* attempts */ Double, Double]
  
  type RetryDecider = js.Function1[/* error */ SdkError, Boolean]
  
  @js.native
  trait RetryQuota extends StObject {
    
    /**
      * returns true if retry tokens are available from the retry quota bucket.
      */
    def hasRetryTokens(error: SdkError): Boolean = js.native
    
    /**
      * releases tokens back to the retry quota.
      */
    def releaseRetryTokens(): Unit = js.native
    def releaseRetryTokens(releaseCapacityAmount: Double): Unit = js.native
    
    /**
      * returns token amount from the retry quota bucket.
      * throws error is retry tokens are not available.
      */
    def retrieveRetryTokens(error: SdkError): Double = js.native
  }
  
  @js.native
  trait StandardRetryStrategyOptions extends StObject {
    
    var delayDecider: js.UndefOr[DelayDecider] = js.native
    
    var retryDecider: js.UndefOr[RetryDecider] = js.native
    
    var retryQuota: js.UndefOr[RetryQuota] = js.native
  }
  object StandardRetryStrategyOptions {
    
    @scala.inline
    def apply(): StandardRetryStrategyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StandardRetryStrategyOptions]
    }
    
    @scala.inline
    implicit class StandardRetryStrategyOptionsMutableBuilder[Self <: StandardRetryStrategyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelayDecider(value: (/* delayBase */ Double, /* attempts */ Double) => Double): Self = StObject.set(x, "delayDecider", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDelayDeciderUndefined: Self = StObject.set(x, "delayDecider", js.undefined)
      
      @scala.inline
      def setRetryDecider(value: /* error */ SdkError => Boolean): Self = StObject.set(x, "retryDecider", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRetryDeciderUndefined: Self = StObject.set(x, "retryDecider", js.undefined)
      
      @scala.inline
      def setRetryQuota(value: RetryQuota): Self = StObject.set(x, "retryQuota", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryQuotaUndefined: Self = StObject.set(x, "retryQuota", js.undefined)
    }
  }
}
