package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartTags extends js.Object {
  
  def Add(Name: String): SmartTag = js.native
  def Add(Name: String, Range: js.UndefOr[scala.Nothing], Properties: js.Any): SmartTag = js.native
  def Add(Name: String, Range: js.Any): SmartTag = js.native
  def Add(Name: String, Range: js.Any, Properties: js.Any): SmartTag = js.native
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): SmartTag = js.native
  
  val Parent: js.Any = js.native
  
  def SmartTagsByType(Name: String): SmartTags = js.native
  
  @JSName("Word.SmartTags_typekey")
  var WordDotSmartTags_typekey: SmartTags = js.native
}
