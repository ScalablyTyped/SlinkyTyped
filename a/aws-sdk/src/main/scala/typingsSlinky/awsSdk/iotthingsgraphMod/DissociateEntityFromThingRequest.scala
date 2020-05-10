package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DissociateEntityFromThingRequest extends js.Object {
  /**
    * The entity type from which to disassociate the thing.
    */
  var entityType: EntityType = js.native
  /**
    * The name of the thing to disassociate.
    */
  var thingName: ThingName = js.native
}

object DissociateEntityFromThingRequest {
  @scala.inline
  def apply(entityType: EntityType, thingName: ThingName): DissociateEntityFromThingRequest = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DissociateEntityFromThingRequest]
  }
  @scala.inline
  implicit class DissociateEntityFromThingRequestOps[Self <: DissociateEntityFromThingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityType(value: EntityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThingName(value: ThingName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

