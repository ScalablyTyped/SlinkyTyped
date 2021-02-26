package typingsSlinky.nodeSnap7.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlockType extends StObject
@JSImport("node-snap7", "BlockType")
@js.native
object BlockType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlockType with Double] = js.native
  
  @js.native
  sealed trait Block_DB extends BlockType
  /* 0x41 */ val Block_DB: typingsSlinky.nodeSnap7.mod.BlockType.Block_DB with Double = js.native
  
  @js.native
  sealed trait Block_FB extends BlockType
  /* 0x45 */ val Block_FB: typingsSlinky.nodeSnap7.mod.BlockType.Block_FB with Double = js.native
  
  @js.native
  sealed trait Block_FC extends BlockType
  /* 0x43 */ val Block_FC: typingsSlinky.nodeSnap7.mod.BlockType.Block_FC with Double = js.native
  
  @js.native
  sealed trait Block_OB extends BlockType
  /* 0x38 */ val Block_OB: typingsSlinky.nodeSnap7.mod.BlockType.Block_OB with Double = js.native
  
  @js.native
  sealed trait Block_SDB extends BlockType
  /* 0x42 */ val Block_SDB: typingsSlinky.nodeSnap7.mod.BlockType.Block_SDB with Double = js.native
  
  @js.native
  sealed trait Block_SFB extends BlockType
  /* 0x46 */ val Block_SFB: typingsSlinky.nodeSnap7.mod.BlockType.Block_SFB with Double = js.native
  
  @js.native
  sealed trait Block_SFC extends BlockType
  /* 0x44 */ val Block_SFC: typingsSlinky.nodeSnap7.mod.BlockType.Block_SFC with Double = js.native
}
