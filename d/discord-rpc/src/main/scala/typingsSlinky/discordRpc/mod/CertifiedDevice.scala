package typingsSlinky.discordRpc.mod

import typingsSlinky.discordRpc.anon.Name
import typingsSlinky.discordRpc.discordRpcStrings.audioinput
import typingsSlinky.discordRpc.discordRpcStrings.audiooutput
import typingsSlinky.discordRpc.discordRpcStrings.videoinput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertifiedDevice extends js.Object {
  var automaticGainControl: js.UndefOr[Boolean] = js.native
  var echoCancellation: js.UndefOr[Boolean] = js.native
  var hardwareMute: js.UndefOr[Boolean] = js.native
  var model: Name = js.native
  var noiseSuppression: js.UndefOr[Boolean] = js.native
  var related: js.Array[String] = js.native
  var `type`: audioinput | audiooutput | videoinput = js.native
  var uuid: String = js.native
  var vendor: Name = js.native
}

object CertifiedDevice {
  @scala.inline
  def apply(
    model: Name,
    related: js.Array[String],
    `type`: audioinput | audiooutput | videoinput,
    uuid: String,
    vendor: Name
  ): CertifiedDevice = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], related = related.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertifiedDevice]
  }
  @scala.inline
  implicit class CertifiedDeviceOps[Self <: CertifiedDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModel(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelated(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("related")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: audioinput | audiooutput | videoinput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVendor(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomaticGainControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticGainControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticGainControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticGainControl")(js.undefined)
        ret
    }
    @scala.inline
    def withEchoCancellation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echoCancellation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEchoCancellation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echoCancellation")(js.undefined)
        ret
    }
    @scala.inline
    def withHardwareMute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareMute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHardwareMute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareMute")(js.undefined)
        ret
    }
    @scala.inline
    def withNoiseSuppression(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noiseSuppression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoiseSuppression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noiseSuppression")(js.undefined)
        ret
    }
  }
  
}

