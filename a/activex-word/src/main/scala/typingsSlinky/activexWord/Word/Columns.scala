package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Columns extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var Borders: typingsSlinky.activexWord.Word.Borders = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val First: Column = js.native
  val Last: Column = js.native
  val NestingLevel: Double = js.native
  val Parent: js.Any = js.native
  var PreferredWidth: Double = js.native
  var PreferredWidthType: WdPreferredWidthType = js.native
  val Shading: typingsSlinky.activexWord.Word.Shading = js.native
  var Width: Double = js.native
  @JSName("Word.Columns_typekey")
  var WordDotColumns_typekey: Columns = js.native
  def Add(): Column = js.native
  def Add(BeforeColumn: js.Any): Column = js.native
  def AutoFit(): Unit = js.native
  def Delete(): Unit = js.native
  def DistributeWidth(): Unit = js.native
  def Item(Index: Double): Column = js.native
  def Select(): Unit = js.native
  def SetWidth(ColumnWidth: Double, RulerStyle: WdRulerStyle): Unit = js.native
}

