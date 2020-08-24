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
import scala.scalajs.js.annotation._

@JSImport("@react-md/tabs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * The `Tab` is a low-level component that just renders an accessible tab widget
    * along with some general styles and an optional icon.
    */
  val Tab: ForwardRefExoticComponent[TabProps with RefAttributes[HTMLButtonElement]] = js.native
  /**
    * This component renders an accessible tab panel with enter and exit
    * animations.  This probably should only be used internally as it relies on the
    * `TabPanels` component along with the `TransitionGroup` from
    * `react-transition-group` to work as expected.
    */
  val TabPanel: ForwardRefExoticComponent[TabPanelProps with RefAttributes[HTMLDivElement]] = js.native
  /**
    * This component allows you to control the visibility of the `TabPanel`
    * components and animating the next and current panels as needed. This works by
    * looping over all the children and getting the current `TabPanel` by the
    * `activeIndex`. This is why the children for this component can only be
    * `TabPanel` and should not be conditional.
    */
  val TabPanels: ForwardRefExoticComponent[TabPanelsProps with RefAttributes[HTMLDivElement]] = js.native
  val Tabs: ForwardRefExoticComponent[PickTabsListPropshiddenco] = js.native
  /**
    * The `TabsList` component is the container for all the individual `Tab`s that
    * should be rendered. This handles adding an active indicator underneath the
    * active tab and animating it to the new location when a new tab becomes
    * active. It also handles the ability update which tab is selected when it has
    * been clicked or updated with keyboard movement.
    *
    * This should probably not be used outside of this package unless a custom
    * implementation is desired.
    */
  val TabsList: ForwardRefExoticComponent[TabsListProps with RefAttributes[HTMLDivElement]] = js.native
  def TabsManager(
    hasTabsIdDefaultActiveIndexActiveIndexOnActiveIndexChangeTabsStackedIconAfterChildren: TabsManagerProps
  ): ReactElement = js.native
  def useTabs(): InitializedTabsManagerContext = js.native
}

