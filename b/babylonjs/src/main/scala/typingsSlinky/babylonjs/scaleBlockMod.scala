package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Blocks/scaleBlock", JSImport.Namespace)
@js.native
object scaleBlockMod extends js.Object {
  
  @js.native
  class ScaleBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new ScaleBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the factor input component
      */
    def factor: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the input component
      */
    def input: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
  }
}
