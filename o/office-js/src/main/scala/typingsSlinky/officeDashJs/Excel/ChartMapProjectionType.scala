package typingsSlinky.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartMapProjectionType extends js.Object

/**
  *
  * Represents the region projection type of a chart series layout. This only applies to region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartMapProjectionType")
@js.native
object ChartMapProjectionType extends js.Object {
  @js.native
  sealed trait albers extends ChartMapProjectionType
  
  @js.native
  sealed trait automatic extends ChartMapProjectionType
  
  @js.native
  sealed trait mercator extends ChartMapProjectionType
  
  @js.native
  sealed trait miller extends ChartMapProjectionType
  
  @js.native
  sealed trait robinson extends ChartMapProjectionType
  
  /* "Albers" */ val albers: typingsSlinky.officeDashJs.Excel.ChartMapProjectionType.albers with String = js.native
  /* "Automatic" */ val automatic: typingsSlinky.officeDashJs.Excel.ChartMapProjectionType.automatic with String = js.native
  /* "Mercator" */ val mercator: typingsSlinky.officeDashJs.Excel.ChartMapProjectionType.mercator with String = js.native
  /* "Miller" */ val miller: typingsSlinky.officeDashJs.Excel.ChartMapProjectionType.miller with String = js.native
  /* "Robinson" */ val robinson: typingsSlinky.officeDashJs.Excel.ChartMapProjectionType.robinson with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartMapProjectionType with String] = js.native
}

