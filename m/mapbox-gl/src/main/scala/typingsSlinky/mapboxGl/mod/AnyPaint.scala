package typingsSlinky.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mapboxGl.mod.BackgroundPaint
  - typingsSlinky.mapboxGl.mod.FillPaint
  - typingsSlinky.mapboxGl.mod.FillExtrusionPaint
  - typingsSlinky.mapboxGl.mod.LinePaint
  - typingsSlinky.mapboxGl.mod.SymbolPaint
  - typingsSlinky.mapboxGl.mod.RasterPaint
  - typingsSlinky.mapboxGl.mod.CirclePaint
  - typingsSlinky.mapboxGl.mod.HeatmapPaint
  - typingsSlinky.mapboxGl.mod.HillshadePaint
*/
trait AnyPaint extends js.Object

object AnyPaint {
  @scala.inline
  implicit def apply(value: BackgroundPaint): AnyPaint = value.asInstanceOf[AnyPaint]
  @scala.inline
  implicit def apply(value: CirclePaint): AnyPaint = value.asInstanceOf[AnyPaint]
  @scala.inline
  implicit def apply(value: FillExtrusionPaint): AnyPaint = value.asInstanceOf[AnyPaint]
  @scala.inline
  implicit def apply(value: FillPaint): AnyPaint = value.asInstanceOf[AnyPaint]
  @scala.inline
  implicit def apply(value: HeatmapPaint): AnyPaint = value.asInstanceOf[AnyPaint]
  @scala.inline
  implicit def apply(value: HillshadePaint): AnyPaint = value.asInstanceOf[AnyPaint]
  @scala.inline
  implicit def apply(value: LinePaint): AnyPaint = value.asInstanceOf[AnyPaint]
  @scala.inline
  implicit def apply(value: RasterPaint): AnyPaint = value.asInstanceOf[AnyPaint]
  @scala.inline
  implicit def apply(value: SymbolPaint): AnyPaint = value.asInstanceOf[AnyPaint]
}

