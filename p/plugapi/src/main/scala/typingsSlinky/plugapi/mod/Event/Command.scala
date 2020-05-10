package typingsSlinky.plugapi.mod.Event

import typingsSlinky.plugapi.mod.RawChatMessage
import typingsSlinky.plugapi.mod.User.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command extends Chat {
  var args: js.Array[String] = js.native
  var command: String = js.native
  def havePermission(args: js.Any*): Boolean = js.native
  def isFrom(args: js.Any*): Boolean = js.native
  def respond(args: js.Any*): js.Any = js.native
  def respondTimeout(args: js.Any*): js.Any = js.native
}

object Command {
  @scala.inline
  def apply(
    args: js.Array[String],
    command: String,
    from: User,
    havePermission: /* repeated */ js.Any => Boolean,
    id: String,
    isFrom: /* repeated */ js.Any => Boolean,
    mentions: js.Array[_],
    message: String,
    muted: Boolean,
    raw: RawChatMessage,
    respond: /* repeated */ js.Any => js.Any,
    respondTimeout: /* repeated */ js.Any => js.Any,
    `type`: String
  ): Command = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], havePermission = js.Any.fromFunction1(havePermission), id = id.asInstanceOf[js.Any], isFrom = js.Any.fromFunction1(isFrom), mentions = mentions.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], respond = js.Any.fromFunction1(respond), respondTimeout = js.Any.fromFunction1(respondTimeout))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  implicit class CommandOps[Self <: Command] (val x: Self) extends AnyVal {
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
    def withHavePermission(value: /* repeated */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("havePermission")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsFrom(value: /* repeated */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFrom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRespond(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respond")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRespondTimeout(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respondTimeout")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

