package typingsSlinky.awsSdk.ebsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Block extends StObject {
  
  /**
    * The block index.
    */
  var BlockIndex: js.UndefOr[typingsSlinky.awsSdk.ebsMod.BlockIndex] = js.native
  
  /**
    * The block token for the block index.
    */
  var BlockToken: js.UndefOr[typingsSlinky.awsSdk.ebsMod.BlockToken] = js.native
}
object Block {
  
  @scala.inline
  def apply(): Block = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Block]
  }
  
  @scala.inline
  implicit class BlockMutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockIndex(value: BlockIndex): Self = StObject.set(x, "BlockIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockIndexUndefined: Self = StObject.set(x, "BlockIndex", js.undefined)
    
    @scala.inline
    def setBlockToken(value: BlockToken): Self = StObject.set(x, "BlockToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockTokenUndefined: Self = StObject.set(x, "BlockToken", js.undefined)
  }
}
