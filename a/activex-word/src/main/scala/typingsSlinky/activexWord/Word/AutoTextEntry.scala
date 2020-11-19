package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoTextEntry extends js.Object {
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val Index: Double = js.native
  
  def Insert(Where: Range): Range = js.native
  def Insert(Where: Range, RichText: js.Any): Range = js.native
  
  var Name: String = js.native
  
  val Parent: js.Any = js.native
  
  val StyleName: String = js.native
  
  var Value: String = js.native
  
  @JSName("Word.AutoTextEntry_typekey")
  var WordDotAutoTextEntry_typekey: AutoTextEntry = js.native
}
