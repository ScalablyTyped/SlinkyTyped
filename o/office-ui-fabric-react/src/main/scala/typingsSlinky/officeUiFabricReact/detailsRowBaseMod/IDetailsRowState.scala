package typingsSlinky.officeUiFabricReact.detailsRowBaseMod

import typingsSlinky.officeUiFabricReact.AnonColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsRowState extends js.Object {
  var columnMeasureInfo: js.UndefOr[AnonColumn] = js.native
  var isDropping: js.UndefOr[Boolean] = js.native
  var selectionState: IDetailsRowSelectionState = js.native
}

object IDetailsRowState {
  @scala.inline
  def apply(selectionState: IDetailsRowSelectionState): IDetailsRowState = {
    val __obj = js.Dynamic.literal(selectionState = selectionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsRowState]
  }
  @scala.inline
  implicit class IDetailsRowStateOps[Self <: IDetailsRowState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectionState(value: IDetailsRowSelectionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnMeasureInfo(value: AnonColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnMeasureInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnMeasureInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnMeasureInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDropping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDropping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDropping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDropping")(js.undefined)
        ret
    }
  }
  
}

