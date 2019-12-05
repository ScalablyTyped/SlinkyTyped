package typingsSlinky.reactDashMeasure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMeasureMod {
  import slinky.core.ReactComponentClass

  type BoundingRect = Dimensions with Margin
  type Margin = TopLeft with BottomRight
  type Measure = ReactComponentClass[MeasureProps]
  type MeasuredComponent[T] = ReactComponentClass[T with MeasuredComponentProps]
  type Rect = TopLeft with Dimensions
}
