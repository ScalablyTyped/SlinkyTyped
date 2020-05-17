package typingsSlinky.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mapboxGl.mod.BackgroundLayout
  - typingsSlinky.mapboxGl.mod.FillLayout
  - typingsSlinky.mapboxGl.mod.FillExtrusionLayout
  - typingsSlinky.mapboxGl.mod.LineLayout
  - typingsSlinky.mapboxGl.mod.SymbolLayout
  - typingsSlinky.mapboxGl.mod.RasterLayout
  - typingsSlinky.mapboxGl.mod.CircleLayout
  - typingsSlinky.mapboxGl.mod.HeatmapLayout
  - typingsSlinky.mapboxGl.mod.HillshadeLayout
*/
trait AnyLayout extends js.Object

object AnyLayout {
  @scala.inline
  implicit def apply(
    value: BackgroundLayout | CircleLayout | FillExtrusionLayout | HeatmapLayout | HillshadeLayout | RasterLayout
  ): AnyLayout = value.asInstanceOf[AnyLayout]
  @scala.inline
  implicit def apply(value: FillLayout): AnyLayout = value.asInstanceOf[AnyLayout]
  @scala.inline
  implicit def apply(value: LineLayout): AnyLayout = value.asInstanceOf[AnyLayout]
  @scala.inline
  implicit def apply(value: SymbolLayout): AnyLayout = value.asInstanceOf[AnyLayout]
}

