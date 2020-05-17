package typingsSlinky.amplitudeJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Carrier extends js.Object {
  var carrier: js.UndefOr[Boolean] = js.native
  var city: js.UndefOr[Boolean] = js.native
  var country: js.UndefOr[Boolean] = js.native
  var device_manufacturer: js.UndefOr[Boolean] = js.native
  var device_model: js.UndefOr[Boolean] = js.native
  var dma: js.UndefOr[Boolean] = js.native
  var ip_address: js.UndefOr[Boolean] = js.native
  var language: js.UndefOr[Boolean] = js.native
  var os_name: js.UndefOr[Boolean] = js.native
  var os_version: js.UndefOr[Boolean] = js.native
  var platform: js.UndefOr[Boolean] = js.native
  var region: js.UndefOr[Boolean] = js.native
  var version_name: js.UndefOr[Boolean] = js.native
}

object Carrier {
  @scala.inline
  def apply(): Carrier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Carrier]
  }
  @scala.inline
  implicit class CarrierOps[Self <: Carrier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCarrier(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarrier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrier")(js.undefined)
        ret
    }
    @scala.inline
    def withCity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withDevice_manufacturer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device_manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice_manufacturer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device_manufacturer")(js.undefined)
        ret
    }
    @scala.inline
    def withDevice_model(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device_model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice_model: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device_model")(js.undefined)
        ret
    }
    @scala.inline
    def withDma(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDma: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dma")(js.undefined)
        ret
    }
    @scala.inline
    def withIp_address(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp_address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip_address")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withOs_name(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOs_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os_name")(js.undefined)
        ret
    }
    @scala.inline
    def withOs_version(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOs_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os_version")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion_name(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version_name")(js.undefined)
        ret
    }
  }
  
}

