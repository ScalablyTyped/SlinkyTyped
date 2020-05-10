package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeightedFontFamily extends js.Object {
  /**
    * The font family of the text.
    *
    * The font family can be any font from the Font menu in Slides or from
    * [Google Fonts] (https://fonts.google.com/). If the font name is
    * unrecognized, the text is rendered in `Arial`.
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * The rendered weight of the text. This field can have any value that is a
    * multiple of `100` between `100` and `900`, inclusive. This range
    * corresponds to the numerical values described in the CSS 2.1
    * Specification, [section 15.6](https://www.w3.org/TR/CSS21/fonts.html#font-boldness),
    * with non-numerical values disallowed. Weights greater than or equal to
    * `700` are considered bold, and weights less than `700`are not bold. The
    * default value is `400` ("normal").
    */
  var weight: js.UndefOr[Double] = js.native
}

object WeightedFontFamily {
  @scala.inline
  def apply(): WeightedFontFamily = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeightedFontFamily]
  }
  @scala.inline
  implicit class WeightedFontFamilyOps[Self <: WeightedFontFamily] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}

