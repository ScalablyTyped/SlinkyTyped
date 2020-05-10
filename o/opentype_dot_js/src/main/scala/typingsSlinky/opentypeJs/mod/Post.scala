package typingsSlinky.opentypeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Post extends js.Object {
  var glyphNameIndex: js.UndefOr[js.Array[Double]] = js.native
  var isFixedPitch: Double = js.native
  var italicAngle: Double = js.native
  var maxMemType1: Double = js.native
  var maxMemType42: Double = js.native
  var minMemType1: Double = js.native
  var minMemType42: Double = js.native
  var names: js.UndefOr[js.Array[String]] = js.native
  var numberOfGlyphs: js.UndefOr[Double] = js.native
  var offset: js.UndefOr[js.Array[Double]] = js.native
  var underlinePosition: Double = js.native
  var underlineThickness: Double = js.native
  var version: Double = js.native
}

object Post {
  @scala.inline
  def apply(
    isFixedPitch: Double,
    italicAngle: Double,
    maxMemType1: Double,
    maxMemType42: Double,
    minMemType1: Double,
    minMemType42: Double,
    underlinePosition: Double,
    underlineThickness: Double,
    version: Double
  ): Post = {
    val __obj = js.Dynamic.literal(isFixedPitch = isFixedPitch.asInstanceOf[js.Any], italicAngle = italicAngle.asInstanceOf[js.Any], maxMemType1 = maxMemType1.asInstanceOf[js.Any], maxMemType42 = maxMemType42.asInstanceOf[js.Any], minMemType1 = minMemType1.asInstanceOf[js.Any], minMemType42 = minMemType42.asInstanceOf[js.Any], underlinePosition = underlinePosition.asInstanceOf[js.Any], underlineThickness = underlineThickness.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Post]
  }
  @scala.inline
  implicit class PostOps[Self <: Post] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsFixedPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFixedPitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItalicAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("italicAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxMemType1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMemType1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxMemType42(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMemType42")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinMemType1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMemType1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinMemType42(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMemType42")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnderlinePosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlinePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnderlineThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlyphNameIndex(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphNameIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyphNameIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphNameIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfGlyphs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfGlyphs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfGlyphs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfGlyphs")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
  }
  
}

