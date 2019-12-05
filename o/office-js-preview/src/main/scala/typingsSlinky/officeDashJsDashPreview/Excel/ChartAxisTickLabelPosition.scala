package typingsSlinky.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisTickLabelPosition extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisTickLabelPosition")
@js.native
object ChartAxisTickLabelPosition extends js.Object {
  @js.native
  sealed trait high extends ChartAxisTickLabelPosition
  
  @js.native
  sealed trait low extends ChartAxisTickLabelPosition
  
  @js.native
  sealed trait nextToAxis extends ChartAxisTickLabelPosition
  
  @js.native
  sealed trait none extends ChartAxisTickLabelPosition
  
  /* "High" */ val high: typingsSlinky.officeDashJsDashPreview.Excel.ChartAxisTickLabelPosition.high with String = js.native
  /* "Low" */ val low: typingsSlinky.officeDashJsDashPreview.Excel.ChartAxisTickLabelPosition.low with String = js.native
  /* "NextToAxis" */ val nextToAxis: typingsSlinky.officeDashJsDashPreview.Excel.ChartAxisTickLabelPosition.nextToAxis with String = js.native
  /* "None" */ val none: typingsSlinky.officeDashJsDashPreview.Excel.ChartAxisTickLabelPosition.none with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartAxisTickLabelPosition with String] = js.native
}

