package typingsSlinky.officeUiFabricReact

import slinky.core.facade.ReactRef
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.documentCardActionsBaseMod.DocumentCardActionsBase
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.std.Number
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardActionsTypesMod {
  
  @js.native
  trait IDocumentCardActions extends StObject
  
  @js.native
  trait IDocumentCardActionsProps extends ClassAttributes[DocumentCardActionsBase] {
    
    /**
      * The actions available for this document.
      */
    var actions: js.Array[IButtonProps] = js.native
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[IDocumentCardActions]] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[
        IStyleFunctionOrObject[IDocumentCardActionsStyleProps, IDocumentCardActionsStyles]
      ] = js.native
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.native
    
    /**
      * The number of views this document has received.
      */
    var views: js.UndefOr[Number] = js.native
  }
  object IDocumentCardActionsProps {
    
    @scala.inline
    def apply(actions: js.Array[IButtonProps]): IDocumentCardActionsProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardActionsProps]
    }
    
    @scala.inline
    implicit class IDocumentCardActionsPropsMutableBuilder[Self <: IDocumentCardActionsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[IButtonProps]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsVarargs(value: IButtonProps*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IDocumentCardActions]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IDocumentCardActions | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefRefObject(value: ReactRef[IDocumentCardActions]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IDocumentCardActionsStyleProps, IDocumentCardActionsStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IDocumentCardActionsStyleProps => DeepPartial[IDocumentCardActionsStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setViews(value: Number): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    }
  }
  
  @js.native
  trait IDocumentCardActionsStyleProps extends StObject {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme = js.native
  }
  object IDocumentCardActionsStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IDocumentCardActionsStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardActionsStyleProps]
    }
    
    @scala.inline
    implicit class IDocumentCardActionsStylePropsMutableBuilder[Self <: IDocumentCardActionsStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDocumentCardActionsStyles extends StObject {
    
    var action: IStyle = js.native
    
    var root: IStyle = js.native
    
    var views: IStyle = js.native
    
    var viewsIcon: IStyle = js.native
  }
  object IDocumentCardActionsStyles {
    
    @scala.inline
    def apply(): IDocumentCardActionsStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardActionsStyles]
    }
    
    @scala.inline
    implicit class IDocumentCardActionsStylesMutableBuilder[Self <: IDocumentCardActionsStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: IStyle): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionNull: Self = StObject.set(x, "action", null)
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setViews(value: IStyle): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewsIcon(value: IStyle): Self = StObject.set(x, "viewsIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewsIconNull: Self = StObject.set(x, "viewsIcon", null)
      
      @scala.inline
      def setViewsIconUndefined: Self = StObject.set(x, "viewsIcon", js.undefined)
      
      @scala.inline
      def setViewsNull: Self = StObject.set(x, "views", null)
      
      @scala.inline
      def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    }
  }
}
