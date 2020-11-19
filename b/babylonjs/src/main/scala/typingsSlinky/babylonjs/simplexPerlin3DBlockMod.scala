package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Blocks/simplexPerlin3DBlock", JSImport.Namespace)
@js.native
object simplexPerlin3DBlockMod extends js.Object {
  
  @js.native
  class SimplexPerlin3DBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new SimplexPerlin3DBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the seed operand input component
      */
    def seed: NodeMaterialConnectionPoint = js.native
  }
}
