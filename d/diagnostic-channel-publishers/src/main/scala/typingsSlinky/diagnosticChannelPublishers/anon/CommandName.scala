package typingsSlinky.diagnosticChannelPublishers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandName extends js.Object {
  var commandName: js.UndefOr[String] = js.native
  var duration: js.UndefOr[Double] = js.native
  var failure: js.UndefOr[String] = js.native
  var reply: js.UndefOr[js.Any] = js.native
}

object CommandName {
  @scala.inline
  def apply(): CommandName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandName]
  }
  @scala.inline
  implicit class CommandNameOps[Self <: CommandName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommandName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommandName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandName")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withFailure(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(js.undefined)
        ret
    }
    @scala.inline
    def withReply(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reply")(js.undefined)
        ret
    }
  }
  
}

