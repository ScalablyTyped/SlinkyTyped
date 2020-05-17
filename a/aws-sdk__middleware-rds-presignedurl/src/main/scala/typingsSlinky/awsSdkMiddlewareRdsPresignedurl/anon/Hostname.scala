package typingsSlinky.awsSdkMiddlewareRdsPresignedurl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hostname extends js.Object {
  var hostname: String = js.native
  var path: String = js.native
  var protocol: String = js.native
}

object Hostname {
  @scala.inline
  def apply(hostname: String, path: String, protocol: String): Hostname = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hostname]
  }
  @scala.inline
  implicit class HostnameOps[Self <: Hostname] (val x: Self) extends AnyVal {
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
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

