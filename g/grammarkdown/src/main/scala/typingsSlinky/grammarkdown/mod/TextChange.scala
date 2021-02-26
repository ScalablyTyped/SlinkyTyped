package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextChange {
  
  @JSImport("grammarkdown", "TextChange.applyChange")
  @js.native
  def applyChange(originalText: String, change: typingsSlinky.grammarkdown.parserMod.TextChange): String = js.native
  
  @JSImport("grammarkdown", "TextChange.clone")
  @js.native
  def clone_(change: typingsSlinky.grammarkdown.parserMod.TextChange): Text = js.native
  
  @JSImport("grammarkdown", "TextChange.create")
  @js.native
  def create(text: String, range: typingsSlinky.grammarkdown.typesMod.Range): Text = js.native
  
  @JSImport("grammarkdown", "TextChange.isUnchanged")
  @js.native
  def isUnchanged(change: typingsSlinky.grammarkdown.parserMod.TextChange): Boolean = js.native
}
