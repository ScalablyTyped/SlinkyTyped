package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.baseComponentTypesMod.IBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardTypesMod {
  
  @js.native
  sealed trait DocumentCardType extends StObject
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCard.types", "DocumentCardType")
  @js.native
  object DocumentCardType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DocumentCardType with Double] = js.native
    
    /**
      * Compact layout. Displays the preview beside the details, rather than above.
      */
    @js.native
    sealed trait compact extends DocumentCardType
    /* 1 */ val compact: typingsSlinky.officeUiFabricReact.documentCardTypesMod.DocumentCardType.compact with Double = js.native
    
    /**
      * Standard DocumentCard.
      */
    @js.native
    sealed trait normal extends DocumentCardType
    /* 0 */ val normal: typingsSlinky.officeUiFabricReact.documentCardTypesMod.DocumentCardType.normal with Double = js.native
  }
  
  @js.native
  trait IDocumentCard extends StObject {
    
    /**
      * Sets focus to the DocumentCard.
      */
    def focus(): Unit = js.native
  }
  object IDocumentCard {
    
    @scala.inline
    def apply(focus: () => Unit): IDocumentCard = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[IDocumentCard]
    }
    
    @scala.inline
    implicit class IDocumentCardMutableBuilder[Self <: IDocumentCard] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IDocumentCardProps
    extends HTMLAttributes[HTMLDivElement]
       with IBaseProps[IDocumentCard] {
    
    /**
      * Hex color value of the line below the card, which should correspond to the document type.
      * This should only be supplied when using the 'compact' card layout.
      *
      * Deprecated at v4.17.1, to be removed at \>= v5.0.0.
      * @deprecated To be removed at v5.0.0.
      */
    var accentColor: js.UndefOr[String] = js.native
    
    /**
      * A URL to navigate to when the card is clicked. If a function has also been provided,
      * it will be used instead of the URL.
      */
    var onClickHref: js.UndefOr[String] = js.native
    
    /**
      * A target browser context for opening the link. If not specified, will open in the same tab/window.
      */
    var onClickTarget: js.UndefOr[String] = js.native
    
    /**
      * Function to call when the card is clicked or keyboard Enter/Space is pushed.
      */
    @JSName("onClick")
    var onClick_IDocumentCardProps: js.UndefOr[js.Function1[/* ev */ js.UndefOr[SyntheticEvent[Event, HTMLElement]], Unit]] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IDocumentCardStyleProps, IDocumentCardStyles]] = js.native
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.native
    
    /**
      * The type of DocumentCard to display.
      * @defaultvalue DocumentCardType.normal
      */
    var `type`: js.UndefOr[DocumentCardType] = js.native
  }
  object IDocumentCardProps {
    
    @scala.inline
    def apply(): IDocumentCardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardProps]
    }
    
    @scala.inline
    implicit class IDocumentCardPropsMutableBuilder[Self <: IDocumentCardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccentColor(value: String): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccentColorUndefined: Self = StObject.set(x, "accentColor", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* ev */ js.UndefOr[SyntheticEvent[Event, HTMLElement]] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickHref(value: String): Self = StObject.set(x, "onClickHref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickHrefUndefined: Self = StObject.set(x, "onClickHref", js.undefined)
      
      @scala.inline
      def setOnClickTarget(value: String): Self = StObject.set(x, "onClickTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickTargetUndefined: Self = StObject.set(x, "onClickTarget", js.undefined)
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IDocumentCardStyleProps, IDocumentCardStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IDocumentCardStyleProps => DeepPartial[IDocumentCardStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setType(value: DocumentCardType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait IDocumentCardStyleProps extends StObject {
    
    /**
      * True when the card has a click action.
      */
    var actionable: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Compact variant of the card.
      */
    var compact: js.UndefOr[Boolean] = js.native
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme = js.native
  }
  object IDocumentCardStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IDocumentCardStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardStyleProps]
    }
    
    @scala.inline
    implicit class IDocumentCardStylePropsMutableBuilder[Self <: IDocumentCardStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionable(value: Boolean): Self = StObject.set(x, "actionable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionableUndefined: Self = StObject.set(x, "actionable", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDocumentCardStyles extends StObject {
    
    var root: IStyle = js.native
  }
  object IDocumentCardStyles {
    
    @scala.inline
    def apply(): IDocumentCardStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardStyles]
    }
    
    @scala.inline
    implicit class IDocumentCardStylesMutableBuilder[Self <: IDocumentCardStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
