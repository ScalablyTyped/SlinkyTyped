package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateThingRequest extends js.Object {
  /**
    * The attribute payload, which consists of up to three name/value pairs in a JSON document. For example:  {\"attributes\":{\"string1\":\"string2\"}} 
    */
  var attributePayload: js.UndefOr[AttributePayload] = js.native
  /**
    * The name of the billing group the thing will be added to.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.native
  /**
    * The name of the thing to create.
    */
  var thingName: ThingName = js.native
  /**
    * The name of the thing type associated with the new thing.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.native
}

object CreateThingRequest {
  @scala.inline
  def apply(thingName: ThingName): CreateThingRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThingRequest]
  }
  @scala.inline
  implicit class CreateThingRequestOps[Self <: CreateThingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThingName(value: ThingName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributePayload(value: AttributePayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributePayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributePayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributePayload")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingGroupName(value: BillingGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withThingTypeName(value: ThingTypeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingTypeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingTypeName")(js.undefined)
        ret
    }
  }
  
}

