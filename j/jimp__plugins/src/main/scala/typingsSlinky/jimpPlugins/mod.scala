package typingsSlinky.jimpPlugins

import typingsSlinky.jimpPluginBlit.mod.Blit
import typingsSlinky.jimpPluginBlur.mod.Blur
import typingsSlinky.jimpPluginColor.mod.Color
import typingsSlinky.jimpPluginContain.mod.Contain
import typingsSlinky.jimpPluginCover.mod.Cover
import typingsSlinky.jimpPluginCrop.mod.Crop
import typingsSlinky.jimpPluginDisplace.mod.Displace
import typingsSlinky.jimpPluginDither.mod.Dither
import typingsSlinky.jimpPluginFlip.mod.Flip
import typingsSlinky.jimpPluginGaussian.mod.Gaussian
import typingsSlinky.jimpPluginInvert.mod.Invert
import typingsSlinky.jimpPluginMask.mod.Mask
import typingsSlinky.jimpPluginNormalize.mod.Normalize
import typingsSlinky.jimpPluginPrint.mod.Print
import typingsSlinky.jimpPluginResize.mod.Resize
import typingsSlinky.jimpPluginRotate.mod.Rotate
import typingsSlinky.jimpPluginScale.mod.Scale
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/plugins", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default(): Plugins = js.native
  type BlitRet = ReturnType[js.Function0[Blit]]
  type BlurRet = ReturnType[js.Function0[Blur]]
  type ColorRet = ReturnType[js.Function0[Color]]
  type ContainRet = ReturnType[js.Function0[Contain]]
  type CoverRet = ReturnType[js.Function0[Cover]]
  type CropRet = ReturnType[js.Function0[Crop]]
  type DisplaceRet = ReturnType[js.Function0[Displace]]
  type DitherRet = ReturnType[js.Function0[Dither]]
  type FlipRet = ReturnType[js.Function0[Flip]]
  type GaussianRet = ReturnType[js.Function0[Gaussian]]
  type InvertRet = ReturnType[js.Function0[Invert]]
  type MaskRet = ReturnType[js.Function0[Mask]]
  type NormalizeRet = ReturnType[js.Function0[Normalize]]
  /**
    * This is made union and not intersection to avoid issues with
    * `IllformedPlugin` and `WellFormedPlugin` when using typings with Jimp
    * generic
    *
    * In reality, this should be an intersection but our type data isn't
    * clever enough to figure out what's a class and what's not/etc
    */
  type Plugins = DitherRet | ResizeRet | BlitRet | RotateRet | ColorRet | PrintRet | BlurRet | CropRet | NormalizeRet | InvertRet | GaussianRet | FlipRet | MaskRet | ScaleRet | DisplaceRet | ContainRet | CoverRet
  type PrintRet = ReturnType[js.Function0[Print]]
  type ResizeRet = ReturnType[js.Function0[Resize]]
  type RotateRet = ReturnType[js.Function0[Rotate]]
  type ScaleRet = ReturnType[js.Function0[Scale]]
}

