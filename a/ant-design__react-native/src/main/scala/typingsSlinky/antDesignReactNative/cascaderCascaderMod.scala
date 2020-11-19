package typingsSlinky.antDesignReactNative

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.anon.ColsData
import typingsSlinky.antDesignReactNative.anon.DataValue
import typingsSlinky.antDesignReactNative.anon.ValueArray
import typingsSlinky.antDesignReactNative.cascaderTypesMod.CascaderProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native/lib/picker/cascader/Cascader", JSImport.Namespace)
@js.native
object cascaderCascaderMod extends js.Object {
  
  @js.native
  trait Cascader
    extends Component[CascaderProps, js.Any, js.Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MCascader(nextProps: DataValue): Unit = js.native
    
    def getCols(): js.Array[ReactElement] = js.native
    
    def getValue(d: js.Any, `val`: js.Any): js.Array[_] = js.native
    
    def onValueChange(value: js.Any, index: js.Any): Unit = js.native
    
    @JSName("state")
    var state_Cascader: ValueArray = js.native
  }
  
  @js.native
  class default () extends Cascader
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: ColsData = js.native
  }
}
