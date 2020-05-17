package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParagraphFormat extends js.Object {
  var AddSpaceBetweenFarEastAndAlpha: Double = js.native
  var AddSpaceBetweenFarEastAndDigit: Double = js.native
  var Alignment: WdParagraphAlignment = js.native
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var AutoAdjustRightIndent: Double = js.native
  var BaseLineAlignment: WdBaselineAlignment = js.native
  var Borders: typingsSlinky.activexWord.Word.Borders = js.native
  var CharacterUnitFirstLineIndent: Double = js.native
  var CharacterUnitLeftIndent: Double = js.native
  var CharacterUnitRightIndent: Double = js.native
  val Creator: Double = js.native
  var DisableLineHeightGrid: Double = js.native
  val Duplicate: ParagraphFormat = js.native
  var FarEastLineBreakControl: Double = js.native
  var FirstLineIndent: Double = js.native
  var HalfWidthPunctuationOnTopOfLine: Double = js.native
  var HangingPunctuation: Double = js.native
  var Hyphenation: Double = js.native
  var KeepTogether: Double = js.native
  var KeepWithNext: Double = js.native
  var LeftIndent: Double = js.native
  var LineSpacing: Double = js.native
  var LineSpacingRule: WdLineSpacing = js.native
  var LineUnitAfter: Double = js.native
  var LineUnitBefore: Double = js.native
  var MirrorIndents: Double = js.native
  var NoLineNumber: Double = js.native
  var OutlineLevel: WdOutlineLevel = js.native
  var PageBreakBefore: Double = js.native
  val Parent: js.Any = js.native
  var ReadingOrder: WdReadingOrder = js.native
  var RightIndent: Double = js.native
  val Shading: typingsSlinky.activexWord.Word.Shading = js.native
  var SpaceAfter: Double = js.native
  var SpaceAfterAuto: Double = js.native
  var SpaceBefore: Double = js.native
  var SpaceBeforeAuto: Double = js.native
  var Style: js.Any = js.native
  var TabStops: typingsSlinky.activexWord.Word.TabStops = js.native
  var TextboxTightWrap: WdTextboxTightWrap = js.native
  var WidowControl: Double = js.native
  @JSName("Word.ParagraphFormat_typekey")
  var WordDotParagraphFormat_typekey: ParagraphFormat = js.native
  var WordWrap: Double = js.native
  def CloseUp(): Unit = js.native
  def IndentCharWidth(Count: Double): Unit = js.native
  def IndentFirstLineCharWidth(Count: Double): Unit = js.native
  def OpenOrCloseUp(): Unit = js.native
  def OpenUp(): Unit = js.native
  def Reset(): Unit = js.native
  def Space1(): Unit = js.native
  def Space15(): Unit = js.native
  def Space2(): Unit = js.native
  def TabHangingIndent(Count: Double): Unit = js.native
  def TabIndent(Count: Double): Unit = js.native
}

