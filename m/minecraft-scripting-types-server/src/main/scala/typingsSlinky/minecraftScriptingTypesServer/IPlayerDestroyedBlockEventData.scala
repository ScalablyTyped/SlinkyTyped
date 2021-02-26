package typingsSlinky.minecraftScriptingTypesServer

import typingsSlinky.minecraftScriptingTypesShared.IEntity
import typingsSlinky.minecraftScriptingTypesShared.VectorXYZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever a player destroys a block.
  */
@js.native
trait IPlayerDestroyedBlockEventData extends StObject {
  
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
  implicit class IPlayerDestroyedBlockEventDataMutableBuilder[Self <: IPlayerDestroyedBlockEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock_identifier(value: String): Self = StObject.set(x, "block_identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlock_position(value: VectorXYZ): Self = StObject.set(x, "block_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayer(value: IEntity): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
  }
}
