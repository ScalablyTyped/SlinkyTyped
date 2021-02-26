package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewDirectionBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/viewDirectionBlock", "ViewDirectionBlock")
  @js.native
  class ViewDirectionBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new ViewDirectionBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the camera position component
      */
    def cameraPosition: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the world position component
      */
    def worldPosition: NodeMaterialConnectionPoint = js.native
  }
}
