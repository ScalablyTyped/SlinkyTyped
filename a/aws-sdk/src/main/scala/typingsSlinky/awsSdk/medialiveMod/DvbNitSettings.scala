package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DvbNitSettings extends js.Object {
  /**
    * The numeric value placed in the Network Information Table (NIT).
    */
  var NetworkId: integerMin0Max65536 = js.native
  /**
    * The network name text placed in the networkNameDescriptor inside the Network Information Table. Maximum length is 256 characters.
    */
  var NetworkName: stringMin1Max256 = js.native
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var RepInterval: js.UndefOr[integerMin25Max10000] = js.native
}

object DvbNitSettings {
  @scala.inline
  def apply(NetworkId: integerMin0Max65536, NetworkName: stringMin1Max256): DvbNitSettings = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId.asInstanceOf[js.Any], NetworkName = NetworkName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DvbNitSettings]
  }
  @scala.inline
  implicit class DvbNitSettingsOps[Self <: DvbNitSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkId(value: integerMin0Max65536): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkName(value: stringMin1Max256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepInterval(value: integerMin25Max10000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepInterval")(js.undefined)
        ret
    }
  }
  
}

