package typingsSlinky.reactNavigation

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNavigation.mod.NavigationFocusInjectedProps
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon0[T /* <: ReactComponentClass[P] */, P /* <: NavigationFocusInjectedProps[NavigationParams] */] extends js.Object {
  var onRef: js.UndefOr[Ref[InstanceType[T]]] = js.native
}

object Anon0 {
  @scala.inline
  def apply[T, P](): Anon0[T, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anon0[T, P]]
  }
  @scala.inline
  implicit class Anon0Ops[Self[t, p] <: Anon0[t, p], T, P] (val x: Self[T, P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, P]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, P]) with Other]
    @scala.inline
    def withOnRefRefObject(value: ReactRef[InstanceType[T]]): Self[T, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRefFunction1(value: /* instance */ InstanceType[T] | Null => Unit): Self[T, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnRef(value: Ref[InstanceType[T]]): Self[T, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnRef: Self[T, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRef")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRefNull: Self[T, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRef")(null)
        ret
    }
  }
  
}

