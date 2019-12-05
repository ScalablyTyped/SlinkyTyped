package typingsSlinky.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterOn extends js.Object

/**
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.FilterOn")
@js.native
object FilterOn extends js.Object {
  @js.native
  sealed trait bottomItems extends FilterOn
  
  @js.native
  sealed trait bottomPercent extends FilterOn
  
  @js.native
  sealed trait cellColor extends FilterOn
  
  @js.native
  sealed trait custom extends FilterOn
  
  @js.native
  sealed trait dynamic extends FilterOn
  
  @js.native
  sealed trait fontColor extends FilterOn
  
  @js.native
  sealed trait icon extends FilterOn
  
  @js.native
  sealed trait topItems extends FilterOn
  
  @js.native
  sealed trait topPercent extends FilterOn
  
  @js.native
  sealed trait values extends FilterOn
  
  /* "BottomItems" */ val bottomItems: typingsSlinky.officeDashJs.Excel.FilterOn.bottomItems with String = js.native
  /* "BottomPercent" */ val bottomPercent: typingsSlinky.officeDashJs.Excel.FilterOn.bottomPercent with String = js.native
  /* "CellColor" */ val cellColor: typingsSlinky.officeDashJs.Excel.FilterOn.cellColor with String = js.native
  /* "Custom" */ val custom: typingsSlinky.officeDashJs.Excel.FilterOn.custom with String = js.native
  /* "Dynamic" */ val dynamic: typingsSlinky.officeDashJs.Excel.FilterOn.dynamic with String = js.native
  /* "FontColor" */ val fontColor: typingsSlinky.officeDashJs.Excel.FilterOn.fontColor with String = js.native
  /* "Icon" */ val icon: typingsSlinky.officeDashJs.Excel.FilterOn.icon with String = js.native
  /* "TopItems" */ val topItems: typingsSlinky.officeDashJs.Excel.FilterOn.topItems with String = js.native
  /* "TopPercent" */ val topPercent: typingsSlinky.officeDashJs.Excel.FilterOn.topPercent with String = js.native
  /* "Values" */ val values: typingsSlinky.officeDashJs.Excel.FilterOn.values with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterOn with String] = js.native
}

