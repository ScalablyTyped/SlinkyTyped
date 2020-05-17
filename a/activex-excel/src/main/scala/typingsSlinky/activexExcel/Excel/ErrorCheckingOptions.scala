package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorCheckingOptions extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  var BackgroundChecking: Boolean = js.native
  val Creator: XlCreator = js.native
  var EmptyCellReferences: Boolean = js.native
  var EvaluateToError: Boolean = js.native
  @JSName("Excel.ErrorCheckingOptions_typekey")
  var ExcelDotErrorCheckingOptions_typekey: ErrorCheckingOptions = js.native
  var InconsistentFormula: Boolean = js.native
  var InconsistentTableFormula: Boolean = js.native
  var IndicatorColorIndex: XlColorIndex = js.native
  var ListDataValidation: Boolean = js.native
  var NumberAsText: Boolean = js.native
  var OmittedCells: Boolean = js.native
  val Parent: js.Any = js.native
  var TextDate: Boolean = js.native
  var UnlockedFormulaCells: Boolean = js.native
}

object ErrorCheckingOptions {
  @scala.inline
  def apply(
    Application: Application,
    BackgroundChecking: Boolean,
    Creator: XlCreator,
    EmptyCellReferences: Boolean,
    EvaluateToError: Boolean,
    ExcelDotErrorCheckingOptions_typekey: ErrorCheckingOptions,
    InconsistentFormula: Boolean,
    InconsistentTableFormula: Boolean,
    IndicatorColorIndex: XlColorIndex,
    ListDataValidation: Boolean,
    NumberAsText: Boolean,
    OmittedCells: Boolean,
    Parent: js.Any,
    TextDate: Boolean,
    UnlockedFormulaCells: Boolean
  ): ErrorCheckingOptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BackgroundChecking = BackgroundChecking.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], EmptyCellReferences = EmptyCellReferences.asInstanceOf[js.Any], EvaluateToError = EvaluateToError.asInstanceOf[js.Any], InconsistentFormula = InconsistentFormula.asInstanceOf[js.Any], InconsistentTableFormula = InconsistentTableFormula.asInstanceOf[js.Any], IndicatorColorIndex = IndicatorColorIndex.asInstanceOf[js.Any], ListDataValidation = ListDataValidation.asInstanceOf[js.Any], NumberAsText = NumberAsText.asInstanceOf[js.Any], OmittedCells = OmittedCells.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], TextDate = TextDate.asInstanceOf[js.Any], UnlockedFormulaCells = UnlockedFormulaCells.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ErrorCheckingOptions_typekey")(ExcelDotErrorCheckingOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCheckingOptions]
  }
  @scala.inline
  implicit class ErrorCheckingOptionsOps[Self <: ErrorCheckingOptions] (val x: Self) extends AnyVal {
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
    def withBackgroundChecking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackgroundChecking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmptyCellReferences(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmptyCellReferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvaluateToError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluateToError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotErrorCheckingOptions_typekey(value: ErrorCheckingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.ErrorCheckingOptions_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInconsistentFormula(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InconsistentFormula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInconsistentTableFormula(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InconsistentTableFormula")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicatorColorIndex(value: XlColorIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndicatorColorIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListDataValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListDataValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberAsText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberAsText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOmittedCells(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OmittedCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnlockedFormulaCells(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnlockedFormulaCells")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

