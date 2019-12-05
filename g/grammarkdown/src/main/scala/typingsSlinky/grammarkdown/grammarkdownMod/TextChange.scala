package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.Anon_Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "TextChange")
@js.native
object TextChange extends js.Object {
  def applyChange(originalText: String, change: typingsSlinky.grammarkdown.distParserMod.TextChange): String = js.native
  def clone(change: typingsSlinky.grammarkdown.distParserMod.TextChange): Anon_Range = js.native
  def create(text: String, range: typingsSlinky.grammarkdown.distCoreMod.Range): Anon_Range = js.native
  def isUnchanged(change: typingsSlinky.grammarkdown.distParserMod.TextChange): Boolean = js.native
}

