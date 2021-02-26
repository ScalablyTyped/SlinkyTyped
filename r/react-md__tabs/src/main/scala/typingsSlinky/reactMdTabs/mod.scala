package typingsSlinky.reactMdTabs

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdTabs.anon.PickTabsListPropshiddenco
import typingsSlinky.reactMdTabs.tabMod.TabProps
import typingsSlinky.reactMdTabs.tabPanelMod.TabPanelProps
import typingsSlinky.reactMdTabs.tabPanelsMod.TabPanelsProps
import typingsSlinky.reactMdTabs.tabsListMod.TabsListProps
import typingsSlinky.reactMdTabs.tabsManagerMod.InitializedTabsManagerContext
import typingsSlinky.reactMdTabs.tabsManagerMod.TabsManagerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/tabs", "Tab")
  @js.native
  val Tab: ForwardRefExoticComponent[TabProps with RefAttributes[HTMLButtonElement]] = js.native
  
  @JSImport("@react-md/tabs", "TabPanel")
  @js.native
  val TabPanel: ForwardRefExoticComponent[TabPanelProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/tabs", "TabPanels")
  @js.native
  val TabPanels: ForwardRefExoticComponent[TabPanelsProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/tabs", "Tabs")
  @js.native
  val Tabs: ForwardRefExoticComponent[PickTabsListPropshiddenco] = js.native
  
  @JSImport("@react-md/tabs", "TabsList")
  @js.native
  val TabsList: ForwardRefExoticComponent[TabsListProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/tabs", "TabsManager")
  @js.native
  def TabsManager(
    hasTabsIdDefaultActiveIndexActiveIndexOnActiveIndexChangeTabsStackedIconAfterChildren: TabsManagerProps
  ): ReactElement = js.native
  
  @JSImport("@react-md/tabs", "useTabs")
  @js.native
  def useTabs(): InitializedTabsManagerContext = js.native
}
