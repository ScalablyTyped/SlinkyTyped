package typingsSlinky.pulumiAws.peeringAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeeringAttachmentArgs extends js.Object {
  
  /**
    * Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the current provider is currently connected to.
    */
  val peerAccountId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Region of EC2 Transit Gateway to peer with.
    */
  val peerRegion: Input[String] = js.native
  
  /**
    * Identifier of EC2 Transit Gateway to peer with.
    */
  val peerTransitGatewayId: Input[String] = js.native
  
  /**
    * Key-value tags for the EC2 Transit Gateway Peering Attachment.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Identifier of EC2 Transit Gateway.
    */
  val transitGatewayId: Input[String] = js.native
}
object PeeringAttachmentArgs {
  
  @scala.inline
  def apply(peerRegion: Input[String], peerTransitGatewayId: Input[String], transitGatewayId: Input[String]): PeeringAttachmentArgs = {
    val __obj = js.Dynamic.literal(peerRegion = peerRegion.asInstanceOf[js.Any], peerTransitGatewayId = peerTransitGatewayId.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeeringAttachmentArgs]
  }
  
  @scala.inline
  implicit class PeeringAttachmentArgsOps[Self <: PeeringAttachmentArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPeerRegion(value: Input[String]): Self = this.set("peerRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerTransitGatewayId(value: Input[String]): Self = this.set("peerTransitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayId(value: Input[String]): Self = this.set("transitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerAccountId(value: Input[String]): Self = this.set("peerAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerAccountId: Self = this.set("peerAccountId", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
