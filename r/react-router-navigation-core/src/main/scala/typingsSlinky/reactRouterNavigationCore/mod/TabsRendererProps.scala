package typingsSlinky.reactRouterNavigationCore.mod

import typingsSlinky.reactRouterNavigationCore.AnonTestID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsRendererProps extends js.Object {
  var loadedTabs: js.Array[String] = js.native
  var navigationState: NavigationState[AnonTestID] = js.native
  var tabs: js.Array[Tab] = js.native
  def onIndexChange(index: Double): Unit = js.native
}

object TabsRendererProps {
  @scala.inline
  def apply(
    loadedTabs: js.Array[String],
    navigationState: NavigationState[AnonTestID],
    onIndexChange: Double => Unit,
    tabs: js.Array[Tab]
  ): TabsRendererProps = {
    val __obj = js.Dynamic.literal(loadedTabs = loadedTabs.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsRendererProps]
  }
  @scala.inline
  implicit class TabsRendererPropsOps[Self <: TabsRendererProps] (val x: Self) extends AnyVal {
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
    def withOnIndexChange(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIndexChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTabs(value: js.Array[Tab]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

