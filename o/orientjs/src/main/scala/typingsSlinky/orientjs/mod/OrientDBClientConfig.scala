package typingsSlinky.orientjs.mod

import typingsSlinky.orientjs.AnonMax
import typingsSlinky.orientjs.AnonMaxNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrientDBClientConfig extends js.Object {
  var host: js.UndefOr[String] = js.native
  var logger: js.UndefOr[js.Any] = js.native
  var pool: js.UndefOr[AnonMax] = js.native
  var port: js.UndefOr[Double] = js.native
  var servers: js.UndefOr[js.Array[OServerConfig]] = js.native
  var subscribePool: js.UndefOr[AnonMaxNumber] = js.native
}

object OrientDBClientConfig {
  @scala.inline
  def apply(): OrientDBClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrientDBClientConfig]
  }
  @scala.inline
  implicit class OrientDBClientConfigOps[Self <: OrientDBClientConfig] (val x: Self) extends AnyVal {
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
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withPool(value: AnonMax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(js.undefined)
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
    def withServers(value: js.Array[OServerConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servers")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscribePool(value: AnonMaxNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribePool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscribePool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribePool")(js.undefined)
        ret
    }
  }
  
}

