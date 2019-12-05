package typingsSlinky.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeLineDashStyle extends js.Object

/**
  *
  * The dash style for a line.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeLineDashStyle")
@js.native
object ShapeLineDashStyle extends js.Object {
  @js.native
  sealed trait dash extends ShapeLineDashStyle
  
  @js.native
  sealed trait dashDot extends ShapeLineDashStyle
  
  @js.native
  sealed trait dashDotDot extends ShapeLineDashStyle
  
  @js.native
  sealed trait longDash extends ShapeLineDashStyle
  
  @js.native
  sealed trait longDashDot extends ShapeLineDashStyle
  
  @js.native
  sealed trait longDashDotDot extends ShapeLineDashStyle
  
  @js.native
  sealed trait roundDot extends ShapeLineDashStyle
  
  @js.native
  sealed trait solid extends ShapeLineDashStyle
  
  @js.native
  sealed trait squareDot extends ShapeLineDashStyle
  
  @js.native
  sealed trait systemDash extends ShapeLineDashStyle
  
  @js.native
  sealed trait systemDashDot extends ShapeLineDashStyle
  
  @js.native
  sealed trait systemDot extends ShapeLineDashStyle
  
  /* "Dash" */ val dash: typingsSlinky.officeDashJs.Excel.ShapeLineDashStyle.dash with String = js.native
  /* "DashDot" */ val dashDot: typingsSlinky.officeDashJs.Excel.ShapeLineDashStyle.dashDot with String = js.native
  /* "DashDotDot" */ val dashDotDot: typingsSlinky.officeDashJs.Excel.ShapeLineDashStyle.dashDotDot with String = js.native
  /* "LongDash" */ val longDash: typingsSlinky.officeDashJs.Excel.ShapeLineDashStyle.longDash with String = js.native
  /* "LongDashDot" */ val longDashDot: typingsSlinky.officeDashJs.Excel.ShapeLineDashStyle.longDashDot with String = js.native
  /* "LongDashDotDot" */ val longDashDotDot: typingsSlinky.officeDashJs.Excel.ShapeLineDashStyle.longDashDotDot with String = js.native
  /* "RoundDot" */ val roundDot: typingsSlinky.officeDashJs.Excel.ShapeLineDashStyle.roundDot with String = js.native
  /* "Solid" */ val solid: typingsSlinky.officeDashJs.Excel.ShapeLineDashStyle.solid with String = js.native
  /* "SquareDot" */ val squareDot: typingsSlinky.officeDashJs.Excel.ShapeLineDashStyle.squareDot with String = js.native
  /* "SystemDash" */ val systemDash: typingsSlinky.officeDashJs.Excel.ShapeLineDashStyle.systemDash with String = js.native
  /* "SystemDashDot" */ val systemDashDot: typingsSlinky.officeDashJs.Excel.ShapeLineDashStyle.systemDashDot with String = js.native
  /* "SystemDot" */ val systemDot: typingsSlinky.officeDashJs.Excel.ShapeLineDashStyle.systemDot with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeLineDashStyle with String] = js.native
}

