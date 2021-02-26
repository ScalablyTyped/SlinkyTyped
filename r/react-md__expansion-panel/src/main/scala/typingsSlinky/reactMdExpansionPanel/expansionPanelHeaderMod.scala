package typingsSlinky.reactMdExpansionPanel

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.ButtonHTMLAttributes
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expansionPanelHeaderMod {
  
  @JSImport("@react-md/expansion-panel/types/ExpansionPanelHeader", "ExpansionPanelHeader")
  @js.native
  val ExpansionPanelHeader: ForwardRefExoticComponent[ExpansionPanelHeaderProps with RefAttributes[HTMLButtonElement]] = js.native
  
  @js.native
  trait ExpansionPanelHeaderProps extends ButtonHTMLAttributes[HTMLButtonElement] {
    
    /**
      * The children to display within the header.
      *
      * Reminder: Since this is a `<button>`, only `inline` elements should be
      * rendered within (so use `<span>` instead of `<div>` for children).
      */
    @JSName("children")
    var children_ExpansionPanelHeaderProps: ReactElement = js.native
    
    /**
      * Boolean if the icon rotation transition should be disabled.
      */
    var disableTransition: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the panel is currently expanded. This is just used to rotate the
      * icon as needed.
      */
    var expanded: Boolean = js.native
    
    /**
      * The icon to use for the expander icon.
      */
    var icon: js.UndefOr[ReactElement] = js.native
    
    /**
      * The id for the header. This is required for a11y.
      */
    @JSName("id")
    var id_ExpansionPanelHeaderProps: String = js.native
    
    /**
      * The click handler that should attempt to toggle the expansion state of the
      * panel.
      */
    @JSName("onClick")
    var onClick_ExpansionPanelHeaderProps: MouseEventHandler[HTMLButtonElement] = js.native
  }
  object ExpansionPanelHeaderProps {
    
    @scala.inline
    def apply(expanded: Boolean, id: String, onClick: SyntheticMouseEvent[HTMLButtonElement] => Unit): ExpansionPanelHeaderProps = {
      val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
      __obj.asInstanceOf[ExpansionPanelHeaderProps]
    }
    
    @scala.inline
    implicit class ExpansionPanelHeaderPropsMutableBuilder[Self <: ExpansionPanelHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisableTransition(value: Boolean): Self = StObject.set(x, "disableTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableTransitionUndefined: Self = StObject.set(x, "disableTransition", js.undefined)
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    }
  }
}
