package typingsSlinky.playcanvas.global.pc

import typingsSlinky.playcanvas.anon.AddressU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new texture.
  * @example
  * // Create a 8x8x24-bit texture
  * var texture = new pc.Texture(graphicsDevice, {
  *     width: 8,
  *     height: 8,
  *     format: pc.PIXELFORMAT_R8_G8_B8
  * });
  *
  * // Fill the texture with a gradient
  * var pixels = texture.lock();
  * var count = 0;
  * for (var i = 0; i < 8; i++) {
  *     for (var j = 0; j < 8; j++) {
  *         pixels[count++] = i * 32;
  *         pixels[count++] = j * 32;
  *         pixels[count++] = 255;
  *     }
  * }
  * texture.unlock();
  * @property name - The name of the texture. Defaults to null.
  * @param graphicsDevice - The graphics device used to manage this texture.
  * @param [options] - Object for passing optional arguments.
  * @param [options.name] - The name of the texture.
  * @param [options.width] - The width of the texture in pixels. Defaults to 4.
  * @param [options.height] - The height of the texture in pixels. Defaults to 4.
  * @param [options.depth] - The number of depth slices in a 3D texture (WebGL2 only). Defaults to 1 (single 2D image).
  * @param [options.format] - The pixel format of the texture. Can be:
  * * {@link pc.PIXELFORMAT_A8}
  * * {@link pc.PIXELFORMAT_L8}
  * * {@link pc.PIXELFORMAT_L8_A8}
  * * {@link pc.PIXELFORMAT_R5_G6_B5}
  * * {@link pc.PIXELFORMAT_R5_G5_B5_A1}
  * * {@link pc.PIXELFORMAT_R4_G4_B4_A4}
  * * {@link pc.PIXELFORMAT_R8_G8_B8}
  * * {@link pc.PIXELFORMAT_R8_G8_B8_A8}
  * * {@link pc.PIXELFORMAT_DXT1}
  * * {@link pc.PIXELFORMAT_DXT3}
  * * {@link pc.PIXELFORMAT_DXT5}
  * * {@link pc.PIXELFORMAT_RGB16F}
  * * {@link pc.PIXELFORMAT_RGBA16F}
  * * {@link pc.PIXELFORMAT_RGB32F}
  * * {@link pc.PIXELFORMAT_RGBA32F}
  * * {@link pc.PIXELFORMAT_ETC1}
  * * {@link pc.PIXELFORMAT_PVRTC_2BPP_RGB_1}
  * * {@link pc.PIXELFORMAT_PVRTC_2BPP_RGBA_1}
  * * {@link pc.PIXELFORMAT_PVRTC_4BPP_RGB_1}
  * * {@link pc.PIXELFORMAT_PVRTC_4BPP_RGBA_1}
  * * {@link pc.PIXELFORMAT_111110F}
  * * {@link pc.PIXELFORMAT_ASTC_4x4}>/li>
  * * {@link pc.PIXELFORMAT_ATC_RGB}
  * * {@link pc.PIXELFORMAT_ATC_RGBA}
  * Defaults to pc.PIXELFORMAT_R8_G8_B8_A8.
  * @param [options.minFilter] - The minification filter type to use. Defaults to {@link pc.FILTER_LINEAR_MIPMAP_LINEAR}
  * @param [options.magFilter] - The magnification filter type to use. Defaults to {@link pc.FILTER_LINEAR}
  * @param [options.anisotropy] - The level of anisotropic filtering to use. Defaults to 1
  * @param [options.addressU] - The repeat mode to use in the U direction. Defaults to {@link pc.ADDRESS_REPEAT}
  * @param [options.addressV] - The repeat mode to use in the V direction. Defaults to {@link pc.ADDRESS_REPEAT}
  * @param [options.addressW] - The repeat mode to use in the W direction. Defaults to {@link pc.ADDRESS_REPEAT}
  * @param [options.mipmaps] - When enabled try to generate or use mipmaps for this texture. Default is true
  * @param [options.cubemap] - Specifies whether the texture is to be a cubemap. Defaults to false.
  * @param [options.volume] - Specifies whether the texture is to be a 3D volume (WebGL2 only). Defaults to false.
  * @param [options.type] - Specifies the image type, see {@link pc.TEXTURETYPE_DEFAULT}
  * @param [options.fixCubemapSeams] - Specifies whether this cubemap texture requires special
  * seam fixing shader code to look right. Defaults to false.
  * @param [options.flipY] - Specifies whether the texture should be flipped in the Y-direction. Only affects textures
  * with a source that is an image, canvas or video element. Does not affect cubemaps, compressed textures or textures set from raw
  * pixel data. Defaults to true.
  * @param [options.premultiplyAlpha] - If true, the alpha channel of the texture (if present) is multiplied into the color
  * channels. Defaults to false.
  * @param [options.compareOnRead] - When enabled, and if texture format is pc.PIXELFORMAT_DEPTH or pc.PIXELFORMAT_DEPTHSTENCIL,
  * hardware PCF is enabled for this texture, and you can get filtered results of comparison using texture() in your shader (WebGL2 only).
  * Defaults to false.
  * @param [options.compareFunc] - Comparison function when compareOnRead is enabled (WebGL2 only). Defaults to pc.FUNC_LESS.
  * Possible values:
  * * {@link pc.FUNC_LESS}
  * * {@link pc.FUNC_LESSEQUAL}
  * * {@link pc.FUNC_GREATER}
  * * {@link pc.FUNC_GREATEREQUAL}
  * * {@link pc.FUNC_EQUAL}
  * * {@link pc.FUNC_NOTEQUAL}
  */
@JSGlobal("pc.Texture")
@js.native
class Texture protected ()
  extends typingsSlinky.playcanvas.pc.Texture {
  def this(graphicsDevice: typingsSlinky.playcanvas.pc.GraphicsDevice) = this()
  def this(graphicsDevice: typingsSlinky.playcanvas.pc.GraphicsDevice, options: AddressU) = this()
}
