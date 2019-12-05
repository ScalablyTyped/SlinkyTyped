package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataExecutionErrorCode extends js.Object

/**
  * An enumeration of data execution error codes.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.DataExecutionErrorCode")
@js.native
object DataExecutionErrorCode extends js.Object {
  @js.native
  sealed trait DATA_EXECUTION_ERROR_CODE_UNSUPPORTED extends DataExecutionErrorCode
  
  @js.native
  sealed trait DUPLICATE_COLUMN_NAMES extends DataExecutionErrorCode
  
  @js.native
  sealed trait ENGINE extends DataExecutionErrorCode
  
  @js.native
  sealed trait INTERRUPTED extends DataExecutionErrorCode
  
  @js.native
  sealed trait NONE extends DataExecutionErrorCode
  
  @js.native
  sealed trait OTHER extends DataExecutionErrorCode
  
  @js.native
  sealed trait PARAMETER_INVALID extends DataExecutionErrorCode
  
  @js.native
  sealed trait TIME_OUT extends DataExecutionErrorCode
  
  @js.native
  sealed trait TOO_MANY_CELLS extends DataExecutionErrorCode
  
  @js.native
  sealed trait TOO_MANY_CHARS_PER_CELL extends DataExecutionErrorCode
  
  @js.native
  sealed trait TOO_MANY_ROWS extends DataExecutionErrorCode
  
  @js.native
  sealed trait UNSUPPORTED_DATA_TYPE extends DataExecutionErrorCode
  
  /* 0 */ val DATA_EXECUTION_ERROR_CODE_UNSUPPORTED: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.DATA_EXECUTION_ERROR_CODE_UNSUPPORTED with Double = js.native
  /* 8 */ val DUPLICATE_COLUMN_NAMES: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.DUPLICATE_COLUMN_NAMES with Double = js.native
  /* 5 */ val ENGINE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.ENGINE with Double = js.native
  /* 9 */ val INTERRUPTED: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.INTERRUPTED with Double = js.native
  /* 1 */ val NONE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.NONE with Double = js.native
  /* 10 */ val OTHER: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.OTHER with Double = js.native
  /* 6 */ val PARAMETER_INVALID: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.PARAMETER_INVALID with Double = js.native
  /* 2 */ val TIME_OUT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.TIME_OUT with Double = js.native
  /* 4 */ val TOO_MANY_CELLS: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.TOO_MANY_CELLS with Double = js.native
  /* 11 */ val TOO_MANY_CHARS_PER_CELL: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.TOO_MANY_CHARS_PER_CELL with Double = js.native
  /* 3 */ val TOO_MANY_ROWS: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.TOO_MANY_ROWS with Double = js.native
  /* 7 */ val UNSUPPORTED_DATA_TYPE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.UNSUPPORTED_DATA_TYPE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataExecutionErrorCode with Double] = js.native
}

