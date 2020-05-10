package typingsSlinky.minecraftScriptingTypesServer

import typingsSlinky.minecraftScriptingTypesShared.IEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever a player attacks an entity.
  */
@js.native
trait IPlayerAttackedEntityEventData extends js.Object {
  /**
    * The entity that was attacked by the player
    */
  var attacked_entity: IEntity = js.native
  /**
    * The player that attacked an entity
    */
  var player: IEntity = js.native
}

object IPlayerAttackedEntityEventData {
  @scala.inline
  def apply(attacked_entity: IEntity, player: IEntity): IPlayerAttackedEntityEventData = {
    val __obj = js.Dynamic.literal(attacked_entity = attacked_entity.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayerAttackedEntityEventData]
  }
  @scala.inline
  implicit class IPlayerAttackedEntityEventDataOps[Self <: IPlayerAttackedEntityEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttacked_entity(value: IEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attacked_entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayer(value: IEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("player")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

