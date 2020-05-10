package typingsSlinky.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHostname extends js.Object {
  var hostname: String = js.native
  var management: AnonOptions = js.native
  var options: AnonChannelMax = js.native
  var password: String = js.native
  var port: String = js.native
  var protocol: String = js.native
  var retry: AnonFactor = js.native
  var slashes: Boolean = js.native
  var socketOptions: AnonTimeout = js.native
  var user: String = js.native
}

object AnonHostname {
  @scala.inline
  def apply(
    hostname: String,
    management: AnonOptions,
    options: AnonChannelMax,
    password: String,
    port: String,
    protocol: String,
    retry: AnonFactor,
    slashes: Boolean,
    socketOptions: AnonTimeout,
    user: String
  ): AnonHostname = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], management = management.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any], socketOptions = socketOptions.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHostname]
  }
  @scala.inline
  implicit class AnonHostnameOps[Self <: AnonHostname] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManagement(value: AnonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("management")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: AnonChannelMax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetry(value: AnonFactor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlashes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slashes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSocketOptions(value: AnonTimeout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketOptions")(value.asInstanceOf[js.Any])
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

