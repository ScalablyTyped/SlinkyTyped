package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecentFiles extends js.Object {
  
  def Add(Document: js.Any): RecentFile = js.native
  def Add(Document: js.Any, ReadOnly: js.Any): RecentFile = js.native
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): RecentFile = js.native
  
  var Maximum: Double = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.RecentFiles_typekey")
  var WordDotRecentFiles_typekey: RecentFiles = js.native
}
