package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.exceljsStrings.custom
import typingsSlinky.exceljs.exceljsStrings.date
import typingsSlinky.exceljs.exceljsStrings.decimal
import typingsSlinky.exceljs.exceljsStrings.list
import typingsSlinky.exceljs.exceljsStrings.textLength
import typingsSlinky.exceljs.exceljsStrings.whole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataValidation extends js.Object {
  var allowBlank: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[String] = js.native
  var errorStyle: js.UndefOr[String] = js.native
  var errorTitle: js.UndefOr[String] = js.native
  var formulae: js.Array[_] = js.native
  var operator: js.UndefOr[DataValidationOperator] = js.native
  var prompt: js.UndefOr[String] = js.native
  var promptTitle: js.UndefOr[String] = js.native
  var showErrorMessage: js.UndefOr[Boolean] = js.native
  var showInputMessage: js.UndefOr[Boolean] = js.native
  var `type`: list | whole | decimal | date | textLength | custom = js.native
}

object DataValidation {
  @scala.inline
  def apply(formulae: js.Array[_], `type`: list | whole | decimal | date | textLength | custom): DataValidation = {
    val __obj = js.Dynamic.literal(formulae = formulae.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValidation]
  }
  @scala.inline
  implicit class DataValidationOps[Self <: DataValidation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormulae(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulae")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: list | whole | decimal | date | textLength | custom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowBlank(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowBlank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowBlank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowBlank")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withOperator(value: DataValidationOperator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(js.undefined)
        ret
    }
    @scala.inline
    def withPrompt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.undefined)
        ret
    }
    @scala.inline
    def withPromptTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromptTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withShowErrorMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInputMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInputMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInputMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInputMessage")(js.undefined)
        ret
    }
  }
  
}

