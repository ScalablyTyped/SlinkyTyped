package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Node/Blocks/randomNumberBlock", JSImport.Namespace)
@js.native
object randomNumberBlockMod extends js.Object {
  @js.native
  class RandomNumberBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new RandomNumberBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    /**
      * Gets the seed input component
      */
    def seed: NodeMaterialConnectionPoint = js.native
  }
  
}

