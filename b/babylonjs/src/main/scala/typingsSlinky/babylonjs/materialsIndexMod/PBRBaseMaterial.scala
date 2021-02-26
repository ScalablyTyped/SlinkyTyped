package typingsSlinky.babylonjs.materialsIndexMod

import typingsSlinky.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "PBRBaseMaterial")
@js.native
abstract class PBRBaseMaterial protected ()
  extends typingsSlinky.babylonjs.materialsPbrIndexMod.PBRBaseMaterial {
  /**
    * Instantiates a new PBRMaterial instance.
    *
    * @param name The material name
    * @param scene The scene the material will be use in.
    */
  def this(name: String, scene: Scene) = this()
}
/* static members */
object PBRBaseMaterial {
  
  @JSImport("babylonjs/Materials/index", "PBRBaseMaterial")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Defines the default value of how much AO map is occluding the analytical lights
    * (point spot...).
    */
  @JSImport("babylonjs/Materials/index", "PBRBaseMaterial.DEFAULT_AO_ON_ANALYTICAL_LIGHTS")
  @js.native
  def DEFAULT_AO_ON_ANALYTICAL_LIGHTS: Double = js.native
  @scala.inline
  def DEFAULT_AO_ON_ANALYTICAL_LIGHTS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_AO_ON_ANALYTICAL_LIGHTS")(x.asInstanceOf[js.Any])
  
  /**
    * PBRMaterialLightFalloff gltf: light is falling off as described in the gltf moving to PBR document
    * to enhance interoperability with other engines.
    */
  @JSImport("babylonjs/Materials/index", "PBRBaseMaterial.LIGHTFALLOFF_GLTF")
  @js.native
  val LIGHTFALLOFF_GLTF: Double = js.native
  
  /**
    * PBRMaterialLightFalloff Physical: light is falling off following the inverse squared distance law.
    */
  @JSImport("babylonjs/Materials/index", "PBRBaseMaterial.LIGHTFALLOFF_PHYSICAL")
  @js.native
  val LIGHTFALLOFF_PHYSICAL: Double = js.native
  
  /**
    * PBRMaterialLightFalloff Standard: light is falling off like in the standard material
    * to enhance interoperability with other materials.
    */
  @JSImport("babylonjs/Materials/index", "PBRBaseMaterial.LIGHTFALLOFF_STANDARD")
  @js.native
  val LIGHTFALLOFF_STANDARD: Double = js.native
  
  /**
    * PBRMaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
    */
  @JSImport("babylonjs/Materials/index", "PBRBaseMaterial.PBRMATERIAL_ALPHABLEND")
  @js.native
  val PBRMATERIAL_ALPHABLEND: Double = js.native
  
  /**
    * PBRMaterialTransparencyMode: Alpha Test mode, pixel are discarded below a certain threshold defined by the alpha cutoff value.
    */
  @JSImport("babylonjs/Materials/index", "PBRBaseMaterial.PBRMATERIAL_ALPHATEST")
  @js.native
  val PBRMATERIAL_ALPHATEST: Double = js.native
  
  /**
    * PBRMaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
    * They are also discarded below the alpha cutoff threshold to improve performances.
    */
  @JSImport("babylonjs/Materials/index", "PBRBaseMaterial.PBRMATERIAL_ALPHATESTANDBLEND")
  @js.native
  val PBRMATERIAL_ALPHATESTANDBLEND: Double = js.native
  
  /**
    * PBRMaterialTransparencyMode: No transparency mode, Alpha channel is not use.
    */
  @JSImport("babylonjs/Materials/index", "PBRBaseMaterial.PBRMATERIAL_OPAQUE")
  @js.native
  val PBRMATERIAL_OPAQUE: Double = js.native
}
