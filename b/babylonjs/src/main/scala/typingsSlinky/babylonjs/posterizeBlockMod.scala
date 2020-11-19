package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Blocks/posterizeBlock", JSImport.Namespace)
@js.native
object posterizeBlockMod extends js.Object {
  
  @js.native
  class PosterizeBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new PosterizeBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the steps input component
      */
    def steps: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the value input component
      */
    def value: NodeMaterialConnectionPoint = js.native
  }
}
