package typingsSlinky.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintErrorType extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PrintErrorType")
@js.native
object PrintErrorType extends js.Object {
  @js.native
  sealed trait asDisplayed extends PrintErrorType
  
  @js.native
  sealed trait blank extends PrintErrorType
  
  @js.native
  sealed trait dash extends PrintErrorType
  
  @js.native
  sealed trait notAvailable extends PrintErrorType
  
  /* "AsDisplayed" */ val asDisplayed: typingsSlinky.officeDashJs.Excel.PrintErrorType.asDisplayed with String = js.native
  /* "Blank" */ val blank: typingsSlinky.officeDashJs.Excel.PrintErrorType.blank with String = js.native
  /* "Dash" */ val dash: typingsSlinky.officeDashJs.Excel.PrintErrorType.dash with String = js.native
  /* "NotAvailable" */ val notAvailable: typingsSlinky.officeDashJs.Excel.PrintErrorType.notAvailable with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PrintErrorType with String] = js.native
}

