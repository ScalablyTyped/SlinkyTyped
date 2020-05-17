package typingsSlinky.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mapboxGl.mod.GeoJSONSourceRaw
  - typingsSlinky.mapboxGl.mod.VideoSourceRaw
  - typingsSlinky.mapboxGl.mod.ImageSourceRaw
  - typingsSlinky.mapboxGl.mod.CanvasSourceRaw
  - typingsSlinky.mapboxGl.mod.VectorSource
  - typingsSlinky.mapboxGl.mod.RasterSource
  - typingsSlinky.mapboxGl.mod.RasterDemSource
*/
trait AnySourceData extends js.Object

object AnySourceData {
  @scala.inline
  implicit def apply(value: CanvasSourceRaw): AnySourceData = value.asInstanceOf[AnySourceData]
  @scala.inline
  implicit def apply(value: GeoJSONSourceRaw): AnySourceData = value.asInstanceOf[AnySourceData]
  @scala.inline
  implicit def apply(value: ImageSourceRaw): AnySourceData = value.asInstanceOf[AnySourceData]
  @scala.inline
  implicit def apply(value: RasterDemSource): AnySourceData = value.asInstanceOf[AnySourceData]
  @scala.inline
  implicit def apply(value: RasterSource): AnySourceData = value.asInstanceOf[AnySourceData]
  @scala.inline
  implicit def apply(value: VectorSource): AnySourceData = value.asInstanceOf[AnySourceData]
  @scala.inline
  implicit def apply(value: VideoSourceRaw): AnySourceData = value.asInstanceOf[AnySourceData]
}

