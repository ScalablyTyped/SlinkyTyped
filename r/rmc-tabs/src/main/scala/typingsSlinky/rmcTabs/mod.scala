package typingsSlinky.rmcTabs

import typingsSlinky.rmcTabs.defaultTabBarMod.PropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-tabs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class DefaultTabBar protected ()
    extends typingsSlinky.rmcTabs.defaultTabBarMod.DefaultTabBar {
    def this(props: PropsType) = this()
  }
  
  @js.native
  class Tabs protected ()
    extends typingsSlinky.rmcTabs.tabsMod.Tabs {
    def this(props: typingsSlinky.rmcTabs.tabsMod.PropsType) = this()
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
    var defaultProps: typingsSlinky.rmcTabs.tabsMod.PropsType = js.native
  }
  
}

