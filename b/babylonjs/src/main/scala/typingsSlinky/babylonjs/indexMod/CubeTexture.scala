package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "CubeTexture")
@js.native
class CubeTexture protected ()
  extends typingsSlinky.babylonjs.materialsIndexMod.CubeTexture {
  /**
    * Creates a cube texture to use with reflection for instance. It can be based upon dds or six images as well
    * as prefiltered data.
    * @param rootUrl defines the url of the texture or the root name of the six images
    * @param scene defines the scene the texture is attached to
    * @param extensions defines the suffixes add to the picture name in case six images are in use like _px.jpg...
    * @param noMipmap defines if mipmaps should be created or not
    * @param files defines the six files to load for the different faces in that order: px, py, pz, nx, ny, nz
    * @param onLoad defines a callback triggered at the end of the file load if no errors occured
    * @param onError defines a callback triggered in case of error during load
    * @param format defines the internal format to use for the texture once loaded
    * @param prefiltered defines whether or not the texture is created from prefiltered data
    * @param forcedExtension defines the extensions to use (force a special type of file to load) in case it is different from the file name
    * @param createPolynomials defines whether or not to create polynomial harmonics from the texture data if necessary
    * @param lodScale defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness
    * @param lodOffset defines the offset applied to environment texture. This manages first LOD level used for IBL according to the roughness
    * @return the cube texture
    */
  def this(
    rootUrl: String,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    extensions: js.UndefOr[Nullable[js.Array[String]]],
    noMipmap: js.UndefOr[Boolean],
    files: js.UndefOr[Nullable[js.Array[String]]],
    onLoad: js.UndefOr[Nullable[js.Function0[Unit]]],
    onError: js.UndefOr[
        Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ]
      ],
    format: js.UndefOr[Double],
    prefiltered: js.UndefOr[Boolean],
    forcedExtension: js.UndefOr[js.Any],
    createPolynomials: js.UndefOr[Boolean],
    lodScale: js.UndefOr[Double],
    lodOffset: js.UndefOr[Double]
  ) = this()
}
/* static members */
@JSImport("babylonjs/index", "CubeTexture")
@js.native
object CubeTexture extends js.Object {
  
  /**
    * Creates a cube texture from an array of image urls
    * @param files defines an array of image urls
    * @param scene defines the hosting scene
    * @param noMipmap specifies if mip maps are not used
    * @returns a cube texture
    */
  def CreateFromImages(files: js.Array[String], scene: typingsSlinky.babylonjs.sceneMod.Scene): typingsSlinky.babylonjs.cubeTextureMod.CubeTexture = js.native
  def CreateFromImages(files: js.Array[String], scene: typingsSlinky.babylonjs.sceneMod.Scene, noMipmap: Boolean): typingsSlinky.babylonjs.cubeTextureMod.CubeTexture = js.native
  
  /**
    * Creates and return a texture created from prefilterd data by tools like IBL Baker or Lys.
    * @param url defines the url of the prefiltered texture
    * @param scene defines the scene the texture is attached to
    * @param forcedExtension defines the extension of the file if different from the url
    * @param createPolynomials defines whether or not to create polynomial harmonics from the texture data if necessary
    * @return the prefiltered texture
    */
  def CreateFromPrefilteredData(url: String, scene: typingsSlinky.babylonjs.sceneMod.Scene): typingsSlinky.babylonjs.cubeTextureMod.CubeTexture = js.native
  def CreateFromPrefilteredData(
    url: String,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    forcedExtension: js.UndefOr[scala.Nothing],
    createPolynomials: Boolean
  ): typingsSlinky.babylonjs.cubeTextureMod.CubeTexture = js.native
  def CreateFromPrefilteredData(url: String, scene: typingsSlinky.babylonjs.sceneMod.Scene, forcedExtension: js.Any): typingsSlinky.babylonjs.cubeTextureMod.CubeTexture = js.native
  def CreateFromPrefilteredData(
    url: String,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    forcedExtension: js.Any,
    createPolynomials: Boolean
  ): typingsSlinky.babylonjs.cubeTextureMod.CubeTexture = js.native
  
  /**
    * Parses text to create a cube texture
    * @param parsedTexture define the serialized text to read from
    * @param scene defines the hosting scene
    * @param rootUrl defines the root url of the cube texture
    * @returns a cube texture
    */
  def Parse(parsedTexture: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene, rootUrl: String): typingsSlinky.babylonjs.cubeTextureMod.CubeTexture = js.native
}
