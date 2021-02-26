package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.NoiseProceduralTexture")
@js.native
class NoiseProceduralTexture protected ()
  extends typingsSlinky.babylonjs.BABYLON.NoiseProceduralTexture {
  /**
    * Creates a new NoiseProceduralTexture
    * @param name defines the name fo the texture
    * @param size defines the size of the texture (default is 256)
    * @param scene defines the hosting scene
    * @param fallbackTexture defines the texture to use if the NoiseProceduralTexture can't be created
    * @param generateMipMaps defines if mipmaps must be generated (true by default)
    */
  def this(name: String) = this()
  def this(name: String, size: Double) = this()
  def this(
    name: String,
    size: js.UndefOr[scala.Nothing],
    scene: Nullable[typingsSlinky.babylonjs.BABYLON.Scene]
  ) = this()
  def this(name: String, size: Double, scene: Nullable[typingsSlinky.babylonjs.BABYLON.Scene]) = this()
  def this(
    name: String,
    size: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.BABYLON.Scene]],
    fallbackTexture: typingsSlinky.babylonjs.BABYLON.Texture
  ) = this()
  def this(
    name: String,
    size: Double,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.BABYLON.Scene]],
    fallbackTexture: typingsSlinky.babylonjs.BABYLON.Texture
  ) = this()
  def this(
    name: String,
    size: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.BABYLON.Scene]],
    fallbackTexture: js.UndefOr[scala.Nothing],
    generateMipMaps: Boolean
  ) = this()
  def this(
    name: String,
    size: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.BABYLON.Scene]],
    fallbackTexture: typingsSlinky.babylonjs.BABYLON.Texture,
    generateMipMaps: Boolean
  ) = this()
  def this(
    name: String,
    size: Double,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.BABYLON.Scene]],
    fallbackTexture: js.UndefOr[scala.Nothing],
    generateMipMaps: Boolean
  ) = this()
  def this(
    name: String,
    size: Double,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.BABYLON.Scene]],
    fallbackTexture: typingsSlinky.babylonjs.BABYLON.Texture,
    generateMipMaps: Boolean
  ) = this()
}
/* static members */
object NoiseProceduralTexture {
  
  /**
    * Creates a NoiseProceduralTexture from parsed noise procedural texture data
    * @param parsedTexture defines parsed texture data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing noise procedural texture information
    * @returns a parsed NoiseProceduralTexture
    */
  @JSGlobal("BABYLON.NoiseProceduralTexture.Parse")
  @js.native
  def Parse(parsedTexture: js.Any, scene: typingsSlinky.babylonjs.BABYLON.Scene): typingsSlinky.babylonjs.BABYLON.NoiseProceduralTexture = js.native
}
