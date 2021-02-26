package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/reflectBlock", "ReflectBlock")
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
