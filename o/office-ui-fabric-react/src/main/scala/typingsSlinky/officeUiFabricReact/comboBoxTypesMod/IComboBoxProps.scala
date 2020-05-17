package typingsSlinky.officeUiFabricReact.comboBoxTypesMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.anon.PartialIButtonStyles
import typingsSlinky.officeUiFabricReact.anon.PartialIComboBoxOptionSty
import typingsSlinky.officeUiFabricReact.anon.PartialIComboBoxStyles
import typingsSlinky.officeUiFabricReact.autofillTypesMod.IAutofillProps
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.comboBoxClassNamesMod.IComboBoxClassNames
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.off
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.on
import typingsSlinky.officeUiFabricReact.selectableDroppableTextTypesMod.ISelectableDroppableTextProps
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComboBoxProps extends ISelectableDroppableTextProps[IComboBox, IComboBox] {
  /**
    * Whether the ComboBox is free form, meaning that the user input is not bound to provided options. Defaults to false.
    */
  var allowFreeform: js.UndefOr[Boolean] = js.native
  /**
    * Optional prop to add a string id that can be referenced inside the aria-describedby attribute
    */
  var ariaDescribedBy: js.UndefOr[String] = js.native
  /**
    * Whether the ComboBox auto completes. As the user is inputing text, it will be suggested potential matches from
    * the list of options. If the combo box is expanded, this will also scroll to the suggested option, and give it a
    * selected style.
    *
    * @defaultvalue "on"
    */
  var autoComplete: js.UndefOr[on | off] = js.native
  /**
    * The AutofillProps to be passed into the Autofill component inside combobox
    */
  var autofill: js.UndefOr[IAutofillProps] = js.native
  /**
    * The IconProps to use for the button aspect of the combobox
    */
  var buttonIconProps: js.UndefOr[IIconProps] = js.native
  /**
    * Styles for the caret down button.
    */
  var caretDownButtonStyles: js.UndefOr[PartialIButtonStyles] = js.native
  /**
    * Default styles that should be applied to ComboBox options,
    * in case an option does not come with user-defined custom styles
    */
  var comboBoxOptionStyles: js.UndefOr[PartialIComboBoxOptionSty] = js.native
  /**
    * Custom max width for dropdown
    */
  var dropdownMaxWidth: js.UndefOr[Double] = js.native
  /**
    * Custom width for dropdown (unless useComboBoxAsMenuWidth is undefined or false)
    */
  var dropdownWidth: js.UndefOr[Double] = js.native
  /**
    * Custom function for providing the classNames for the ComboBox. Can be used to provide
    * all styles for the component instead of applying them on top of the default styles.
    */
  var getClassNames: js.UndefOr[
    js.Function8[
      /* theme */ ITheme, 
      /* isOpen */ Boolean, 
      /* disabled */ Boolean, 
      /* required */ Boolean, 
      /* focused */ Boolean, 
      /* allowFreeForm */ Boolean, 
      /* hasErrorMessage */ Boolean, 
      /* className */ js.UndefOr[String], 
      IComboBoxClassNames
    ]
  ] = js.native
  /**
    * Optional iconButton props on combo box
    */
  var iconButtonProps: js.UndefOr[IButtonProps] = js.native
  /**
    * Sets the 'aria-hidden' attribute on the ComboBox's button element instructing screen readers how to handle
    * the element. This element is hidden by default because all functionality is handled by the input element and
    * the arrow button is only meant to be decorative.
    * @defaultvalue true
    */
  var isButtonAriaHidden: js.UndefOr[Boolean] = js.native
  /**
    * Optional keytip for this combo box
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.native
  /**
    * Callback issued when either:
    * 1) the selected option changes
    * 2) a manually edited value is submitted. In this case there may not be a matched option if allowFreeform
    *    is also true (and hence only value would be true, the other parameter would be null in this case)
    */
  @JSName("onChange")
  var onChange_IComboBoxProps: js.UndefOr[
    js.Function4[
      SyntheticEvent[EventTarget with IComboBox, Event], 
      /* option */ js.UndefOr[IComboBoxOption], 
      /* index */ js.UndefOr[Double], 
      /* value */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  /**
    * Callback issued when a ComboBox item is clicked.
    */
  var onItemClick: js.UndefOr[
    js.Function3[
      SyntheticEvent[EventTarget with IComboBox, Event], 
      /* option */ js.UndefOr[IComboBoxOption], 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /**
    * Function that gets invoked before the menu gets dismissed
    */
  var onMenuDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Function that gets invoked when the ComboBox menu is dismissed
    */
  var onMenuDismissed: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Function that gets invoked when the ComboBox menu is launched
    */
  var onMenuOpen: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback issued when the user changes the pending value in ComboBox
    */
  var onPendingValueChanged: js.UndefOr[
    js.Function3[
      /* option */ js.UndefOr[IComboBoxOption], 
      /* index */ js.UndefOr[Double], 
      /* value */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  /**
    * Custom render function for the label text.
    */
  var onRenderLabel: js.UndefOr[IRenderFunction[IOnRenderComboBoxLabelProps]] = js.native
  /**
    * Add additional content below the callout list.
    */
  var onRenderLowerContent: js.UndefOr[IRenderFunction[IComboBoxProps]] = js.native
  /**
    * Add additional content above the callout list.
    */
  var onRenderUpperContent: js.UndefOr[IRenderFunction[IComboBoxProps]] = js.native
  /**
    * Callback issued when the options should be resolved, if they have been updated or
    * if they need to be passed in the first time
    */
  var onResolveOptions: js.UndefOr[
    js.Function1[
      /* options */ js.Array[IComboBoxOption], 
      js.Array[IComboBoxOption] | js.Thenable[js.Array[IComboBoxOption]]
    ]
  ] = js.native
  /**
    * Callback issued when the ComboBox requests the list to scroll to a specific element
    */
  var onScrollToItem: js.UndefOr[js.Function1[/* itemIndex */ Double, Unit]] = js.native
  /**
    * Collection of options for this ComboBox
    */
  @JSName("options")
  var options_IComboBoxProps: js.Array[IComboBoxOption] = js.native
  /**
    * Menu will not be created or destroyed when opened or closed, instead it
    * will be hidden. This will improve perf of the menu opening but could potentially
    * impact overall perf by having more elements in the dom. Should only be used
    * when perf is important.
    * Note: This may increase the amount of time it takes for the comboBox itself to mount.
    */
  var persistMenu: js.UndefOr[Boolean] = js.native
  /**
    * When options are scrollable the selected option is positioned at the top of the callout when it is opened
    * (unless it has reached the end of the scrollbar).
    * @defaultvalue false;
    */
  var scrollSelectedToTop: js.UndefOr[Boolean] = js.native
  /**
    * When specified, determines whether the callout (the menu which drops down) should
    * restore the focus after being dismissed or not.  If false, then the menu will not try
    * to set focus to whichever element had focus before the menu was opened.
    * @defaultvalue true;
    */
  var shouldRestoreFocus: js.UndefOr[Boolean] = js.native
  /**
    * Custom styles for this component
    */
  var styles: js.UndefOr[PartialIComboBoxStyles] = js.native
  /**
    * Value to show in the input, does not have to map to a combobox option
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Whether to use the ComboBoxes width as the menu's width
    */
  var useComboBoxAsMenuWidth: js.UndefOr[Boolean] = js.native
}

object IComboBoxProps {
  @scala.inline
  def apply(options: js.Array[IComboBoxOption]): IComboBoxProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComboBoxProps]
  }
  @scala.inline
  implicit class IComboBoxPropsOps[Self <: IComboBoxProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: js.Array[IComboBoxOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowFreeform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFreeform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFreeform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFreeform")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaDescribedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescribedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaDescribedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescribedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoComplete(value: on | off): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAutofill(value: IAutofillProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutofill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofill")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonIconProps(value: IIconProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonIconProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonIconProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonIconProps")(js.undefined)
        ret
    }
    @scala.inline
    def withCaretDownButtonStyles(value: PartialIButtonStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretDownButtonStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaretDownButtonStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretDownButtonStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withComboBoxOptionStyles(value: PartialIComboBoxOptionSty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comboBoxOptionStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComboBoxOptionStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comboBoxOptionStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownMaxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGetClassNames(
      value: (/* theme */ ITheme, /* isOpen */ Boolean, /* disabled */ Boolean, /* required */ Boolean, /* focused */ Boolean, /* allowFreeForm */ Boolean, /* hasErrorMessage */ Boolean, /* className */ js.UndefOr[String]) => IComboBoxClassNames
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClassNames")(js.Any.fromFunction8(value))
        ret
    }
    @scala.inline
    def withoutGetClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClassNames")(js.undefined)
        ret
    }
    @scala.inline
    def withIconButtonProps(value: IButtonProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconButtonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withIsButtonAriaHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isButtonAriaHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsButtonAriaHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isButtonAriaHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withKeytipProps(value: IKeytipProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keytipProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeytipProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keytipProps")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(
      value: (SyntheticEvent[EventTarget with IComboBox, Event], /* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double], /* value */ js.UndefOr[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemClick(
      value: (SyntheticEvent[EventTarget with IComboBox, Event], /* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMenuDismiss(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuDismiss")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMenuDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMenuDismissed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuDismissed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMenuDismissed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuDismissed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMenuOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMenuOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPendingValueChanged(
      value: (/* option */ js.UndefOr[IComboBoxOption], /* index */ js.UndefOr[Double], /* value */ js.UndefOr[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPendingValueChanged")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnPendingValueChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPendingValueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderLabel(
      value: (/* props */ js.UndefOr[IOnRenderComboBoxLabelProps], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IOnRenderComboBoxLabelProps], ReactElement | Null]
        ]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderLabel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderLowerContent(
      value: (/* props */ js.UndefOr[IComboBoxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IComboBoxProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderLowerContent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderLowerContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderLowerContent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderUpperContent(
      value: (/* props */ js.UndefOr[IComboBoxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IComboBoxProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderUpperContent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderUpperContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderUpperContent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResolveOptions(
      value: /* options */ js.Array[IComboBoxOption] => js.Array[IComboBoxOption] | js.Thenable[js.Array[IComboBoxOption]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResolveOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResolveOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResolveOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScrollToItem(value: /* itemIndex */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollToItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScrollToItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollToItem")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSelectedToTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSelectedToTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSelectedToTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSelectedToTop")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldRestoreFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRestoreFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldRestoreFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRestoreFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: PartialIComboBoxStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withUseComboBoxAsMenuWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useComboBoxAsMenuWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseComboBoxAsMenuWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useComboBoxAsMenuWidth")(js.undefined)
        ret
    }
  }
  
}

