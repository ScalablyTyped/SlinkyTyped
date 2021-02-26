package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comments extends StObject {
  
  def Add(Range: Range): Comment = js.native
  def Add(Range: Range, Text: js.Any): Comment = js.native
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): Comment = js.native
  
  val Parent: js.Any = js.native
  
  var ShowBy: String = js.native
  
  @JSName("Word.Comments_typekey")
  var WordDotComments_typekey: Comments = js.native
}
