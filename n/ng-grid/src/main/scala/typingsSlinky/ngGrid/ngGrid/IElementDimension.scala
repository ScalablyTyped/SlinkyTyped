package typingsSlinky.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IElementDimension extends js.Object {
  var rootMaxH: js.UndefOr[Double] = js.native
  var rootMaxW: js.UndefOr[Double] = js.native
  var rowIndexCellW: js.UndefOr[Double] = js.native
  var rowSelectedCellW: js.UndefOr[Double] = js.native
  var scrollH: js.UndefOr[Double] = js.native
  var scrollW: js.UndefOr[Double] = js.native
}

object IElementDimension {
  @scala.inline
  def apply(): IElementDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IElementDimension]
  }
  @scala.inline
  implicit class IElementDimensionOps[Self <: IElementDimension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRootMaxH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootMaxH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootMaxH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootMaxH")(js.undefined)
        ret
    }
    @scala.inline
    def withRootMaxW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootMaxW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootMaxW: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootMaxW")(js.undefined)
        ret
    }
    @scala.inline
    def withRowIndexCellW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndexCellW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowIndexCellW: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndexCellW")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSelectedCellW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelectedCellW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSelectedCellW: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelectedCellW")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollH")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollW: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollW")(js.undefined)
        ret
    }
  }
  
}

