package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Blocks/worleyNoise3DBlock", JSImport.Namespace)
@js.native
object worleyNoise3DBlockMod extends js.Object {
  
  @js.native
  class WorleyNoise3DBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new WorleyNoise3DBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the jitter input component
      */
    def jitter: NodeMaterialConnectionPoint = js.native
    
    /** Gets or sets a boolean indicating that normal should be inverted on X axis */
    var manhattanDistance: Boolean = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the seed input component
      */
    def seed: NodeMaterialConnectionPoint = js.native
  }
}
