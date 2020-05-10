package typingsSlinky.bdfjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Glyph extends js.Object {
  var bitmap: js.Array[js.Array[Double]] = js.native
  var boundingBox: BoundingBox = js.native
  var bytes: js.Array[Double] = js.native
  var char: String = js.native
  var code: Double = js.native
  var deviceWidthX: Double = js.native
  var deviceWidthY: Double = js.native
  var name: String = js.native
  var scalableWidthX: Double = js.native
  var scalableWidthY: Double = js.native
}

object Glyph {
  @scala.inline
  def apply(
    bitmap: js.Array[js.Array[Double]],
    boundingBox: BoundingBox,
    bytes: js.Array[Double],
    char: String,
    code: Double,
    deviceWidthX: Double,
    deviceWidthY: Double,
    name: String,
    scalableWidthX: Double,
    scalableWidthY: Double
  ): Glyph = {
    val __obj = js.Dynamic.literal(bitmap = bitmap.asInstanceOf[js.Any], boundingBox = boundingBox.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], char = char.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], deviceWidthX = deviceWidthX.asInstanceOf[js.Any], deviceWidthY = deviceWidthY.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scalableWidthX = scalableWidthX.asInstanceOf[js.Any], scalableWidthY = scalableWidthY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Glyph]
  }
  @scala.inline
  implicit class GlyphOps[Self <: Glyph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitmap(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoundingBox(value: BoundingBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBytes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("char")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceWidthX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceWidthX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceWidthY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceWidthY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScalableWidthX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalableWidthX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScalableWidthY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalableWidthY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

