package typingsSlinky.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the state of calculation across the entire Excel application.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.CalculationState")
@js.native
object CalculationState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Excel.CalculationState with String] = js.native
  
  /* "Calculating" */ val calculating: typingsSlinky.officeJs.Excel.CalculationState.calculating with String = js.native
  
  /* "Done" */ val done: typingsSlinky.officeJs.Excel.CalculationState.done with String = js.native
  
  /* "Pending" */ val pending: typingsSlinky.officeJs.Excel.CalculationState.pending with String = js.native
}
