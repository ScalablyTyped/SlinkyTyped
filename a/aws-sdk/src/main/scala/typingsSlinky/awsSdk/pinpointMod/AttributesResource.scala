package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributesResource extends js.Object {
  /**
    * The unique identifier for the application.
    */
  var ApplicationId: string = js.native
  /**
    * The type of attribute or attributes that were removed from the endpoints. Valid values are: endpoint-custom-attributes - Custom attributes that describe endpoints. endpoint-metric-attributes - Custom metrics that your app reports to Amazon Pinpoint for endpoints. endpoint-user-attributes - Custom attributes that describe users.
    */
  var AttributeType: string = js.native
  /**
    * An array that specifies the names of the attributes that were removed from the endpoints.
    */
  var Attributes: js.UndefOr[ListOfString] = js.native
}

object AttributesResource {
  @scala.inline
  def apply(ApplicationId: string, AttributeType: string): AttributesResource = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], AttributeType = AttributeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesResource]
  }
  @scala.inline
  implicit class AttributesResourceOps[Self <: AttributesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeType(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: ListOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
  }
  
}

