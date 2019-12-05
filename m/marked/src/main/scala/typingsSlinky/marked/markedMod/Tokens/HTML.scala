package typingsSlinky.marked.markedMod.Tokens

import typingsSlinky.marked.markedMod.Token
import typingsSlinky.marked.markedStrings.html
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTML extends Token {
  var pre: Boolean
  var text: String
  var `type`: html
}

object HTML {
  @scala.inline
  def apply(pre: Boolean, text: String, `type`: html): HTML = {
    val __obj = js.Dynamic.literal(pre = pre.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTML]
  }
}

