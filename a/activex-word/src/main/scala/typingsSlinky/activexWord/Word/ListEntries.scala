package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEntries extends js.Object {
  
  def Add(Name: String): ListEntry = js.native
  def Add(Name: String, Index: js.Any): ListEntry = js.native
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  def Clear(): Unit = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): ListEntry = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.ListEntries_typekey")
  var WordDotListEntries_typekey: ListEntries = js.native
}
