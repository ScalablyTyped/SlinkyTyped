package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object powBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/powBlock", "PowBlock")
  @js.native
  class PowBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new PowBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the power operand input component
      */
    def power: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the value operand input component
      */
    def value: NodeMaterialConnectionPoint = js.native
  }
}
