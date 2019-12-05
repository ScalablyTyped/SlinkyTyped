package typingsSlinky.reactDashSwipeableDashViews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSwipeableDashViewsMod {
  import slinky.core.ReactComponentClass

  type OnChangeIndexCallback = js.Function2[/* index */ Double, /* indexLatest */ Double, Unit]
  type OnSwitchingCallback = js.Function2[/* index */ Double, /* type */ OnSwitchingCallbackTypeDescriptor, Unit]
  type OnTransitionEndCallback = js.Function0[Unit]
  type SwipeableViews = ReactComponentClass[SwipeableViewsProps]
}
