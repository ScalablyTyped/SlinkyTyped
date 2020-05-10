package typingsSlinky.pulumiAws.getDirectConnectGatewayAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDirectConnectGatewayAttachmentResult extends js.Object {
  val dxGatewayId: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Key-value tags for the EC2 Transit Gateway Attachment
    */
  val tags: StringDictionary[js.Any] = js.native
  val transitGatewayId: String = js.native
}

object GetDirectConnectGatewayAttachmentResult {
  @scala.inline
  def apply(dxGatewayId: String, id: String, tags: StringDictionary[js.Any], transitGatewayId: String): GetDirectConnectGatewayAttachmentResult = {
    val __obj = js.Dynamic.literal(dxGatewayId = dxGatewayId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectConnectGatewayAttachmentResult]
  }
  @scala.inline
  implicit class GetDirectConnectGatewayAttachmentResultOps[Self <: GetDirectConnectGatewayAttachmentResult] (val x: Self) extends AnyVal {
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitGatewayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

