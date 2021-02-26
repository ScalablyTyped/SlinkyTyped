package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalBlendBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/normalBlendBlock", "NormalBlendBlock")
  @js.native
  class NormalBlendBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new NormalBlendBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the first input component
      */
    def normalMap0: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the second input component
      */
    def normalMap1: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
  }
}
