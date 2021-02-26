package typingsSlinky.materialUi

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clickAwayListenerMod {
  
  @JSImport("material-ui/internal/ClickAwayListener", JSImport.Default)
  @js.native
  class default ()
    extends Component[ClickAwayListenerProps, js.Object, js.Any]
  
  @js.native
  trait ClickAwayListener
    extends Component[ClickAwayListenerProps, js.Object, js.Any]
  
  @js.native
  trait ClickAwayListenerProps extends Props[ClickAwayListener] {
    
    var onClickAway: js.UndefOr[js.Any] = js.native
  }
  object ClickAwayListenerProps {
    
    @scala.inline
    def apply(): ClickAwayListenerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickAwayListenerProps]
    }
    
    @scala.inline
    implicit class ClickAwayListenerPropsMutableBuilder[Self <: ClickAwayListenerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClickAway(value: js.Any): Self = StObject.set(x, "onClickAway", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickAwayUndefined: Self = StObject.set(x, "onClickAway", js.undefined)
    }
  }
}
