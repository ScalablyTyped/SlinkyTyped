package typingsSlinky.officeUiFabricReact.dropdownTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropdownStyles extends js.Object {
  /** Refers to the callout that hosts Dropdown options in larger viewports. */
  var callout: IStyle = js.native
  /** Refers to the downward pointing caret icon users click on to expand the Dropdown. */
  var caretDown: IStyle = js.native
  /** Refers to the wrapping container around the downward pointing caret users click on to expand the Dropdown. */
  var caretDownWrapper: IStyle = js.native
  /** Refers to the actual Dropdown element. */
  var dropdown: IStyle = js.native
  /** Refers to the dropdown separator. */
  var dropdownDivider: IStyle = js.native
  /** Refers to the individual dropdown item. */
  var dropdownItem: IStyle = js.native
  /** Style for a dropdown item when it is disabled. */
  var dropdownItemDisabled: IStyle = js.native
  /** Refers to the individual dropdown items that are being rendered as a header. */
  var dropdownItemHeader: IStyle = js.native
  /** Style for a dropdown item when it is hidden */
  var dropdownItemHidden: IStyle = js.native
  /** Style for a dropdown item when it is being selected. */
  var dropdownItemSelected: IStyle = js.native
  /** Style for a dropdown item when it is both selected and disabled. */
  var dropdownItemSelectedAndDisabled: IStyle = js.native
  /** Refers to the FocusZone wrapping the individual dropdown items. */
  var dropdownItems: IStyle = js.native
  /** Refers to the element that wraps `dropdownItems`. */
  var dropdownItemsWrapper: IStyle = js.native
  /**
    * Refers to the text element that renders the actual dropdown item/option text. This would be wrapped by the element
    * referred to by `dropdownItem`.
    */
  var dropdownOptionText: IStyle = js.native
  /** Refers to the error message being rendered under the Dropdown (if any). */
  var errorMessage: IStyle = js.native
  /** Refers to the label associated with the dropdown. This is enclosed by the root. */
  var label: IStyle = js.native
  /**
    * Refers to the panel that hosts the Dropdown options in small viewports.
    * Note: This will be deprecated when Panel supports JS Styling.
    */
  var panel: IStyle = js.native
  /** Root element of the Dropdown (includes Label and the actual Dropdown). */
  var root: IStyle = js.native
  /** Subcomponent styles. */
  var subComponentStyles: IDropdownSubComponentStyles = js.native
  /** Refers to the primary title of the Dropdown (rendering the selected options/placeholder/etc.). */
  var title: IStyle = js.native
}

object IDropdownStyles {
  @scala.inline
  def apply(subComponentStyles: IDropdownSubComponentStyles): IDropdownStyles = {
    val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownStyles]
  }
  @scala.inline
  implicit class IDropdownStylesOps[Self <: IDropdownStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubComponentStyles(value: IDropdownSubComponentStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subComponentStyles")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withCaretDown(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaretDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretDown")(js.undefined)
        ret
    }
    @scala.inline
    def withCaretDownNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretDown")(null)
        ret
    }
    @scala.inline
    def withCaretDownWrapper(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretDownWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaretDownWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretDownWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withCaretDownWrapperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretDownWrapper")(null)
        ret
    }
    @scala.inline
    def withDropdown(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdown")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdown")(null)
        ret
    }
    @scala.inline
    def withDropdownDivider(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownDivider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownDivider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownDivider")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownDividerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownDivider")(null)
        ret
    }
    @scala.inline
    def withDropdownItem(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItem")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownItemNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItem")(null)
        ret
    }
    @scala.inline
    def withDropdownItemDisabled(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItemDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownItemDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItemDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownItemDisabledNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItemDisabled")(null)
        ret
    }
    @scala.inline
    def withDropdownItemHeader(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItemHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownItemHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItemHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownItemHeaderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItemHeader")(null)
        ret
    }
    @scala.inline
    def withDropdownItemHidden(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItemHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownItemHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItemHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownItemHiddenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItemHidden")(null)
        ret
    }
    @scala.inline
    def withDropdownItemSelected(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItemSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownItemSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItemSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownItemSelectedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItemSelected")(null)
        ret
    }
    @scala.inline
    def withDropdownItemSelectedAndDisabled(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItemSelectedAndDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownItemSelectedAndDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItemSelectedAndDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownItemSelectedAndDisabledNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItemSelectedAndDisabled")(null)
        ret
    }
    @scala.inline
    def withDropdownItems(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItems")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownItemsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItems")(null)
        ret
    }
    @scala.inline
    def withDropdownItemsWrapper(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItemsWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownItemsWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItemsWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownItemsWrapperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownItemsWrapper")(null)
        ret
    }
    @scala.inline
    def withDropdownOptionText(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownOptionText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownOptionText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownOptionText")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownOptionTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownOptionText")(null)
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
    def withPanel(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(js.undefined)
        ret
    }
    @scala.inline
    def withPanelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(null)
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
    def withTitle(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(null)
        ret
    }
  }
  
}

