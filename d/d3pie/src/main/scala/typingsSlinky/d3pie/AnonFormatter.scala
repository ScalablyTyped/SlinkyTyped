package typingsSlinky.d3pie

import typingsSlinky.d3pie.d3pie.ID3PieLabelsOptions
import typingsSlinky.d3pie.d3pie.ID3PieStyleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFormatter extends js.Object {
  var formatter: js.UndefOr[js.Function1[/* context */ AnonSection, String]] = js.native
  var inner: js.UndefOr[ID3PieLabelsOptions] = js.native
  var lines: js.UndefOr[AnonEnabled] = js.native
  var mainLabel: js.UndefOr[ID3PieStyleOptions] = js.native
  var outer: js.UndefOr[pieDistancenumberID3PieLa] = js.native
  var percentage: js.UndefOr[decimalPlacesnumberID3Pie] = js.native
  var truncation: js.UndefOr[AnonTruncateLength] = js.native
  var value: js.UndefOr[ID3PieStyleOptions] = js.native
}

object AnonFormatter {
  @scala.inline
  def apply(): AnonFormatter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFormatter]
  }
  @scala.inline
  implicit class AnonFormatterOps[Self <: AnonFormatter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatter(value: /* context */ AnonSection => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withInner(value: ID3PieLabelsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inner")(js.undefined)
        ret
    }
    @scala.inline
    def withLines(value: AnonEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(js.undefined)
        ret
    }
    @scala.inline
    def withMainLabel(value: ID3PieStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withOuter(value: pieDistancenumberID3PieLa): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outer")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentage(value: decimalPlacesnumberID3Pie): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentage")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncation(value: AnonTruncateLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncation")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: ID3PieStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

