package typingsSlinky.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mapboxGl.mod.GeoJSONSource
  - typingsSlinky.mapboxGl.mod.VideoSource
  - typingsSlinky.mapboxGl.mod.ImageSource
  - typingsSlinky.mapboxGl.mod.CanvasSource
  - typingsSlinky.mapboxGl.mod.VectorSource
  - typingsSlinky.mapboxGl.mod.RasterSource
  - typingsSlinky.mapboxGl.mod.RasterDemSource
*/
trait AnySourceImpl extends js.Object

object AnySourceImpl {
  @scala.inline
  implicit def apply(value: CanvasSource): AnySourceImpl = value.asInstanceOf[AnySourceImpl]
  @scala.inline
  implicit def apply(value: GeoJSONSource): AnySourceImpl = value.asInstanceOf[AnySourceImpl]
  @scala.inline
  implicit def apply(value: ImageSource): AnySourceImpl = value.asInstanceOf[AnySourceImpl]
  @scala.inline
  implicit def apply(value: RasterDemSource): AnySourceImpl = value.asInstanceOf[AnySourceImpl]
  @scala.inline
  implicit def apply(value: RasterSource): AnySourceImpl = value.asInstanceOf[AnySourceImpl]
  @scala.inline
  implicit def apply(value: VectorSource): AnySourceImpl = value.asInstanceOf[AnySourceImpl]
  @scala.inline
  implicit def apply(value: VideoSource): AnySourceImpl = value.asInstanceOf[AnySourceImpl]
}

