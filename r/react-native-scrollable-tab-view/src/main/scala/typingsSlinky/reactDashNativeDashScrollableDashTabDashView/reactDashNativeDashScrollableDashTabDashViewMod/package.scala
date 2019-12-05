package typingsSlinky.reactDashNativeDashScrollableDashTabDashView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashScrollableDashTabDashViewMod {
  import typingsSlinky.react.reactMod._Global_.JSX.Element
  import typingsSlinky.reactDashNative.reactDashNativeMod.LayoutChangeEvent
  import typingsSlinky.reactDashNativeDashScrollableDashTabDashView.Anon_ActiveTab
  import typingsSlinky.reactDashNativeDashScrollableDashTabDashView.Anon_TabLabel

  type RenderTabProperties = js.Function5[
    /* name */ String, 
    /* pageIndex */ Double, 
    /* isTabActive */ Boolean, 
    /* onPressHandler */ js.Function1[/* pageNumber */ Double, Unit], 
    /* onLayoutHandler */ js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]], 
    Element
  ]
  type TabBarProps[T] = T with Anon_ActiveTab
  type TabProps[T] = T with Anon_TabLabel
}
