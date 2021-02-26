package typingsSlinky.reactAliceCarousel

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.reactAliceCarousel.typesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dotsNavigationMod {
  
  @JSImport("react-alice-carousel/lib/views/DotsNavigation", "DotsNavigation")
  @js.native
  def DotsNavigation(hasStateOnClickOnMouseEnterOnMouseLeave: Props): ReactElement = js.native
  
  @js.native
  trait Props extends StObject {
    
    def onClick(index: Double): Unit = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[Element]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[Element]] = js.native
    
    var state: State = js.native
  }
  object Props {
    
    @scala.inline
    def apply(onClick: Double => Unit, state: State): Props = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: Double => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
