package typingsSlinky.awsSdkMiddlewareRetry.defaultStrategyMod

import typingsSlinky.awsSdkTypes.utilMod.Provider
import typingsSlinky.awsSdkTypes.utilMod.RetryStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
