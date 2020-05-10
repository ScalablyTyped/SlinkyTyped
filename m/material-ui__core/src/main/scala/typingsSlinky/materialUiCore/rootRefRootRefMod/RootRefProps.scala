package typingsSlinky.materialUiCore.rootRefRootRefMod

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RootRefProps[T] extends js.Object {
  var rootRef: js.UndefOr[(js.Function1[/* instance */ T | Null, Unit]) | ReactRef[T]] = js.native
}

object RootRefProps {
  @scala.inline
  def apply[T](): RootRefProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootRefProps[T]]
  }
  @scala.inline
  implicit class RootRefPropsOps[Self[t] <: RootRefProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withRootRefRefObject(value: ReactRef[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootRefFunction1(value: /* instance */ T | Null => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRootRef(value: (js.Function1[/* instance */ T | Null, Unit]) | ReactRef[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootRef: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootRef")(js.undefined)
        ret
    }
  }
  
}

