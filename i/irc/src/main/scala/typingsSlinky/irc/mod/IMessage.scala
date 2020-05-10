package typingsSlinky.irc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMessage extends js.Object {
  /** Command arguments */
  var args: js.Array[String] = js.native
  /** Mapped IRC command */
  var command: String = js.native
  /** Command type */
  var commandType: CommandType = js.native
  /** Prefix */
  var prefix: js.UndefOr[String] = js.native
  /** Raw IRC command */
  var rawCommand: String = js.native
}

object IMessage {
  @scala.inline
  def apply(args: js.Array[String], command: String, commandType: CommandType, rawCommand: String): IMessage = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], commandType = commandType.asInstanceOf[js.Any], rawCommand = rawCommand.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage]
  }
  @scala.inline
  implicit class IMessageOps[Self <: IMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommandType(value: CommandType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
  }
  
}

