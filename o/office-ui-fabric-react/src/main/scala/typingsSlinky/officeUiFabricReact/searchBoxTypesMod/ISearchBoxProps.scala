package typingsSlinky.officeUiFabricReact.searchBoxTypesMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.PickIIconPropsExcludekeyo
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchBoxProps extends InputHTMLAttributes[HTMLInputElement] {
  /**
    * The aria label of the SearchBox for the benefit of screen readers.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * The props for the clear button.
    */
  var clearButtonProps: js.UndefOr[IButtonProps] = js.native
  /**
    * Optional callback to access the ISearchBox interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ISearchBox]] = js.native
  /**
    * The default value of the text in the SearchBox, in the case of an uncontrolled component.
    * This prop is being deprecated since so far, uncontrolled behavior has not been implemented.
    * @deprecated Not implemented.
    */
  @JSName("defaultValue")
  var defaultValue_ISearchBoxProps: js.UndefOr[String] = js.native
  /**
    * Whether or not to animate the SearchBox icon on focus.
    * @defaultvalue false
    */
  var disableAnimation: js.UndefOr[Boolean] = js.native
  /**
    * The props for the icon.
    */
  var iconProps: js.UndefOr[PickIIconPropsExcludekeyo] = js.native
  /**
    * Deprecated. Use `placeholder` instead.
    * @deprecated Use `placeholder` instead.
    */
  var labelText: js.UndefOr[String] = js.native
  /**
    * Callback function for when the typed input for the SearchBox has changed.
    */
  @JSName("onChange")
  var onChange_ISearchBoxProps: js.UndefOr[
    js.Function2[
      /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  /**
    * Deprecated at v0.52.2, use `onChange` instead.
    * @deprecated Use `onChange` instead.
    */
  var onChanged: js.UndefOr[js.Function1[/* newValue */ js.Any, Unit]] = js.native
  /**
    * Callback executed when the user clears the search box by either clicking 'X' or hitting escape.
    */
  var onClear: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.native
  /**
    * Callback executed when the user presses escape in the search box.
    */
  var onEscape: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.native
  /**
    * Callback executed when the user presses enter in the search box.
    */
  var onSearch: js.UndefOr[js.Function1[/* newValue */ js.Any, Unit]] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ISearchBoxStyleProps, ISearchBoxStyles]] = js.native
  /**
    * Theme (provided through customization).
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Whether or not the SearchBox is underlined.
    * @defaultvalue false
    */
  var underlined: js.UndefOr[Boolean] = js.native
  /**
    * The value of the text in the SearchBox.
    */
  @JSName("value")
  var value_ISearchBoxProps: js.UndefOr[String] = js.native
}

object ISearchBoxProps {
  @scala.inline
  def apply(): ISearchBoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISearchBoxProps]
  }
  @scala.inline
  implicit class ISearchBoxPropsOps[Self <: ISearchBoxProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withClearButtonProps(value: IButtonProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButtonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ ISearchBox | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[ISearchBox]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[ISearchBox]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withIconProps(value: PickIIconPropsExcludekeyo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconProps")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(
      value: (/* event */ js.UndefOr[ChangeEvent[HTMLInputElement]], /* newValue */ js.UndefOr[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChanged(value: /* newValue */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClear(value: /* ev */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClear")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEscape(value: /* ev */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEscape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEscape")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSearch(value: /* newValue */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: ISearchBoxStyleProps => Partial[ISearchBoxStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[ISearchBoxStyleProps, ISearchBoxStyles]): Self = {
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
    @scala.inline
    def withUnderlined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlined")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

