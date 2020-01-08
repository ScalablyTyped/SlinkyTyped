package typingsSlinky.activexDashWord

import typingsSlinky.activexDashWord.Word.Application
import typingsSlinky.activexDashWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  @JSName("Word.Application")
  var WordDotApplication: Application
  @JSName("Word.Document")
  var WordDotDocument: Document
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(WordDotApplication: Application, WordDotDocument: Document): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Word.Application")(WordDotApplication.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Document")(WordDotDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

