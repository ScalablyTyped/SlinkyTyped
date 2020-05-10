package typingsSlinky.amqplib.propertiesMod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connect extends js.Object {
  /**
    * The size in bytes of the maximum frame allowed over the connection. 0 means
    * no limit (but since frames have a size field which is an unsigned 32 bit integer, it’s perforce 2^32 - 1).
    *
    * Default value: 0x1000 (4kb) - That's the allowed minimum, it will fit many purposes
    */
  var frameMax: js.UndefOr[Double] = js.native
  /**
    * The period of the connection heartbeat in seconds.
    *
    * Default value: 0
    */
  var heartbeat: js.UndefOr[Double] = js.native
  /**
    * Hostname used for connecting to the server.
    *
    * Default value: 'localhost'
    */
  var hostname: js.UndefOr[String] = js.native
  /**
    * The desired locale for error messages. RabbitMQ only ever uses en_US
    *
    * Default value: 'en_US'
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * Password used for authenticating against the server.
    *
    * Default value: 'guest'
    */
  var password: js.UndefOr[String] = js.native
  /**
    * Port used for connecting to the server.
    *
    * Default value: 5672
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * The to be used protocol
    *
    * Default value: 'amqp'
    */
  var protocol: js.UndefOr[String] = js.native
  /**
    * Username used for authenticating against the server.
    *
    * Default value: 'guest'
    */
  var username: js.UndefOr[String] = js.native
  /**
    * What VHost shall be used.
    *
    * Default value: '/'
    */
  var vhost: js.UndefOr[String] = js.native
}

object Connect {
  @scala.inline
  def apply(): Connect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connect]
  }
  @scala.inline
  implicit class ConnectOps[Self <: Connect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrameMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameMax")(js.undefined)
        ret
    }
    @scala.inline
    def withHeartbeat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartbeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeat")(js.undefined)
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
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
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
    def withPort(value: Double): Self = {
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
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
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

