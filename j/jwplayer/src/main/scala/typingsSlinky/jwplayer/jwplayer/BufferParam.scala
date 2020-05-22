package typingsSlinky.jwplayer.jwplayer

import typingsSlinky.jwplayer.jwplayerStrings.complete
import typingsSlinky.jwplayer.jwplayerStrings.error
import typingsSlinky.jwplayer.jwplayerStrings.loading
import typingsSlinky.jwplayer.jwplayerStrings.stalled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferParam extends js.Object {
  var newstate: String
  var oldstate: String
  var reason: loading | complete | stalled | error
}

object BufferParam {
  @scala.inline
  def apply(newstate: String, oldstate: String, reason: loading | complete | stalled | error): BufferParam = {
    val __obj = js.Dynamic.literal(newstate = newstate.asInstanceOf[js.Any], oldstate = oldstate.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferParam]
  }
}

