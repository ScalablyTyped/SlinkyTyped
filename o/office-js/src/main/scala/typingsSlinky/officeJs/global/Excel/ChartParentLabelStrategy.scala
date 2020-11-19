package typingsSlinky.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the parent label strategy of the chart series layout. This only applies to treemap charts
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartParentLabelStrategy")
@js.native
object ChartParentLabelStrategy extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Excel.ChartParentLabelStrategy with String] = js.native
  
  /* "Banner" */ val banner: typingsSlinky.officeJs.Excel.ChartParentLabelStrategy.banner with String = js.native
  
  /* "None" */ val none: typingsSlinky.officeJs.Excel.ChartParentLabelStrategy.none with String = js.native
  
  /* "Overlapping" */ val overlapping: typingsSlinky.officeJs.Excel.ChartParentLabelStrategy.overlapping with String = js.native
}
