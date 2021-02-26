package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cells extends StObject {
  
  def Add(): Cell = js.native
  def Add(BeforeCell: js.Any): Cell = js.native
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  def AutoFit(): Unit = js.native
  
  var Borders: typingsSlinky.activexWord.Word.Borders = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  def Delete(ShiftCells: js.Any): Unit = js.native
  
  def DistributeHeight(): Unit = js.native
  
  def DistributeWidth(): Unit = js.native
  
  var Height: Double = js.native
  
  var HeightRule: WdRowHeightRule = js.native
  
  def Item(Index: Double): Cell = js.native
  
  def Merge(): Unit = js.native
  
  val NestingLevel: Double = js.native
  
  val Parent: js.Any = js.native
  
  var PreferredWidth: Double = js.native
  
  var PreferredWidthType: WdPreferredWidthType = js.native
  
  def SetHeight(RowHeight: js.Any, HeightRule: WdRowHeightRule): Unit = js.native
  
  def SetWidth(ColumnWidth: Double, RulerStyle: WdRulerStyle): Unit = js.native
  
  val Shading: typingsSlinky.activexWord.Word.Shading = js.native
  
  def Split(): Unit = js.native
  def Split(
    NumRows: js.UndefOr[scala.Nothing],
    NumColumns: js.UndefOr[scala.Nothing],
    MergeBeforeSplit: js.Any
  ): Unit = js.native
  def Split(NumRows: js.UndefOr[scala.Nothing], NumColumns: js.Any): Unit = js.native
  def Split(NumRows: js.UndefOr[scala.Nothing], NumColumns: js.Any, MergeBeforeSplit: js.Any): Unit = js.native
  def Split(NumRows: js.Any): Unit = js.native
  def Split(NumRows: js.Any, NumColumns: js.UndefOr[scala.Nothing], MergeBeforeSplit: js.Any): Unit = js.native
  def Split(NumRows: js.Any, NumColumns: js.Any): Unit = js.native
  def Split(NumRows: js.Any, NumColumns: js.Any, MergeBeforeSplit: js.Any): Unit = js.native
  
  var VerticalAlignment: WdCellVerticalAlignment = js.native
  
  var Width: Double = js.native
  
  @JSName("Word.Cells_typekey")
  var WordDotCells_typekey: Cells = js.native
}
