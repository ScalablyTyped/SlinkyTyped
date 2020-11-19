package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomLabels extends js.Object {
  
  def Add(Name: String): CustomLabel = js.native
  def Add(Name: String, DotMatrix: js.Any): CustomLabel = js.native
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): CustomLabel = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.CustomLabels_typekey")
  var WordDotCustomLabels_typekey: CustomLabels = js.native
}
