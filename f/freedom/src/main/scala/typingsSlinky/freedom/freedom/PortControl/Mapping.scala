package typingsSlinky.freedom.freedom.PortControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mapping extends js.Object {
  var errInfo: js.UndefOr[String] = js.native
  var externalIp: js.UndefOr[String] = js.native
  var externalPort: Double = js.native
  var internalIp: String = js.native
  var internalPort: Double = js.native
  var lifetime: Double = js.native
  var nonce: js.UndefOr[js.Array[Double]] = js.native
  var protocol: String = js.native
  var timeoutId: js.UndefOr[Double] = js.native
}

object Mapping {
  @scala.inline
  def apply(externalPort: Double, internalIp: String, internalPort: Double, lifetime: Double, protocol: String): Mapping = {
    val __obj = js.Dynamic.literal(externalPort = externalPort.asInstanceOf[js.Any], internalIp = internalIp.asInstanceOf[js.Any], internalPort = internalPort.asInstanceOf[js.Any], lifetime = lifetime.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapping]
  }
  @scala.inline
  implicit class MappingOps[Self <: Mapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExternalPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternalIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternalPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLifetime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalIp")(js.undefined)
        ret
    }
    @scala.inline
    def withNonce(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutId")(js.undefined)
        ret
    }
  }
  
}

