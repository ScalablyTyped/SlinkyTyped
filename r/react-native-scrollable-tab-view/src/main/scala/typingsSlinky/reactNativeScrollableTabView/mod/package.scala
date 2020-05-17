package typingsSlinky.reactNativeScrollableTabView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RenderTabProperties = js.Function5[
    /* name */ java.lang.String, 
    /* pageIndex */ scala.Double, 
    /* isTabActive */ scala.Boolean, 
    /* onPressHandler */ js.Function1[/* pageNumber */ scala.Double, scala.Unit], 
    /* onLayoutHandler */ js.UndefOr[
      js.Function1[/* event */ typingsSlinky.reactNative.mod.LayoutChangeEvent, scala.Unit]
    ], 
    slinky.core.facade.ReactElement
  ]
  type TabBarProps[T] = T with typingsSlinky.reactNativeScrollableTabView.anon.ActiveTab
  type TabProps[T] = T with typingsSlinky.reactNativeScrollableTabView.anon.TabLabel
}
