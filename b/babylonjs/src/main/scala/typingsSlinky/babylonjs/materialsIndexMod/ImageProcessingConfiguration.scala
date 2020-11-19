package typingsSlinky.babylonjs.materialsIndexMod

import typingsSlinky.babylonjs.imageProcessingConfigurationMod.IImageProcessingConfigurationDefines
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "ImageProcessingConfiguration")
@js.native
class ImageProcessingConfiguration ()
  extends typingsSlinky.babylonjs.imageProcessingConfigurationMod.ImageProcessingConfiguration
/* static members */
@JSImport("babylonjs/Materials/index", "ImageProcessingConfiguration")
@js.native
object ImageProcessingConfiguration extends js.Object {
  
  /**
    * Parses the image processing from a json representation.
    * @param source the JSON source to parse
    * @return The parsed image processing
    */
  def Parse(source: js.Any): typingsSlinky.babylonjs.imageProcessingConfigurationMod.ImageProcessingConfiguration = js.native
  
  /**
    * Prepare the list of samplers associated with the Image Processing effects.
    * @param samplersList The list of uniforms used in the effect
    * @param defines the list of defines currently in use
    */
  def PrepareSamplers(samplersList: js.Array[String], defines: IImageProcessingConfigurationDefines): Unit = js.native
  
  /**
    * Prepare the list of uniforms associated with the Image Processing effects.
    * @param uniforms The list of uniforms used in the effect
    * @param defines the list of defines currently in use
    */
  def PrepareUniforms(uniforms: js.Array[String], defines: IImageProcessingConfigurationDefines): Unit = js.native
  
  /**
    * ACES Tone mapping (used by default in unreal and unity). This can help getting closer
    * to other engines rendering to increase portability.
    */
  val TONEMAPPING_ACES: Double = js.native
  
  /**
    * Default tone mapping applied in BabylonJS.
    */
  val TONEMAPPING_STANDARD: Double = js.native
  
  /**
    * Used to apply the vignette as a mix with the pixel color.
    */
  def VIGNETTEMODE_MULTIPLY: Double = js.native
  
  /**
    * Used to apply the vignette as a replacement of the pixel color.
    */
  def VIGNETTEMODE_OPAQUE: Double = js.native
  
  var _VIGNETTEMODE_MULTIPLY: js.Any = js.native
  
  var _VIGNETTEMODE_OPAQUE: js.Any = js.native
}
