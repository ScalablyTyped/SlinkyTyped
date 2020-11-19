package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Blocks/Fragment/perturbNormalBlock", JSImport.Namespace)
@js.native
object perturbNormalBlockMod extends js.Object {
  
  @js.native
  class PerturbNormalBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new PerturbNormalBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    var _tangentSpaceParameterName: js.Any = js.native
    
    /** Gets or sets a boolean indicating that normal should be inverted on X axis */
    var invertX: Boolean = js.native
    
    /** Gets or sets a boolean indicating that normal should be inverted on Y axis */
    var invertY: Boolean = js.native
    
    /**
      * Gets the normal map color input component
      */
    def normalMapColor: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the strength input component
      */
    def strength: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the uv input component
      */
    def uv: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the world normal input component
      */
    def worldNormal: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the world position input component
      */
    def worldPosition: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the world tangent input component
      */
    def worldTangent: NodeMaterialConnectionPoint = js.native
  }
}
