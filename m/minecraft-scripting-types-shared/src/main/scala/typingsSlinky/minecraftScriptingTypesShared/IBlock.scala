package typingsSlinky.minecraftScriptingTypesShared

import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBlock extends _IMinecraftObject {
  
  /**
    * The identifier of the block
    */
  val __identifier__ : String = js.native
  
  /**
    * The type of the object
    */
  val __type__ : block = js.native
  
  /**
    * This is the position of the block. It also functions as part of its unique identifier
    */
  val block_position: VectorXYZ = js.native
  
  /**
    * This is the ticking area object that was used to get this block
    */
  val ticking_area: ITickingArea = js.native
}
object IBlock {
  
  @scala.inline
  def apply(__identifier__ : String, __type__ : block, block_position: VectorXYZ, ticking_area: ITickingArea): IBlock = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__.asInstanceOf[js.Any], __type__ = __type__.asInstanceOf[js.Any], block_position = block_position.asInstanceOf[js.Any], ticking_area = ticking_area.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBlock]
  }
  
  @scala.inline
  implicit class IBlockMutableBuilder[Self <: IBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock_position(value: VectorXYZ): Self = StObject.set(x, "block_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicking_area(value: ITickingArea): Self = StObject.set(x, "ticking_area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__identifier__(value: String): Self = StObject.set(x, "__identifier__", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__type__(value: block): Self = StObject.set(x, "__type__", value.asInstanceOf[js.Any])
  }
}
