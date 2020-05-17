package typingsSlinky.rascal.mod

import typingsSlinky.rascal.anon.Dictkey
import typingsSlinky.rascal.anon.TimeoutNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionAttributes extends js.Object {
  var auth: js.UndefOr[String] = js.native
  var hostname: js.UndefOr[String] = js.native
  var loggableUrl: js.UndefOr[String] = js.native
  var options: js.UndefOr[Dictkey] = js.native
  var password: js.UndefOr[String] = js.native
  var pathname: js.UndefOr[String] = js.native
  var port: js.UndefOr[String | Double] = js.native
  var protocol: js.UndefOr[String] = js.native
  var query: js.UndefOr[String] = js.native
  var slashes: js.UndefOr[Boolean] = js.native
  var socketOptions: js.UndefOr[TimeoutNumber] = js.native
  var url: js.UndefOr[String] = js.native
  var user: js.UndefOr[String] = js.native
  var vhost: js.UndefOr[String] = js.native
}

object ConnectionAttributes {
  @scala.inline
  def apply(): ConnectionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionAttributes]
  }
  @scala.inline
  implicit class ConnectionAttributesOps[Self <: ConnectionAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggableUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggableUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggableUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggableUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: Dictkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPathname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withSlashes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slashes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlashes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slashes")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketOptions(value: TimeoutNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
    @scala.inline
    def withVhost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vhost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVhost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vhost")(js.undefined)
        ret
    }
  }
  
}

