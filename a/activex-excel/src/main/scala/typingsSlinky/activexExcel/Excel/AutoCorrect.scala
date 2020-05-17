package typingsSlinky.activexExcel.Excel

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCorrect extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  var AutoExpandListRange: Boolean = js.native
  var AutoFillFormulasInLists: Boolean = js.native
  var CapitalizeNamesOfDays: Boolean = js.native
  var CorrectCapsLock: Boolean = js.native
  var CorrectSentenceCap: Boolean = js.native
  val Creator: XlCreator = js.native
  var DisplayAutoCorrectOptions: Boolean = js.native
  @JSName("Excel.AutoCorrect_typekey")
  var ExcelDotAutoCorrect_typekey: AutoCorrect = js.native
  val Parent: js.Any = js.native
  var ReplaceText: Boolean = js.native
  var TwoInitialCapitals: Boolean = js.native
  /** @returns The string to be replaced */
  def AddReplacement(What: String, Replacement: String): String = js.native
  /** @returns The string to be replaced */
  def DeleteReplacement(What: String): String = js.native
  def ReplacementList(Index: Double): SafeArray[String] = js.native
}

object AutoCorrect {
  @scala.inline
  def apply(
    AddReplacement: (String, String) => String,
    Application: Application,
    AutoExpandListRange: Boolean,
    AutoFillFormulasInLists: Boolean,
    CapitalizeNamesOfDays: Boolean,
    CorrectCapsLock: Boolean,
    CorrectSentenceCap: Boolean,
    Creator: XlCreator,
    DeleteReplacement: String => String,
    DisplayAutoCorrectOptions: Boolean,
    ExcelDotAutoCorrect_typekey: AutoCorrect,
    Parent: js.Any,
    ReplaceText: Boolean,
    ReplacementList: Double => SafeArray[String],
    TwoInitialCapitals: Boolean
  ): AutoCorrect = {
    val __obj = js.Dynamic.literal(AddReplacement = js.Any.fromFunction2(AddReplacement), Application = Application.asInstanceOf[js.Any], AutoExpandListRange = AutoExpandListRange.asInstanceOf[js.Any], AutoFillFormulasInLists = AutoFillFormulasInLists.asInstanceOf[js.Any], CapitalizeNamesOfDays = CapitalizeNamesOfDays.asInstanceOf[js.Any], CorrectCapsLock = CorrectCapsLock.asInstanceOf[js.Any], CorrectSentenceCap = CorrectSentenceCap.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DeleteReplacement = js.Any.fromFunction1(DeleteReplacement), DisplayAutoCorrectOptions = DisplayAutoCorrectOptions.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReplaceText = ReplaceText.asInstanceOf[js.Any], ReplacementList = js.Any.fromFunction1(ReplacementList), TwoInitialCapitals = TwoInitialCapitals.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.AutoCorrect_typekey")(ExcelDotAutoCorrect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCorrect]
  }
  @scala.inline
  implicit class AutoCorrectOps[Self <: AutoCorrect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddReplacement(value: (String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddReplacement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoExpandListRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoExpandListRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoFillFormulasInLists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFillFormulasInLists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapitalizeNamesOfDays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapitalizeNamesOfDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCorrectCapsLock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CorrectCapsLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCorrectSentenceCap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CorrectSentenceCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteReplacement(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteReplacement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisplayAutoCorrectOptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayAutoCorrectOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotAutoCorrect_typekey(value: AutoCorrect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.AutoCorrect_typekey")(value.asInstanceOf[js.Any])
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
    def withReplacementList(value: Double => SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplacementList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTwoInitialCapitals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TwoInitialCapitals")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

