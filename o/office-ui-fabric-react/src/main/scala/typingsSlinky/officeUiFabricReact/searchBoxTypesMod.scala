package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactRef
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.anon.PickIIconPropsExcludekeyo
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchBoxTypesMod {
  
  @js.native
  trait ISearchBox extends StObject {
    
    /**
      * Sets focus inside the search input box.
      */
    def focus(): Unit = js.native
    
    /**
      * Returns whether or not the SearchBox has focus
      */
    def hasFocus(): Boolean = js.native
  }
  object ISearchBox {
    
    @scala.inline
    def apply(focus: () => Unit, hasFocus: () => Boolean): ISearchBox = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus), hasFocus = js.Any.fromFunction0(hasFocus))
      __obj.asInstanceOf[ISearchBox]
    }
    
    @scala.inline
    implicit class ISearchBoxMutableBuilder[Self <: ISearchBox] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasFocus(value: () => Boolean): Self = StObject.set(x, "hasFocus", js.Any.fromFunction0(value))
    }
  }
  
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
    implicit class ISearchBoxPropsMutableBuilder[Self <: ISearchBoxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setClearButtonProps(value: IButtonProps): Self = StObject.set(x, "clearButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearButtonPropsUndefined: Self = StObject.set(x, "clearButtonProps", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[ISearchBox]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ ISearchBox | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefRefObject(value: ReactRef[ISearchBox]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisableAnimation(value: Boolean): Self = StObject.set(x, "disableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableAnimationUndefined: Self = StObject.set(x, "disableAnimation", js.undefined)
      
      @scala.inline
      def setIconProps(value: PickIIconPropsExcludekeyo): Self = StObject.set(x, "iconProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPropsUndefined: Self = StObject.set(x, "iconProps", js.undefined)
      
      @scala.inline
      def setLabelText(value: String): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelTextUndefined: Self = StObject.set(x, "labelText", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* event */ js.UndefOr[ChangeEvent[HTMLInputElement]], /* newValue */ js.UndefOr[String]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnChanged(value: /* newValue */ js.Any => Unit): Self = StObject.set(x, "onChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangedUndefined: Self = StObject.set(x, "onChanged", js.undefined)
      
      @scala.inline
      def setOnClear(value: /* ev */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      @scala.inline
      def setOnEscape(value: /* ev */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onEscape", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEscapeUndefined: Self = StObject.set(x, "onEscape", js.undefined)
      
      @scala.inline
      def setOnSearch(value: /* newValue */ js.Any => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[ISearchBoxStyleProps, ISearchBoxStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: ISearchBoxStyleProps => DeepPartial[ISearchBoxStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setUnderlined(value: Boolean): Self = StObject.set(x, "underlined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlinedUndefined: Self = StObject.set(x, "underlined", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait ISearchBoxStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var disableAnimation: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var hasFocus: js.UndefOr[Boolean] = js.native
    
    var hasInput: js.UndefOr[Boolean] = js.native
    
    var theme: ITheme = js.native
    
    var underlined: js.UndefOr[Boolean] = js.native
  }
  object ISearchBoxStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): ISearchBoxStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISearchBoxStyleProps]
    }
    
    @scala.inline
    implicit class ISearchBoxStylePropsMutableBuilder[Self <: ISearchBoxStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisableAnimation(value: Boolean): Self = StObject.set(x, "disableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableAnimationUndefined: Self = StObject.set(x, "disableAnimation", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHasFocus(value: Boolean): Self = StObject.set(x, "hasFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasFocusUndefined: Self = StObject.set(x, "hasFocus", js.undefined)
      
      @scala.inline
      def setHasInput(value: Boolean): Self = StObject.set(x, "hasInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasInputUndefined: Self = StObject.set(x, "hasInput", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlined(value: Boolean): Self = StObject.set(x, "underlined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlinedUndefined: Self = StObject.set(x, "underlined", js.undefined)
    }
  }
  
  @js.native
  trait ISearchBoxStyles extends StObject {
    
    var clearButton: js.UndefOr[IStyle] = js.native
    
    var field: js.UndefOr[IStyle] = js.native
    
    var icon: js.UndefOr[IStyle] = js.native
    
    var iconContainer: js.UndefOr[IStyle] = js.native
    
    var root: js.UndefOr[IStyle] = js.native
  }
  object ISearchBoxStyles {
    
    @scala.inline
    def apply(): ISearchBoxStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISearchBoxStyles]
    }
    
    @scala.inline
    implicit class ISearchBoxStylesMutableBuilder[Self <: ISearchBoxStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearButton(value: IStyle): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearButtonNull: Self = StObject.set(x, "clearButton", null)
      
      @scala.inline
      def setClearButtonUndefined: Self = StObject.set(x, "clearButton", js.undefined)
      
      @scala.inline
      def setField(value: IStyle): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNull: Self = StObject.set(x, "field", null)
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setIcon(value: IStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconContainer(value: IStyle): Self = StObject.set(x, "iconContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconContainerNull: Self = StObject.set(x, "iconContainer", null)
      
      @scala.inline
      def setIconContainerUndefined: Self = StObject.set(x, "iconContainer", js.undefined)
      
      @scala.inline
      def setIconNull: Self = StObject.set(x, "icon", null)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
