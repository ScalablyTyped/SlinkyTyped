package typingsSlinky.reactMdForm

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdForm.inputToggleMod.InputToggleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioMod {
  
  @JSImport("@react-md/form/types/toggle/Radio", "Radio")
  @js.native
  val Radio: ForwardRefExoticComponent[RadioProps with RefAttributes[HTMLInputElement]] = js.native
  
  @js.native
  trait RadioProps extends InputToggleProps {
    
    /**
      * A value is required for a radio button unlike a checkbox.
      */
    @JSName("value")
    var value_RadioProps: js.Array[String] | String | Double = js.native
  }
  object RadioProps {
    
    @scala.inline
    def apply(id: String, value: js.Array[String] | String | Double): RadioProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioProps]
    }
    
    @scala.inline
    implicit class RadioPropsMutableBuilder[Self <: RadioProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Array[String] | String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
