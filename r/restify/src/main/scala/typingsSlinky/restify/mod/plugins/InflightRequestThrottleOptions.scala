package typingsSlinky.restify.mod.plugins

import typingsSlinky.restify.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InflightRequestThrottleOptions extends js.Object {
  var err: js.Any = js.native
  var limit: Double = js.native
  var server: Server = js.native
}

object InflightRequestThrottleOptions {
  @scala.inline
  def apply(err: js.Any, limit: Double, server: Server): InflightRequestThrottleOptions = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[InflightRequestThrottleOptions]
  }
  @scala.inline
  implicit class InflightRequestThrottleOptionsOps[Self <: InflightRequestThrottleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErr(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServer(value: Server): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

