package typingsSlinky.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorksheetPositionType extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.WorksheetPositionType")
@js.native
object WorksheetPositionType extends js.Object {
  @js.native
  sealed trait after extends WorksheetPositionType
  
  @js.native
  sealed trait before extends WorksheetPositionType
  
  @js.native
  sealed trait beginning extends WorksheetPositionType
  
  @js.native
  sealed trait end extends WorksheetPositionType
  
  @js.native
  sealed trait none extends WorksheetPositionType
  
  /* "After" */ val after: typingsSlinky.officeDashJsDashPreview.Excel.WorksheetPositionType.after with String = js.native
  /* "Before" */ val before: typingsSlinky.officeDashJsDashPreview.Excel.WorksheetPositionType.before with String = js.native
  /* "Beginning" */ val beginning: typingsSlinky.officeDashJsDashPreview.Excel.WorksheetPositionType.beginning with String = js.native
  /* "End" */ val end: typingsSlinky.officeDashJsDashPreview.Excel.WorksheetPositionType.end with String = js.native
  /* "None" */ val none: typingsSlinky.officeDashJsDashPreview.Excel.WorksheetPositionType.none with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WorksheetPositionType with String] = js.native
}

