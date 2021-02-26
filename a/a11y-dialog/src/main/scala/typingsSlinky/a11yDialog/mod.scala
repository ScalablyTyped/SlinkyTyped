package typingsSlinky.a11yDialog

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.NodeList
import typingsSlinky.a11yDialog.mod.A11yDialog.A11yDialog
import typingsSlinky.a11yDialog.mod.A11yDialog.Targets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("a11y-dialog", JSImport.Namespace)
  @js.native
  class ^ protected () extends A11yDialog {
    def this(node: Element) = this()
    def this(node: Element, targets: Targets) = this()
  }
  
  object A11yDialog {
    
    @js.native
    trait A11yDialog extends StObject {
      
      /* private */ def _bindKeypress(event: Event): Unit = js.native
      
      /* private */ def _fire(`type`: EventType, event: Event): Unit = js.native
      
      /* private */ def _maintainFocus(event: Event): Unit = js.native
      
      def create(targets: Targets): typingsSlinky.a11yDialog.mod.A11yDialog.A11yDialog = js.native
      
      def destroy(): typingsSlinky.a11yDialog.mod.A11yDialog.A11yDialog = js.native
      
      def hide(): typingsSlinky.a11yDialog.mod.A11yDialog.A11yDialog = js.native
      def hide(event: Event): typingsSlinky.a11yDialog.mod.A11yDialog.A11yDialog = js.native
      
      def off(`type`: EventType, handler: EventHandler): typingsSlinky.a11yDialog.mod.A11yDialog.A11yDialog = js.native
      
      def on(`type`: EventType, handler: EventHandler): typingsSlinky.a11yDialog.mod.A11yDialog.A11yDialog = js.native
      
      def show(): typingsSlinky.a11yDialog.mod.A11yDialog.A11yDialog = js.native
      def show(event: Event): typingsSlinky.a11yDialog.mod.A11yDialog.A11yDialog = js.native
    }
    
    type EventHandler = js.Function2[/* node */ Element, /* event */ js.UndefOr[Event], Unit]
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.a11yDialog.a11yDialogStrings.show
      - typingsSlinky.a11yDialog.a11yDialogStrings.hide
      - typingsSlinky.a11yDialog.a11yDialogStrings.destroy
      - typingsSlinky.a11yDialog.a11yDialogStrings.create
    */
    trait EventType extends StObject
    object EventType {
      
      @scala.inline
      def create: typingsSlinky.a11yDialog.a11yDialogStrings.create = "create".asInstanceOf[typingsSlinky.a11yDialog.a11yDialogStrings.create]
      
      @scala.inline
      def destroy: typingsSlinky.a11yDialog.a11yDialogStrings.destroy = "destroy".asInstanceOf[typingsSlinky.a11yDialog.a11yDialogStrings.destroy]
      
      @scala.inline
      def hide: typingsSlinky.a11yDialog.a11yDialogStrings.hide = "hide".asInstanceOf[typingsSlinky.a11yDialog.a11yDialogStrings.hide]
      
      @scala.inline
      def show: typingsSlinky.a11yDialog.a11yDialogStrings.show = "show".asInstanceOf[typingsSlinky.a11yDialog.a11yDialogStrings.show]
    }
    
    type Targets = NodeList | Element | String
  }
}
