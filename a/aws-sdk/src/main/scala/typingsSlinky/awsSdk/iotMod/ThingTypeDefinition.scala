package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingTypeDefinition extends js.Object {
  /**
    * The thing type ARN.
    */
  var thingTypeArn: js.UndefOr[ThingTypeArn] = js.native
  /**
    * The ThingTypeMetadata contains additional information about the thing type including: creation date and time, a value indicating whether the thing type is deprecated, and a date and time when it was deprecated.
    */
  var thingTypeMetadata: js.UndefOr[ThingTypeMetadata] = js.native
  /**
    * The name of the thing type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.native
  /**
    * The ThingTypeProperties for the thing type.
    */
  var thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.native
}

object ThingTypeDefinition {
  @scala.inline
  def apply(): ThingTypeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingTypeDefinition]
  }
  @scala.inline
  implicit class ThingTypeDefinitionOps[Self <: ThingTypeDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThingTypeArn(value: ThingTypeArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingTypeArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingTypeArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingTypeArn")(js.undefined)
        ret
    }
    @scala.inline
    def withThingTypeMetadata(value: ThingTypeMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingTypeMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingTypeMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingTypeMetadata")(js.undefined)
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
    def withThingTypeProperties(value: ThingTypeProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingTypeProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingTypeProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingTypeProperties")(js.undefined)
        ret
    }
  }
  
}

