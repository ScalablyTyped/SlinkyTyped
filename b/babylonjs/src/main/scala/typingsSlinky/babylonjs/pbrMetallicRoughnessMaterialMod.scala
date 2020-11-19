package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.baseTextureMod.BaseTexture
import typingsSlinky.babylonjs.mathColorMod.Color3
import typingsSlinky.babylonjs.pbrBaseSimpleMaterialMod.PBRBaseSimpleMaterial
import typingsSlinky.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/PBR/pbrMetallicRoughnessMaterial", JSImport.Namespace)
@js.native
object pbrMetallicRoughnessMaterialMod extends js.Object {
  
  @js.native
  class PBRMetallicRoughnessMaterial protected () extends PBRBaseSimpleMaterial {
    /**
      * Instantiates a new PBRMetalRoughnessMaterial instance.
      *
      * @param name The material name
      * @param scene The scene the material will be use in.
      */
    def this(name: String, scene: Scene) = this()
    
    /**
      * The base color has two different interpretations depending on the value of metalness.
      * When the material is a metal, the base color is the specific measured reflectance value
      * at normal incidence (F0). For a non-metal the base color represents the reflected diffuse color
      * of the material.
      */
    var baseColor: Color3 = js.native
    
    /**
      * Base texture of the metallic workflow. It contains both the baseColor information in RGB as
      * well as opacity information in the alpha channel.
      */
    var baseTexture: BaseTexture = js.native
    
    /**
      * Specifies the metallic scalar value of the material.
      * Can also be used to scale the metalness values of the metallic texture.
      */
    var metallic: Double = js.native
    
    /**
      * Texture containing both the metallic value in the B channel and the
      * roughness value in the G channel to keep better precision.
      */
    var metallicRoughnessTexture: BaseTexture = js.native
    
    /**
      * Specifies the roughness scalar value of the material.
      * Can also be used to scale the roughness values of the metallic texture.
      */
    var roughness: Double = js.native
  }
  /* static members */
  @js.native
  object PBRMetallicRoughnessMaterial extends js.Object {
    
    /**
      * Parses a JSON object correponding to the serialize function.
      */
    def Parse(source: js.Any, scene: Scene, rootUrl: String): PBRMetallicRoughnessMaterial = js.native
  }
}
