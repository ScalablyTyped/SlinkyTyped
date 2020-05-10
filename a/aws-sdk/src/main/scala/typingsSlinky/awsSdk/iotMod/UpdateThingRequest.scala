package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateThingRequest extends js.Object {
  /**
    * A list of thing attributes, a JSON string containing name-value pairs. For example:  {\"attributes\":{\"name1\":\"value2\"}}  This data is used to add new attributes or update existing attributes.
    */
  var attributePayload: js.UndefOr[AttributePayload] = js.native
  /**
    * The expected version of the thing record in the registry. If the version of the record in the registry does not match the expected version specified in the request, the UpdateThing request is rejected with a VersionConflictException.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.native
  /**
    * Remove a thing type association. If true, the association is removed.
    */
  var removeThingType: js.UndefOr[RemoveThingType] = js.native
  /**
    * The name of the thing to update.
    */
  var thingName: ThingName = js.native
  /**
    * The name of the thing type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.native
}

object UpdateThingRequest {
  @scala.inline
  def apply(thingName: ThingName): UpdateThingRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThingRequest]
  }
  @scala.inline
  implicit class UpdateThingRequestOps[Self <: UpdateThingRequest] (val x: Self) extends AnyVal {
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
    def withExpectedVersion(value: OptionalVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveThingType(value: RemoveThingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeThingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveThingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeThingType")(js.undefined)
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

