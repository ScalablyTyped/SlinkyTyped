package typingsSlinky.d3pie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  decimalPlaces ? :number} & d3pie.d3pie.ID3PieStyleOptions */
@js.native
trait decimalPlacesnumberID3Pie extends js.Object {
  var color: js.UndefOr[String] = js.native
  var decimalPlaces: js.UndefOr[Double] = js.native
  var font: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
}

object decimalPlacesnumberID3Pie {
  @scala.inline
  def apply(): decimalPlacesnumberID3Pie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[decimalPlacesnumberID3Pie]
  }
  @scala.inline
  implicit class decimalPlacesnumberID3PieOps[Self <: decimalPlacesnumberID3Pie] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimalPlaces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalPlaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalPlaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalPlaces")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
  }
  
}

