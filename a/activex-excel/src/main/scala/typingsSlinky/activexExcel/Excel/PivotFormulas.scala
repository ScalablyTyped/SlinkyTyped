package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotFormulas extends js.Object {
  
  def apply(Index: String): PivotFormula = js.native
  def apply(Index: Double): PivotFormula = js.native
  
  def Add(Formula: String): PivotFormula = js.native
  def Add(Formula: String, UseStandardFormula: js.Any): PivotFormula = js.native
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): PivotFormula = js.native
  def Item(Index: Double): PivotFormula = js.native
  
  val Parent: js.Any = js.native
  
  def _Add(Formula: String): PivotFormula = js.native
  
  def _Default(Index: js.Any): PivotFormula = js.native
}
