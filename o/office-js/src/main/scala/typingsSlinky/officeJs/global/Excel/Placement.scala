package typingsSlinky.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Specifies the way that an object is attached to its underlying cells.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.Placement")
@js.native
object Placement extends js.Object {
  /* "Absolute" */ val absolute: typingsSlinky.officeJs.Excel.Placement.absolute with String = js.native
  /* "OneCell" */ val oneCell: typingsSlinky.officeJs.Excel.Placement.oneCell with String = js.native
  /* "TwoCell" */ val twoCell: typingsSlinky.officeJs.Excel.Placement.twoCell with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Excel.Placement with String] = js.native
}

