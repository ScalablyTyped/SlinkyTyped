package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detailsRowCheckTypesMod {
  
  @js.native
  trait IDetailsCheckboxProps extends StObject {
    
    var checked: Boolean = js.native
    
    var theme: js.UndefOr[ITheme] = js.native
  }
  object IDetailsCheckboxProps {
    
    @scala.inline
    def apply(checked: Boolean): IDetailsCheckboxProps = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsCheckboxProps]
    }
    
    @scala.inline
    implicit class IDetailsCheckboxPropsMutableBuilder[Self <: IDetailsCheckboxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait IDetailsRowCheckProps extends HTMLAttributes[HTMLElement] {
    
    /**
      * Is any selected - also true for isSelectionModal
      */
    var anySelected: js.UndefOr[Boolean] = js.native
    
    /**
      * Can this checkbox be selectable
      */
    var canSelect: Boolean = js.native
    
    /**
      * The classname to be passed down to Check component
      */
    var checkClassName: js.UndefOr[String] = js.native
    
    /**
      * Is this in compact mode?
      */
    var compact: js.UndefOr[Boolean] = js.native
    
    /**
      * Is the check part of the header in a DetailsList
      */
    var isHeader: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether or not this checkbox is visible
      */
    var isVisible: js.UndefOr[Boolean] = js.native
    
    /**
      * If provided, can be used to render a custom checkbox
      */
    var onRenderDetailsCheckbox: js.UndefOr[IRenderFunction[IDetailsCheckboxProps]] = js.native
    
    /**
      * Whether or not this check is selected
      */
    var selected: js.UndefOr[Boolean] = js.native
    
    /**
      * Style override
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsRowCheckStyleProps, IDetailsRowCheckStyles]] = js.native
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: js.UndefOr[ITheme] = js.native
    
    /**
      * Whether to use fast icon and check components. The icons can't be targeted by customization
      * but are still customizable via class names.
      * @defaultvalue true
      */
    var useFastIcons: js.UndefOr[Boolean] = js.native
  }
  object IDetailsRowCheckProps {
    
    @scala.inline
    def apply(canSelect: Boolean): IDetailsRowCheckProps = {
      val __obj = js.Dynamic.literal(canSelect = canSelect.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsRowCheckProps]
    }
    
    @scala.inline
    implicit class IDetailsRowCheckPropsMutableBuilder[Self <: IDetailsRowCheckProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnySelected(value: Boolean): Self = StObject.set(x, "anySelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnySelectedUndefined: Self = StObject.set(x, "anySelected", js.undefined)
      
      @scala.inline
      def setCanSelect(value: Boolean): Self = StObject.set(x, "canSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckClassName(value: String): Self = StObject.set(x, "checkClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckClassNameUndefined: Self = StObject.set(x, "checkClassName", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setIsHeader(value: Boolean): Self = StObject.set(x, "isHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHeaderUndefined: Self = StObject.set(x, "isHeader", js.undefined)
      
      @scala.inline
      def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
      
      @scala.inline
      def setOnRenderDetailsCheckbox(
        value: (/* props */ js.UndefOr[IDetailsCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsCheckboxProps], ReactElement | Null]]) => ReactElement | Null
      ): Self = StObject.set(x, "onRenderDetailsCheckbox", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderDetailsCheckboxUndefined: Self = StObject.set(x, "onRenderDetailsCheckbox", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IDetailsRowCheckStyleProps, IDetailsRowCheckStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IDetailsRowCheckStyleProps => DeepPartial[IDetailsRowCheckStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
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
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRowCheck.types.IDetailsRowCheckProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRowCheck.types.IDetailsRowCheckProps, 'compact' | 'isHeader' | 'selected' | 'anySelected' | 'canSelect' | 'className'> & {  isVisible :boolean | undefined} */
  @js.native
  trait IDetailsRowCheckStyleProps extends StObject {
    
    var anySelected: js.UndefOr[Boolean] = js.native
    
    var canSelect: Boolean = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var compact: js.UndefOr[Boolean] = js.native
    
    var isHeader: js.UndefOr[Boolean] = js.native
    
    /** Is checkbox visible */
    var isVisible: js.UndefOr[Boolean] = js.native
    
    var selected: js.UndefOr[Boolean] = js.native
    
    var theme: ITheme = js.native
  }
  object IDetailsRowCheckStyleProps {
    
    @scala.inline
    def apply(canSelect: Boolean, theme: ITheme): IDetailsRowCheckStyleProps = {
      val __obj = js.Dynamic.literal(canSelect = canSelect.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsRowCheckStyleProps]
    }
    
    @scala.inline
    implicit class IDetailsRowCheckStylePropsMutableBuilder[Self <: IDetailsRowCheckStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnySelected(value: Boolean): Self = StObject.set(x, "anySelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnySelectedUndefined: Self = StObject.set(x, "anySelected", js.undefined)
      
      @scala.inline
      def setCanSelect(value: Boolean): Self = StObject.set(x, "canSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setIsHeader(value: Boolean): Self = StObject.set(x, "isHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHeaderUndefined: Self = StObject.set(x, "isHeader", js.undefined)
      
      @scala.inline
      def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDetailsRowCheckStyles extends StObject {
    
    /** @deprecated Use `root` (they're applied to the same element) */
    var check: IStyle = js.native
    
    var isDisabled: IStyle = js.native
    
    var root: IStyle = js.native
  }
  object IDetailsRowCheckStyles {
    
    @scala.inline
    def apply(): IDetailsRowCheckStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDetailsRowCheckStyles]
    }
    
    @scala.inline
    implicit class IDetailsRowCheckStylesMutableBuilder[Self <: IDetailsRowCheckStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheck(value: IStyle): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckNull: Self = StObject.set(x, "check", null)
      
      @scala.inline
      def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      @scala.inline
      def setIsDisabled(value: IStyle): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDisabledNull: Self = StObject.set(x, "isDisabled", null)
      
      @scala.inline
      def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
