package typingsSlinky.reactDashNumericDashInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNumericDashInputMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type BoundsFunctionProp = Double | (js.Function1[ReactComponentClass[NumericInputProps], js.UndefOr[Double]])
  type NumericInput = ReactComponentClass[NumericInputProps]
  type Omit[T, K] = Pick[T, Exclude[String, K]]
}
