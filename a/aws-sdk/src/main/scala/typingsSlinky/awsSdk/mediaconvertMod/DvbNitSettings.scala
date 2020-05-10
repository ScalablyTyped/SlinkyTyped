package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DvbNitSettings extends js.Object {
  /**
    * The numeric value placed in the Network Information Table (NIT).
    */
  var NetworkId: js.UndefOr[integerMin0Max65535] = js.native
  /**
    * The network name text placed in the network_name_descriptor inside the Network Information Table. Maximum length is 256 characters.
    */
  var NetworkName: js.UndefOr[stringMin1Max256] = js.native
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var NitInterval: js.UndefOr[integerMin25Max10000] = js.native
}

object DvbNitSettings {
  @scala.inline
  def apply(): DvbNitSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DvbNitSettings]
  }
  @scala.inline
  implicit class DvbNitSettingsOps[Self <: DvbNitSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkId(value: integerMin0Max65535): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkId")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkName(value: stringMin1Max256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkName")(js.undefined)
        ret
    }
    @scala.inline
    def withNitInterval(value: integerMin25Max10000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NitInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNitInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NitInterval")(js.undefined)
        ret
    }
  }
  
}

