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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/tabs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Tab: ForwardRefExoticComponent[TabProps with RefAttributes[HTMLButtonElement]] = js.native
  
  val TabPanel: ForwardRefExoticComponent[TabPanelProps with RefAttributes[HTMLDivElement]] = js.native
  
  val TabPanels: ForwardRefExoticComponent[TabPanelsProps with RefAttributes[HTMLDivElement]] = js.native
  
  val Tabs: ForwardRefExoticComponent[PickTabsListPropshiddenco] = js.native
  
  val TabsList: ForwardRefExoticComponent[TabsListProps with RefAttributes[HTMLDivElement]] = js.native
  
  def TabsManager(
    hasTabsIdDefaultActiveIndexActiveIndexOnActiveIndexChangeTabsStackedIconAfterChildren: TabsManagerProps
  ): ReactElement = js.native
  
  def useTabs(): InitializedTabsManagerContext = js.native
}
