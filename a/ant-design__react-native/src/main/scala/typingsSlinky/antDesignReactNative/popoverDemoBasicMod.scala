package typingsSlinky.antDesignReactNative

import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native/lib/popover/demo/basic", JSImport.Namespace)
@js.native
object popoverDemoBasicMod extends js.Object {
  
  val description: /* "Popover example" */ String = js.native
  
  val title: /* "Popover" */ String = js.native
  
  @js.native
  trait PopoverExample
    extends Component[js.Any, js.Any, js.Any] {
    
    def onSelect(value: js.Any): Unit = js.native
    
    var renderList: js.Any = js.native
  }
  
  @js.native
  class default protected () extends PopoverExample {
    def this(props: js.Any) = this()
  }
}
