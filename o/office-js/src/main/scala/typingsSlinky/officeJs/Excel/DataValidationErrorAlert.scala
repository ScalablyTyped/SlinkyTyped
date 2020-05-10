package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.Information
import typingsSlinky.officeJs.officeJsStrings.Stop
import typingsSlinky.officeJs.officeJsStrings.Warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the error alert properties for the data validation.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait DataValidationErrorAlert extends js.Object {
  /**
    *
    * Represents error alert message.
    *
    * [Api set: ExcelApi 1.8]
    */
  var message: String = js.native
  /**
    *
    * Determines whether to show an error alert dialog or not when a user enters invalid data. The default is true.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAlert: Boolean = js.native
  /**
    *
    * Represents data validation alert type, please see Excel.DataValidationAlertStyle for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var style: DataValidationAlertStyle | Stop | Warning | Information = js.native
  /**
    *
    * Represents error alert dialog title.
    *
    * [Api set: ExcelApi 1.8]
    */
  var title: String = js.native
}

object DataValidationErrorAlert {
  @scala.inline
  def apply(
    message: String,
    showAlert: Boolean,
    style: DataValidationAlertStyle | Stop | Warning | Information,
    title: String
  ): DataValidationErrorAlert = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], showAlert = showAlert.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValidationErrorAlert]
  }
  @scala.inline
  implicit class DataValidationErrorAlertOps[Self <: DataValidationErrorAlert] (val x: Self) extends AnyVal {
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
    def withShowAlert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAlert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: DataValidationAlertStyle | Stop | Warning | Information): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
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

