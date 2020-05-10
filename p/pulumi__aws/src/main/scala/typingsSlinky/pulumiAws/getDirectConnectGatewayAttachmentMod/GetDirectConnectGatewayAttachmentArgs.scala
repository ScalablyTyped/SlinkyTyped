package typingsSlinky.pulumiAws.getDirectConnectGatewayAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDirectConnectGatewayAttachmentArgs extends js.Object {
  /**
    * Identifier of the Direct Connect Gateway.
    */
  val dxGatewayId: String = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Identifier of the EC2 Transit Gateway.
    */
  val transitGatewayId: String = js.native
}

object GetDirectConnectGatewayAttachmentArgs {
  @scala.inline
  def apply(dxGatewayId: String, transitGatewayId: String): GetDirectConnectGatewayAttachmentArgs = {
    val __obj = js.Dynamic.literal(dxGatewayId = dxGatewayId.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectConnectGatewayAttachmentArgs]
  }
  @scala.inline
  implicit class GetDirectConnectGatewayAttachmentArgsOps[Self <: GetDirectConnectGatewayAttachmentArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDxGatewayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dxGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitGatewayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

