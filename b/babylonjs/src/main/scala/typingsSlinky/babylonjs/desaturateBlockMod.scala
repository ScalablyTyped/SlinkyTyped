package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Blocks/desaturateBlock", JSImport.Namespace)
@js.native
object desaturateBlockMod extends js.Object {
  
  @js.native
  class DesaturateBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new DesaturateBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the color operand input component
      */
    def color: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the level operand input component
      */
    def level: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
  }
}
