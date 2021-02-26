package typingsSlinky.officeUiFabricReact

import slinky.core.facade.ReactRef
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.dialogFooterBaseMod.DialogFooterBase
import typingsSlinky.react.mod.Props
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogFooterTypesMod {
  
  @js.native
  trait IDialogFooter extends StObject
  
  @js.native
  trait IDialogFooterProps extends Props[DialogFooterBase] {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[IDialogFooter]] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IDialogFooterStyleProps, IDialogFooterStyles]] = js.native
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object IDialogFooterProps {
    
    @scala.inline
    def apply(): IDialogFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDialogFooterProps]
    }
    
    @scala.inline
    implicit class IDialogFooterPropsMutableBuilder[Self <: IDialogFooterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IDialogFooter]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IDialogFooter | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefRefObject(value: ReactRef[IDialogFooter]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IDialogFooterStyleProps, IDialogFooterStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IDialogFooterStyleProps => DeepPartial[IDialogFooterStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait IDialogFooterStyleProps extends StObject {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme = js.native
  }
  object IDialogFooterStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IDialogFooterStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDialogFooterStyleProps]
    }
    
    @scala.inline
    implicit class IDialogFooterStylePropsMutableBuilder[Self <: IDialogFooterStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDialogFooterStyles extends StObject {
    
    var action: IStyle = js.native
    
    /**
      * Style for the actions element.
      */
    var actions: IStyle = js.native
    
    var actionsRight: IStyle = js.native
  }
  object IDialogFooterStyles {
    
    @scala.inline
    def apply(): IDialogFooterStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDialogFooterStyles]
    }
    
    @scala.inline
    implicit class IDialogFooterStylesMutableBuilder[Self <: IDialogFooterStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: IStyle): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionNull: Self = StObject.set(x, "action", null)
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setActions(value: IStyle): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsNull: Self = StObject.set(x, "actions", null)
      
      @scala.inline
      def setActionsRight(value: IStyle): Self = StObject.set(x, "actionsRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsRightNull: Self = StObject.set(x, "actionsRight", null)
      
      @scala.inline
      def setActionsRightUndefined: Self = StObject.set(x, "actionsRight", js.undefined)
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    }
  }
}
