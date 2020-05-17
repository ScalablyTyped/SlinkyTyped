package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpellingOptions extends js.Object {
  var ArabicModes: XlArabicModes = js.native
  var ArabicStrictAlefHamza: Boolean = js.native
  var ArabicStrictFinalYaa: Boolean = js.native
  var ArabicStrictTaaMarboota: Boolean = js.native
  var BrazilReform: XlPortugueseReform = js.native
  var DictLang: Double = js.native
  @JSName("Excel.SpellingOptions_typekey")
  var ExcelDotSpellingOptions_typekey: SpellingOptions = js.native
  var GermanPostReform: Boolean = js.native
  var HebrewModes: XlHebrewModes = js.native
  var IgnoreCaps: Boolean = js.native
  var IgnoreFileNames: Boolean = js.native
  var IgnoreMixedDigits: Boolean = js.native
  var KoreanCombineAux: Boolean = js.native
  var KoreanProcessCompound: Boolean = js.native
  var KoreanUseAutoChangeList: Boolean = js.native
  var PortugalReform: XlPortugueseReform = js.native
  var RussianStrictE: Boolean = js.native
  var SpanishModes: XlSpanishModes = js.native
  var SuggestMainOnly: Boolean = js.native
  var UserDict: String = js.native
}

object SpellingOptions {
  @scala.inline
  def apply(
    ArabicModes: XlArabicModes,
    ArabicStrictAlefHamza: Boolean,
    ArabicStrictFinalYaa: Boolean,
    ArabicStrictTaaMarboota: Boolean,
    BrazilReform: XlPortugueseReform,
    DictLang: Double,
    ExcelDotSpellingOptions_typekey: SpellingOptions,
    GermanPostReform: Boolean,
    HebrewModes: XlHebrewModes,
    IgnoreCaps: Boolean,
    IgnoreFileNames: Boolean,
    IgnoreMixedDigits: Boolean,
    KoreanCombineAux: Boolean,
    KoreanProcessCompound: Boolean,
    KoreanUseAutoChangeList: Boolean,
    PortugalReform: XlPortugueseReform,
    RussianStrictE: Boolean,
    SpanishModes: XlSpanishModes,
    SuggestMainOnly: Boolean,
    UserDict: String
  ): SpellingOptions = {
    val __obj = js.Dynamic.literal(ArabicModes = ArabicModes.asInstanceOf[js.Any], ArabicStrictAlefHamza = ArabicStrictAlefHamza.asInstanceOf[js.Any], ArabicStrictFinalYaa = ArabicStrictFinalYaa.asInstanceOf[js.Any], ArabicStrictTaaMarboota = ArabicStrictTaaMarboota.asInstanceOf[js.Any], BrazilReform = BrazilReform.asInstanceOf[js.Any], DictLang = DictLang.asInstanceOf[js.Any], GermanPostReform = GermanPostReform.asInstanceOf[js.Any], HebrewModes = HebrewModes.asInstanceOf[js.Any], IgnoreCaps = IgnoreCaps.asInstanceOf[js.Any], IgnoreFileNames = IgnoreFileNames.asInstanceOf[js.Any], IgnoreMixedDigits = IgnoreMixedDigits.asInstanceOf[js.Any], KoreanCombineAux = KoreanCombineAux.asInstanceOf[js.Any], KoreanProcessCompound = KoreanProcessCompound.asInstanceOf[js.Any], KoreanUseAutoChangeList = KoreanUseAutoChangeList.asInstanceOf[js.Any], PortugalReform = PortugalReform.asInstanceOf[js.Any], RussianStrictE = RussianStrictE.asInstanceOf[js.Any], SpanishModes = SpanishModes.asInstanceOf[js.Any], SuggestMainOnly = SuggestMainOnly.asInstanceOf[js.Any], UserDict = UserDict.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SpellingOptions_typekey")(ExcelDotSpellingOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpellingOptions]
  }
  @scala.inline
  implicit class SpellingOptionsOps[Self <: SpellingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArabicModes(value: XlArabicModes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArabicModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArabicStrictAlefHamza(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArabicStrictAlefHamza")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArabicStrictFinalYaa(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArabicStrictFinalYaa")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArabicStrictTaaMarboota(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArabicStrictTaaMarboota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrazilReform(value: XlPortugueseReform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrazilReform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDictLang(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DictLang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotSpellingOptions_typekey(value: SpellingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.SpellingOptions_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGermanPostReform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GermanPostReform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHebrewModes(value: XlHebrewModes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HebrewModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreCaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IgnoreCaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreFileNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IgnoreFileNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreMixedDigits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IgnoreMixedDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKoreanCombineAux(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KoreanCombineAux")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKoreanProcessCompound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KoreanProcessCompound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKoreanUseAutoChangeList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KoreanUseAutoChangeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortugalReform(value: XlPortugueseReform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortugalReform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRussianStrictE(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RussianStrictE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpanishModes(value: XlSpanishModes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpanishModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestMainOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuggestMainOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserDict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserDict")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

