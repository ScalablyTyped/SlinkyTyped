package typingsSlinky.officeUiFabricReact

import slinky.core.facade.ReactRef
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.documentCardStatusBaseMod.DocumentCardStatusBase
import typingsSlinky.react.mod.Props
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardStatusTypesMod {
  
  @js.native
  trait IDocumentCardStatus extends StObject
  
  @js.native
  trait IDocumentCardStatusProps extends Props[DocumentCardStatusBase] {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[IDocumentCardStatus]] = js.native
    
    /**
      * Describe status information. Required field.
      */
    var status: String = js.native
    
    /**
      * Describes DocumentCard status icon.
      */
    var statusIcon: js.UndefOr[String] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IDocumentCardStatusStyleProps, IDocumentCardStatusStyles]] = js.native
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object IDocumentCardStatusProps {
    
    @scala.inline
    def apply(status: String): IDocumentCardStatusProps = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardStatusProps]
    }
    
    @scala.inline
    implicit class IDocumentCardStatusPropsMutableBuilder[Self <: IDocumentCardStatusProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IDocumentCardStatus]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IDocumentCardStatus | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefRefObject(value: ReactRef[IDocumentCardStatus]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusIcon(value: String): Self = StObject.set(x, "statusIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusIconUndefined: Self = StObject.set(x, "statusIcon", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IDocumentCardStatusStyleProps, IDocumentCardStatusStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IDocumentCardStatusStyleProps => DeepPartial[IDocumentCardStatusStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait IDocumentCardStatusStyleProps extends StObject {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme = js.native
  }
  object IDocumentCardStatusStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IDocumentCardStatusStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardStatusStyleProps]
    }
    
    @scala.inline
    implicit class IDocumentCardStatusStylePropsMutableBuilder[Self <: IDocumentCardStatusStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDocumentCardStatusStyles extends StObject {
    
    var root: IStyle = js.native
  }
  object IDocumentCardStatusStyles {
    
    @scala.inline
    def apply(): IDocumentCardStatusStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardStatusStyles]
    }
    
    @scala.inline
    implicit class IDocumentCardStatusStylesMutableBuilder[Self <: IDocumentCardStatusStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
