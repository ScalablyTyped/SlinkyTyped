package typingsSlinky.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BorderLineStyle extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.BorderLineStyle")
@js.native
object BorderLineStyle extends js.Object {
  @js.native
  sealed trait continuous extends BorderLineStyle
  
  @js.native
  sealed trait dash extends BorderLineStyle
  
  @js.native
  sealed trait dashDot extends BorderLineStyle
  
  @js.native
  sealed trait dashDotDot extends BorderLineStyle
  
  @js.native
  sealed trait dot extends BorderLineStyle
  
  @js.native
  sealed trait double extends BorderLineStyle
  
  @js.native
  sealed trait none extends BorderLineStyle
  
  @js.native
  sealed trait slantDashDot extends BorderLineStyle
  
  /* "Continuous" */ val continuous: typingsSlinky.officeDashJs.Excel.BorderLineStyle.continuous with String = js.native
  /* "Dash" */ val dash: typingsSlinky.officeDashJs.Excel.BorderLineStyle.dash with String = js.native
  /* "DashDot" */ val dashDot: typingsSlinky.officeDashJs.Excel.BorderLineStyle.dashDot with String = js.native
  /* "DashDotDot" */ val dashDotDot: typingsSlinky.officeDashJs.Excel.BorderLineStyle.dashDotDot with String = js.native
  /* "Dot" */ val dot: typingsSlinky.officeDashJs.Excel.BorderLineStyle.dot with String = js.native
  /* "Double" */ val double: typingsSlinky.officeDashJs.Excel.BorderLineStyle.double with String = js.native
  /* "None" */ val none: typingsSlinky.officeDashJs.Excel.BorderLineStyle.none with String = js.native
  /* "SlantDashDot" */ val slantDashDot: typingsSlinky.officeDashJs.Excel.BorderLineStyle.slantDashDot with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BorderLineStyle with String] = js.native
}

