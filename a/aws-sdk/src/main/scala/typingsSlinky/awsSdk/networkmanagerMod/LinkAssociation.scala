package typingsSlinky.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkAssociation extends js.Object {
  /**
    * The device ID for the link association.
    */
  var DeviceId: js.UndefOr[String] = js.native
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.native
  /**
    * The state of the association.
    */
  var LinkAssociationState: js.UndefOr[typingsSlinky.awsSdk.networkmanagerMod.LinkAssociationState] = js.native
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[String] = js.native
}

object LinkAssociation {
  @scala.inline
  def apply(): LinkAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkAssociation]
  }
  @scala.inline
  implicit class LinkAssociationOps[Self <: LinkAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalNetworkId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalNetworkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalNetworkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalNetworkId")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkAssociationState(value: LinkAssociationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkAssociationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkAssociationState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkAssociationState")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkId")(js.undefined)
        ret
    }
  }
  
}

