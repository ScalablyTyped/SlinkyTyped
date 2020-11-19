package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlicerCacheLevels extends js.Object {
  
  def apply(): SlicerCacheLevel = js.native
  def apply(Level: String): SlicerCacheLevel = js.native
  def apply(Level: Double): SlicerCacheLevel = js.native
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(): SlicerCacheLevel = js.native
  def Item(Level: String): SlicerCacheLevel = js.native
  def Item(Level: Double): SlicerCacheLevel = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(): SlicerCacheLevel = js.native
  def _Default(Level: js.Any): SlicerCacheLevel = js.native
}
