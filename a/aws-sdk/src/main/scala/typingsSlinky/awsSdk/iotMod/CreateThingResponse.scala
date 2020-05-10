package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateThingResponse extends js.Object {
  /**
    * The ARN of the new thing.
    */
  var thingArn: js.UndefOr[ThingArn] = js.native
  /**
    * The thing ID.
    */
  var thingId: js.UndefOr[ThingId] = js.native
  /**
    * The name of the new thing.
    */
  var thingName: js.UndefOr[ThingName] = js.native
}

object CreateThingResponse {
  @scala.inline
  def apply(): CreateThingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateThingResponse]
  }
  @scala.inline
  implicit class CreateThingResponseOps[Self <: CreateThingResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

