package typingsSlinky.jimpPluginPrint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontInfo extends js.Object {
  var aa: Double = js.native
  var bold: Double = js.native
  var charset: String = js.native
  var face: String = js.native
  var italic: Double = js.native
  var padding: js.Tuple4[Double, Double, Double, Double] = js.native
  var size: Double = js.native
  var smooth: Double = js.native
  var spacing: js.Tuple2[Double, Double] = js.native
  var stretchH: Double = js.native
  var unicode: Double = js.native
}

object FontInfo {
  @scala.inline
  def apply(
    aa: Double,
    bold: Double,
    charset: String,
    face: String,
    italic: Double,
    padding: js.Tuple4[Double, Double, Double, Double],
    size: Double,
    smooth: Double,
    spacing: js.Tuple2[Double, Double],
    stretchH: Double,
    unicode: Double
  ): FontInfo = {
    val __obj = js.Dynamic.literal(aa = aa.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], charset = charset.asInstanceOf[js.Any], face = face.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], smooth = smooth.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], stretchH = stretchH.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontInfo]
  }
  @scala.inline
  implicit class FontInfoOps[Self <: FontInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAa(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aa")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("face")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItalic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("italic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPadding(value: js.Tuple4[Double, Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmooth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smooth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpacing(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStretchH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnicode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

