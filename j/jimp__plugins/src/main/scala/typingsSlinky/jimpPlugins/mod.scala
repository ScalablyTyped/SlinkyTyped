package typingsSlinky.jimpPlugins

import typingsSlinky.jimpPluginBlit.mod.Blit
import typingsSlinky.jimpPluginBlur.mod.Blur
import typingsSlinky.jimpPluginCircle.mod.Circle
import typingsSlinky.jimpPluginColor.mod.Color
import typingsSlinky.jimpPluginContain.mod.Contain
import typingsSlinky.jimpPluginCover.mod.Cover
import typingsSlinky.jimpPluginCrop.mod.Crop
import typingsSlinky.jimpPluginDisplace.mod.Displace
import typingsSlinky.jimpPluginDither.mod.Dither
import typingsSlinky.jimpPluginFisheye.mod.Fisheye
import typingsSlinky.jimpPluginFlip.mod.Flip
import typingsSlinky.jimpPluginGaussian.mod.Gaussian
import typingsSlinky.jimpPluginInvert.mod.Invert
import typingsSlinky.jimpPluginMask.mod.Mask
import typingsSlinky.jimpPluginNormalize.mod.Normalize
import typingsSlinky.jimpPluginPrint.mod.Print
import typingsSlinky.jimpPluginResize.mod.Resize
import typingsSlinky.jimpPluginRotate.mod.Rotate
import typingsSlinky.jimpPluginScale.mod.Scale
import typingsSlinky.jimpPluginShadow.mod.Shadow
import typingsSlinky.jimpPluginThreshold.mod.Threshold
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
  type CircleRet = ReturnType[js.Function0[Circle]]
  type ColorRet = ReturnType[js.Function0[Color]]
  type ContainRet = ReturnType[js.Function0[Contain]]
  type CoverRet = ReturnType[js.Function0[Cover]]
  type CropRet = ReturnType[js.Function0[Crop]]
  type DisplaceRet = ReturnType[js.Function0[Displace]]
  type DitherRet = ReturnType[js.Function0[Dither]]
  type FisheyeRet = ReturnType[js.Function0[Fisheye]]
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
  type Plugins = BlitRet | BlurRet | CircleRet | ColorRet | ContainRet | CoverRet | CropRet | DisplaceRet | DitherRet | FlipRet | FisheyeRet | GaussianRet | InvertRet | MaskRet | NormalizeRet | PrintRet | ResizeRet | RotateRet | ScaleRet | ShadowRet | ThresholdRet
  type PrintRet = ReturnType[js.Function0[Print]]
  type ResizeRet = ReturnType[js.Function0[Resize]]
  type RotateRet = ReturnType[js.Function0[Rotate]]
  type ScaleRet = ReturnType[js.Function0[Scale]]
  type ShadowRet = ReturnType[js.Function0[Shadow]]
  type ThresholdRet = ReturnType[js.Function0[Threshold]]
}

