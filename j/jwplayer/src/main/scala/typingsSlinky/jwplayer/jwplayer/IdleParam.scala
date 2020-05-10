package typingsSlinky.jwplayer.jwplayer

import typingsSlinky.jwplayer.jwplayerStrings.buffering
import typingsSlinky.jwplayer.jwplayerStrings.paused
import typingsSlinky.jwplayer.jwplayerStrings.playing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdleParam extends js.Object {
  var oldstate: buffering | playing | paused = js.native
}

object IdleParam {
  @scala.inline
  def apply(oldstate: buffering | playing | paused): IdleParam = {
    val __obj = js.Dynamic.literal(oldstate = oldstate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleParam]
  }
  @scala.inline
  implicit class IdleParamOps[Self <: IdleParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOldstate(value: buffering | playing | paused): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldstate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

