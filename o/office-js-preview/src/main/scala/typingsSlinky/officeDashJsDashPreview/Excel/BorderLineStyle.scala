package typingsSlinky.officeDashJsDashPreview.Excel

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
  
  /* "Continuous" */ val continuous: typingsSlinky.officeDashJsDashPreview.Excel.BorderLineStyle.continuous with String = js.native
  /* "Dash" */ val dash: typingsSlinky.officeDashJsDashPreview.Excel.BorderLineStyle.dash with String = js.native
  /* "DashDot" */ val dashDot: typingsSlinky.officeDashJsDashPreview.Excel.BorderLineStyle.dashDot with String = js.native
  /* "DashDotDot" */ val dashDotDot: typingsSlinky.officeDashJsDashPreview.Excel.BorderLineStyle.dashDotDot with String = js.native
  /* "Dot" */ val dot: typingsSlinky.officeDashJsDashPreview.Excel.BorderLineStyle.dot with String = js.native
  /* "Double" */ val double: typingsSlinky.officeDashJsDashPreview.Excel.BorderLineStyle.double with String = js.native
  /* "None" */ val none: typingsSlinky.officeDashJsDashPreview.Excel.BorderLineStyle.none with String = js.native
  /* "SlantDashDot" */ val slantDashDot: typingsSlinky.officeDashJsDashPreview.Excel.BorderLineStyle.slantDashDot with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BorderLineStyle with String] = js.native
}

