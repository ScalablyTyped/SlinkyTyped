package typingsSlinky.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents Data validation error alert style. The default is "Stop".
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.DataValidationAlertStyle")
@js.native
object DataValidationAlertStyle extends js.Object {
  /* "Information" */ val information: typingsSlinky.officeJs.Excel.DataValidationAlertStyle.information with String = js.native
  /* "Stop" */ val stop: typingsSlinky.officeJs.Excel.DataValidationAlertStyle.stop with String = js.native
  /* "Warning" */ val warning: typingsSlinky.officeJs.Excel.DataValidationAlertStyle.warning with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Excel.DataValidationAlertStyle with String] = js.native
}

