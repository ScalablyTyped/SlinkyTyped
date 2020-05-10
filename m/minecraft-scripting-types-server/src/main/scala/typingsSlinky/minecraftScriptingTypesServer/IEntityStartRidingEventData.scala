package typingsSlinky.minecraftScriptingTypesServer

import typingsSlinky.minecraftScriptingTypesShared.IEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever an entity becomes a rider on another entity.
  */
@js.native
trait IEntityStartRidingEventData extends js.Object {
  /**
    * The rider
    */
  var entity: IEntity = js.native
  /**
    * The entity being ridden
    */
  var ride: IEntity = js.native
}

object IEntityStartRidingEventData {
  @scala.inline
  def apply(entity: IEntity, ride: IEntity): IEntityStartRidingEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], ride = ride.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityStartRidingEventData]
  }
  @scala.inline
  implicit class IEntityStartRidingEventDataOps[Self <: IEntityStartRidingEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntity(value: IEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRide(value: IEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ride")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

