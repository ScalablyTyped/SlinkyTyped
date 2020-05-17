package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCorrect extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var CorrectCapsLock: Boolean = js.native
  var CorrectDays: Boolean = js.native
  var CorrectHangulAndAlphabet: Boolean = js.native
  var CorrectInitialCaps: Boolean = js.native
  var CorrectKeyboardSetting: Boolean = js.native
  var CorrectSentenceCaps: Boolean = js.native
  var CorrectTableCells: Boolean = js.native
  val Creator: Double = js.native
  var DisplayAutoCorrectOptions: Boolean = js.native
  val Entries: AutoCorrectEntries = js.native
  var FirstLetterAutoAdd: Boolean = js.native
  val FirstLetterExceptions: typingsSlinky.activexWord.Word.FirstLetterExceptions = js.native
  var HangulAndAlphabetAutoAdd: Boolean = js.native
  val HangulAndAlphabetExceptions: typingsSlinky.activexWord.Word.HangulAndAlphabetExceptions = js.native
  var OtherCorrectionsAutoAdd: Boolean = js.native
  val OtherCorrectionsExceptions: typingsSlinky.activexWord.Word.OtherCorrectionsExceptions = js.native
  val Parent: js.Any = js.native
  var ReplaceText: Boolean = js.native
  var ReplaceTextFromSpellingChecker: Boolean = js.native
  var TwoInitialCapsAutoAdd: Boolean = js.native
  val TwoInitialCapsExceptions: typingsSlinky.activexWord.Word.TwoInitialCapsExceptions = js.native
  @JSName("Word.AutoCorrect_typekey")
  var WordDotAutoCorrect_typekey: AutoCorrect = js.native
}

object AutoCorrect {
  @scala.inline
  def apply(
    Application: Application,
    CorrectCapsLock: Boolean,
    CorrectDays: Boolean,
    CorrectHangulAndAlphabet: Boolean,
    CorrectInitialCaps: Boolean,
    CorrectKeyboardSetting: Boolean,
    CorrectSentenceCaps: Boolean,
    CorrectTableCells: Boolean,
    Creator: Double,
    DisplayAutoCorrectOptions: Boolean,
    Entries: AutoCorrectEntries,
    FirstLetterAutoAdd: Boolean,
    FirstLetterExceptions: FirstLetterExceptions,
    HangulAndAlphabetAutoAdd: Boolean,
    HangulAndAlphabetExceptions: HangulAndAlphabetExceptions,
    OtherCorrectionsAutoAdd: Boolean,
    OtherCorrectionsExceptions: OtherCorrectionsExceptions,
    Parent: js.Any,
    ReplaceText: Boolean,
    ReplaceTextFromSpellingChecker: Boolean,
    TwoInitialCapsAutoAdd: Boolean,
    TwoInitialCapsExceptions: TwoInitialCapsExceptions,
    WordDotAutoCorrect_typekey: AutoCorrect
  ): AutoCorrect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CorrectCapsLock = CorrectCapsLock.asInstanceOf[js.Any], CorrectDays = CorrectDays.asInstanceOf[js.Any], CorrectHangulAndAlphabet = CorrectHangulAndAlphabet.asInstanceOf[js.Any], CorrectInitialCaps = CorrectInitialCaps.asInstanceOf[js.Any], CorrectKeyboardSetting = CorrectKeyboardSetting.asInstanceOf[js.Any], CorrectSentenceCaps = CorrectSentenceCaps.asInstanceOf[js.Any], CorrectTableCells = CorrectTableCells.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DisplayAutoCorrectOptions = DisplayAutoCorrectOptions.asInstanceOf[js.Any], Entries = Entries.asInstanceOf[js.Any], FirstLetterAutoAdd = FirstLetterAutoAdd.asInstanceOf[js.Any], FirstLetterExceptions = FirstLetterExceptions.asInstanceOf[js.Any], HangulAndAlphabetAutoAdd = HangulAndAlphabetAutoAdd.asInstanceOf[js.Any], HangulAndAlphabetExceptions = HangulAndAlphabetExceptions.asInstanceOf[js.Any], OtherCorrectionsAutoAdd = OtherCorrectionsAutoAdd.asInstanceOf[js.Any], OtherCorrectionsExceptions = OtherCorrectionsExceptions.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReplaceText = ReplaceText.asInstanceOf[js.Any], ReplaceTextFromSpellingChecker = ReplaceTextFromSpellingChecker.asInstanceOf[js.Any], TwoInitialCapsAutoAdd = TwoInitialCapsAutoAdd.asInstanceOf[js.Any], TwoInitialCapsExceptions = TwoInitialCapsExceptions.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AutoCorrect_typekey")(WordDotAutoCorrect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCorrect]
  }
  @scala.inline
  implicit class AutoCorrectOps[Self <: AutoCorrect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCorrectCapsLock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CorrectCapsLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCorrectDays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CorrectDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCorrectHangulAndAlphabet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CorrectHangulAndAlphabet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCorrectInitialCaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CorrectInitialCaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCorrectKeyboardSetting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CorrectKeyboardSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCorrectSentenceCaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CorrectSentenceCaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCorrectTableCells(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CorrectTableCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayAutoCorrectOptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayAutoCorrectOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntries(value: AutoCorrectEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstLetterAutoAdd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstLetterAutoAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstLetterExceptions(value: FirstLetterExceptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstLetterExceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHangulAndAlphabetAutoAdd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HangulAndAlphabetAutoAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHangulAndAlphabetExceptions(value: HangulAndAlphabetExceptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HangulAndAlphabetExceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtherCorrectionsAutoAdd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OtherCorrectionsAutoAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtherCorrectionsExceptions(value: OtherCorrectionsExceptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OtherCorrectionsExceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplaceText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceTextFromSpellingChecker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplaceTextFromSpellingChecker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwoInitialCapsAutoAdd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TwoInitialCapsAutoAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwoInitialCapsExceptions(value: TwoInitialCapsExceptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TwoInitialCapsExceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotAutoCorrect_typekey(value: AutoCorrect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.AutoCorrect_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

