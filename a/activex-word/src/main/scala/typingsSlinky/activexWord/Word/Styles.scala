package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Styles extends js.Object {
  
  def Add(Name: String): Style = js.native
  def Add(Name: String, Type: js.Any): Style = js.native
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): Style = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.Styles_typekey")
  var WordDotStyles_typekey: Styles = js.native
}
