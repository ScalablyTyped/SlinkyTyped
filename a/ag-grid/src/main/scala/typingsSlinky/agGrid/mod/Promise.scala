package typingsSlinky.agGrid.mod

import typingsSlinky.agGrid.utilsMod.ExternalPromise
import typingsSlinky.agGrid.utilsMod.ResolveAndRejectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid", "Promise")
@js.native
class Promise[T] protected ()
  extends typingsSlinky.agGrid.utilsMod.Promise[T] {
  def this(callback: ResolveAndRejectCallback[T]) = this()
}
/* static members */
@JSImport("ag-grid", "Promise")
@js.native
object Promise extends js.Object {
  
  def all[T](toCombine: js.Array[typingsSlinky.agGrid.utilsMod.Promise[T]]): typingsSlinky.agGrid.utilsMod.Promise[js.Array[T]] = js.native
  
  def external[T](): ExternalPromise[T] = js.native
  
  def resolve[T](value: T): typingsSlinky.agGrid.utilsMod.Promise[T] = js.native
}
