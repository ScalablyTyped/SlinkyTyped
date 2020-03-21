package typingsSlinky.reactMeasure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BoundingRect = typingsSlinky.reactMeasure.mod.Dimensions with typingsSlinky.reactMeasure.mod.Margin
  type Margin = typingsSlinky.reactMeasure.mod.TopLeft with typingsSlinky.reactMeasure.mod.BottomRight
  type Measure = slinky.core.ReactComponentClass[typingsSlinky.reactMeasure.mod.MeasureProps]
  type MeasuredComponent[T] = slinky.core.ReactComponentClass[T with typingsSlinky.reactMeasure.mod.MeasuredComponentProps]
  type Rect = typingsSlinky.reactMeasure.mod.TopLeft with typingsSlinky.reactMeasure.mod.Dimensions
}
