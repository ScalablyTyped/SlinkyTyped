package typingsSlinky.reactNavigation

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNavigation.mod.NavigationFocusInjectedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon1[T, P] extends js.Object {
  var onRef: js.UndefOr[Ref[ReactComponentClass[T with NavigationFocusInjectedProps[P]]]] = js.native
}

object Anon1 {
  @scala.inline
  def apply[T, P](): Anon1[T, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anon1[T, P]]
  }
  @scala.inline
  implicit class Anon1Ops[Self[t, p] <: Anon1[t, p], T, P] (val x: Self[T, P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, P]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, P]) with Other]
    @scala.inline
    def withOnRefRefObject(value: ReactRef[ReactComponentClass[T with NavigationFocusInjectedProps[P]]]): Self[T, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRefFunction1(value: /* instance */ (ReactComponentClass[T with NavigationFocusInjectedProps[P]]) | Null => Unit): Self[T, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnRef(value: Ref[ReactComponentClass[T with NavigationFocusInjectedProps[P]]]): Self[T, P] = {
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

