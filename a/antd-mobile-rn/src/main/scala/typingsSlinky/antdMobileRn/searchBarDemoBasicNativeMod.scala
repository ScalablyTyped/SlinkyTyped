package typingsSlinky.antdMobileRn

import typingsSlinky.antdMobileRn.anon.ValueString
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile-rn/lib/search-bar/demo/basic.native", JSImport.Namespace)
@js.native
object searchBarDemoBasicNativeMod extends js.Object {
  
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
