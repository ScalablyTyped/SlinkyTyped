package typingsSlinky.agGrid.mainMod

import typingsSlinky.agGrid.utilsMod.ExternalPromise
import typingsSlinky.agGrid.utilsMod.ResolveAndRejectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/main", "Promise")
@js.native
class Promise[T] protected ()
  extends typingsSlinky.agGrid.utilsMod.Promise[T] {
  def this(callback: ResolveAndRejectCallback[T]) = this()
}
/* static members */
object Promise {
  
  @JSImport("ag-grid/dist/lib/main", "Promise.all")
  @js.native
  def all[T](toCombine: js.Array[typingsSlinky.agGrid.utilsMod.Promise[T]]): typingsSlinky.agGrid.utilsMod.Promise[js.Array[T]] = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Promise.external")
  @js.native
  def external[T](): ExternalPromise[T] = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Promise.resolve")
  @js.native
  def resolve[T](value: T): typingsSlinky.agGrid.utilsMod.Promise[T] = js.native
}
