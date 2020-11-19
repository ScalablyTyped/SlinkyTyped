package typingsSlinky.awsSdkRetryMiddleware

import typingsSlinky.awsSdkTypes.utilMod.RetryDecider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/retry-middleware/build/retryDecider", JSImport.Namespace)
@js.native
object retryDeciderMod extends js.Object {
  
  def defaultRetryDecider(): RetryDecider = js.native
  def defaultRetryDecider(retryClockSkewErrors: Boolean): RetryDecider = js.native
}
