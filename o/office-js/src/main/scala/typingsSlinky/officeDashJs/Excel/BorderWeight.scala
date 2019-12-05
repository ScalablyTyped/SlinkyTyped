package typingsSlinky.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BorderWeight extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.BorderWeight")
@js.native
object BorderWeight extends js.Object {
  @js.native
  sealed trait hairline extends BorderWeight
  
  @js.native
  sealed trait medium extends BorderWeight
  
  @js.native
  sealed trait thick extends BorderWeight
  
  @js.native
  sealed trait thin extends BorderWeight
  
  /* "Hairline" */ val hairline: typingsSlinky.officeDashJs.Excel.BorderWeight.hairline with String = js.native
  /* "Medium" */ val medium: typingsSlinky.officeDashJs.Excel.BorderWeight.medium with String = js.native
  /* "Thick" */ val thick: typingsSlinky.officeDashJs.Excel.BorderWeight.thick with String = js.native
  /* "Thin" */ val thin: typingsSlinky.officeDashJs.Excel.BorderWeight.thin with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BorderWeight with String] = js.native
}

