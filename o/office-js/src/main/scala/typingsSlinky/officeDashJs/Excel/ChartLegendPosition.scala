package typingsSlinky.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartLegendPosition extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartLegendPosition")
@js.native
object ChartLegendPosition extends js.Object {
  @js.native
  sealed trait bottom extends ChartLegendPosition
  
  @js.native
  sealed trait corner extends ChartLegendPosition
  
  @js.native
  sealed trait custom extends ChartLegendPosition
  
  @js.native
  sealed trait invalid extends ChartLegendPosition
  
  @js.native
  sealed trait left extends ChartLegendPosition
  
  @js.native
  sealed trait right extends ChartLegendPosition
  
  @js.native
  sealed trait top extends ChartLegendPosition
  
  /* "Bottom" */ val bottom: typingsSlinky.officeDashJs.Excel.ChartLegendPosition.bottom with String = js.native
  /* "Corner" */ val corner: typingsSlinky.officeDashJs.Excel.ChartLegendPosition.corner with String = js.native
  /* "Custom" */ val custom: typingsSlinky.officeDashJs.Excel.ChartLegendPosition.custom with String = js.native
  /* "Invalid" */ val invalid: typingsSlinky.officeDashJs.Excel.ChartLegendPosition.invalid with String = js.native
  /* "Left" */ val left: typingsSlinky.officeDashJs.Excel.ChartLegendPosition.left with String = js.native
  /* "Right" */ val right: typingsSlinky.officeDashJs.Excel.ChartLegendPosition.right with String = js.native
  /* "Top" */ val top: typingsSlinky.officeDashJs.Excel.ChartLegendPosition.top with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartLegendPosition with String] = js.native
}

