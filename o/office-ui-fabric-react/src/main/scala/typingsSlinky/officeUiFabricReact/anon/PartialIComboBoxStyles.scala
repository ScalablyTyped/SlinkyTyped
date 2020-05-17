package typingsSlinky.officeUiFabricReact.anon

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/ComboBox/ComboBox.types.IComboBoxStyles> */
@js.native
trait PartialIComboBoxStyles extends js.Object {
  var callout: js.UndefOr[IStyle] = js.native
  var container: js.UndefOr[IStyle] = js.native
  var divider: js.UndefOr[IStyle] = js.native
  var errorMessage: js.UndefOr[IStyle] = js.native
  var header: js.UndefOr[IStyle] = js.native
  var input: js.UndefOr[IStyle] = js.native
  var inputDisabled: js.UndefOr[IStyle] = js.native
  var label: js.UndefOr[IStyle] = js.native
  var labelDisabled: js.UndefOr[IStyle] = js.native
  var optionsContainer: js.UndefOr[IStyle] = js.native
  var optionsContainerWrapper: js.UndefOr[IStyle] = js.native
  var root: js.UndefOr[IStyle] = js.native
  var rootDisabled: js.UndefOr[IStyle] = js.native
  var rootDisallowFreeForm: js.UndefOr[IStyle] = js.native
  var rootError: js.UndefOr[IStyle] = js.native
  var rootFocused: js.UndefOr[IStyle] = js.native
  var rootHovered: js.UndefOr[IStyle] = js.native
  var rootPressed: js.UndefOr[IStyle] = js.native
  var screenReaderText: js.UndefOr[IStyle] = js.native
}

object PartialIComboBoxStyles {
  @scala.inline
  def apply(): PartialIComboBoxStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIComboBoxStyles]
  }
  @scala.inline
  implicit class PartialIComboBoxStylesOps[Self <: PartialIComboBoxStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallout(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout")(null)
        ret
    }
    @scala.inline
    def withContainer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(null)
        ret
    }
    @scala.inline
    def withDivider(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDivider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divider")(js.undefined)
        ret
    }
    @scala.inline
    def withDividerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divider")(null)
        ret
    }
    @scala.inline
    def withErrorMessage(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(null)
        ret
    }
    @scala.inline
    def withHeader(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(null)
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
    def withOptionsContainer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionsContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionsContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsContainer")(null)
        ret
    }
    @scala.inline
    def withOptionsContainerWrapper(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsContainerWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionsContainerWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsContainerWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionsContainerWrapperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsContainerWrapper")(null)
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
    def withRootDisabled(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRootDisabledNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDisabled")(null)
        ret
    }
    @scala.inline
    def withRootDisallowFreeForm(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDisallowFreeForm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootDisallowFreeForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDisallowFreeForm")(js.undefined)
        ret
    }
    @scala.inline
    def withRootDisallowFreeFormNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDisallowFreeForm")(null)
        ret
    }
    @scala.inline
    def withRootError(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootError")(js.undefined)
        ret
    }
    @scala.inline
    def withRootErrorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootError")(null)
        ret
    }
    @scala.inline
    def withRootFocused(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootFocused")(js.undefined)
        ret
    }
    @scala.inline
    def withRootFocusedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootFocused")(null)
        ret
    }
    @scala.inline
    def withRootHovered(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootHovered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootHovered")(js.undefined)
        ret
    }
    @scala.inline
    def withRootHoveredNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootHovered")(null)
        ret
    }
    @scala.inline
    def withRootPressed(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootPressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootPressed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootPressed")(js.undefined)
        ret
    }
    @scala.inline
    def withRootPressedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootPressed")(null)
        ret
    }
    @scala.inline
    def withScreenReaderText(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenReaderText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderText")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenReaderTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderText")(null)
        ret
    }
  }
  
}

