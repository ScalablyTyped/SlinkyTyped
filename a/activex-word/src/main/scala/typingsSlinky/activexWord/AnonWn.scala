package typingsSlinky.activexWord

import typingsSlinky.activexWord.Word.Document
import typingsSlinky.activexWord.Word.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWn extends js.Object {
  val Doc: Document
  val Wn: Window
}

object AnonWn {
  @scala.inline
  def apply(Doc: Document, Wn: Window): AnonWn = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], Wn = Wn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonWn]
  }
}

