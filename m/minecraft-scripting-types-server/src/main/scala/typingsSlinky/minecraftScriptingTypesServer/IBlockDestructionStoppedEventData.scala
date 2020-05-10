package typingsSlinky.minecraftScriptingTypesServer

import typingsSlinky.minecraftScriptingTypesShared.IEntity
import typingsSlinky.minecraftScriptingTypesShared.VectorXYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever a player stops destroying a block.
  */
@js.native
trait IBlockDestructionStoppedEventData extends js.Object {
  /**
    * The position of the block that was being destroyed
    */
  var block_position: VectorXYZ = js.native
  /**
    * How far along the destruction was before it was stopped (0 - 1 range)
    */
  var destruction_progress: Double = js.native
  /**
    * The player that stopped destoying the block
    */
  var player: IEntity = js.native
}

object IBlockDestructionStoppedEventData {
  @scala.inline
  def apply(block_position: VectorXYZ, destruction_progress: Double, player: IEntity): IBlockDestructionStoppedEventData = {
    val __obj = js.Dynamic.literal(block_position = block_position.asInstanceOf[js.Any], destruction_progress = destruction_progress.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBlockDestructionStoppedEventData]
  }
  @scala.inline
  implicit class IBlockDestructionStoppedEventDataOps[Self <: IBlockDestructionStoppedEventData] (val x: Self) extends AnyVal {
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
    def withDestruction_progress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destruction_progress")(value.asInstanceOf[js.Any])
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

