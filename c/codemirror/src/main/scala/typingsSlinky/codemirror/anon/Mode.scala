package typingsSlinky.codemirror.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mode extends js.Object {
  var mode: typingsSlinky.codemirror.mod.Mode[_]
  var state: js.Any
}

object Mode {
  @scala.inline
  def apply(mode: typingsSlinky.codemirror.mod.Mode[_], state: js.Any): Mode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
}

