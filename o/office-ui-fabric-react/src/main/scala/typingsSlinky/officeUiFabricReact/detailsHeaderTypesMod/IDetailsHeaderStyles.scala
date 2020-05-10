package typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsHeaderStyles extends js.Object {
  var accessibleLabel: IStyle = js.native
  /**
    * @deprecated Not used
    */
  var cellIsActionable: IStyle = js.native
  var cellIsCheck: IStyle = js.native
  /**
    * @deprecated Not used
    */
  var cellIsEmpty: IStyle = js.native
  var cellIsGroupExpander: IStyle = js.native
  var cellIsResizing: IStyle = js.native
  var cellSizer: IStyle = js.native
  var cellSizerEnd: IStyle = js.native
  var cellSizerStart: IStyle = js.native
  /**
    * @deprecated Not used
    */
  var cellWrapperPadded: IStyle = js.native
  var check: IStyle = js.native
  var checkTooltip: IStyle = js.native
  var collapseButton: IStyle = js.native
  var dropHintCaretStyle: IStyle = js.native
  var dropHintCircleStyle: IStyle = js.native
  var dropHintLineStyle: IStyle = js.native
  var dropHintStyle: IStyle = js.native
  var root: IStyle = js.native
  var sizingOverlay: IStyle = js.native
}

object IDetailsHeaderStyles {
  @scala.inline
  def apply(): IDetailsHeaderStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsHeaderStyles]
  }
  @scala.inline
  implicit class IDetailsHeaderStylesOps[Self <: IDetailsHeaderStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibleLabel(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibleLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibleLabelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleLabel")(null)
        ret
    }
    @scala.inline
    def withCellIsActionable(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellIsActionable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellIsActionable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellIsActionable")(js.undefined)
        ret
    }
    @scala.inline
    def withCellIsActionableNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellIsActionable")(null)
        ret
    }
    @scala.inline
    def withCellIsCheck(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellIsCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellIsCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellIsCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withCellIsCheckNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellIsCheck")(null)
        ret
    }
    @scala.inline
    def withCellIsEmpty(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellIsEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellIsEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellIsEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withCellIsEmptyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellIsEmpty")(null)
        ret
    }
    @scala.inline
    def withCellIsGroupExpander(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellIsGroupExpander")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellIsGroupExpander: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellIsGroupExpander")(js.undefined)
        ret
    }
    @scala.inline
    def withCellIsGroupExpanderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellIsGroupExpander")(null)
        ret
    }
    @scala.inline
    def withCellIsResizing(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellIsResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellIsResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellIsResizing")(js.undefined)
        ret
    }
    @scala.inline
    def withCellIsResizingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellIsResizing")(null)
        ret
    }
    @scala.inline
    def withCellSizer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellSizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSizer")(js.undefined)
        ret
    }
    @scala.inline
    def withCellSizerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSizer")(null)
        ret
    }
    @scala.inline
    def withCellSizerEnd(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSizerEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellSizerEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSizerEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withCellSizerEndNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSizerEnd")(null)
        ret
    }
    @scala.inline
    def withCellSizerStart(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSizerStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellSizerStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSizerStart")(js.undefined)
        ret
    }
    @scala.inline
    def withCellSizerStartNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSizerStart")(null)
        ret
    }
    @scala.inline
    def withCellWrapperPadded(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellWrapperPadded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellWrapperPadded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellWrapperPadded")(js.undefined)
        ret
    }
    @scala.inline
    def withCellWrapperPaddedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellWrapperPadded")(null)
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
    def withCheckTooltip(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckTooltipNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkTooltip")(null)
        ret
    }
    @scala.inline
    def withCollapseButton(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseButtonNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseButton")(null)
        ret
    }
    @scala.inline
    def withDropHintCaretStyle(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropHintCaretStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropHintCaretStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropHintCaretStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDropHintCaretStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropHintCaretStyle")(null)
        ret
    }
    @scala.inline
    def withDropHintCircleStyle(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropHintCircleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropHintCircleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropHintCircleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDropHintCircleStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropHintCircleStyle")(null)
        ret
    }
    @scala.inline
    def withDropHintLineStyle(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropHintLineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropHintLineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropHintLineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDropHintLineStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropHintLineStyle")(null)
        ret
    }
    @scala.inline
    def withDropHintStyle(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropHintStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropHintStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropHintStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDropHintStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropHintStyle")(null)
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
    @scala.inline
    def withSizingOverlay(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizingOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizingOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizingOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withSizingOverlayNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizingOverlay")(null)
        ret
    }
  }
  
}

