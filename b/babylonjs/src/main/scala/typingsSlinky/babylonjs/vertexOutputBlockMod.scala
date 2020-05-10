package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/Vertex/vertexOutputBlock", JSImport.Namespace)
@js.native
object vertexOutputBlockMod extends js.Object {
  @js.native
  class VertexOutputBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new VertexOutputBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    /**
      * Gets the vector input component
      */
    def vector: NodeMaterialConnectionPoint = js.native
  }
  
}

