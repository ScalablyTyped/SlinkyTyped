package typingsSlinky.annyang.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandOptionRegex extends js.Object {
  var regexp: js.RegExp = js.native
  def callback(): Unit = js.native
}

object CommandOptionRegex {
  @scala.inline
  def apply(callback: () => Unit, regexp: js.RegExp): CommandOptionRegex = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), regexp = regexp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandOptionRegex]
  }
  @scala.inline
  implicit class CommandOptionRegexOps[Self <: CommandOptionRegex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegexp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

