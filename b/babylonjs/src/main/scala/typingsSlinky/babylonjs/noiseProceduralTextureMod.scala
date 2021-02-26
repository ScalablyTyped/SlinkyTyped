package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.proceduralTextureMod.ProceduralTexture
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.textureMod.Texture
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noiseProceduralTextureMod {
  
  @JSImport("babylonjs/Materials/Textures/Procedurals/noiseProceduralTexture", "NoiseProceduralTexture")
  @js.native
  class NoiseProceduralTexture protected () extends ProceduralTexture {
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
    def this(name: String, size: js.UndefOr[scala.Nothing], scene: Nullable[Scene]) = this()
    def this(name: String, size: Double, scene: Nullable[Scene]) = this()
    def this(
      name: String,
      size: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      fallbackTexture: Texture
    ) = this()
    def this(name: String, size: Double, scene: js.UndefOr[Nullable[Scene]], fallbackTexture: Texture) = this()
    def this(
      name: String,
      size: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      fallbackTexture: js.UndefOr[scala.Nothing],
      generateMipMaps: Boolean
    ) = this()
    def this(
      name: String,
      size: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      fallbackTexture: Texture,
      generateMipMaps: Boolean
    ) = this()
    def this(
      name: String,
      size: Double,
      scene: js.UndefOr[Nullable[Scene]],
      fallbackTexture: js.UndefOr[scala.Nothing],
      generateMipMaps: Boolean
    ) = this()
    def this(
      name: String,
      size: Double,
      scene: js.UndefOr[Nullable[Scene]],
      fallbackTexture: Texture,
      generateMipMaps: Boolean
    ) = this()
    
    var _updateShaderUniforms: js.Any = js.native
    
    /** Gets or sets animation speed factor (default is 1) */
    var animationSpeedFactor: Double = js.native
    
    /** Gets or sets a value between 0 and 1 indicating the overall brightness of the texture (default is 0.2) */
    var brightness: Double = js.native
    
    /** Defines the number of octaves to process */
    var octaves: Double = js.native
    
    /** Defines the level of persistence (0.8 by default) */
    var persistence: Double = js.native
    
    /** Gets or sets the start time (default is 0) */
    var time: Double = js.native
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
    @JSImport("babylonjs/Materials/Textures/Procedurals/noiseProceduralTexture", "NoiseProceduralTexture.Parse")
    @js.native
    def Parse(parsedTexture: js.Any, scene: Scene): NoiseProceduralTexture = js.native
  }
}
