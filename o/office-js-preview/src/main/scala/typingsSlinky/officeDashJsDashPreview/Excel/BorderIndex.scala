package typingsSlinky.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BorderIndex extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.BorderIndex")
@js.native
object BorderIndex extends js.Object {
  @js.native
  sealed trait diagonalDown extends BorderIndex
  
  @js.native
  sealed trait diagonalUp extends BorderIndex
  
  @js.native
  sealed trait edgeBottom extends BorderIndex
  
  @js.native
  sealed trait edgeLeft extends BorderIndex
  
  @js.native
  sealed trait edgeRight extends BorderIndex
  
  @js.native
  sealed trait edgeTop extends BorderIndex
  
  @js.native
  sealed trait insideHorizontal extends BorderIndex
  
  @js.native
  sealed trait insideVertical extends BorderIndex
  
  /* "DiagonalDown" */ val diagonalDown: typingsSlinky.officeDashJsDashPreview.Excel.BorderIndex.diagonalDown with String = js.native
  /* "DiagonalUp" */ val diagonalUp: typingsSlinky.officeDashJsDashPreview.Excel.BorderIndex.diagonalUp with String = js.native
  /* "EdgeBottom" */ val edgeBottom: typingsSlinky.officeDashJsDashPreview.Excel.BorderIndex.edgeBottom with String = js.native
  /* "EdgeLeft" */ val edgeLeft: typingsSlinky.officeDashJsDashPreview.Excel.BorderIndex.edgeLeft with String = js.native
  /* "EdgeRight" */ val edgeRight: typingsSlinky.officeDashJsDashPreview.Excel.BorderIndex.edgeRight with String = js.native
  /* "EdgeTop" */ val edgeTop: typingsSlinky.officeDashJsDashPreview.Excel.BorderIndex.edgeTop with String = js.native
  /* "InsideHorizontal" */ val insideHorizontal: typingsSlinky.officeDashJsDashPreview.Excel.BorderIndex.insideHorizontal with String = js.native
  /* "InsideVertical" */ val insideVertical: typingsSlinky.officeDashJsDashPreview.Excel.BorderIndex.insideVertical with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BorderIndex with String] = js.native
}

