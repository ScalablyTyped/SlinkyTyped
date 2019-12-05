package typingsSlinky.reactDashNativeDashScrollableDashTabDashView.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashScrollableDashTabDashView.reactDashNativeDashScrollableDashTabDashViewMod.DefaultTabBarProps
import typingsSlinky.reactDashNativeDashScrollableDashTabDashView.reactDashNativeDashScrollableDashTabDashViewMod.TabBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashNativeDashScrollableDashTabDashView), Name(reactDashNativeDashScrollableDashTabDashViewMod), Name(TabBarProps))) was not a @ScalaJSDefined trait */
object DefaultTabBar
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashScrollableDashTabDashView.reactDashNativeDashScrollableDashTabDashViewMod.DefaultTabBar
    ] {
  @JSImport("react-native-scrollable-tab-view", "DefaultTabBar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = TabBarProps[DefaultTabBarProps]
}

