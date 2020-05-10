package typingsSlinky.officeUiFabricReact.detailsRowTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsRowStyles extends js.Object {
  var cell: IStyle = js.native
  var cellAnimation: IStyle = js.native
  var cellMeasurer: IStyle = js.native
  var cellPadded: IStyle = js.native
  var cellUnpadded: IStyle = js.native
  var check: IStyle = js.native
  var checkCell: IStyle = js.native
  var checkCover: IStyle = js.native
  var fields: IStyle = js.native
  var isMultiline: IStyle = js.native
  var isRowHeader: IStyle = js.native
  var root: IStyle = js.native
}

object IDetailsRowStyles {
  @scala.inline
  def apply(): IDetailsRowStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsRowStyles]
  }
  @scala.inline
  implicit class IDetailsRowStylesOps[Self <: IDetailsRowStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCell(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(js.undefined)
        ret
    }
    @scala.inline
    def withCellNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(null)
        ret
    }
    @scala.inline
    def withCellAnimation(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withCellAnimationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellAnimation")(null)
        ret
    }
    @scala.inline
    def withCellMeasurer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMeasurer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellMeasurer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMeasurer")(js.undefined)
        ret
    }
    @scala.inline
    def withCellMeasurerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMeasurer")(null)
        ret
    }
    @scala.inline
    def withCellPadded(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellPadded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellPadded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellPadded")(js.undefined)
        ret
    }
    @scala.inline
    def withCellPaddedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellPadded")(null)
        ret
    }
    @scala.inline
    def withCellUnpadded(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellUnpadded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellUnpadded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellUnpadded")(js.undefined)
        ret
    }
    @scala.inline
    def withCellUnpaddedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellUnpadded")(null)
        ret
    }
    @scala.inline
    def withCheck(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(null)
        ret
    }
    @scala.inline
    def withCheckCell(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCell")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckCellNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCell")(null)
        ret
    }
    @scala.inline
    def withCheckCover(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckCover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCover")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckCoverNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCover")(null)
        ret
    }
    @scala.inline
    def withFields(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(null)
        ret
    }
    @scala.inline
    def withIsMultiline(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMultiline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiline")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMultilineNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiline")(null)
        ret
    }
    @scala.inline
    def withIsRowHeader(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRowHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRowHeaderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRowHeader")(null)
        ret
    }
    @scala.inline
    def withRoot(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
  }
  
}

