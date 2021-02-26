package typingsSlinky.reactScrollIntoViewIfNeeded

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.scrollIntoViewIfNeeded.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-scroll-into-view-if-needed", JSImport.Default)
  @js.native
  class default ()
    extends Component[ReactScrollIntoViewIfNeededProps, js.Object, js.Any]
  
  type ReactScrollIntoViewIfNeeded = ReactComponentClass[ReactScrollIntoViewIfNeededProps]
  
  @js.native
  trait ReactScrollIntoViewIfNeededProps extends HTMLProps[HTMLElement] {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var elementType: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
      ] = js.native
    
    var options: js.UndefOr[Options[_]] = js.native
  }
  object ReactScrollIntoViewIfNeededProps {
    
    @scala.inline
    def apply(): ReactScrollIntoViewIfNeededProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactScrollIntoViewIfNeededProps]
    }
    
    @scala.inline
    implicit class ReactScrollIntoViewIfNeededPropsMutableBuilder[Self <: ReactScrollIntoViewIfNeededProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setElementType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
      
      @scala.inline
      def setOptions(value: Options[_]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
