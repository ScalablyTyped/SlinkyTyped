package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/Fragment/frontFacingBlock", JSImport.Namespace)
@js.native
object frontFacingBlockMod extends js.Object {
  @js.native
  class FrontFacingBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new FrontFacingBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
  }
  
}

