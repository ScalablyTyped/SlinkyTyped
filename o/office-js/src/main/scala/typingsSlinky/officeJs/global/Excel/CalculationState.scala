package typingsSlinky.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the state of calculation across the entire Excel application.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.CalculationState")
@js.native
object CalculationState extends js.Object {
  /* "Calculating" */ val calculating: typingsSlinky.officeJs.Excel.CalculationState.calculating with String = js.native
  /* "Done" */ val done: typingsSlinky.officeJs.Excel.CalculationState.done with String = js.native
  /* "Pending" */ val pending: typingsSlinky.officeJs.Excel.CalculationState.pending with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Excel.CalculationState with String] = js.native
}

