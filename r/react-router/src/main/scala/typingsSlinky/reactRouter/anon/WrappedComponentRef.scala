package typingsSlinky.reactRouter.anon

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactRouter.mod.WithRouterProps
import typingsSlinky.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedComponentRef[C /* <: ReactComponentClass[_] */] extends WithRouterProps[C] {
  var wrappedComponentRef: js.UndefOr[Ref[InstanceType[C]]] = js.native
}

object WrappedComponentRef {
  @scala.inline
  def apply[C](): WrappedComponentRef[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WrappedComponentRef[C]]
  }
  @scala.inline
  implicit class WrappedComponentRefOps[Self[c] <: WrappedComponentRef[c], C] (val x: Self[C]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[C] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[C] with Other]
    @scala.inline
    def withWrappedComponentRefRefObject(value: ReactRef[InstanceType[C]]): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappedComponentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrappedComponentRefFunction1(value: /* instance */ InstanceType[C] | Null => Unit): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappedComponentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrappedComponentRef(value: Ref[InstanceType[C]]): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappedComponentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrappedComponentRef: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappedComponentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withWrappedComponentRefNull: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappedComponentRef")(null)
        ret
    }
  }
  
}

