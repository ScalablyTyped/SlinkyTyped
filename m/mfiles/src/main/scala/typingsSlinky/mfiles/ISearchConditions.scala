package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFSearchFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISearchConditions extends js.Object {
  
  def Add(Index: Double, SearchCondition: ISearchCondition): Unit = js.native
  
  def AppendFromExportedSearchString(ExportedSearchString: String): Unit = js.native
  
  def Clone(): ISearchConditions = js.native
  
  val Count: Double = js.native
  
  def GetAsExportedSearchString(SearchFlags: MFSearchFlags): String = js.native
  
  def Item(Index: Double): ISearchCondition = js.native
  def Item(Index: Double, value: ISearchCondition): Unit = js.native
  
  def Remove(Index: Double): Unit = js.native
}
