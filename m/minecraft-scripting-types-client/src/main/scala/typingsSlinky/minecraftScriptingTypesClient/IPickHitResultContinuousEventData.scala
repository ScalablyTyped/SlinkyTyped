package typingsSlinky.minecraftScriptingTypesClient

import typingsSlinky.minecraftScriptingTypesShared.IEntity
import typingsSlinky.minecraftScriptingTypesShared.VectorXYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered every update and tells you what entity the mouse pointer is pointing to in the world up to 1000 blocks away.
  */
@js.native
trait IPickHitResultContinuousEventData extends js.Object {
  /**
    * The entity that was hit or null if it not pointing at an entity
    */
  var entity: IEntity = js.native
  /**
    * The position of the entity that was hit or block that was hit
    */
  var position: VectorXYZ = js.native
}

object IPickHitResultContinuousEventData {
  @scala.inline
  def apply(entity: IEntity, position: VectorXYZ): IPickHitResultContinuousEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPickHitResultContinuousEventData]
  }
  @scala.inline
  implicit class IPickHitResultContinuousEventDataOps[Self <: IPickHitResultContinuousEventData] (val x: Self) extends AnyVal {
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
    def withPosition(value: VectorXYZ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

