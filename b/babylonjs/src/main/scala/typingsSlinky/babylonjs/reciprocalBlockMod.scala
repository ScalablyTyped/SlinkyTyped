package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reciprocalBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/reciprocalBlock", "ReciprocalBlock")
  @js.native
  class ReciprocalBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new ReciprocalBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the input component
      */
    def input: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
  }
}
