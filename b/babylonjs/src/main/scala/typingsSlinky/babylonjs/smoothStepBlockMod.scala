package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smoothStepBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/smoothStepBlock", "SmoothStepBlock")
  @js.native
  class SmoothStepBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new SmoothStepBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the first edge operand input component
      */
    def edge0: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the second edge operand input component
      */
    def edge1: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the value operand input component
      */
    def value: NodeMaterialConnectionPoint = js.native
  }
}
