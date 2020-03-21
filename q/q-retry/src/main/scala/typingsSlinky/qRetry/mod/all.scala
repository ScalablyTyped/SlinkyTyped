package typingsSlinky.qRetry.mod

import typingsSlinky.q.mod.IWhenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "all")
@js.native
object all extends js.Object {
  def apply[T](promises: IWhenable[js.Array[IWhenable[T]]]): typingsSlinky.q.mod.Promise[js.Array[T]] = js.native
}

