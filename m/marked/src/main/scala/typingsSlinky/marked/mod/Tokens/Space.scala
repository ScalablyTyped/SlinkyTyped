package typingsSlinky.marked.mod.Tokens

import typingsSlinky.marked.markedStrings.space
import typingsSlinky.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Space extends Token {
  var `type`: space
}

object Space {
  @scala.inline
  def apply(`type`: space): Space = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Space]
  }
}

