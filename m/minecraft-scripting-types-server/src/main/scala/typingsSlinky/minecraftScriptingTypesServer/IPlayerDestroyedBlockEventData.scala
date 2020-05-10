package typingsSlinky.minecraftScriptingTypesServer

import typingsSlinky.minecraftScriptingTypesShared.IEntity
import typingsSlinky.minecraftScriptingTypesShared.VectorXYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever a player destroys a block.
  */
@js.native
trait IPlayerDestroyedBlockEventData extends js.Object {
  /**
    * The identifier of the block that was destroyed
    */
  var block_identifier: String = js.native
  /**
    * The position of the block that was destroyed
    */
  var block_position: VectorXYZ = js.native
  /**
    * The player that destroyed the block
    */
  var player: IEntity = js.native
}

object IPlayerDestroyedBlockEventData {
  @scala.inline
  def apply(block_identifier: String, block_position: VectorXYZ, player: IEntity): IPlayerDestroyedBlockEventData = {
    val __obj = js.Dynamic.literal(block_identifier = block_identifier.asInstanceOf[js.Any], block_position = block_position.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayerDestroyedBlockEventData]
  }
  @scala.inline
  implicit class IPlayerDestroyedBlockEventDataOps[Self <: IPlayerDestroyedBlockEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlock_identifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block_identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlock_position(value: VectorXYZ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block_position")(value.asInstanceOf[js.Any])
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

