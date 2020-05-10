package typingsSlinky.pulumiAws.getInternetGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2.GetInternetGatewayAttachment
import typingsSlinky.pulumiAws.outputMod.ec2.GetInternetGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInternetGatewayResult extends js.Object {
  val attachments: js.Array[GetInternetGatewayAttachment] = js.native
  val filters: js.UndefOr[js.Array[GetInternetGatewayFilter]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val internetGatewayId: String = js.native
  /**
    * The ID of the AWS account that owns the internet gateway.
    */
  val ownerId: String = js.native
  val tags: StringDictionary[js.Any] = js.native
}

object GetInternetGatewayResult {
  @scala.inline
  def apply(
    attachments: js.Array[GetInternetGatewayAttachment],
    id: String,
    internetGatewayId: String,
    ownerId: String,
    tags: StringDictionary[js.Any]
  ): GetInternetGatewayResult = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], internetGatewayId = internetGatewayId.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInternetGatewayResult]
  }
  @scala.inline
  implicit class GetInternetGatewayResultOps[Self <: GetInternetGatewayResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachments(value: js.Array[GetInternetGatewayAttachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternetGatewayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internetGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[GetInternetGatewayFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
  }
  
}

