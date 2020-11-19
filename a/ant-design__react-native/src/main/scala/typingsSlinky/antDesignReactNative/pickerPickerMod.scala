package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.anon.ChildrenArray
import typingsSlinky.antDesignReactNative.pickerTypesMod.PickerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native/lib/picker/Picker", JSImport.Namespace)
@js.native
object pickerPickerMod extends js.Object {
  
  @js.native
  trait Picker
    extends Component[PickerProps, js.Object, js.Any] {
    
    def getValue(): js.Any = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MPicker(nextProps: js.Any): Boolean = js.native
  }
  
  @js.native
  class default () extends Picker
  /* static members */
  @js.native
  object default extends js.Object {
    
    var Item: js.Any = js.native
    
    var defaultProps: ChildrenArray = js.native
  }
}
