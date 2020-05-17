package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Find[TParent] extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var CorrectHangulEndings: Boolean = js.native
  val Creator: Double = js.native
  var Font: typingsSlinky.activexWord.Word.Font = js.native
  var Format: Boolean = js.native
  var Forward: Boolean = js.native
  val Found: Boolean = js.native
  val Frame: typingsSlinky.activexWord.Word.Frame = js.native
  var HanjaPhoneticHangul: Boolean = js.native
  var Highlight: Double = js.native
  var IgnorePunct: Boolean = js.native
  var IgnoreSpace: Boolean = js.native
  var LanguageID: WdLanguageID = js.native
  var LanguageIDFarEast: WdLanguageID = js.native
  var LanguageIDOther: WdLanguageID = js.native
  var MatchAlefHamza: Boolean = js.native
  var MatchAllWordForms: Boolean = js.native
  var MatchByte: Boolean = js.native
  var MatchCase: Boolean = js.native
  var MatchControl: Boolean = js.native
  var MatchDiacritics: Boolean = js.native
  var MatchFuzzy: Boolean = js.native
  var MatchKashida: Boolean = js.native
  var MatchPhrase: Boolean = js.native
  var MatchPrefix: Boolean = js.native
  var MatchSoundsLike: Boolean = js.native
  var MatchSuffix: Boolean = js.native
  var MatchWholeWord: Boolean = js.native
  var MatchWildcards: Boolean = js.native
  var NoProofing: Double = js.native
  var ParagraphFormat: typingsSlinky.activexWord.Word.ParagraphFormat = js.native
  val Parent: TParent = js.native
  val Replacement: typingsSlinky.activexWord.Word.Replacement = js.native
  var Style: js.Any = js.native
  var Text: String = js.native
  @JSName("Word.Find_typekey")
  var WordDotFind_typekey: Find[Range | Selection] = js.native
  var Wrap: WdFindWrap = js.native
  def ClearAllFuzzyOptions(): Unit = js.native
  def ClearFormatting(): Unit = js.native
  def ClearHitHighlight(): Boolean = js.native
  def Execute(
    FindText: js.UndefOr[String],
    MatchCase: js.UndefOr[Boolean],
    MatchWholeWord: js.UndefOr[Boolean],
    MatchWildcards: js.UndefOr[Boolean],
    MatchSoundsLike: js.UndefOr[Boolean],
    MatchAllWordForms: js.UndefOr[Boolean],
    Forward: js.UndefOr[Boolean],
    Wrap: js.UndefOr[WdFindWrap],
    Format: js.UndefOr[Boolean],
    ReplaceWith: js.UndefOr[String],
    Replace: js.UndefOr[WdReplace],
    MatchKashida: js.UndefOr[Boolean],
    MatchDiacritics: js.UndefOr[Boolean],
    MatchAlefHamza: js.UndefOr[Boolean],
    MatchControl: js.UndefOr[Boolean]
  ): Boolean = js.native
  def Execute2007(
    FindText: js.UndefOr[String],
    MatchCase: js.UndefOr[Boolean],
    MatchWholeWord: js.UndefOr[Boolean],
    MatchWildcards: js.UndefOr[Boolean],
    MatchSoundsLike: js.UndefOr[Boolean],
    MatchAllWordForms: js.UndefOr[Boolean],
    Forward: js.UndefOr[Boolean],
    Wrap: js.UndefOr[WdFindWrap],
    Format: js.UndefOr[Boolean],
    ReplaceWith: js.UndefOr[String],
    Replace: js.UndefOr[WdReplace],
    MatchKashida: js.UndefOr[Boolean],
    MatchDiacritics: js.UndefOr[Boolean],
    MatchAlefHamza: js.UndefOr[Boolean],
    MatchControl: js.UndefOr[Boolean],
    MatchPrefix: js.UndefOr[Boolean],
    MatchSuffix: js.UndefOr[Boolean],
    MatchPhrase: js.UndefOr[Boolean],
    IgnoreSpace: js.UndefOr[Boolean],
    IgnorePunct: js.UndefOr[Boolean]
  ): Boolean = js.native
  def ExecuteOld(
    FindText: js.UndefOr[String],
    MatchCase: js.UndefOr[Boolean],
    MatchWholeWord: js.UndefOr[Boolean],
    MatchWildcards: js.UndefOr[Boolean],
    MatchSoundsLike: js.UndefOr[Boolean],
    MatchAllWordForms: js.UndefOr[Boolean],
    Forward: js.UndefOr[Boolean],
    Wrap: js.UndefOr[WdFindWrap],
    Format: js.UndefOr[Boolean],
    ReplaceWith: js.UndefOr[String],
    Replace: js.UndefOr[WdReplace]
  ): Boolean = js.native
  def HitHighlight(
    FindText: js.Any,
    HighlightColor: js.UndefOr[js.Any],
    TextColor: js.UndefOr[js.Any],
    MatchCase: js.UndefOr[js.Any],
    MatchWholeWord: js.UndefOr[js.Any],
    MatchPrefix: js.UndefOr[js.Any],
    MatchSuffix: js.UndefOr[js.Any],
    MatchPhrase: js.UndefOr[js.Any],
    MatchWildcards: js.UndefOr[js.Any],
    MatchSoundsLike: js.UndefOr[js.Any],
    MatchAllWordForms: js.UndefOr[js.Any],
    MatchByte: js.UndefOr[js.Any],
    MatchFuzzy: js.UndefOr[js.Any],
    MatchKashida: js.UndefOr[js.Any],
    MatchDiacritics: js.UndefOr[js.Any],
    MatchAlefHamza: js.UndefOr[js.Any],
    MatchControl: js.UndefOr[js.Any],
    IgnoreSpace: js.UndefOr[js.Any],
    IgnorePunct: js.UndefOr[js.Any],
    HanjaPhoneticHangul: js.UndefOr[js.Any]
  ): Boolean = js.native
  def SetAllFuzzyOptions(): Unit = js.native
}

