package typingsSlinky.raven.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait parsedDSN extends js.Object {
  var host: String = js.native
  var path: String = js.native
  var port: Double = js.native
  var private_key: String = js.native
  var project_id: String = js.native
  var protocol: String = js.native
  var public_key: String = js.native
}

object parsedDSN {
  @scala.inline
  def apply(
    host: String,
    path: String,
    port: Double,
    private_key: String,
    project_id: String,
    protocol: String,
    public_key: String
  ): parsedDSN = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], private_key = private_key.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], public_key = public_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[parsedDSN]
  }
  @scala.inline
  implicit class parsedDSNOps[Self <: parsedDSN] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivate_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublic_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public_key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

