package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.pickerTypesMod.PickerProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerPickerMod {
  
  @JSImport("@ant-design/react-native/lib/picker/Picker", JSImport.Default)
  @js.native
  class default () extends Picker
  object default {
    
    @JSImport("@ant-design/react-native/lib/picker/Picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ant-design/react-native/lib/picker/Picker", "default.Item")
    @js.native
    def Item: js.Any = js.native
    @scala.inline
    def Item_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    /* static member */
    object defaultProps {
      
      @JSImport("@ant-design/react-native/lib/picker/Picker", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/picker/Picker", "default.defaultProps.children")
      @js.native
      def children: js.Array[scala.Nothing] = js.native
      @scala.inline
      def children_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Picker
    extends Component[PickerProps, js.Object, js.Any] {
    
    def getValue(): js.Any = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MPicker(nextProps: js.Any): Boolean = js.native
  }
}
