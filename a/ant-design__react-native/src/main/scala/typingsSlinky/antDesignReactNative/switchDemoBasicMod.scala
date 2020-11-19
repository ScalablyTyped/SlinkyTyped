package typingsSlinky.antDesignReactNative

import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native/lib/switch/demo/basic", JSImport.Namespace)
@js.native
object switchDemoBasicMod extends js.Object {
  
  @js.native
  trait SwitchExample
    extends Component[js.Any, js.Any, js.Any] {
    
    def onSwitchChange(value: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends SwitchExample {
    def this(props: js.Any) = this()
  }
}
