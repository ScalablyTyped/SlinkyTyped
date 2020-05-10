package typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.Context

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDevice extends js.Object {
  /**
    * A device unique ID.
    */
  var id: String = js.native
  /**
    * The IP address.
    */
  var ip: String = js.native
  /**
    * The device language.
    */
  var language: String = js.native
  /**
    * The current display language of the operating system.
    */
  var locale: String = js.native
  /**
    * The device model for the current device.
    */
  var model: String = js.native
  /**
    * The IANA interface type for the internet connected network adapter.
    */
  var network: Double = js.native
  /**
    * The device OEM for the current device.
    */
  var oemName: String = js.native
  /**
    * The OS name.
    */
  var os: String = js.native
  /**
    * The OS version.
    */
  var osversion: String = js.native
  /**
    * The application screen resolution.
    */
  var resolution: String = js.native
  /**
    * The type for the current device.
    */
  var `type`: String = js.native
}

object IDevice {
  @scala.inline
  def apply(
    id: String,
    ip: String,
    language: String,
    locale: String,
    model: String,
    network: Double,
    oemName: String,
    os: String,
    osversion: String,
    resolution: String,
    `type`: String
  ): IDevice = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], oemName = oemName.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], osversion = osversion.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDevice]
  }
  @scala.inline
  implicit class IDeviceOps[Self <: IDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetwork(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOemName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oemName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOsversion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osversion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolution(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

