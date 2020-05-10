package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateThingTypeResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the thing type.
    */
  var thingTypeArn: js.UndefOr[ThingTypeArn] = js.native
  /**
    * The thing type ID.
    */
  var thingTypeId: js.UndefOr[ThingTypeId] = js.native
  /**
    * The name of the thing type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.native
}

object CreateThingTypeResponse {
  @scala.inline
  def apply(): CreateThingTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateThingTypeResponse]
  }
  @scala.inline
  implicit class CreateThingTypeResponseOps[Self <: CreateThingTypeResponse] (val x: Self) extends AnyVal {
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
    def withThingTypeId(value: ThingTypeId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingTypeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingTypeId")(js.undefined)
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

