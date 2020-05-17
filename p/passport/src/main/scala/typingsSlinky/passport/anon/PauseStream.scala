package typingsSlinky.passport.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PauseStream extends js.Object {
  var pauseStream: Boolean = js.native
}

object PauseStream {
  @scala.inline
  def apply(pauseStream: Boolean): PauseStream = {
    val __obj = js.Dynamic.literal(pauseStream = pauseStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[PauseStream]
  }
  @scala.inline
  implicit class PauseStreamOps[Self <: PauseStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPauseStream(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseStream")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

