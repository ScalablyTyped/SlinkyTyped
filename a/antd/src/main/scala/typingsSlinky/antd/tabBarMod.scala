package typingsSlinky.antd

import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.Animated
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.antd.tabsMod.TabsProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/tabs/TabBar", JSImport.Namespace)
@js.native
object tabBarMod extends js.Object {
  @js.native
  trait TabBar
    extends Component[TabsProps, js.Object, js.Any] {
    def renderTabBar(hasDirection: ConfigConsumerProps): ReactElement = js.native
  }
  
  @js.native
  class default () extends TabBar
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Animated = js.native
  }
  
}

