package typingsSlinky.officeUiFabricReact.dropdownTypesMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsSlinky.officeUiFabricReact.selectableDroppableTextTypesMod.ISelectableDroppableTextProps
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropdownProps extends ISelectableDroppableTextProps[IDropdown, HTMLDivElement] {
  /**
    * Keys that will be initially used to set selected items. This prop is used for `multiSelect`
    * scenarios. In other cases, `defaultSelectedKey` should be used.
    */
  var defaultSelectedKeys: js.UndefOr[js.Array[Double | String]] = js.native
  /**
    * Custom width for dropdown. If value is 0, width of the input field is used.
    * @defaultvalue 0
    */
  var dropdownWidth: js.UndefOr[Double] = js.native
  /**
    * Deprecated at v0.52.0, use `disabled` instead.
    * @deprecated Use `disabled` instead.
    */
  var isDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Optional keytip for this dropdown
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.native
  /**
    * When multiple items are selected, this still will be used to separate values in
    * the dropdown title.
    *
    * @defaultvalue ", "
    */
  var multiSelectDelimiter: js.UndefOr[String] = js.native
  /**
    * Optional preference to have onChanged still be called when an already selected item is
    * clicked in single select mode.  Default to false
    */
  var notifyOnReselect: js.UndefOr[Boolean] = js.native
  /**
    * Callback issued when the selected option changes.
    */
  @JSName("onChange")
  var onChange_IDropdownProps: js.UndefOr[
    js.Function3[
      SyntheticEvent[EventTarget with HTMLDivElement, Event], 
      /* option */ js.UndefOr[IDropdownOption], 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /**
    * @deprecated Use `onChange` instead.
    */
  var onChanged: js.UndefOr[js.Function2[/* option */ IDropdownOption, /* index */ js.UndefOr[Double], Unit]] = js.native
  /**
    * Optional custom renderer for chevron icon
    */
  var onRenderCaretDown: js.UndefOr[IRenderFunction[IDropdownProps]] = js.native
  /**
    * Custom render function for the label.
    */
  var onRenderLabel: js.UndefOr[IRenderFunction[IDropdownProps]] = js.native
  /**
    * Optional custom renderer for placeholder text
    * @deprecated Use `onRenderPlaceholder`
    */
  var onRenderPlaceHolder: js.UndefOr[IRenderFunction[IDropdownProps]] = js.native
  /**
    * Optional custom renderer for placeholder text
    */
  var onRenderPlaceholder: js.UndefOr[IRenderFunction[IDropdownProps]] = js.native
  /**
    * Optional custom renderer for selected option displayed in input
    */
  var onRenderTitle: js.UndefOr[IRenderFunction[js.Array[IDropdownOption]]] = js.native
  /**
    * Options for the dropdown. If using `defaultSelectedKey` or `defaultSelectedKeys`, options must be
    * pure for correct behavior.
    */
  @JSName("options")
  var options_IDropdownProps: js.Array[IDropdownOption] = js.native
  /**
    * Input placeholder text. Displayed until option is selected.
    * @deprecated Use `placeholder`
    */
  var placeHolder: js.UndefOr[String] = js.native
  /**
    * Pass in ResponsiveMode to manually overwrite the way the Dropdown renders.
    * ResponsiveMode.Large would, for instance, disable the behavior where Dropdown options
    * get rendered into a Panel while ResponsiveMode.Small would result in the Dropdown
    * options always getting rendered in a Panel.
    */
  var responsiveMode: js.UndefOr[typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode] = js.native
  /**
    * Keys of the selected items. If you provide this, you must maintain selection
    * state by observing onChange events and passing a new value in when changed.
    * Passing null in will clear the selection.
    */
  var selectedKeys: js.UndefOr[(js.Array[Double | String]) | Null] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDropdownStyleProps, IDropdownStyles]] = js.native
  /**
    * Theme provided by higher order component.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IDropdownProps {
  @scala.inline
  def apply(options: js.Array[IDropdownOption]): IDropdownProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownProps]
  }
  @scala.inline
  implicit class IDropdownPropsOps[Self <: IDropdownProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: js.Array[IDropdownOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultSelectedKeys(value: js.Array[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSelectedKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedKeys")(js.undefined)
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
    def withIsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(js.undefined)
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
    def withMultiSelectDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelectDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSelectDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelectDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyOnReselect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyOnReselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifyOnReselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyOnReselect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(
      value: (SyntheticEvent[EventTarget with HTMLDivElement, Event], /* option */ js.UndefOr[IDropdownOption], /* index */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChanged(value: (/* option */ IDropdownOption, /* index */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderCaretDown(
      value: (/* props */ js.UndefOr[IDropdownProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDropdownProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderCaretDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderCaretDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderCaretDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderLabel(
      value: (/* props */ js.UndefOr[IDropdownProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDropdownProps], ReactElement | Null]]) => ReactElement | Null
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
    def withOnRenderPlaceHolder(
      value: (/* props */ js.UndefOr[IDropdownProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDropdownProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderPlaceHolder")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderPlaceHolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderPlaceHolder")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderTitle(
      value: (/* props */ js.UndefOr[js.Array[IDropdownOption]], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[js.Array[IDropdownOption]], ReactElement | Null]
        ]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderTitle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceHolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeHolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceHolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeHolder")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsiveMode(value: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsiveMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedKeys(value: js.Array[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedKeysNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKeys")(null)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IDropdownStyleProps => Partial[IDropdownStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IDropdownStyleProps, IDropdownStyles]): Self = {
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
  }
  
}

