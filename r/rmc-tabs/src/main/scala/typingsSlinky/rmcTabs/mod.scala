package typingsSlinky.rmcTabs

import typingsSlinky.rmcTabs.anon.TypeofDefaultTabBar
import typingsSlinky.rmcTabs.defaultTabBarMod.PropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rmc-tabs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class DefaultTabBar protected ()
    extends typingsSlinky.rmcTabs.defaultTabBarMod.DefaultTabBar {
    def this(props: PropsType) = this()
  }
  /* static members */
  @js.native
  object DefaultTabBar extends js.Object {
    
    var defaultProps: PropsType = js.native
  }
  
  @js.native
  class Tabs protected ()
    extends typingsSlinky.rmcTabs.tabsMod.Tabs {
    def this(props: typingsSlinky.rmcTabs.tabsMod.PropsType) = this()
  }
  /* static members */
  @js.native
  object Tabs extends js.Object {
    
    var DefaultTabBar: TypeofDefaultTabBar = js.native
    
    var defaultProps: typingsSlinky.rmcTabs.tabsMod.PropsType = js.native
  }
}
