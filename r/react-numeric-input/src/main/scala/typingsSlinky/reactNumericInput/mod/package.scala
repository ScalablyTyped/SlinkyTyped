package typingsSlinky.reactNumericInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BoundsFunctionProp = scala.Double | (js.Function1[
    slinky.core.ReactComponentClass[typingsSlinky.reactNumericInput.mod.NumericInputProps], 
    js.UndefOr[scala.Double]
  ])
  type NumericInput = slinky.core.ReactComponentClass[typingsSlinky.reactNumericInput.mod.NumericInputProps]
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
}
