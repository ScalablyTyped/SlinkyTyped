package typingsSlinky.chromeApps.chrome.usb

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since Chrome 39. */
@js.native
trait ConfigDescriptor extends js.Object {
  /**
    * Is this the active configuration?
    * @since Chrome 47.
    */
  var active: Boolean = js.native
  /** The configuration number. */
  var configurationValue: integer = js.native
  /** Description of the configuration. */
  var description: js.UndefOr[String] = js.native
  /** Extra descriptor data associated with this configuration. */
  var extra_data: js.typedarray.ArrayBuffer = js.native
  /** Available interfaces. */
  var interfaces: js.Array[InterfaceDescriptor] = js.native
  /** The maximum power needed by this device in milliamps (mA). */
  var maxPower: integer = js.native
  /** The device supports remote wakeup. */
  var remoteWakeup: Boolean = js.native
  /** The device is self-powered. */
  var selfPowered: Boolean = js.native
}

object ConfigDescriptor {
  @scala.inline
  def apply(
    active: Boolean,
    configurationValue: integer,
    extra_data: js.typedarray.ArrayBuffer,
    interfaces: js.Array[InterfaceDescriptor],
    maxPower: integer,
    remoteWakeup: Boolean,
    selfPowered: Boolean
  ): ConfigDescriptor = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], configurationValue = configurationValue.asInstanceOf[js.Any], extra_data = extra_data.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any], maxPower = maxPower.asInstanceOf[js.Any], remoteWakeup = remoteWakeup.asInstanceOf[js.Any], selfPowered = selfPowered.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigDescriptor]
  }
  @scala.inline
  implicit class ConfigDescriptorOps[Self <: ConfigDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigurationValue(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtra_data(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterfaces(value: js.Array[InterfaceDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxPower(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteWakeup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteWakeup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelfPowered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfPowered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
  }
  
}

