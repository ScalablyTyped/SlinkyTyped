package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Blocks/Dual/fogBlock", JSImport.Namespace)
@js.native
object fogBlockMod extends js.Object {
  
  @js.native
  class FogBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new FogBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    var _fogDistanceName: js.Any = js.native
    
    var _fogParameters: js.Any = js.native
    
    /**
      * Gets the fog color input component
      */
    def fogColor: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the color input component
      */
    def input: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the view input component
      */
    def view: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the world position input component
      */
    def worldPosition: NodeMaterialConnectionPoint = js.native
  }
}
