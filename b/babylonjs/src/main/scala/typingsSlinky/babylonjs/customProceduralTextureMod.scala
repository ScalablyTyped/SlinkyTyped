package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.proceduralTextureMod.ProceduralTexture
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Textures/Procedurals/customProceduralTexture", JSImport.Namespace)
@js.native
object customProceduralTextureMod extends js.Object {
  
  @js.native
  class CustomProceduralTexture protected () extends ProceduralTexture {
    /**
      * Instantiates a new Custom Procedural Texture.
      * Procedural texturing is a way to programmatically create a texture. There are 2 types of procedural textures: code-only, and code that references some classic 2D images, sometimes called 'refMaps' or 'sampler' images.
      * Custom Procedural textures are the easiest way to create your own procedural in your application.
      * @see http://doc.babylonjs.com/how_to/how_to_use_procedural_textures#creating-custom-procedural-textures
      * @param name Define the name of the texture
      * @param texturePath Define the folder path containing all the cutom texture related files (config, shaders...)
      * @param size Define the size of the texture to create
      * @param scene Define the scene the texture belongs to
      * @param fallbackTexture Define a fallback texture in case there were issues to create the custom texture
      * @param generateMipMaps Define if the texture should creates mip maps or not
      */
    def this(name: String, texturePath: String, size: Double, scene: Scene) = this()
    def this(name: String, texturePath: String, size: Double, scene: Scene, fallbackTexture: Texture) = this()
    def this(
      name: String,
      texturePath: String,
      size: Double,
      scene: Scene,
      fallbackTexture: js.UndefOr[scala.Nothing],
      generateMipMaps: Boolean
    ) = this()
    def this(
      name: String,
      texturePath: String,
      size: Double,
      scene: Scene,
      fallbackTexture: Texture,
      generateMipMaps: Boolean
    ) = this()
    
    var _animate: js.Any = js.native
    
    var _config: js.Any = js.native
    
    var _loadJson: js.Any = js.native
    
    var _texturePath: js.Any = js.native
    
    var _time: js.Any = js.native
    
    /**
      * Define if the texture animates or not.
      */
    def animate: Boolean = js.native
    def animate_=(value: Boolean): Unit = js.native
    
    /**
      * Update the uniform values of the procedural texture in the shader.
      */
    def updateShaderUniforms(): Unit = js.native
    
    /**
      * Update the list of dependant textures samplers in the shader.
      */
    def updateTextures(): Unit = js.native
  }
}
