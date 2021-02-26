package typingsSlinky.babylonjs

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPointDirection
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMaterialConnectionPointCustomObjectMod {
  
  @JSImport("babylonjs/Materials/Node/nodeMaterialConnectionPointCustomObject", "NodeMaterialConnectionPointCustomObject")
  @js.native
  class NodeMaterialConnectionPointCustomObject[T /* <: NodeMaterialBlock */] protected () extends NodeMaterialConnectionPoint {
    /**
      * Creates a new connection point
      * @param name defines the connection point name
      * @param ownerBlock defines the block hosting this connection point
      * @param direction defines the direction of the connection point
      */
    def this(
      name: String,
      ownerBlock: NodeMaterialBlock,
      direction: NodeMaterialConnectionPointDirection,
      _blockType: Instantiable1[/* args (repeated) */ js.Any, T],
      _blockName: String
    ) = this()
    def this(
      name: String,
      ownerBlock: NodeMaterialBlock,
      direction: NodeMaterialConnectionPointDirection,
      _blockType: Instantiable1[/* args (repeated) */ js.Any, T],
      _blockName: String,
      _nameForCheking: String
    ) = this()
    
    var _blockName: js.Any = js.native
    
    var _blockType: js.Any = js.native
    
    var _nameForCheking: js.Any = js.native
  }
}
