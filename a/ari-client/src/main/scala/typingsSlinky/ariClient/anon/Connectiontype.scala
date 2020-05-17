package typingsSlinky.ariClient.anon

import typingsSlinky.ariClient.mod.Containers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connectiontype extends js.Object {
  var app: String = js.native
  var channelId: js.UndefOr[String] = js.native
  var connection_type: js.UndefOr[String] = js.native
  var direction: js.UndefOr[String] = js.native
  var encapsulation: js.UndefOr[String] = js.native
  var external_host: String = js.native
  var format: String = js.native
  var transport: js.UndefOr[String] = js.native
  var variables: js.UndefOr[Containers] = js.native
}

object Connectiontype {
  @scala.inline
  def apply(app: String, external_host: String, format: String): Connectiontype = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], external_host = external_host.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connectiontype]
  }
  @scala.inline
  implicit class ConnectiontypeOps[Self <: Connectiontype] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternal_host(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_type")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withEncapsulation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encapsulation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncapsulation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encapsulation")(js.undefined)
        ret
    }
    @scala.inline
    def withTransport(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(js.undefined)
        ret
    }
    @scala.inline
    def withVariables(value: Containers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

