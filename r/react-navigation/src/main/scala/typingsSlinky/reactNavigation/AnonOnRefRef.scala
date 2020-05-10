package typingsSlinky.reactNavigation

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNavigation.mod.NavigationInjectedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnRefRef[T, P] extends js.Object {
  var onRef: js.UndefOr[Ref[ReactComponentClass[T with NavigationInjectedProps[P]]]] = js.native
}

object AnonOnRefRef {
  @scala.inline
  def apply[T, P](): AnonOnRefRef[T, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonOnRefRef[T, P]]
  }
  @scala.inline
  implicit class AnonOnRefRefOps[Self[t, p] <: AnonOnRefRef[t, p], T, P] (val x: Self[T, P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, P]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, P]) with Other]
    @scala.inline
    def withOnRefRefObject(value: ReactRef[ReactComponentClass[T with NavigationInjectedProps[P]]]): Self[T, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRefFunction1(value: /* instance */ (ReactComponentClass[T with NavigationInjectedProps[P]]) | Null => Unit): Self[T, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnRef(value: Ref[ReactComponentClass[T with NavigationInjectedProps[P]]]): Self[T, P] = {
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

