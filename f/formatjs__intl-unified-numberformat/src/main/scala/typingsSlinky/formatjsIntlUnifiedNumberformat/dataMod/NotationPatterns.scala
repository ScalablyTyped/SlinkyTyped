package typingsSlinky.formatjsIntlUnifiedNumberformat.dataMod

import typingsSlinky.formatjsIntlUnifiedNumberformat.RecordDecimalFormatNumSig
import typingsSlinky.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.compactLong
import typingsSlinky.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.compactShort
import typingsSlinky.formatjsIntlUtils.numberTypesMod.CompactSignPattern
import typingsSlinky.formatjsIntlUtils.numberTypesMod.DecimalFormatNum
import typingsSlinky.formatjsIntlUtils.numberTypesMod.SignPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotationPatterns extends CompactSignPattern {
  var decimalNum: js.UndefOr[DecimalFormatNum] = js.native
  var notation: js.UndefOr[compactShort | compactLong] = js.native
  @JSName("100000000000000")
  def `100000000000000_MNotationPatterns`: SignPattern = js.native
  @JSName("10000000000000")
  def `10000000000000_MNotationPatterns`: SignPattern = js.native
  @JSName("1000000000000")
  def `1000000000000_MNotationPatterns`: SignPattern = js.native
  @JSName("100000000000")
  def `100000000000_MNotationPatterns`: SignPattern = js.native
  @JSName("10000000000")
  def `10000000000_MNotationPatterns`: SignPattern = js.native
  @JSName("1000000000")
  def `1000000000_MNotationPatterns`: SignPattern = js.native
  @JSName("100000000")
  def `100000000_MNotationPatterns`: SignPattern = js.native
  @JSName("10000000")
  def `10000000_MNotationPatterns`: SignPattern = js.native
  @JSName("1000000")
  def `1000000_MNotationPatterns`: SignPattern = js.native
  @JSName("100000")
  def `100000_MNotationPatterns`: SignPattern = js.native
  @JSName("10000")
  def `10000_MNotationPatterns`: SignPattern = js.native
  @JSName("1000")
  def `1000_MNotationPatterns`: SignPattern = js.native
  def compactLong: RecordDecimalFormatNumSig = js.native
  def compactShort: RecordDecimalFormatNumSig = js.native
  def produceCompactSignPattern(decimalNum: DecimalFormatNum): SignPattern = js.native
}

object NotationPatterns {
  @scala.inline
  def apply(
    `1000`: () => SignPattern,
    `10000`: () => SignPattern,
    `100000`: () => SignPattern,
    `1000000`: () => SignPattern,
    `10000000`: () => SignPattern,
    `100000000`: () => SignPattern,
    `1000000000`: () => SignPattern,
    `10000000000`: () => SignPattern,
    `100000000000`: () => SignPattern,
    `1000000000000`: () => SignPattern,
    `10000000000000`: () => SignPattern,
    `100000000000000`: () => SignPattern,
    compactLong: () => RecordDecimalFormatNumSig,
    compactShort: () => RecordDecimalFormatNumSig,
    produceCompactSignPattern: DecimalFormatNum => SignPattern
  ): NotationPatterns = {
    val __obj = js.Dynamic.literal(compactLong = js.Any.fromFunction0(compactLong), compactShort = js.Any.fromFunction0(compactShort), produceCompactSignPattern = js.Any.fromFunction1(produceCompactSignPattern))
    __obj.updateDynamic("1000")(js.Any.fromFunction0(`1000`))
    __obj.updateDynamic("10000")(js.Any.fromFunction0(`10000`))
    __obj.updateDynamic("100000")(js.Any.fromFunction0(`100000`))
    __obj.updateDynamic("1000000")(js.Any.fromFunction0(`1000000`))
    __obj.updateDynamic("10000000")(js.Any.fromFunction0(`10000000`))
    __obj.updateDynamic("100000000")(js.Any.fromFunction0(`100000000`))
    __obj.updateDynamic("1000000000")(js.Any.fromFunction0(`1000000000`))
    __obj.updateDynamic("10000000000")(js.Any.fromFunction0(`10000000000`))
    __obj.updateDynamic("100000000000")(js.Any.fromFunction0(`100000000000`))
    __obj.updateDynamic("1000000000000")(js.Any.fromFunction0(`1000000000000`))
    __obj.updateDynamic("10000000000000")(js.Any.fromFunction0(`10000000000000`))
    __obj.updateDynamic("100000000000000")(js.Any.fromFunction0(`100000000000000`))
    __obj.asInstanceOf[NotationPatterns]
  }
  @scala.inline
  implicit class NotationPatternsOps[Self <: NotationPatterns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with1000(value: () => SignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1000")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with10000(value: () => SignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("10000")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with100000(value: () => SignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("100000")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with1000000(value: () => SignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1000000")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with10000000(value: () => SignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("10000000")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with100000000(value: () => SignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("100000000")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with1000000000(value: () => SignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1000000000")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with10000000000(value: () => SignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("10000000000")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with100000000000(value: () => SignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("100000000000")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with1000000000000(value: () => SignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1000000000000")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with10000000000000(value: () => SignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("10000000000000")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with100000000000000(value: () => SignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("100000000000000")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCompactLong(value: () => RecordDecimalFormatNumSig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactLong")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCompactShort(value: () => RecordDecimalFormatNumSig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactShort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProduceCompactSignPattern(value: DecimalFormatNum => SignPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("produceCompactSignPattern")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecimalNum(value: DecimalFormatNum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalNum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalNum")(js.undefined)
        ret
    }
    @scala.inline
    def withNotation(value: compactShort | compactLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notation")(js.undefined)
        ret
    }
  }
  
}

