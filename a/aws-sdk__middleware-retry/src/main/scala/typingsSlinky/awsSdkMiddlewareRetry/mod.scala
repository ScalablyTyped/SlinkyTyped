package typingsSlinky.awsSdkMiddlewareRetry

import typingsSlinky.awsSdkMiddlewareRetry.configurationsMod.PreviouslyResolved
import typingsSlinky.awsSdkMiddlewareRetry.configurationsMod.RetryInputConfig
import typingsSlinky.awsSdkMiddlewareRetry.configurationsMod.RetryResolvedConfig
import typingsSlinky.awsSdkMiddlewareRetry.defaultStrategyMod.StandardRetryStrategyOptions
import typingsSlinky.awsSdkNodeConfigProvider.configLoaderMod.LoadedConfigSelectors
import typingsSlinky.awsSdkSmithyClient.sdkErrorMod.SdkError
import typingsSlinky.awsSdkTypes.middlewareMod.AbsoluteLocation
import typingsSlinky.awsSdkTypes.middlewareMod.FinalizeHandler
import typingsSlinky.awsSdkTypes.middlewareMod.FinalizeRequestHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Pluggable
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-retry", "CONFIG_MAX_ATTEMPTS")
  @js.native
  val CONFIG_MAX_ATTEMPTS: /* "max_attempts" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "CONFIG_RETRY_MODE")
  @js.native
  val CONFIG_RETRY_MODE: /* "retry_mode" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "DEFAULT_MAX_ATTEMPTS")
  @js.native
  val DEFAULT_MAX_ATTEMPTS: /* 3 */ Double = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "DEFAULT_RETRY_MODE")
  @js.native
  val DEFAULT_RETRY_MODE: /* "standard" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "ENV_MAX_ATTEMPTS")
  @js.native
  val ENV_MAX_ATTEMPTS: /* "AWS_MAX_ATTEMPTS" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "ENV_RETRY_MODE")
  @js.native
  val ENV_RETRY_MODE: /* "AWS_RETRY_MODE" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "NODE_MAX_ATTEMPT_CONFIG_OPTIONS")
  @js.native
  val NODE_MAX_ATTEMPT_CONFIG_OPTIONS: LoadedConfigSelectors[Double] = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "NODE_RETRY_MODE_CONFIG_OPTIONS")
  @js.native
  val NODE_RETRY_MODE_CONFIG_OPTIONS: LoadedConfigSelectors[String] = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "StandardRetryStrategy")
  @js.native
  class StandardRetryStrategy protected ()
    extends typingsSlinky.awsSdkMiddlewareRetry.defaultStrategyMod.StandardRetryStrategy {
    def this(maxAttemptsProvider: Provider[Double]) = this()
    def this(maxAttemptsProvider: Provider[Double], options: StandardRetryStrategyOptions) = this()
  }
  
  @JSImport("@aws-sdk/middleware-retry", "defaultDelayDecider")
  @js.native
  def defaultDelayDecider(delayBase: Double, attempts: Double): Double = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "defaultRetryDecider")
  @js.native
  def defaultRetryDecider(error: SdkError): Boolean = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "getRetryPlugin")
  @js.native
  def getRetryPlugin(options: RetryResolvedConfig): Pluggable[_, _] = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "resolveRetryConfig")
  @js.native
  def resolveRetryConfig[T](input: T with PreviouslyResolved with RetryInputConfig): T with RetryResolvedConfig = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "retryMiddleware")
  @js.native
  def retryMiddleware(options: RetryResolvedConfig): js.Function1[/* next */ FinalizeHandler[_, MetadataBearer], FinalizeHandler[_, MetadataBearer]] = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "retryMiddlewareOptions")
  @js.native
  val retryMiddlewareOptions: FinalizeRequestHandlerOptions with AbsoluteLocation = js.native
}
