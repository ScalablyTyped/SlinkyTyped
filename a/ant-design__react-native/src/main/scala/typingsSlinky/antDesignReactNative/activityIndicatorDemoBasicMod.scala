package typingsSlinky.antDesignReactNative

import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activityIndicatorDemoBasicMod {
  
  @JSImport("@ant-design/react-native/lib/activity-indicator/demo/basic", JSImport.Default)
  @js.native
  class default protected () extends ActivityIndicatorExample {
    def this(props: js.Any) = this()
  }
  
  @js.native
  trait ActivityIndicatorExample
    extends Component[js.Any, js.Any, js.Any] {
    
    var closeTimer: js.Any = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MActivityIndicatorExample(): Unit = js.native
    
    def loadingToast(): Unit = js.native
  }
}
