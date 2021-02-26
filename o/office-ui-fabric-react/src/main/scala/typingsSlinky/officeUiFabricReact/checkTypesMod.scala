package typingsSlinky.officeUiFabricReact

import slinky.core.facade.ReactRef
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkTypesMod {
  
  @js.native
  trait ICheckProps extends StObject {
    
    /**
      * @deprecated Not used
      */
    var alwaysShowCheck: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether or not this menu item is currently checked.
      * @defaultvalue false
      */
    var checked: js.UndefOr[Boolean] = js.native
    
    /**
      * Additional css class to apply to the Check
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[ICheckProps]] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[ICheckStyleProps, ICheckStyles]] = js.native
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.native
    
    /**
      * Whether to use fast icon components. The icons can't be targeted by customization but are
      * still customizable via class names.
      * @defaultvalue true
      */
    var useFastIcons: js.UndefOr[Boolean] = js.native
  }
  object ICheckProps {
    
    @scala.inline
    def apply(): ICheckProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICheckProps]
    }
    
    @scala.inline
    implicit class ICheckPropsMutableBuilder[Self <: ICheckProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysShowCheck(value: Boolean): Self = StObject.set(x, "alwaysShowCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysShowCheckUndefined: Self = StObject.set(x, "alwaysShowCheck", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[ICheckProps]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ ICheckProps | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefRefObject(value: ReactRef[ICheckProps]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[ICheckStyleProps, ICheckStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: ICheckStyleProps => DeepPartial[ICheckStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setUseFastIcons(value: Boolean): Self = StObject.set(x, "useFastIcons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseFastIconsUndefined: Self = StObject.set(x, "useFastIcons", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Check/Check.types.ICheckProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Check/Check.types.ICheckProps, 'className' | 'checked'> & {  height :string | undefined,   checkBoxHeight :string | undefined} */
  @js.native
  trait ICheckStyleProps extends StObject {
    
    /**
      * Custom height/width for the checkbox.
      * @defaultvalue '18px'
      * @deprecated Use `height`
      */
    var checkBoxHeight: js.UndefOr[String] = js.native
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    /**
      * Custom height/width for the checkbox.
      * @defaultvalue '18px'
      */
    var height: js.UndefOr[String] = js.native
    
    var theme: ITheme = js.native
  }
  object ICheckStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): ICheckStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICheckStyleProps]
    }
    
    @scala.inline
    implicit class ICheckStylePropsMutableBuilder[Self <: ICheckStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckBoxHeight(value: String): Self = StObject.set(x, "checkBoxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckBoxHeightUndefined: Self = StObject.set(x, "checkBoxHeight", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICheckStyles extends StObject {
    
    /**
      * The 'check' icon styles.
      */
    var check: IStyle = js.native
    
    /**
      * Check host style
      * @deprecated Not used directly within the component. Instead, use `CheckGlobalClassNames.checkHost` from
      * `Check.styles.ts` to get the static class name to apply to the parent element of the Check.
      */
    var checkHost: IStyle = js.native
    
    /**
      * The 'circle' icon styles.
      */
    var circle: IStyle = js.native
    
    /**
      * Style for the root element.
      */
    var root: IStyle = js.native
  }
  object ICheckStyles {
    
    @scala.inline
    def apply(): ICheckStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICheckStyles]
    }
    
    @scala.inline
    implicit class ICheckStylesMutableBuilder[Self <: ICheckStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheck(value: IStyle): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckHost(value: IStyle): Self = StObject.set(x, "checkHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckHostNull: Self = StObject.set(x, "checkHost", null)
      
      @scala.inline
      def setCheckHostUndefined: Self = StObject.set(x, "checkHost", js.undefined)
      
      @scala.inline
      def setCheckNull: Self = StObject.set(x, "check", null)
      
      @scala.inline
      def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      @scala.inline
      def setCircle(value: IStyle): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircleNull: Self = StObject.set(x, "circle", null)
      
      @scala.inline
      def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
