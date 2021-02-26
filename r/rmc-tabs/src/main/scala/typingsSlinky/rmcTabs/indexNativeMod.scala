package typingsSlinky.rmcTabs

import typingsSlinky.rmcTabs.anon.TypeofDefaultTabBar
import typingsSlinky.rmcTabs.defaultTabBarNativeMod.PropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexNativeMod {
  
  @JSImport("rmc-tabs/lib/index.native", "DefaultTabBar")
  @js.native
  class DefaultTabBar protected ()
    extends typingsSlinky.rmcTabs.defaultTabBarNativeMod.DefaultTabBar {
    def this(props: PropsType) = this()
  }
  /* static members */
  object DefaultTabBar {
    
    @JSImport("rmc-tabs/lib/index.native", "DefaultTabBar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs/lib/index.native", "DefaultTabBar.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    @scala.inline
    def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rmc-tabs/lib/index.native", "Tabs")
  @js.native
  class Tabs protected ()
    extends typingsSlinky.rmcTabs.tabsNativeMod.Tabs {
    def this(props: typingsSlinky.rmcTabs.tabsNativeMod.PropsType) = this()
  }
  /* static members */
  object Tabs {
    
    @JSImport("rmc-tabs/lib/index.native", "Tabs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs/lib/index.native", "Tabs.DefaultTabBar")
    @js.native
    def DefaultTabBar: TypeofDefaultTabBar = js.native
    @scala.inline
    def DefaultTabBar_=(x: TypeofDefaultTabBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTabBar")(x.asInstanceOf[js.Any])
    
    @JSImport("rmc-tabs/lib/index.native", "Tabs.defaultProps")
    @js.native
    def defaultProps: typingsSlinky.rmcTabs.tabsNativeMod.PropsType = js.native
    @scala.inline
    def defaultProps_=(x: typingsSlinky.rmcTabs.tabsNativeMod.PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
