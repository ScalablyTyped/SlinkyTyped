package typingsSlinky.awsSdkMiddlewareRetry.configurationsMod

import typingsSlinky.awsSdkTypes.utilMod.Provider
import typingsSlinky.awsSdkTypes.utilMod.RetryStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryResolvedConfig extends js.Object {
  
  def maxAttempts(): js.Promise[Double] = js.native
  @JSName("maxAttempts")
  var maxAttempts_Original: Provider[Double] = js.native
  
  var retryStrategy: RetryStrategy = js.native
}
