package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomNumberBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/randomNumberBlock", "RandomNumberBlock")
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
