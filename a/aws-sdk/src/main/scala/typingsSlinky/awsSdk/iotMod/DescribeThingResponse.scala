package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeThingResponse extends js.Object {
  /**
    * The thing attributes.
    */
  var attributes: js.UndefOr[Attributes] = js.native
  /**
    * The name of the billing group the thing belongs to.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.native
  /**
    * The default client ID.
    */
  var defaultClientId: js.UndefOr[ClientId] = js.native
  /**
    * The ARN of the thing to describe.
    */
  var thingArn: js.UndefOr[ThingArn] = js.native
  /**
    * The ID of the thing to describe.
    */
  var thingId: js.UndefOr[ThingId] = js.native
  /**
    * The name of the thing.
    */
  var thingName: js.UndefOr[ThingName] = js.native
  /**
    * The thing type name.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.native
  /**
    * The current version of the thing record in the registry.  To avoid unintentional changes to the information in the registry, you can pass the version information in the expectedVersion parameter of the UpdateThing and DeleteThing calls. 
    */
  var version: js.UndefOr[Version] = js.native
}

object DescribeThingResponse {
  @scala.inline
  def apply(): DescribeThingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeThingResponse]
  }
  @scala.inline
  implicit class DescribeThingResponseOps[Self <: DescribeThingResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
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
    def withDefaultClientId(value: ClientId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClientId")(js.undefined)
        ret
    }
    @scala.inline
    def withThingArn(value: ThingArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingArn")(js.undefined)
        ret
    }
    @scala.inline
    def withThingId(value: ThingId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingId")(js.undefined)
        ret
    }
    @scala.inline
    def withThingName(value: ThingName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingName")(js.undefined)
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
    @scala.inline
    def withVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

