package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Variables extends js.Object {
  
  def Add(Name: String): Variable = js.native
  def Add(Name: String, Value: js.Any): Variable = js.native
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: String): Variable = js.native
  def Item(Index: Double): Variable = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.Variables_typekey")
  var WordDotVariables_typekey: Variables = js.native
}
