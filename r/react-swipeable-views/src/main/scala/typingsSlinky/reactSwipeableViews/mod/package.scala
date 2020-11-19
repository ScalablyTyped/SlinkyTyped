package typingsSlinky.reactSwipeableViews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type OnChangeIndexCallback = js.Function2[/* index */ scala.Double, /* indexLatest */ scala.Double, scala.Unit]
  
  type OnSwitchingCallback = js.Function2[
    /* index */ scala.Double, 
    /* type */ typingsSlinky.reactSwipeableViews.mod.OnSwitchingCallbackTypeDescriptor, 
    scala.Unit
  ]
  
  type OnTransitionEndCallback = js.Function0[scala.Unit]
  
  type SwipeableViews = slinky.core.ReactComponentClass[typingsSlinky.reactSwipeableViews.mod.SwipeableViewsProps]
}
