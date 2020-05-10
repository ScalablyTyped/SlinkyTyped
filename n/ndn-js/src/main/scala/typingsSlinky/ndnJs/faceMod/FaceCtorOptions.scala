package typingsSlinky.ndnJs.faceMod

import typingsSlinky.ndnJs.transportMod.Transport
import typingsSlinky.ndnJs.transportMod.TransportConnectionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaceCtorOptions extends js.Object {
  var connectionInfo: js.UndefOr[TransportConnectionInfo | Null] = js.native
  var getConnectionInfo: js.UndefOr[js.Function0[TransportConnectionInfo]] = js.native
  var getTransport: js.UndefOr[js.Function0[Transport]] = js.native
  var host: js.UndefOr[String | Null] = js.native
  var port: js.UndefOr[Double | Null] = js.native
}

object FaceCtorOptions {
  @scala.inline
  def apply(): FaceCtorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceCtorOptions]
  }
  @scala.inline
  implicit class FaceCtorOptionsOps[Self <: FaceCtorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionInfo(value: TransportConnectionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionInfoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionInfo")(null)
        ret
    }
    @scala.inline
    def withGetConnectionInfo(value: () => TransportConnectionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConnectionInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetConnectionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConnectionInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTransport(value: () => Transport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTransport")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTransport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTransport")(js.undefined)
        ret
    }
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
    def withHostNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(null)
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
    def withPortNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(null)
        ret
    }
  }
  
}

