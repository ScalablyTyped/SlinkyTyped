package typingsSlinky.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisPosition extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisPosition")
@js.native
object ChartAxisPosition extends js.Object {
  @js.native
  sealed trait automatic extends ChartAxisPosition
  
  @js.native
  sealed trait custom extends ChartAxisPosition
  
  @js.native
  sealed trait maximum extends ChartAxisPosition
  
  @js.native
  sealed trait minimum extends ChartAxisPosition
  
  /* "Automatic" */ val automatic: typingsSlinky.officeDashJsDashPreview.Excel.ChartAxisPosition.automatic with String = js.native
  /* "Custom" */ val custom: typingsSlinky.officeDashJsDashPreview.Excel.ChartAxisPosition.custom with String = js.native
  /* "Maximum" */ val maximum: typingsSlinky.officeDashJsDashPreview.Excel.ChartAxisPosition.maximum with String = js.native
  /* "Minimum" */ val minimum: typingsSlinky.officeDashJsDashPreview.Excel.ChartAxisPosition.minimum with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartAxisPosition with String] = js.native
}

