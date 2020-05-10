package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/addBlock", JSImport.Namespace)
@js.native
object addBlockMod extends js.Object {
  @js.native
  class AddBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new AddBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    /**
      * Gets the left operand input component
      */
    def left: NodeMaterialConnectionPoint = js.native
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    /**
      * Gets the right operand input component
      */
    def right: NodeMaterialConnectionPoint = js.native
  }
  
}

