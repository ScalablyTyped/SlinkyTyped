package typingsSlinky.officeUiFabricReact.baseExtendedPickerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseExtendedPicker[T] extends js.Object {
  /** Forces the picker to resolve */
  var forceResolve: js.UndefOr[js.Function0[Unit]] = js.native
  /** Gets the current value of the input. */
  var items: js.UndefOr[js.Array[T]] = js.native
  /** Sets focus to the input. */
  def focus(): Unit = js.native
}

object IBaseExtendedPicker {
  @scala.inline
  def apply[T](focus: () => Unit): IBaseExtendedPicker[T] = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
    __obj.asInstanceOf[IBaseExtendedPicker[T]]
  }
  @scala.inline
  implicit class IBaseExtendedPickerOps[Self[t] <: IBaseExtendedPicker[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFocus(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withForceResolve(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceResolve")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutForceResolve: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceResolve")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
  }
  
}

