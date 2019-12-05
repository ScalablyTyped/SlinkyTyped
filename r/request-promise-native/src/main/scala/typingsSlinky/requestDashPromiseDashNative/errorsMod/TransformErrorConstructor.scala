package typingsSlinky.requestDashPromiseDashNative.errorsMod

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.requestDashPromiseDashNative.requestDashPromiseDashNativeMod.FullResponse
import typingsSlinky.requestDashPromiseDashNative.requestDashPromiseDashNativeMod.Options
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformErrorConstructor
  extends Error
     with Instantiable3[/* cause */ js.Any, /* options */ Options, /* response */ FullResponse, TransformError] {
  def apply(cause: js.Any, options: Options, response: FullResponse): TransformError = js.native
}

