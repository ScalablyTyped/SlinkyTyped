package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.AnonRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "TextChange")
@js.native
object TextChange extends js.Object {
  def applyChange(originalText: String, change: typingsSlinky.grammarkdown.parserMod.TextChange): String = js.native
  def clone(change: typingsSlinky.grammarkdown.parserMod.TextChange): AnonRange = js.native
  def create(text: String, range: typingsSlinky.grammarkdown.coreMod.Range): AnonRange = js.native
  def isUnchanged(change: typingsSlinky.grammarkdown.parserMod.TextChange): Boolean = js.native
}

