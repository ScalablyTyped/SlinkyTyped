package typingsSlinky.minecraftScriptingTypesServer

import typingsSlinky.minecraftScriptingTypesShared.IEntity
import typingsSlinky.minecraftScriptingTypesShared.VectorXYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever a player interacts with a block.
  */
@js.native
trait IBlockInteractedWithEventData extends js.Object {
  /**
    * The position of the block that is being interacted with
    */
  var block_position: VectorXYZ = js.native
  /**
    * The player that interacted with the block
    */
  var player: IEntity = js.native
}

object IBlockInteractedWithEventData {
  @scala.inline
  def apply(block_position: VectorXYZ, player: IEntity): IBlockInteractedWithEventData = {
    val __obj = js.Dynamic.literal(block_position = block_position.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBlockInteractedWithEventData]
  }
  @scala.inline
  implicit class IBlockInteractedWithEventDataOps[Self <: IBlockInteractedWithEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

