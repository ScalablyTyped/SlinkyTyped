package typingsSlinky.requestDashPromiseDashNative.requestDashPromiseDashNativeMod

import typingsSlinky.request.requestMod.Request
import typingsSlinky.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestPromise[T]
  extends Request
     with Promise[T] {
  def promise(): js.Promise[T] = js.native
}

