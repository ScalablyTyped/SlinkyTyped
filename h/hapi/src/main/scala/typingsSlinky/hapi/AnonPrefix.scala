package typingsSlinky.hapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPrefix extends js.Object {
  /**
    * the route path prefix used by any calls to server.route() from the server. Note that if a prefix is used and the route path is set to '/', the resulting path will not include
    * the trailing slash.
    */
  var prefix: String = js.native
  /** the route virtual host settings used by any calls to server.route() from the server. */
  var vhost: String = js.native
}

object AnonPrefix {
  @scala.inline
  def apply(prefix: String, vhost: String): AnonPrefix = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], vhost = vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrefix]
  }
  @scala.inline
  implicit class AnonPrefixOps[Self <: AnonPrefix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVhost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vhost")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

