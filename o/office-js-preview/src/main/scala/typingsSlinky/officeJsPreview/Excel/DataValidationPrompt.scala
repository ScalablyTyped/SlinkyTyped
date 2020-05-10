package typingsSlinky.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the user prompt properties for the data validation.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait DataValidationPrompt extends js.Object {
  /**
    *
    * Represents the message of the prompt.
    *
    * [Api set: ExcelApi 1.8]
    */
  var message: String = js.native
  /**
    *
    * Determines whether or not to show the prompt when user selects a cell with data validation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showPrompt: Boolean = js.native
  /**
    *
    * Represents the title for the prompt.
    *
    * [Api set: ExcelApi 1.8]
    */
  var title: String = js.native
}

object DataValidationPrompt {
  @scala.inline
  def apply(message: String, showPrompt: Boolean, title: String): DataValidationPrompt = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], showPrompt = showPrompt.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValidationPrompt]
  }
  @scala.inline
  implicit class DataValidationPromptOps[Self <: DataValidationPrompt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowPrompt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPrompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

