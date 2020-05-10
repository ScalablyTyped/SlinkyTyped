package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DDSInfo extends js.Object {
  /**
    * The dxgiFormat of the texture
    * @see https://docs.microsoft.com/en-us/windows/desktop/api/dxgiformat/ne-dxgiformat-dxgi_format
    */
  var dxgiFormat: Double = js.native
  /**
    * Width of the texture
    */
  var height: Double = js.native
  /**
    * If the texture is a compressed format eg. FOURCC_DXT1
    */
  var isCompressed: Boolean = js.native
  /**
    * If this is a cube texture
    * @see https://docs.microsoft.com/en-us/windows/desktop/direct3ddds/dds-file-layout-for-cubic-environment-maps
    */
  var isCube: Boolean = js.native
  /**
    * If the textures format is a known fourCC format
    * @see https://www.fourcc.org/
    */
  var isFourCC: Boolean = js.native
  /**
    * If the texture is a lumincance format
    */
  var isLuminance: Boolean = js.native
  /**
    * If the texture is an RGB format eg. DXGI_FORMAT_B8G8R8X8_UNORM format
    */
  var isRGB: Boolean = js.native
  /**
    * Number of Mipmaps for the texture
    * @see https://en.wikipedia.org/wiki/Mipmap
    */
  var mipmapCount: Double = js.native
  /**
    * Sphericle polynomial created for the dds texture
    */
  var sphericalPolynomial: js.UndefOr[SphericalPolynomial] = js.native
  /**
    * Texture type eg. Engine.TEXTURETYPE_UNSIGNED_INT, Engine.TEXTURETYPE_FLOAT
    */
  var textureType: Double = js.native
  /**
    * Width of the texture
    */
  var width: Double = js.native
}

object DDSInfo {
  @scala.inline
  def apply(
    dxgiFormat: Double,
    height: Double,
    isCompressed: Boolean,
    isCube: Boolean,
    isFourCC: Boolean,
    isLuminance: Boolean,
    isRGB: Boolean,
    mipmapCount: Double,
    textureType: Double,
    width: Double
  ): DDSInfo = {
    val __obj = js.Dynamic.literal(dxgiFormat = dxgiFormat.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isCompressed = isCompressed.asInstanceOf[js.Any], isCube = isCube.asInstanceOf[js.Any], isFourCC = isFourCC.asInstanceOf[js.Any], isLuminance = isLuminance.asInstanceOf[js.Any], isRGB = isRGB.asInstanceOf[js.Any], mipmapCount = mipmapCount.asInstanceOf[js.Any], textureType = textureType.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DDSInfo]
  }
  @scala.inline
  implicit class DDSInfoOps[Self <: DDSInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDxgiFormat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dxgiFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCompressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCube(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCube")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFourCC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFourCC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLuminance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLuminance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRGB(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRGB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMipmapCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mipmapCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSphericalPolynomial(value: SphericalPolynomial): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sphericalPolynomial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSphericalPolynomial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sphericalPolynomial")(js.undefined)
        ret
    }
  }
  
}

