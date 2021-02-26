package typingsSlinky.reactMdExpansionPanel

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdCard.cardMod.CardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expansionPanelMod {
  
  @JSImport("@react-md/expansion-panel/types/ExpansionPanel", "ExpansionPanel")
  @js.native
  val ExpansionPanel: ForwardRefExoticComponent[ExpansionPanelProps with RefAttributes[HTMLDivElement]] = js.native
  
  /* Inlined std.Pick<@react-md/card.@react-md/card.CardContentProps, 'disablePadding' | 'disableSecondaryColor' | 'disableParagraphMargin'> */
  @js.native
  trait ConfigurableCardContentProps extends StObject {
    
    var disablePadding: js.UndefOr[Boolean] = js.native
    
    var disableParagraphMargin: js.UndefOr[Boolean] = js.native
    
    var disableSecondaryColor: js.UndefOr[Boolean] = js.native
  }
  object ConfigurableCardContentProps {
    
    @scala.inline
    def apply(): ConfigurableCardContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurableCardContentProps]
    }
    
    @scala.inline
    implicit class ConfigurableCardContentPropsMutableBuilder[Self <: ConfigurableCardContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisablePadding(value: Boolean): Self = StObject.set(x, "disablePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePaddingUndefined: Self = StObject.set(x, "disablePadding", js.undefined)
      
      @scala.inline
      def setDisableParagraphMargin(value: Boolean): Self = StObject.set(x, "disableParagraphMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableParagraphMarginUndefined: Self = StObject.set(x, "disableParagraphMargin", js.undefined)
      
      @scala.inline
      def setDisableSecondaryColor(value: Boolean): Self = StObject.set(x, "disableSecondaryColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSecondaryColorUndefined: Self = StObject.set(x, "disableSecondaryColor", js.undefined)
    }
  }
  
  @js.native
  trait ExpansionPanelProps
    extends CardProps
       with ConfigurableCardContentProps {
    
    /**
      * An optional className to provide the content of the panel.
      */
    var contentClassName: js.UndefOr[String] = js.native
    
    /**
      * An optional style to provide to the content of the panel.
      */
    var contentStyle: js.UndefOr[CSSProperties] = js.native
    
    /**
      * An optional header element to display instead of the default
      * implementation.
      */
    var customHeader: js.UndefOr[ReactElement] = js.native
    
    /**
      * Boolean if the collapse transition should be disabled for the content
      * within the panel. It is recommended to disable this transition if there is
      * a lot of content within the panel since animating max-height isn't super
      * great since it causes DOM repaints during the entire transition.
      */
    var disableTransition: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if clicking on the header should no longer toggle the expansion
      * state. This will automatically be provided from the `usePanels` hook for
      * when a panel cannot be closed to do preventing all panels from being closed
      * at a time.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the panel is currently expanded.
      */
    var expanded: Boolean = js.native
    
    /**
      * An optional expander icon to use within the default header implementation.
      * This defaults to the `"expander"` icon.
      */
    var expanderIcon: js.UndefOr[ReactElement] = js.native
    
    /**
      * The children to display within the default header element.
      */
    var header: js.UndefOr[ReactElement] = js.native
    
    /**
      * An optional className to provide to the default header implementation. If
      * the `header` prop is provided, this will do nothing.
      */
    var headerClassName: js.UndefOr[String] = js.native
    
    /**
      * An optional ref to pass to the default header implementation. This will be
      * provided automatically if you are using the `usePanels` hook to allow
      * keyboard movement with the arrow keys and home/end keys. If you provide
      * your own `header`, you'll need to pass the `headerRef` to your custom
      * implementation to the focusable element for the keyboard focus behavior to
      * work.
      */
    var headerRef: js.UndefOr[Ref[HTMLButtonElement]] = js.native
    
    /**
      * An optional style object to provide to the default header implementation. If
      * the `header` prop is provided, this will do nothing.
      */
    var headerStyle: js.UndefOr[CSSProperties] = js.native
    
    /**
      * An id for the panel that is required for a11y.
      */
    @JSName("id")
    var id_ExpansionPanelProps: String = js.native
    
    /**
      * Boolean if margin top should be applied to this header to add some
      * additional spacing between this panel and the previous panel. This will
      * automatically be provided for panels when using the `usePanels` hook.
      */
    var marginTop: js.UndefOr[Boolean] = js.native
    
    /**
      * A function that should attempt to change the expansion state of the panel.
      */
    var onExpandClick: MouseEventHandler[HTMLButtonElement] = js.native
    
    /**
      * Boolean if the content should be persistent within the DOM instead of
      * unmounting once no longer expanded. This is only really helpful if you want
      * to maintain state while the panel is hidden since the children will unmount
      * when not expanded.
      */
    var persistent: js.UndefOr[Boolean] = js.native
  }
  object ExpansionPanelProps {
    
    @scala.inline
    def apply(expanded: Boolean, id: String, onExpandClick: SyntheticMouseEvent[HTMLButtonElement] => Unit): ExpansionPanelProps = {
      val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onExpandClick = js.Any.fromFunction1(onExpandClick))
      __obj.asInstanceOf[ExpansionPanelProps]
    }
    
    @scala.inline
    implicit class ExpansionPanelPropsMutableBuilder[Self <: ExpansionPanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      @scala.inline
      def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      @scala.inline
      def setCustomHeader(value: ReactElement): Self = StObject.set(x, "customHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeaderReactElement(value: ReactElement): Self = StObject.set(x, "customHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeaderUndefined: Self = StObject.set(x, "customHeader", js.undefined)
      
      @scala.inline
      def setDisableTransition(value: Boolean): Self = StObject.set(x, "disableTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableTransitionUndefined: Self = StObject.set(x, "disableTransition", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanderIcon(value: ReactElement): Self = StObject.set(x, "expanderIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanderIconReactElement(value: ReactElement): Self = StObject.set(x, "expanderIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanderIconUndefined: Self = StObject.set(x, "expanderIcon", js.undefined)
      
      @scala.inline
      def setHeader(value: ReactElement): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
      
      @scala.inline
      def setHeaderReactElement(value: ReactElement): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderRef(value: Ref[HTMLButtonElement]): Self = StObject.set(x, "headerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderRefFunction1(value: /* instance */ HTMLButtonElement | Null => Unit): Self = StObject.set(x, "headerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderRefNull: Self = StObject.set(x, "headerRef", null)
      
      @scala.inline
      def setHeaderRefRefObject(value: ReactRef[HTMLButtonElement]): Self = StObject.set(x, "headerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderRefUndefined: Self = StObject.set(x, "headerRef", js.undefined)
      
      @scala.inline
      def setHeaderStyle(value: CSSProperties): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginTop(value: Boolean): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      @scala.inline
      def setOnExpandClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onExpandClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    }
  }
}
