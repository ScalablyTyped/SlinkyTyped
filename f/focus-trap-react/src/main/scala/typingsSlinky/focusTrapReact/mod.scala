package typingsSlinky.focusTrapReact

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.focusTrap.mod.Options
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("focus-trap-react", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[Props, js.Object, js.Any]
  
  type FocusTrap = ReactComponentClass[Props]
  
  @js.native
  trait Props
    extends AllHTMLAttributes[js.Any] {
    
    var active: js.UndefOr[Boolean] = js.native
    
    @JSName("children")
    var children_Props: ReactElement = js.native
    
    var focusTrapOptions: js.UndefOr[Options] = js.native
    
    var paused: js.UndefOr[Boolean] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(children: ReactElement): Props = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusTrapOptions(value: Options): Self = StObject.set(x, "focusTrapOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusTrapOptionsUndefined: Self = StObject.set(x, "focusTrapOptions", js.undefined)
      
      @scala.inline
      def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
    }
  }
}
