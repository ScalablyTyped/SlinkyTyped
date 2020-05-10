package typingsSlinky.ipAddress.mod

import typingsSlinky.ipAddress.AnonGroupIndividual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeredoProperties extends js.Object {
  var client4: Address4 = js.native
  var coneNat: Boolean = js.native
  var flags: String = js.native
  var microsoft: AnonGroupIndividual = js.native
  var prefix: String = js.native
  var server4: Address4 = js.native
  var udpPort: String = js.native
}

object TeredoProperties {
  @scala.inline
  def apply(
    client4: Address4,
    coneNat: Boolean,
    flags: String,
    microsoft: AnonGroupIndividual,
    prefix: String,
    server4: Address4,
    udpPort: String
  ): TeredoProperties = {
    val __obj = js.Dynamic.literal(client4 = client4.asInstanceOf[js.Any], coneNat = coneNat.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], microsoft = microsoft.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], server4 = server4.asInstanceOf[js.Any], udpPort = udpPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeredoProperties]
  }
  @scala.inline
  implicit class TeredoPropertiesOps[Self <: TeredoProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient4(value: Address4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConeNat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coneNat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMicrosoft(value: AnonGroupIndividual): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsoft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServer4(value: Address4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUdpPort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("udpPort")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

