package typingsSlinky.grammarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "TextChange")
@js.native
object TextChange extends js.Object {
  def applyChange(originalText: String, change: typingsSlinky.grammarkdown.parserMod.TextChange): String = js.native
  def clone(change: typingsSlinky.grammarkdown.parserMod.TextChange): typingsSlinky.grammarkdown.anon.Range = js.native
  def create(text: String, range: typingsSlinky.grammarkdown.coreMod.Range): typingsSlinky.grammarkdown.anon.Range = js.native
  def isUnchanged(change: typingsSlinky.grammarkdown.parserMod.TextChange): Boolean = js.native
}

