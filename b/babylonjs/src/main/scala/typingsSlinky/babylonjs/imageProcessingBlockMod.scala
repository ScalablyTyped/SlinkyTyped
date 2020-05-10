package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/Fragment/imageProcessingBlock", JSImport.Namespace)
@js.native
object imageProcessingBlockMod extends js.Object {
  @js.native
  class ImageProcessingBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new ImageProcessingBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    /**
      * Gets the color input component
      */
    def color: NodeMaterialConnectionPoint = js.native
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
  }
  
}

