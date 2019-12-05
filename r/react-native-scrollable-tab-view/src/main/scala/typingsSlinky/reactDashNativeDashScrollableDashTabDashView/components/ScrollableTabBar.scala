package typingsSlinky.reactDashNativeDashScrollableDashTabDashView.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashScrollableDashTabDashView.reactDashNativeDashScrollableDashTabDashViewMod.ScrollableTabBarProps
import typingsSlinky.reactDashNativeDashScrollableDashTabDashView.reactDashNativeDashScrollableDashTabDashViewMod.TabBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashNativeDashScrollableDashTabDashView), Name(reactDashNativeDashScrollableDashTabDashViewMod), Name(TabBarProps))) was not a @ScalaJSDefined trait */
object ScrollableTabBar
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashScrollableDashTabDashView.reactDashNativeDashScrollableDashTabDashViewMod.ScrollableTabBar
    ] {
  @JSImport("react-native-scrollable-tab-view", "ScrollableTabBar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = TabBarProps[ScrollableTabBarProps]
}

