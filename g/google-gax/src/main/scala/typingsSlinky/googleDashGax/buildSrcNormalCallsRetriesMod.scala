package typingsSlinky.googleDashGax

import typingsSlinky.googleDashGax.buildSrcApitypesMod.GRPCCall
import typingsSlinky.googleDashGax.buildSrcApitypesMod.GRPCCallOtherArgs
import typingsSlinky.googleDashGax.buildSrcApitypesMod.SimpleCallbackFunction
import typingsSlinky.googleDashGax.buildSrcGaxMod.RetryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/normalCalls/retries", JSImport.Namespace)
@js.native
object buildSrcNormalCallsRetriesMod extends js.Object {
  def retryable(func: GRPCCall, retry: RetryOptions, otherArgs: GRPCCallOtherArgs): SimpleCallbackFunction = js.native
}

