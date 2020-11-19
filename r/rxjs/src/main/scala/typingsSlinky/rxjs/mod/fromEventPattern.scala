package typingsSlinky.rxjs.mod

import typingsSlinky.rxjs.fromEventMod.NodeEventHandler
import typingsSlinky.rxjs.internalObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs", "fromEventPattern")
@js.native
object fromEventPattern extends js.Object {
  
  def apply[T](addHandler: js.Function1[/* handler */ NodeEventHandler, _]): Observable[T] = js.native
  def apply[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, _],
    removeHandler: js.UndefOr[scala.Nothing],
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = js.native
  def apply[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, _],
    removeHandler: js.Function2[/* handler */ NodeEventHandler, /* signal */ js.UndefOr[js.Any], Unit]
  ): Observable[T] = js.native
  def apply[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, _],
    removeHandler: js.Function2[/* handler */ NodeEventHandler, /* signal */ js.UndefOr[js.Any], Unit],
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = js.native
}
