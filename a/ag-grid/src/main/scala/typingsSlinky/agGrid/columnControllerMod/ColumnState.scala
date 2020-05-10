package typingsSlinky.agGrid.columnControllerMod

import typingsSlinky.agGrid.agGridStrings.left
import typingsSlinky.agGrid.agGridStrings.right
import typingsSlinky.agGrid.colDefMod.IAggFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnState extends js.Object {
  var aggFunc: js.UndefOr[String | IAggFunc] = js.native
  var colId: String = js.native
  var hide: js.UndefOr[Boolean] = js.native
  var pinned: js.UndefOr[Boolean | String | left | right] = js.native
  var pivotIndex: js.UndefOr[Double] = js.native
  var rowGroupIndex: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object ColumnState {
  @scala.inline
  def apply(colId: String): ColumnState = {
    val __obj = js.Dynamic.literal(colId = colId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnState]
  }
  @scala.inline
  implicit class ColumnStateOps[Self <: ColumnState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAggFuncFunction1(value: /* input */ js.Array[js.Any] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggFunc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAggFunc(value: String | IAggFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withPinned(value: Boolean | String | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withRowGroupIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroupIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowGroupIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGroupIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

