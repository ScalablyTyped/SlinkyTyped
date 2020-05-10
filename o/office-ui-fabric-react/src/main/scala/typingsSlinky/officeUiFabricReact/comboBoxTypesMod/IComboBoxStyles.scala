package typingsSlinky.officeUiFabricReact.comboBoxTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComboBoxStyles extends js.Object {
  /**
    * Styles for the callout.
    */
  var callout: IStyle = js.native
  /**
    * Style for the container which has the ComboBox and the label
    */
  var container: IStyle = js.native
  /**
    * Styles for a divider in the options.
    */
  var divider: IStyle = js.native
  /**
    * Styles for the error Message text of the comboBox.
    */
  var errorMessage: IStyle = js.native
  /**
    * Styles for a header in the options.
    */
  var header: IStyle = js.native
  /**
    * Base styles for the input element - which contains the currently selected
    * option.
    */
  var input: IStyle = js.native
  /**
    * Style override for the input element when comboBox is disabled.
    */
  var inputDisabled: IStyle = js.native
  /**
    * Style for the label element of the ComboBox.
    */
  var label: IStyle = js.native
  /**
    * Style for the label element of the ComboBox in the disabled state.
    */
  var labelDisabled: IStyle = js.native
  /**
    * Styles for the container of all the Combobox options
    * Includes the headers and dividers.
    */
  var optionsContainer: IStyle = js.native
  /**
    * Styles for the optionsContainerWrapper.
    */
  var optionsContainerWrapper: IStyle = js.native
  /**
    * Base styles for the root element of all ComboBoxes.
    */
  var root: IStyle = js.native
  /**
    * Styles for when the comboBox is disabled. These styles override all the other styles.
    * NOTE : Hover (or) Focused (or) active styles are not applied for disabled comboBoxes.
    */
  var rootDisabled: IStyle = js.native
  /**
    * Styles for variant of ComboBox where allowFreeForm is false in the props.
    */
  var rootDisallowFreeForm: IStyle = js.native
  /**
    * Styles for the root element for variant of ComboBox with an errorMessage in the props.
    */
  var rootError: IStyle = js.native
  /**
    * Styles for when the ComboBox is focused. These styles are applied for all comboBoxes except when
    * the comboBox is disabled.
    */
  var rootFocused: IStyle = js.native
  /**
    * Styles for when the ComboBox is hovered. These styles are applied for all comboBoxes except when
    * the comboBox is disabled.
    */
  var rootHovered: IStyle = js.native
  /**
    * Styles for when the ComboBox is active. These styles are applied for all comboBoxes except when
    * the comboBox is disabled.
    */
  var rootPressed: IStyle = js.native
  /**
    * Styles for hidden screen reader text.
    */
  var screenReaderText: IStyle = js.native
}

object IComboBoxStyles {
  @scala.inline
  def apply(): IComboBoxStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComboBoxStyles]
  }
  @scala.inline
  implicit class IComboBoxStylesOps[Self <: IComboBoxStyles] (val x: Self) extends AnyVal {
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

