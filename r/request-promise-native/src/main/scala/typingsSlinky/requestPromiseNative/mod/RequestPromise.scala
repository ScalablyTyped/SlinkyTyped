package typingsSlinky.requestPromiseNative.mod

import typingsSlinky.request.mod.Request
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

