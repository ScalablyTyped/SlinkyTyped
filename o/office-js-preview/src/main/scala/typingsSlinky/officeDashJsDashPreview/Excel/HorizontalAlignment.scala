package typingsSlinky.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalAlignment extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.HorizontalAlignment")
@js.native
object HorizontalAlignment extends js.Object {
  @js.native
  sealed trait center extends HorizontalAlignment
  
  @js.native
  sealed trait centerAcrossSelection extends HorizontalAlignment
  
  @js.native
  sealed trait distributed extends HorizontalAlignment
  
  @js.native
  sealed trait fill extends HorizontalAlignment
  
  @js.native
  sealed trait general extends HorizontalAlignment
  
  @js.native
  sealed trait justify extends HorizontalAlignment
  
  @js.native
  sealed trait left extends HorizontalAlignment
  
  @js.native
  sealed trait right extends HorizontalAlignment
  
  /* "Center" */ val center: typingsSlinky.officeDashJsDashPreview.Excel.HorizontalAlignment.center with String = js.native
  /* "CenterAcrossSelection" */ val centerAcrossSelection: typingsSlinky.officeDashJsDashPreview.Excel.HorizontalAlignment.centerAcrossSelection with String = js.native
  /* "Distributed" */ val distributed: typingsSlinky.officeDashJsDashPreview.Excel.HorizontalAlignment.distributed with String = js.native
  /* "Fill" */ val fill: typingsSlinky.officeDashJsDashPreview.Excel.HorizontalAlignment.fill with String = js.native
  /* "General" */ val general: typingsSlinky.officeDashJsDashPreview.Excel.HorizontalAlignment.general with String = js.native
  /* "Justify" */ val justify: typingsSlinky.officeDashJsDashPreview.Excel.HorizontalAlignment.justify with String = js.native
  /* "Left" */ val left: typingsSlinky.officeDashJsDashPreview.Excel.HorizontalAlignment.left with String = js.native
  /* "Right" */ val right: typingsSlinky.officeDashJsDashPreview.Excel.HorizontalAlignment.right with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HorizontalAlignment with String] = js.native
}

