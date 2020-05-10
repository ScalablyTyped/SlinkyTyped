package typingsSlinky.blueprintjsTable.rowHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRowHeights extends js.Object {
  var defaultRowHeight: js.UndefOr[Double] = js.native
  var maxRowHeight: js.UndefOr[Double] = js.native
  var minRowHeight: js.UndefOr[Double] = js.native
}

object IRowHeights {
  @scala.inline
  def apply(): IRowHeights = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRowHeights]
  }
  @scala.inline
  implicit class IRowHeightsOps[Self <: IRowHeights] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRowHeight")(js.undefined)
        ret
    }
  }
  
}

