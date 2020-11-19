package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLNodes extends js.Object {
  
  def Add(Name: String, Namespace: String): XMLNode = js.native
  def Add(Name: String, Namespace: String, Range: js.Any): XMLNode = js.native
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): XMLNode = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.XMLNodes_typekey")
  var WordDotXMLNodes_typekey: XMLNodes = js.native
}