object ParagraphFormat {
  @scala.inline
  def apply(
    AddSpaceBetweenFarEastAndAlpha: Double,
    AddSpaceBetweenFarEastAndDigit: Double,
    Alignment: WdParagraphAlignment,
    Application: Application,
    AutoAdjustRightIndent: Double,
    BaseLineAlignment: WdBaselineAlignment,
    Borders: Borders,
    CharacterUnitFirstLineIndent: Double,
    CharacterUnitLeftIndent: Double,
    CharacterUnitRightIndent: Double,
    CloseUp: () => Unit,
    Creator: Double,
    DisableLineHeightGrid: Double,
    Duplicate: ParagraphFormat,
    FarEastLineBreakControl: Double,
    FirstLineIndent: Double,
    HalfWidthPunctuationOnTopOfLine: Double,
    HangingPunctuation: Double,
    Hyphenation: Double,
    IndentCharWidth: Double => Unit,
    IndentFirstLineCharWidth: Double => Unit,
    KeepTogether: Double,
    KeepWithNext: Double,
    LeftIndent: Double,
    LineSpacing: Double,
    LineSpacingRule: WdLineSpacing,
    LineUnitAfter: Double,
    LineUnitBefore: Double,
    MirrorIndents: Double,
    NoLineNumber: Double,
    OpenOrCloseUp: () => Unit,
    OpenUp: () => Unit,
    OutlineLevel: WdOutlineLevel,
    PageBreakBefore: Double,
    Parent: js.Any,
    ReadingOrder: WdReadingOrder,
    Reset: () => Unit,
    RightIndent: Double,
    Shading: Shading,
    Space1: () => Unit,
    Space15: () => Unit,
    Space2: () => Unit,
    SpaceAfter: Double,
    SpaceAfterAuto: Double,
    SpaceBefore: Double,
    SpaceBeforeAuto: Double,
    Style: js.Any,
    TabHangingIndent: Double => Unit,
    TabIndent: Double => Unit,
    TabStops: TabStops,
    TextboxTightWrap: WdTextboxTightWrap,
    WidowControl: Double,
    WordDotParagraphFormat_typekey: ParagraphFormat,
    WordWrap: Double
  ): ParagraphFormat = {
    val __obj = js.Dynamic.literal(AddSpaceBetweenFarEastAndAlpha = AddSpaceBetweenFarEastAndAlpha.asInstanceOf[js.Any], AddSpaceBetweenFarEastAndDigit = AddSpaceBetweenFarEastAndDigit.asInstanceOf[js.Any], Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], AutoAdjustRightIndent = AutoAdjustRightIndent.asInstanceOf[js.Any], BaseLineAlignment = BaseLineAlignment.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], CharacterUnitFirstLineIndent = CharacterUnitFirstLineIndent.asInstanceOf[js.Any], CharacterUnitLeftIndent = CharacterUnitLeftIndent.asInstanceOf[js.Any], CharacterUnitRightIndent = CharacterUnitRightIndent.asInstanceOf[js.Any], CloseUp = js.Any.fromFunction0(CloseUp), Creator = Creator.asInstanceOf[js.Any], DisableLineHeightGrid = DisableLineHeightGrid.asInstanceOf[js.Any], Duplicate = Duplicate.asInstanceOf[js.Any], FarEastLineBreakControl = FarEastLineBreakControl.asInstanceOf[js.Any], FirstLineIndent = FirstLineIndent.asInstanceOf[js.Any], HalfWidthPunctuationOnTopOfLine = HalfWidthPunctuationOnTopOfLine.asInstanceOf[js.Any], HangingPunctuation = HangingPunctuation.asInstanceOf[js.Any], Hyphenation = Hyphenation.asInstanceOf[js.Any], IndentCharWidth = js.Any.fromFunction1(IndentCharWidth), IndentFirstLineCharWidth = js.Any.fromFunction1(IndentFirstLineCharWidth), KeepTogether = KeepTogether.asInstanceOf[js.Any], KeepWithNext = KeepWithNext.asInstanceOf[js.Any], LeftIndent = LeftIndent.asInstanceOf[js.Any], LineSpacing = LineSpacing.asInstanceOf[js.Any], LineSpacingRule = LineSpacingRule.asInstanceOf[js.Any], LineUnitAfter = LineUnitAfter.asInstanceOf[js.Any], LineUnitBefore = LineUnitBefore.asInstanceOf[js.Any], MirrorIndents = MirrorIndents.asInstanceOf[js.Any], NoLineNumber = NoLineNumber.asInstanceOf[js.Any], OpenOrCloseUp = js.Any.fromFunction0(OpenOrCloseUp), OpenUp = js.Any.fromFunction0(OpenUp), OutlineLevel = OutlineLevel.asInstanceOf[js.Any], PageBreakBefore = PageBreakBefore.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReadingOrder = ReadingOrder.asInstanceOf[js.Any], Reset = js.Any.fromFunction0(Reset), RightIndent = RightIndent.asInstanceOf[js.Any], Shading = Shading.asInstanceOf[js.Any], Space1 = js.Any.fromFunction0(Space1), Space15 = js.Any.fromFunction0(Space15), Space2 = js.Any.fromFunction0(Space2), SpaceAfter = SpaceAfter.asInstanceOf[js.Any], SpaceAfterAuto = SpaceAfterAuto.asInstanceOf[js.Any], SpaceBefore = SpaceBefore.asInstanceOf[js.Any], SpaceBeforeAuto = SpaceBeforeAuto.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], TabHangingIndent = js.Any.fromFunction1(TabHangingIndent), TabIndent = js.Any.fromFunction1(TabIndent), TabStops = TabStops.asInstanceOf[js.Any], TextboxTightWrap = TextboxTightWrap.asInstanceOf[js.Any], WidowControl = WidowControl.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ParagraphFormat_typekey")(WordDotParagraphFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphFormat]
  }
  @scala.inline
  implicit class ParagraphFormatOps[Self <: ParagraphFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddSpaceBetweenFarEastAndAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddSpaceBetweenFarEastAndAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddSpaceBetweenFarEastAndDigit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddSpaceBetweenFarEastAndDigit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlignment(value: WdParagraphAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoAdjustRightIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoAdjustRightIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseLineAlignment(value: WdBaselineAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseLineAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorders(value: Borders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Borders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharacterUnitFirstLineIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharacterUnitFirstLineIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharacterUnitLeftIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharacterUnitLeftIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharacterUnitRightIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharacterUnitRightIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseUp(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloseUp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableLineHeightGrid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableLineHeightGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuplicate(value: ParagraphFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duplicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFarEastLineBreakControl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FarEastLineBreakControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstLineIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstLineIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHalfWidthPunctuationOnTopOfLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HalfWidthPunctuationOnTopOfLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHangingPunctuation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HangingPunctuation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyphenation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hyphenation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndentCharWidth(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndentCharWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIndentFirstLineCharWidth(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndentFirstLineCharWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeepTogether(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeepTogether")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepWithNext(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeepWithNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineSpacingRule(value: WdLineSpacing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineSpacingRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineUnitAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineUnitAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineUnitBefore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineUnitBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMirrorIndents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MirrorIndents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoLineNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoLineNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenOrCloseUp(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenOrCloseUp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpenUp(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenUp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOutlineLevel(value: WdOutlineLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutlineLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageBreakBefore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageBreakBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadingOrder(value: WdReadingOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadingOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRightIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShading(value: Shading): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpace1(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Space1")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSpace15(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Space15")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSpace2(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Space2")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSpaceAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterAuto(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceBefore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceBeforeAuto(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceBeforeAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabHangingIndent(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TabHangingIndent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTabIndent(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TabIndent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTabStops(value: TabStops): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TabStops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextboxTightWrap(value: WdTextboxTightWrap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextboxTightWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidowControl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WidowControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotParagraphFormat_typekey(value: ParagraphFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.ParagraphFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordWrap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WordWrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

