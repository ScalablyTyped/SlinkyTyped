package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{initialRowStateAccessor (row : react-table.react-table.Row<D>): react-table.react-table.UseRowStateLocalState<D, unknown>, getResetRowStateDeps (instance : react-table.react-table.TableInstance<D>): std.Array<any>,   autoResetRowState ? :boolean}> */
@js.native
trait UseRowStateOptions[D /* <: js.Object */] extends js.Object {
  var autoResetRowState: js.UndefOr[Boolean] = js.native
  var getResetRowStateDeps: js.UndefOr[js.Function1[/* instance */ TableInstance[D], js.Array[_]]] = js.native
  var initialRowStateAccessor: js.UndefOr[js.Function1[/* row */ Row[D], UseRowStateLocalState[D, _]]] = js.native
}

object UseRowStateOptions {
  @scala.inline
  def apply[D](): UseRowStateOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseRowStateOptions[D]]
  }
  @scala.inline
  implicit class UseRowStateOptionsOps[Self[d] <: UseRowStateOptions[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withAutoResetRowState(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResetRowState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResetRowState: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResetRowState")(js.undefined)
        ret
    }
    @scala.inline
    def withGetResetRowStateDeps(value: /* instance */ TableInstance[D] => js.Array[_]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResetRowStateDeps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetResetRowStateDeps: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResetRowStateDeps")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialRowStateAccessor(value: /* row */ Row[D] => UseRowStateLocalState[D, _]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRowStateAccessor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInitialRowStateAccessor: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRowStateAccessor")(js.undefined)
        ret
    }
  }
  
}

