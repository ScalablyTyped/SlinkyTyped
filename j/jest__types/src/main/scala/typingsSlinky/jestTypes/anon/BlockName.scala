package typingsSlinky.jestTypes.anon

import typingsSlinky.jestTypes.circusMod.BlockMode
import typingsSlinky.jestTypes.circusMod.SyncEvent
import typingsSlinky.jestTypes.jestTypesStrings.finish_describe_definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockName extends SyncEvent {
  
  var blockName: typingsSlinky.jestTypes.circusMod.BlockName = js.native
  
  var mode: BlockMode = js.native
  
  var name: finish_describe_definition = js.native
}
object BlockName {
  
  @scala.inline
  def apply(
    blockName: typingsSlinky.jestTypes.circusMod.BlockName,
    mode: BlockMode,
    name: finish_describe_definition
  ): BlockName = {
    val __obj = js.Dynamic.literal(blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockName]
  }
  
  @scala.inline
  implicit class BlockNameMutableBuilder[Self <: BlockName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockName(value: typingsSlinky.jestTypes.circusMod.BlockName): Self = StObject.set(x, "blockName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: BlockMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: finish_describe_definition): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
