package typingsSlinky.atAntDashDesignReactDashNative

import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.ActionSheet
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`ActionSheet example`
import typingsSlinky.atAntDashDesignReactDashNative.libActionDashSheetDemoBasicMod.Test
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/action-sheet/demo/basic", JSImport.Namespace)
@js.native
object libActionDashSheetDemoBasicMod extends js.Object {
  @js.native
  trait Test
    extends Component[js.Any, js.Any, js.Any] {
    def showActionSheet(): Unit = js.native
    def showShareActionSheet(): Unit = js.native
  }
  
  @js.native
  class default protected () extends Test {
    def this(props: js.Any) = this()
  }
  
  val description: `ActionSheet example` = js.native
  val title: ActionSheet = js.native
}

