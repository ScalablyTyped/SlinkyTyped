package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.anon.ValueString
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native/lib/search-bar/demo/basic", JSImport.Namespace)
@js.native
object searchBarDemoBasicMod extends js.Object {
  
  @js.native
  trait SearchBarDemo
    extends Component[js.Any, js.Any, js.Any] {
    
    def clear(): Unit = js.native
    
    def onChange(value: js.Any): Unit = js.native
    
    @JSName("state")
    var state_SearchBarDemo: ValueString = js.native
  }
  
  @js.native
  class default () extends SearchBarDemo
}
