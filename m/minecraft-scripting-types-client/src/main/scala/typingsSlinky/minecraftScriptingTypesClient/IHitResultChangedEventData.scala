package typingsSlinky.minecraftScriptingTypesClient

import typingsSlinky.minecraftScriptingTypesShared.IEntity
import typingsSlinky.minecraftScriptingTypesShared.VectorXYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever the reticle changes from pointing at a block or air to pointing at an entity and the other way around. Up to 1000 blocks away.
  */
@js.native
trait IHitResultChangedEventData extends js.Object {
  /**
    * The entity that was hit or null if it fired when moving off of an entity
    */
  var entity: IEntity = js.native
  /**
    * The position of the entity that was hit or null if it fired when moving off an entity
    */
  var position: VectorXYZ | Null = js.native
}

object IHitResultChangedEventData {
  @scala.inline
  def apply(entity: IEntity): IHitResultChangedEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHitResultChangedEventData]
  }
  @scala.inline
  implicit class IHitResultChangedEventDataOps[Self <: IHitResultChangedEventData] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withPositionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(null)
        ret
    }
  }
  
}

