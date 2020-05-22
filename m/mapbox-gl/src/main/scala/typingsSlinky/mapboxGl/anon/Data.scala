package typingsSlinky.mapboxGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray
  var height: Double
  var width: Double
}

object Data {
  @scala.inline
  def apply(data: js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray, height: Double, width: Double): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

