package typingsSlinky.antDesignReactNative

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native/lib/tab-bar/demo/basic", JSImport.Namespace)
@js.native
object tabBarDemoBasicMod extends js.Object {
  
  @js.native
  trait BasicTabBarExample
    extends Component[js.Any, js.Any, js.Any] {
    
    def onChangeTab(tabName: js.Any): Unit = js.native
    
    def renderContent(pageText: js.Any): ReactElement = js.native
  }
  
  @js.native
  class default protected () extends BasicTabBarExample {
    def this(props: js.Any) = this()
  }
}
