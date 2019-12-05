package typingsSlinky.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisTimeUnit extends js.Object

/**
  *
  * Specifies the unit of time for chart axes and data series.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisTimeUnit")
@js.native
object ChartAxisTimeUnit extends js.Object {
  @js.native
  sealed trait days extends ChartAxisTimeUnit
  
  @js.native
  sealed trait months extends ChartAxisTimeUnit
  
  @js.native
  sealed trait years extends ChartAxisTimeUnit
  
  /* "Days" */ val days: typingsSlinky.officeDashJsDashPreview.Excel.ChartAxisTimeUnit.days with String = js.native
  /* "Months" */ val months: typingsSlinky.officeDashJsDashPreview.Excel.ChartAxisTimeUnit.months with String = js.native
  /* "Years" */ val years: typingsSlinky.officeDashJsDashPreview.Excel.ChartAxisTimeUnit.years with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartAxisTimeUnit with String] = js.native
}

