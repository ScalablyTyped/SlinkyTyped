package typingsSlinky.grammarkdown.parserMod

import typingsSlinky.grammarkdown.AnonRange
import typingsSlinky.grammarkdown.coreMod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextChange extends js.Object {
  var range: Range = js.native
  var text: String = js.native
}

@JSImport("grammarkdown/dist/parser", "TextChange")
@js.native
object TextChange extends js.Object {
  def applyChange(originalText: String, change: TextChange): String = js.native
  def clone(change: TextChange): AnonRange = js.native
  def create(text: String, range: Range): AnonRange = js.native
  def isUnchanged(change: TextChange): Boolean = js.native
}

