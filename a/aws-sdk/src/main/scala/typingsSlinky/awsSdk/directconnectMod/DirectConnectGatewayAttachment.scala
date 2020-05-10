package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectConnectGatewayAttachment extends js.Object {
  /**
    * The state of the attachment. The following are the possible values:    attaching: The initial state after a virtual interface is created using the Direct Connect gateway.    attached: The Direct Connect gateway and virtual interface are attached and ready to pass traffic.    detaching: The initial state after calling DeleteVirtualInterface.    detached: The virtual interface is detached from the Direct Connect gateway. Traffic flow between the Direct Connect gateway and virtual interface is stopped.  
    */
  var attachmentState: js.UndefOr[DirectConnectGatewayAttachmentState] = js.native
  /**
    * The type of attachment.
    */
  var attachmentType: js.UndefOr[DirectConnectGatewayAttachmentType] = js.native
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.native
  /**
    * The error message if the state of an object failed to advance.
    */
  var stateChangeError: js.UndefOr[StateChangeError] = js.native
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.native
  /**
    * The ID of the AWS account that owns the virtual interface.
    */
  var virtualInterfaceOwnerAccount: js.UndefOr[OwnerAccount] = js.native
  /**
    * The AWS Region where the virtual interface is located.
    */
  var virtualInterfaceRegion: js.UndefOr[VirtualInterfaceRegion] = js.native
}

object DirectConnectGatewayAttachment {
  @scala.inline
  def apply(): DirectConnectGatewayAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectConnectGatewayAttachment]
  }
  @scala.inline
  implicit class DirectConnectGatewayAttachmentOps[Self <: DirectConnectGatewayAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachmentState(value: DirectConnectGatewayAttachmentState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachmentState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentState")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachmentType(value: DirectConnectGatewayAttachmentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachmentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentType")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectConnectGatewayId(value: DirectConnectGatewayId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnectGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectConnectGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnectGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withStateChangeError(value: StateChangeError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChangeError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateChangeError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChangeError")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualInterfaceId(value: VirtualInterfaceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualInterfaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterfaceId")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualInterfaceOwnerAccount(value: OwnerAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterfaceOwnerAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualInterfaceOwnerAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterfaceOwnerAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualInterfaceRegion(value: VirtualInterfaceRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterfaceRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualInterfaceRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterfaceRegion")(js.undefined)
        ret
    }
  }
  
}

