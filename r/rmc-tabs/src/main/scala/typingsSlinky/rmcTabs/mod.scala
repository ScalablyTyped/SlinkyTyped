package typingsSlinky.rmcTabs

import typingsSlinky.rmcTabs.anon.TypeofDefaultTabBar
import typingsSlinky.rmcTabs.defaultTabBarMod.PropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rmc-tabs", "DefaultTabBar")
  @js.native
  class DefaultTabBar protected ()
    extends typingsSlinky.rmcTabs.defaultTabBarMod.DefaultTabBar {
    def this(props: PropsType) = this()
  }
  /* static members */
  object DefaultTabBar {
    
    @JSImport("rmc-tabs", "DefaultTabBar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs", "DefaultTabBar.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    @scala.inline
    def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rmc-tabs", "Tabs")
  @js.native
  class Tabs protected ()
    extends typingsSlinky.rmcTabs.tabsMod.Tabs {
    def this(props: typingsSlinky.rmcTabs.tabsMod.PropsType) = this()
  }
  /* static members */
  object Tabs {
    
    @JSImport("rmc-tabs", "Tabs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs", "Tabs.DefaultTabBar")
    @js.native
    def DefaultTabBar: TypeofDefaultTabBar = js.native
    @scala.inline
    def DefaultTabBar_=(x: TypeofDefaultTabBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTabBar")(x.asInstanceOf[js.Any])
    
    @JSImport("rmc-tabs", "Tabs.defaultProps")
    @js.native
    def defaultProps: typingsSlinky.rmcTabs.tabsMod.PropsType = js.native
    @scala.inline
    def defaultProps_=(x: typingsSlinky.rmcTabs.tabsMod.PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
