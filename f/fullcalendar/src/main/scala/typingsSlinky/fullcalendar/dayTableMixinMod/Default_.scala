package typingsSlinky.fullcalendar.dayTableMixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/DayTableMixin", "Default")
@js.native
class Default_ ()
  extends typingsSlinky.fullcalendar.mixinMod.default
     with DayTableInterface {
  var breakOnWeeks: Boolean = js.native
  var colHeadFormat: js.Any = js.native
  var dayIndices: js.Any = js.native
  def computeColCnt(): js.Any = js.native
  def computeColHeadFormat(): js.Any = js.native
  def getCellDayIndex(row: js.Any, col: js.Any): js.Any = js.native
  def getColDayIndex(col: js.Any): js.Any = js.native
  def getDateDayIndex(date: js.Any): js.Any = js.native
  def renderBgCellHtml(date: js.Any, otherAttrs: js.Any): String = js.native
  def renderBgCellsHtml(row: js.Any): String = js.native
  def renderBgIntroHtml(row: js.Any): Unit = js.native
  def renderHeadDateCellHtml(date: js.Any, colspan: js.Any, otherAttrs: js.Any): String = js.native
  def renderHeadDateCellsHtml(): String = js.native
  def renderHeadIntroHtml(): Unit = js.native
  def renderHeadTrHtml(): String = js.native
  def updateDayTableCols(): Unit = js.native
}

