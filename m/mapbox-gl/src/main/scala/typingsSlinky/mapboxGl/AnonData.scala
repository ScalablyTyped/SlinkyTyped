package typingsSlinky.mapboxGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint8ClampedArray
  var height: Double
  var width: Double
}

object AnonData {
  @scala.inline
  def apply(
    data: scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint8ClampedArray,
    height: Double,
    width: Double
  ): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonData]
  }
}

