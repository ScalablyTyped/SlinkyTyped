package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.panoramaToCubemapMod.CubeMapInfo
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "CubeMapToSphericalPolynomialTools")
@js.native
class CubeMapToSphericalPolynomialTools ()
  extends typingsSlinky.babylonjs.legacyMod.CubeMapToSphericalPolynomialTools
/* static members */
object CubeMapToSphericalPolynomialTools {
  
  @JSImport("babylonjs", "CubeMapToSphericalPolynomialTools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a texture to the according Spherical Polynomial data.
    * This extracts the first 3 orders only as they are the only one used in the lighting.
    *
    * @param texture The texture to extract the information from.
    * @return The Spherical Polynomial data.
    */
  @JSImport("babylonjs", "CubeMapToSphericalPolynomialTools.ConvertCubeMapTextureToSphericalPolynomial")
  @js.native
  def ConvertCubeMapTextureToSphericalPolynomial(texture: typingsSlinky.babylonjs.baseTextureMod.BaseTexture): Nullable[typingsSlinky.babylonjs.sphericalPolynomialMod.SphericalPolynomial] = js.native
  
  /**
    * Converts a cubemap to the according Spherical Polynomial data.
    * This extracts the first 3 orders only as they are the only one used in the lighting.
    *
    * @param cubeInfo The Cube map to extract the information from.
    * @return The Spherical Polynomial data.
    */
  @JSImport("babylonjs", "CubeMapToSphericalPolynomialTools.ConvertCubeMapToSphericalPolynomial")
  @js.native
  def ConvertCubeMapToSphericalPolynomial(cubeInfo: CubeMapInfo): typingsSlinky.babylonjs.sphericalPolynomialMod.SphericalPolynomial = js.native
  
  @JSImport("babylonjs", "CubeMapToSphericalPolynomialTools.FileFaces")
  @js.native
  def FileFaces: js.Any = js.native
  @scala.inline
  def FileFaces_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FileFaces")(x.asInstanceOf[js.Any])
}
