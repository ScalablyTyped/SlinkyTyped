package typingsSlinky.reactDashFlatpickr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashFlatpickrMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type DatePicker = ReactComponentClass[DateTimePickerProps]
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
