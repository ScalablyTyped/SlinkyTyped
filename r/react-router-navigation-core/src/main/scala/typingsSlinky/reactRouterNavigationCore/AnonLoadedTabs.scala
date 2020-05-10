package typingsSlinky.reactRouterNavigationCore

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouterNavigationCore.mod.NavigationState
import typingsSlinky.reactRouterNavigationCore.mod.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLoadedTabs extends js.Object {
  var loadedTabs: js.Array[String] = js.native
  var navigationState: NavigationState[AnonTestID] = js.native
  var rootIndex: Double = js.native
  var tabs: js.Array[Tab] = js.native
  var tabsHistory: NumberDictionary[js.Array[Location[LocationState]]] = js.native
}

object AnonLoadedTabs {
  @scala.inline
  def apply(
    loadedTabs: js.Array[String],
    navigationState: NavigationState[AnonTestID],
    rootIndex: Double,
    tabs: js.Array[Tab],
    tabsHistory: NumberDictionary[js.Array[Location[LocationState]]]
  ): AnonLoadedTabs = {
    val __obj = js.Dynamic.literal(loadedTabs = loadedTabs.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], rootIndex = rootIndex.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], tabsHistory = tabsHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLoadedTabs]
  }
  @scala.inline
  implicit class AnonLoadedTabsOps[Self <: AnonLoadedTabs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadedTabs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadedTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigationState(value: NavigationState[AnonTestID]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabs(value: js.Array[Tab]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabsHistory(value: NumberDictionary[js.Array[Location[LocationState]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabsHistory")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

