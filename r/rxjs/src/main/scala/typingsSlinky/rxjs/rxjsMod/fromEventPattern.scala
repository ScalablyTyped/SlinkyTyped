package typingsSlinky.rxjs.rxjsMod

import typingsSlinky.rxjs.internalObservableFromEventMod.NodeEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "fromEventPattern")
@js.native
object fromEventPattern extends js.Object {
  def apply[T](addHandler: js.Function1[/* handler */ NodeEventHandler, _]): typingsSlinky.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, _],
    removeHandler: js.Function2[/* handler */ NodeEventHandler, /* signal */ js.UndefOr[js.Any], Unit]
  ): typingsSlinky.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T](
    addHandler: js.Function1[/* handler */ NodeEventHandler, _],
    removeHandler: js.Function2[/* handler */ NodeEventHandler, /* signal */ js.UndefOr[js.Any], Unit],
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): typingsSlinky.rxjs.internalObservableMod.Observable[T] = js.native
}

