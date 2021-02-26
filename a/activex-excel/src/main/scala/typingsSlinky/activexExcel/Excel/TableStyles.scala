package typingsSlinky.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableStyles extends StObject {
  
  def apply(Index: String): TableStyle = js.native
  def apply(Index: Double): TableStyle = js.native
  
  def Add(TableStyleName: String): TableStyle = js.native
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): TableStyle = js.native
  def Item(Index: Double): TableStyle = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: js.Any): TableStyle = js.native
}
