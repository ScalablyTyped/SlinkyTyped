package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Blocks/rotate2dBlock", JSImport.Namespace)
@js.native
object rotate2dBlockMod extends js.Object {
  
  @js.native
  class Rotate2dBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new Rotate2dBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the input angle
      */
    def angle: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the input vector
      */
    def input: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
  }
}
