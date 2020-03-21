package typingsSlinky.antdMobileRn

import slinky.core.facade.ReactElement
import typingsSlinky.antdMobileRn.tabsPropsTypeMod.TabsProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile-rn/lib/tabs/index.native", JSImport.Namespace)
@js.native
object tabsIndexNativeMod extends js.Object {
  @js.native
  trait Tabs
    extends Component[TabsProps, js.Object, js.Any] {
    def renderTabBar(props: js.Any): ReactElement = js.native
  }
  
  @js.native
  class default () extends Tabs
  
  /* static members */
  @js.native
  object default extends js.Object {
    var DefaultTabBar: TypeofRMCDefaultTabBar = js.native
  }
  
}

