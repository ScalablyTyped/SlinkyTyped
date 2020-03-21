package typingsSlinky.rmcTabs

import typingsSlinky.rmcTabs.defaultTabBarNativeMod.PropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-tabs/lib/index.native", JSImport.Namespace)
@js.native
object indexNativeMod extends js.Object {
  @js.native
  class DefaultTabBar protected ()
    extends typingsSlinky.rmcTabs.defaultTabBarNativeMod.DefaultTabBar {
    def this(props: PropsType) = this()
  }
  
  @js.native
  class Tabs protected ()
    extends typingsSlinky.rmcTabs.tabsNativeMod.Tabs {
    def this(props: typingsSlinky.rmcTabs.tabsNativeMod.PropsType) = this()
  }
  
  /* static members */
  @js.native
  object DefaultTabBar extends js.Object {
    var defaultProps: PropsType = js.native
  }
  
  /* static members */
  @js.native
  object Tabs extends js.Object {
    var DefaultTabBar: TypeofDefaultTabBar = js.native
    var defaultProps: typingsSlinky.rmcTabs.tabsNativeMod.PropsType = js.native
  }
  
}

