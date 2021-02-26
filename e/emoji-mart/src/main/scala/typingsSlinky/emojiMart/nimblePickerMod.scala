package typingsSlinky.emojiMart

import slinky.core.ReactComponentClass
import typingsSlinky.emojiMart.dataMod.Data
import typingsSlinky.emojiMart.sharedPropsMod.PickerProps
import typingsSlinky.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nimblePickerMod {
  
  @JSImport("emoji-mart/dist-es/components/picker/nimble-picker", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[NimblePickerProps, js.Object, js.Any]
  
  type NimblePicker = ReactComponentClass[NimblePickerProps]
  
  @js.native
  trait NimblePickerProps extends PickerProps {
    
    var data: Data = js.native
  }
  object NimblePickerProps {
    
    @scala.inline
    def apply(data: Data): NimblePickerProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[NimblePickerProps]
    }
    
    @scala.inline
    implicit class NimblePickerPropsMutableBuilder[Self <: NimblePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
}
