package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nLerpBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/nLerpBlock", "NLerpBlock")
  @js.native
  class NLerpBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new NLerpBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the gradient operand input component
      */
    def gradient: NodeMaterialConnectionPoint = js.native
    
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
