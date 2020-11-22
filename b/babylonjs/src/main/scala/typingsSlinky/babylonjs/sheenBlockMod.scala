package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsSlinky.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock
import typingsSlinky.babylonjs.reflectionBlockMod.ReflectionBlock
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Blocks/PBR/sheenBlock", JSImport.Namespace)
@js.native
object sheenBlockMod extends js.Object {
  
  @js.native
  class SheenBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new SheenBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * If true, the sheen effect is layered above the base BRDF with the albedo-scaling technique.
      * It allows the strength of the sheen effect to not depend on the base color of the material,
      * making it easier to setup and tweak the effect
      */
    var albedoScaling: Boolean = js.native
    
    /**
      * Gets the color input component
      */
    def color: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the main code of the block (fragment side)
      * @param reflectionBlock instance of a ReflectionBlock null if the code must be generated without an active reflection module
      * @returns the shader code
      */
    def getCode(reflectionBlock: Nullable[ReflectionBlock]): String = js.native
    
    /**
      * Gets the intensity input component
      */
    def intensity: NodeMaterialConnectionPoint = js.native
    
    /**
      * Defines if the sheen is linked to the sheen color.
      */
    var linkSheenWithAlbedo: Boolean = js.native
    
    /**
      * Gets the roughness input component
      */
    def roughness: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the sheen object output component
      */
    def sheen: NodeMaterialConnectionPoint = js.native
  }
}
