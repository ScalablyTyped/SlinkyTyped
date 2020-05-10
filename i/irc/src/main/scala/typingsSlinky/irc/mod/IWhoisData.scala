package typingsSlinky.irc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWhoisData extends js.Object {
  /** Channels */
  var channels: js.Array[String] = js.native
  /** Hostnamej */
  var host: String = js.native
  /** Nickname */
  var nick: String = js.native
  /** Is this user an operator? */
  var operator: String = js.native
  /** Real name" */
  var realname: String = js.native
  /** Server */
  var server: String = js.native
  /** Server description string */
  var serverinfo: String = js.native
  /** Username */
  var user: String = js.native
}

object IWhoisData {
  @scala.inline
  def apply(
    channels: js.Array[String],
    host: String,
    nick: String,
    operator: String,
    realname: String,
    server: String,
    serverinfo: String,
    user: String
  ): IWhoisData = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], realname = realname.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], serverinfo = serverinfo.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWhoisData]
  }
  @scala.inline
  implicit class IWhoisDataOps[Self <: IWhoisData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNick(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerinfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

