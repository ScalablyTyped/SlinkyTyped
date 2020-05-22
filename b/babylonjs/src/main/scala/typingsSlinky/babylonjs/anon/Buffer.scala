package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.Color3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer extends js.Object {
  var alphaFilter: Double
  var buffer: js.typedarray.Uint8Array
  var bufferHeight: Double
  var bufferWidth: Double
  var colorFilter: Color3
  var height: Double
  var maxHeight: Double
  var minHeight: Double
  var subdivisions: Double
  var width: Double
}

object Buffer {
  @scala.inline
  def apply(
    alphaFilter: Double,
    buffer: js.typedarray.Uint8Array,
    bufferHeight: Double,
    bufferWidth: Double,
    colorFilter: Color3,
    height: Double,
    maxHeight: Double,
    minHeight: Double,
    subdivisions: Double,
    width: Double
  ): Buffer = {
    val __obj = js.Dynamic.literal(alphaFilter = alphaFilter.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], bufferHeight = bufferHeight.asInstanceOf[js.Any], bufferWidth = bufferWidth.asInstanceOf[js.Any], colorFilter = colorFilter.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], subdivisions = subdivisions.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
}

