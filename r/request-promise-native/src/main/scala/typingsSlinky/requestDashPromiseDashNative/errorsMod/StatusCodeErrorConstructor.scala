package typingsSlinky.requestDashPromiseDashNative.errorsMod

import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.requestDashPromiseDashNative.requestDashPromiseDashNativeMod.FullResponse
import typingsSlinky.requestDashPromiseDashNative.requestDashPromiseDashNativeMod.Options
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusCodeErrorConstructor
  extends Error
     with Instantiable4[
      /* statusCode */ Double, 
      /* body */ js.Any, 
      /* options */ Options, 
      /* response */ FullResponse, 
      StatusCodeError
    ] {
  def apply(statusCode: Double, body: js.Any, options: Options, response: FullResponse): StatusCodeError = js.native
}

