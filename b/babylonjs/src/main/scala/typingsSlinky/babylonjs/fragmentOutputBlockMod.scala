package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Blocks/Fragment/fragmentOutputBlock", JSImport.Namespace)
@js.native
object fragmentOutputBlockMod extends js.Object {
  
  @js.native
  class FragmentOutputBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new FragmentOutputBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the a input component
      */
    def a: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the rgb input component
      */
    def rgb: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the rgba input component
      */
    def rgba: NodeMaterialConnectionPoint = js.native
  }
}
