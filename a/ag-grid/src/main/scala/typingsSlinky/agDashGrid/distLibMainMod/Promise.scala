package typingsSlinky.agDashGrid.distLibMainMod

import typingsSlinky.agDashGrid.distLibUtilsMod.ExternalPromise
import typingsSlinky.agDashGrid.distLibUtilsMod.ResolveAndRejectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/main", "Promise")
@js.native
class Promise[T] protected ()
  extends typingsSlinky.agDashGrid.distLibUtilsMod.Promise[T] {
  def this(callback: ResolveAndRejectCallback[T]) = this()
}

/* static members */
@JSImport("ag-grid/dist/lib/main", "Promise")
@js.native
object Promise extends js.Object {
  def all[T](toCombine: js.Array[typingsSlinky.agDashGrid.distLibUtilsMod.Promise[T]]): typingsSlinky.agDashGrid.distLibUtilsMod.Promise[js.Array[T]] = js.native
  def external[T](): ExternalPromise[T] = js.native
  def resolve[T](value: T): typingsSlinky.agDashGrid.distLibUtilsMod.Promise[T] = js.native
}

