package typingsSlinky.reactNativeScrollableTabView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type RenderTabProperties = js.Function5[
    /* name */ java.lang.String, 
    /* pageIndex */ scala.Double, 
    /* isTabActive */ scala.Boolean, 
    /* onPressHandler */ js.Function1[/* pageNumber */ scala.Double, scala.Unit], 
    /* onLayoutHandler */ js.UndefOr[
      js.Function1[
        slinky.core.SyntheticEvent[typingsSlinky.reactNative.mod.NodeHandle, typingsSlinky.reactNative.anon.Layout], 
        scala.Unit
      ]
    ], 
    slinky.core.facade.ReactElement
  ]
  
  type TabBarProps[T] = T with typingsSlinky.reactNativeScrollableTabView.anon.ActiveTab
  
  type TabProps[T] = T with typingsSlinky.reactNativeScrollableTabView.anon.TabLabel
}
