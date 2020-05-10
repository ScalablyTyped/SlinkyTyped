package typingsSlinky.jwplayer.jwplayer

import typingsSlinky.jwplayer.jwplayerStrings.complete
import typingsSlinky.jwplayer.jwplayerStrings.error
import typingsSlinky.jwplayer.jwplayerStrings.loading
import typingsSlinky.jwplayer.jwplayerStrings.stalled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferParam extends js.Object {
  var newstate: String = js.native
  var oldstate: String = js.native
  var reason: loading | complete | stalled | error = js.native
}

object BufferParam {
  @scala.inline
  def apply(newstate: String, oldstate: String, reason: loading | complete | stalled | error): BufferParam = {
    val __obj = js.Dynamic.literal(newstate = newstate.asInstanceOf[js.Any], oldstate = oldstate.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferParam]
  }
  @scala.inline
  implicit class BufferParamOps[Self <: BufferParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewstate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newstate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldstate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldstate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: loading | complete | stalled | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

