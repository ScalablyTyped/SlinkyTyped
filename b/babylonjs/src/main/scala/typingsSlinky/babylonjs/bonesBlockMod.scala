package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Blocks/Vertex/bonesBlock", JSImport.Namespace)
@js.native
object bonesBlockMod extends js.Object {
  
  @js.native
  class BonesBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new BonesBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the matrix indices input component
      */
    def matricesIndices: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the extra matrix indices input component
      */
    def matricesIndicesExtra: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the matrix weights input component
      */
    def matricesWeights: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the extra matrix weights input component
      */
    def matricesWeightsExtra: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the world input component
      */
    def world: NodeMaterialConnectionPoint = js.native
  }
}
