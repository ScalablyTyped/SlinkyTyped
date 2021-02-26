package typingsSlinky.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddIns extends StObject {
  
  def apply(Index: String): AddIn = js.native
  def apply(Index: Double): AddIn = js.native
  
  def Add(Filename: String): AddIn = js.native
  def Add(Filename: String, CopyFile: Boolean): AddIn = js.native
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): AddIn = js.native
  def Item(Index: Double): AddIn = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: String): AddIn = js.native
  def _Default(Index: Double): AddIn = js.native
}
