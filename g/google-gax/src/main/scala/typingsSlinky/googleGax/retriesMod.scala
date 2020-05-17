package typingsSlinky.googleGax

import typingsSlinky.googleGax.apitypesMod.GRPCCall
import typingsSlinky.googleGax.apitypesMod.GRPCCallOtherArgs
import typingsSlinky.googleGax.apitypesMod.SimpleCallbackFunction
import typingsSlinky.googleGax.gaxMod.RetryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/normalCalls/retries", JSImport.Namespace)
@js.native
object retriesMod extends js.Object {
  def retryable(func: GRPCCall, retry: RetryOptions, otherArgs: GRPCCallOtherArgs): SimpleCallbackFunction = js.native
}

