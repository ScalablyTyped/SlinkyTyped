package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingGroupProperties extends js.Object {
  /**
    * The thing group attributes in JSON format.
    */
  var attributePayload: js.UndefOr[AttributePayload] = js.native
  /**
    * The thing group description.
    */
  var thingGroupDescription: js.UndefOr[ThingGroupDescription] = js.native
}

object ThingGroupProperties {
  @scala.inline
  def apply(): ThingGroupProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingGroupProperties]
  }
  @scala.inline
  implicit class ThingGroupPropertiesOps[Self <: ThingGroupProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withThingGroupDescription(value: ThingGroupDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingGroupDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupDescription")(js.undefined)
        ret
    }
  }
  
}

