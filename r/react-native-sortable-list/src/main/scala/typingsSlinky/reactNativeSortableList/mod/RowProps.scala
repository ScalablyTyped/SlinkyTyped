package typingsSlinky.reactNativeSortableList.mod

import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.PanResponderGestureState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowProps[T, K] extends js.Object {
  var active: Boolean = js.native
  var data: T = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[Double] = js.native
  var key: js.UndefOr[K] = js.native
  var toggleRowActive: js.UndefOr[
    js.Function2[
      SyntheticEvent[NodeHandle, NativeTouchEvent], 
      /* gestureState */ js.UndefOr[PanResponderGestureState], 
      Unit
    ]
  ] = js.native
}

object RowProps {
  @scala.inline
  def apply[T, K](active: Boolean, data: T): RowProps[T, K] = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowProps[T, K]]
  }
  @scala.inline
  implicit class RowPropsOps[Self[t, k] <: RowProps[t, k], T, K] (val x: Self[T, K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, K]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, K]) with Other]
    @scala.inline
    def withActive(value: Boolean): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: T): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: K): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleRowActive(
      value: (SyntheticEvent[NodeHandle, NativeTouchEvent], /* gestureState */ js.UndefOr[PanResponderGestureState]) => Unit
    ): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleRowActive")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutToggleRowActive: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleRowActive")(js.undefined)
        ret
    }
  }
  
}

