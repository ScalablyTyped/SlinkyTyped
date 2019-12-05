package typingsSlinky.qDashRetry.qDashRetryMod

import typingsSlinky.q.qMod.IWhenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "race")
@js.native
object race extends js.Object {
  def apply[T](promises: js.Array[IWhenable[T]]): typingsSlinky.q.qMod.Promise[T] = js.native
}

