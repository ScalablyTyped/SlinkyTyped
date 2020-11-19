package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Blocks/reflectBlock", JSImport.Namespace)
@js.native
object reflectBlockMod extends js.Object {
  
  @js.native
  class ReflectBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new ReflectBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the incident component
      */
    def incident: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the normal component
      */
    def normal: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
  }
}
