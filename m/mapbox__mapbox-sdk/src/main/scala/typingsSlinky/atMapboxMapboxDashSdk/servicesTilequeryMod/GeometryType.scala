package typingsSlinky.atMapboxMapboxDashSdk.servicesTilequeryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atMapboxMapboxDashSdk.atMapboxMapboxDashSdkStrings.polygon
  - typings.atMapboxMapboxDashSdk.atMapboxMapboxDashSdkStrings.linestring
  - typings.atMapboxMapboxDashSdk.atMapboxMapboxDashSdkStrings.point
*/
trait GeometryType extends js.Object

object GeometryType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def linestring: typingsSlinky.atMapboxMapboxDashSdk.atMapboxMapboxDashSdkStrings.linestring = this.cast("linestring")
  @scala.inline
  def point: typingsSlinky.atMapboxMapboxDashSdk.atMapboxMapboxDashSdkStrings.point = this.cast("point")
  @scala.inline
  def polygon: typingsSlinky.atMapboxMapboxDashSdk.atMapboxMapboxDashSdkStrings.polygon = this.cast("polygon")
}