object Find {
  @scala.inline
  def apply[TParent](
    Application: Application,
    ClearAllFuzzyOptions: () => Unit,
    ClearFormatting: () => Unit,
    ClearHitHighlight: () => Boolean,
    CorrectHangulEndings: Boolean,
    Creator: Double,
    Execute: (js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[WdFindWrap], js.UndefOr[Boolean], js.UndefOr[String], js.UndefOr[WdReplace], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Boolean,
    Execute2007: (js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[WdFindWrap], js.UndefOr[Boolean], js.UndefOr[String], js.UndefOr[WdReplace], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Boolean,
    ExecuteOld: (js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[WdFindWrap], js.UndefOr[Boolean], js.UndefOr[String], js.UndefOr[WdReplace]) => Boolean,
    Font: Font,
    Format: Boolean,
    Forward: Boolean,
    Found: Boolean,
    Frame: Frame,
    HanjaPhoneticHangul: Boolean,
    Highlight: Double,
    HitHighlight: (js.Any, js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Boolean,
    IgnorePunct: Boolean,
    IgnoreSpace: Boolean,
    LanguageID: WdLanguageID,
    LanguageIDFarEast: WdLanguageID,
    LanguageIDOther: WdLanguageID,
    MatchAlefHamza: Boolean,
    MatchAllWordForms: Boolean,
    MatchByte: Boolean,
    MatchCase: Boolean,
    MatchControl: Boolean,
    MatchDiacritics: Boolean,
    MatchFuzzy: Boolean,
    MatchKashida: Boolean,
    MatchPhrase: Boolean,
    MatchPrefix: Boolean,
    MatchSoundsLike: Boolean,
    MatchSuffix: Boolean,
    MatchWholeWord: Boolean,
    MatchWildcards: Boolean,
    NoProofing: Double,
    ParagraphFormat: ParagraphFormat,
    Parent: TParent,
    Replacement: Replacement,
    SetAllFuzzyOptions: () => Unit,
    Style: js.Any,
    Text: String,
    WordDotFind_typekey: Find[Range | Selection],
    Wrap: WdFindWrap
  ): Find[TParent] = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ClearAllFuzzyOptions = js.Any.fromFunction0(ClearAllFuzzyOptions), ClearFormatting = js.Any.fromFunction0(ClearFormatting), ClearHitHighlight = js.Any.fromFunction0(ClearHitHighlight), CorrectHangulEndings = CorrectHangulEndings.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Execute = js.Any.fromFunction15(Execute), Execute2007 = js.Any.fromFunction20(Execute2007), ExecuteOld = js.Any.fromFunction11(ExecuteOld), Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Forward = Forward.asInstanceOf[js.Any], Found = Found.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], HanjaPhoneticHangul = HanjaPhoneticHangul.asInstanceOf[js.Any], Highlight = Highlight.asInstanceOf[js.Any], HitHighlight = js.Any.fromFunction20(HitHighlight), IgnorePunct = IgnorePunct.asInstanceOf[js.Any], IgnoreSpace = IgnoreSpace.asInstanceOf[js.Any], LanguageID = LanguageID.asInstanceOf[js.Any], LanguageIDFarEast = LanguageIDFarEast.asInstanceOf[js.Any], LanguageIDOther = LanguageIDOther.asInstanceOf[js.Any], MatchAlefHamza = MatchAlefHamza.asInstanceOf[js.Any], MatchAllWordForms = MatchAllWordForms.asInstanceOf[js.Any], MatchByte = MatchByte.asInstanceOf[js.Any], MatchCase = MatchCase.asInstanceOf[js.Any], MatchControl = MatchControl.asInstanceOf[js.Any], MatchDiacritics = MatchDiacritics.asInstanceOf[js.Any], MatchFuzzy = MatchFuzzy.asInstanceOf[js.Any], MatchKashida = MatchKashida.asInstanceOf[js.Any], MatchPhrase = MatchPhrase.asInstanceOf[js.Any], MatchPrefix = MatchPrefix.asInstanceOf[js.Any], MatchSoundsLike = MatchSoundsLike.asInstanceOf[js.Any], MatchSuffix = MatchSuffix.asInstanceOf[js.Any], MatchWholeWord = MatchWholeWord.asInstanceOf[js.Any], MatchWildcards = MatchWildcards.asInstanceOf[js.Any], NoProofing = NoProofing.asInstanceOf[js.Any], ParagraphFormat = ParagraphFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Replacement = Replacement.asInstanceOf[js.Any], SetAllFuzzyOptions = js.Any.fromFunction0(SetAllFuzzyOptions), Style = Style.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Wrap = Wrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Find_typekey")(WordDotFind_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Find[TParent]]
  }
  @scala.inline
  implicit class FindOps[Self[tparent] <: Find[tparent], TParent] (val x: Self[TParent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TParent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TParent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TParent] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TParent] with Other]
    @scala.inline
    def withApplication(value: Application): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearAllFuzzyOptions(value: () => Unit): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearAllFuzzyOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearFormatting(value: () => Unit): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearFormatting")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearHitHighlight(value: () => Boolean): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearHitHighlight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCorrectHangulEndings(value: Boolean): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CorrectHangulEndings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecute(
      value: (js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[WdFindWrap], js.UndefOr[Boolean], js.UndefOr[String], js.UndefOr[WdReplace], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Boolean
    ): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Execute")(js.Any.fromFunction15(value))
        ret
    }
    @scala.inline
    def withExecute2007(
      value: (js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[WdFindWrap], js.UndefOr[Boolean], js.UndefOr[String], js.UndefOr[WdReplace], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean]) => Boolean
    ): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Execute2007")(js.Any.fromFunction20(value))
        ret
    }
    @scala.inline
    def withExecuteOld(
      value: (js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[Boolean], js.UndefOr[WdFindWrap], js.UndefOr[Boolean], js.UndefOr[String], js.UndefOr[WdReplace]) => Boolean
    ): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecuteOld")(js.Any.fromFunction11(value))
        ret
    }
    @scala.inline
    def withFont(value: Font): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: Boolean): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForward(value: Boolean): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Forward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFound(value: Boolean): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Found")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrame(value: Frame): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHanjaPhoneticHangul(value: Boolean): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HanjaPhoneticHangul")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlight(value: Double): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHitHighlight(
      value: (js.Any, js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Boolean
    ): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HitHighlight")(js.Any.fromFunction20(value))
        ret
    }
    @scala.inline
    def withIgnorePunct(value: Boolean): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IgnorePunct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreSpace(value: Boolean): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IgnoreSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageID(value: WdLanguageID): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageIDFarEast(value: WdLanguageID): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageIDFarEast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageIDOther(value: WdLanguageID): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageIDOther")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchAlefHamza(value: Boolean): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchAlefHamza")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchAllWordForms(value: Boolean): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchAllWordForms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchByte(value: Boolean): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchByte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchCase(value: Boolean): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchControl(value: Boolean): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchDiacritics(value: Boolean): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchDiacritics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchFuzzy(value: Boolean): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchFuzzy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchKashida(value: Boolean): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchKashida")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchPhrase(value: Boolean): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchPhrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchPrefix(value: Boolean): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchSoundsLike(value: Boolean): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchSoundsLike")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchSuffix(value: Boolean): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchWholeWord(value: Boolean): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchWholeWord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchWildcards(value: Boolean): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchWildcards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoProofing(value: Double): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoProofing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParagraphFormat(value: ParagraphFormat): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParagraphFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: TParent): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplacement(value: Replacement): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Replacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetAllFuzzyOptions(value: () => Unit): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetAllFuzzyOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStyle(value: js.Any): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotFind_typekey(value: Find[Range | Selection]): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Find_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrap(value: WdFindWrap): Self[TParent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Wrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

