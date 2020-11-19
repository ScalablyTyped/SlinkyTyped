package typingsSlinky.rmcTabs.defaultTabBarMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.rmcTabs.anon.OnPanEnd
import typingsSlinky.rmcTabs.anon.ShowNext
import typingsSlinky.rmcTabs.modelsMod.Models.TabData
import typingsSlinky.rmcTabs.rmcTabsStrings.bottom
import typingsSlinky.rmcTabs.rmcTabsStrings.left
import typingsSlinky.rmcTabs.rmcTabsStrings.right
import typingsSlinky.rmcTabs.rmcTabsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rmc-tabs/lib/DefaultTabBar", "DefaultTabBar")
@js.native
class DefaultTabBar protected ()
  extends Component[PropsType, StateType, js.Any] {
  def this(props: PropsType) = this()
  
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MDefaultTabBar(nextProps: PropsType): Unit = js.native
  
  def getTabSize(page: Double, tabLength: Double): Double = js.native
  
  def getTransformByIndex(props: PropsType): ShowNext = js.native
  
  def isTabBarVertical(): Boolean = js.native
  @JSName("isTabBarVertical")
  def isTabBarVertical_bottom(position: bottom): Boolean = js.native
  @JSName("isTabBarVertical")
  def isTabBarVertical_left(position: left): Boolean = js.native
  @JSName("isTabBarVertical")
  def isTabBarVertical_right(position: right): Boolean = js.native
  @JSName("isTabBarVertical")
  def isTabBarVertical_top(position: top): Boolean = js.native
  
  var layout: HTMLDivElement = js.native
  
  var onPan: OnPanEnd = js.native
  
  def onPress(index: Double): Unit = js.native
  
  def renderTab(t: TabData, i: Double, size: Double, isTabBarVertical: Boolean): ReactElement = js.native
  
  def setContentLayout(div: HTMLDivElement): Unit = js.native
}
/* static members */
@JSImport("rmc-tabs/lib/DefaultTabBar", "DefaultTabBar")
@js.native
object DefaultTabBar extends js.Object {
  
  var defaultProps: PropsType = js.native
}
