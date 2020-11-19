package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CubeFields extends js.Object {
  
  def apply(Index: String): CubeField = js.native
  def apply(Index: Double): CubeField = js.native
  
  def AddSet(Name: String, Caption: String): CubeField = js.native
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): CubeField = js.native
  def Item(Index: Double): CubeField = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: js.Any): CubeField = js.native
}
