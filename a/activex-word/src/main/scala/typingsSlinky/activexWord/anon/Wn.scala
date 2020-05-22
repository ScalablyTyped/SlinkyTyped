package typingsSlinky.activexWord.anon

import typingsSlinky.activexWord.Word.Document
import typingsSlinky.activexWord.Word.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Wn extends js.Object {
  val Doc: Document
  val Wn: Window
}

object Wn {
  @scala.inline
  def apply(Doc: Document, Wn: Window): Wn = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], Wn = Wn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wn]
  }
}

