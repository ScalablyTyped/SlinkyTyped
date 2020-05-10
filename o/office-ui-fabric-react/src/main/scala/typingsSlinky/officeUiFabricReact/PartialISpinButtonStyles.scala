package typingsSlinky.officeUiFabricReact

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/SpinButton/SpinButton.types.ISpinButtonStyles> */
@js.native
trait PartialISpinButtonStyles extends js.Object {
  var arrowButtonsContainer: js.UndefOr[IStyle] = js.native
  var arrowButtonsContainerDisabled: js.UndefOr[IStyle] = js.native
  var icon: js.UndefOr[IStyle] = js.native
  var iconDisabled: js.UndefOr[IStyle] = js.native
  var input: js.UndefOr[IStyle] = js.native
  var inputDisabled: js.UndefOr[IStyle] = js.native
  var inputTextSelected: js.UndefOr[IStyle] = js.native
  var label: js.UndefOr[IStyle] = js.native
  var labelDisabled: js.UndefOr[IStyle] = js.native
  var labelWrapper: js.UndefOr[IStyle] = js.native
  var labelWrapperBottom: js.UndefOr[IStyle] = js.native
  var labelWrapperEnd: js.UndefOr[IStyle] = js.native
  var labelWrapperStart: js.UndefOr[IStyle] = js.native
  var labelWrapperTop: js.UndefOr[IStyle] = js.native
  var root: js.UndefOr[IStyle] = js.native
  var spinButtonWrapper: js.UndefOr[IStyle] = js.native
  var spinButtonWrapperDisabled: js.UndefOr[IStyle] = js.native
  var spinButtonWrapperFocused: js.UndefOr[IStyle] = js.native
  var spinButtonWrapperHovered: js.UndefOr[IStyle] = js.native
  var spinButtonWrapperTopBottom: js.UndefOr[IStyle] = js.native
}

object PartialISpinButtonStyles {
  @scala.inline
  def apply(): PartialISpinButtonStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialISpinButtonStyles]
  }
  @scala.inline
  implicit class PartialISpinButtonStylesOps[Self <: PartialISpinButtonStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowButtonsContainer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowButtonsContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowButtonsContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowButtonsContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowButtonsContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowButtonsContainer")(null)
        ret
    }
    @scala.inline
    def withArrowButtonsContainerDisabled(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowButtonsContainerDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowButtonsContainerDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowButtonsContainerDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowButtonsContainerDisabledNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowButtonsContainerDisabled")(null)
        ret
    }
    @scala.inline
    def withIcon(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(null)
        ret
    }
    @scala.inline
    def withIconDisabled(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIconDisabledNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconDisabled")(null)
        ret
    }
    @scala.inline
    def withInput(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withInputNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(null)
        ret
    }
    @scala.inline
    def withInputDisabled(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInputDisabledNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDisabled")(null)
        ret
    }
    @scala.inline
    def withInputTextSelected(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputTextSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputTextSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputTextSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withInputTextSelectedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputTextSelected")(null)
        ret
    }
    @scala.inline
    def withLabel(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(null)
        ret
    }
    @scala.inline
    def withLabelDisabled(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelDisabledNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDisabled")(null)
        ret
    }
    @scala.inline
    def withLabelWrapper(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelWrapperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrapper")(null)
        ret
    }
    @scala.inline
    def withLabelWrapperBottom(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrapperBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelWrapperBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrapperBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelWrapperBottomNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrapperBottom")(null)
        ret
    }
    @scala.inline
    def withLabelWrapperEnd(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrapperEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelWrapperEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrapperEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelWrapperEndNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrapperEnd")(null)
        ret
    }
    @scala.inline
    def withLabelWrapperStart(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrapperStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelWrapperStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrapperStart")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelWrapperStartNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrapperStart")(null)
        ret
    }
    @scala.inline
    def withLabelWrapperTop(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrapperTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelWrapperTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrapperTop")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelWrapperTopNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrapperTop")(null)
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
    def withSpinButtonWrapper(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinButtonWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinButtonWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinButtonWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinButtonWrapperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinButtonWrapper")(null)
        ret
    }
    @scala.inline
    def withSpinButtonWrapperDisabled(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinButtonWrapperDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinButtonWrapperDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinButtonWrapperDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinButtonWrapperDisabledNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinButtonWrapperDisabled")(null)
        ret
    }
    @scala.inline
    def withSpinButtonWrapperFocused(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinButtonWrapperFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinButtonWrapperFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinButtonWrapperFocused")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinButtonWrapperFocusedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinButtonWrapperFocused")(null)
        ret
    }
    @scala.inline
    def withSpinButtonWrapperHovered(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinButtonWrapperHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinButtonWrapperHovered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinButtonWrapperHovered")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinButtonWrapperHoveredNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinButtonWrapperHovered")(null)
        ret
    }
    @scala.inline
    def withSpinButtonWrapperTopBottom(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinButtonWrapperTopBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinButtonWrapperTopBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinButtonWrapperTopBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinButtonWrapperTopBottomNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinButtonWrapperTopBottom")(null)
        ret
    }
  }
  
}

