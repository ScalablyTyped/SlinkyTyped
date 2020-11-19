package typingsSlinky.babylonjs.miscIndexMod

import typingsSlinky.babylonjs.baseTextureMod.BaseTexture
import typingsSlinky.babylonjs.panoramaToCubemapMod.CubeMapInfo
import typingsSlinky.babylonjs.sphericalPolynomialMod.SphericalPolynomial
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "CubeMapToSphericalPolynomialTools")
@js.native
class CubeMapToSphericalPolynomialTools ()
  extends typingsSlinky.babylonjs.highDynamicRangeIndexMod.CubeMapToSphericalPolynomialTools
/* static members */
@JSImport("babylonjs/Misc/index", "CubeMapToSphericalPolynomialTools")
@js.native
object CubeMapToSphericalPolynomialTools extends js.Object {
  
  /**
    * Converts a texture to the according Spherical Polynomial data.
    * This extracts the first 3 orders only as they are the only one used in the lighting.
    *
    * @param texture The texture to extract the information from.
    * @return The Spherical Polynomial data.
    */
  def ConvertCubeMapTextureToSphericalPolynomial(texture: BaseTexture): Nullable[SphericalPolynomial] = js.native
  
  /**
    * Converts a cubemap to the according Spherical Polynomial data.
    * This extracts the first 3 orders only as they are the only one used in the lighting.
    *
    * @param cubeInfo The Cube map to extract the information from.
    * @return The Spherical Polynomial data.
    */
  def ConvertCubeMapToSphericalPolynomial(cubeInfo: CubeMapInfo): SphericalPolynomial = js.native
  
  var FileFaces: js.Any = js.native
}
