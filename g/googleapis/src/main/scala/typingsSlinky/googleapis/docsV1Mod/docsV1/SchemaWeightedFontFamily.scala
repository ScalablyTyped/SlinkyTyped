package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a font family and weight of text.
  */
@js.native
trait SchemaWeightedFontFamily extends js.Object {
  /**
    * The font family of the text.  The font family can be any font from the
    * Font menu in Docs or from [Google Fonts] (https://fonts.google.com/). If
    * the font name is unrecognized, the text is rendered in `Arial`.
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * The weight of the font. This field can have any value that is a multiple
    * of `100` between `100` and `900`, inclusive. This range corresponds to
    * the numerical values described in the CSS 2.1 Specification,
    * [section 15.6](https://www.w3.org/TR/CSS21/fonts.html#font-boldness),
    * with non-numerical values disallowed.  The default value is `400`
    * (&quot;normal&quot;).  The font weight makes up just one component of the
    * rendered font weight. The rendered weight is determined by a combination
    * of the `weight` and the text style&#39;s resolved `bold` value, after
    * accounting for inheritance:  * If the text is bold and the weight is less
    * than `400`, the rendered   weight is 400. * If the text is bold and the
    * weight is greater than or equal to `400` but   is less than `700`, the
    * rendered weight is `700`. * If the weight is greater than or equal to
    * `700`, the rendered weight is   equal to the weight. * If the text is not
    * bold, the rendered weight is equal to the weight.
    */
  var weight: js.UndefOr[Double] = js.native
}

object SchemaWeightedFontFamily {
  @scala.inline
  def apply(): SchemaWeightedFontFamily = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWeightedFontFamily]
  }
  @scala.inline
  implicit class SchemaWeightedFontFamilyOps[Self <: SchemaWeightedFontFamily] (val x: Self) extends AnyVal {
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

