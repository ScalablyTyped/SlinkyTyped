package typingsSlinky.reactNativeCalendarPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DateChangedCallback = js.Function1[/* date */ typingsSlinky.moment.mod.Moment, scala.Unit]
  type DisabledDatesFunc = js.Function1[/* date */ typingsSlinky.moment.mod.Moment, scala.Boolean]
  type MomentParsable = typingsSlinky.moment.mod.MomentInput
  type SwipeCallback = js.Function1[
    /* swipeDirection */ typingsSlinky.reactNativeCalendarPicker.mod.SwipeDirection, 
    scala.Unit
  ]
}
