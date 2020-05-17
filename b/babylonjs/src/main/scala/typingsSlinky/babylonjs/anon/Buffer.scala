package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.Color3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Buffer extends js.Object {
  var alphaFilter: Double = js.native
  var buffer: js.typedarray.Uint8Array = js.native
  var bufferHeight: Double = js.native
  var bufferWidth: Double = js.native
  var colorFilter: Color3 = js.native
  var height: Double = js.native
  var maxHeight: Double = js.native
  var minHeight: Double = js.native
  var subdivisions: Double = js.native
  var width: Double = js.native
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
  @scala.inline
  implicit class BufferOps[Self <: Buffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlphaFilter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuffer(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorFilter(value: Color3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubdivisions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdivisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

