package typingsSlinky.reactColor

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.reactColor.mod.ColorResult
import typingsSlinky.reactColor.mod.CustomPickerProps
import typingsSlinky.reactColor.reactColorStrings.horizontal
import typingsSlinky.reactColor.reactColorStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hueMod {
  
  @JSImport("react-color/lib/components/common/Hue", JSImport.Default)
  @js.native
  class default ()
    extends Component[HueProps, js.Object, js.Any]
  
  @js.native
  trait Hue
    extends Component[HueProps, js.Object, js.Any]
  
  @js.native
  trait HueProps extends CustomPickerProps[Hue] {
    
    var direction: js.UndefOr[horizontal | vertical] = js.native
  }
  object HueProps {
    
    @scala.inline
    def apply(onChange: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): HueProps = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange))
      __obj.asInstanceOf[HueProps]
    }
    
    @scala.inline
    implicit class HuePropsMutableBuilder[Self <: HueProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    }
  }
}
