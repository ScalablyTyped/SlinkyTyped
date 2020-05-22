package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranscodedPixels extends js.Object {
  var height: Double
  var transcodedPixels: js.typedarray.ArrayBufferView
  var width: Double
}

object TranscodedPixels {
  @scala.inline
  def apply(height: Double, transcodedPixels: js.typedarray.ArrayBufferView, width: Double): TranscodedPixels = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], transcodedPixels = transcodedPixels.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranscodedPixels]
  }
}

