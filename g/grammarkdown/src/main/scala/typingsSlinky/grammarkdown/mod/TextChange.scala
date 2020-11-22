package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "TextChange")
@js.native
object TextChange extends js.Object {
  
  def applyChange(originalText: String, change: typingsSlinky.grammarkdown.parserMod.TextChange): String = js.native
  
  def clone(change: typingsSlinky.grammarkdown.parserMod.TextChange): Text = js.native
  
  def create(text: String, range: typingsSlinky.grammarkdown.typesMod.Range): Text = js.native
  
  def isUnchanged(change: typingsSlinky.grammarkdown.parserMod.TextChange): Boolean = js.native
}
