package typingsSlinky.atJimpPlugins

import typingsSlinky.atJimpPluginDashBlit.atJimpPluginDashBlitMod.Blit
import typingsSlinky.atJimpPluginDashBlur.atJimpPluginDashBlurMod.Blur
import typingsSlinky.atJimpPluginDashColor.atJimpPluginDashColorMod.Color
import typingsSlinky.atJimpPluginDashContain.atJimpPluginDashContainMod.Contain
import typingsSlinky.atJimpPluginDashCover.atJimpPluginDashCoverMod.Cover
import typingsSlinky.atJimpPluginDashCrop.atJimpPluginDashCropMod.Crop
import typingsSlinky.atJimpPluginDashDisplace.atJimpPluginDashDisplaceMod.Displace
import typingsSlinky.atJimpPluginDashDither.atJimpPluginDashDitherMod.Dither
import typingsSlinky.atJimpPluginDashFlip.atJimpPluginDashFlipMod.Flip
import typingsSlinky.atJimpPluginDashGaussian.atJimpPluginDashGaussianMod.Gaussian
import typingsSlinky.atJimpPluginDashInvert.atJimpPluginDashInvertMod.Invert
import typingsSlinky.atJimpPluginDashMask.atJimpPluginDashMaskMod.Mask
import typingsSlinky.atJimpPluginDashNormalize.atJimpPluginDashNormalizeMod.Normalize
import typingsSlinky.atJimpPluginDashPrint.atJimpPluginDashPrintMod.Print
import typingsSlinky.atJimpPluginDashResize.atJimpPluginDashResizeMod.Resize
import typingsSlinky.atJimpPluginDashRotate.atJimpPluginDashRotateMod.Rotate
import typingsSlinky.atJimpPluginDashScale.atJimpPluginDashScaleMod.Scale
import typingsSlinky.atJimpPlugins.atJimpPluginsMod.BlitRet
import typingsSlinky.atJimpPlugins.atJimpPluginsMod.BlurRet
import typingsSlinky.atJimpPlugins.atJimpPluginsMod.ColorRet
import typingsSlinky.atJimpPlugins.atJimpPluginsMod.ContainRet
import typingsSlinky.atJimpPlugins.atJimpPluginsMod.CoverRet
import typingsSlinky.atJimpPlugins.atJimpPluginsMod.CropRet
import typingsSlinky.atJimpPlugins.atJimpPluginsMod.DisplaceRet
import typingsSlinky.atJimpPlugins.atJimpPluginsMod.DitherRet
import typingsSlinky.atJimpPlugins.atJimpPluginsMod.FlipRet
import typingsSlinky.atJimpPlugins.atJimpPluginsMod.GaussianRet
import typingsSlinky.atJimpPlugins.atJimpPluginsMod.InvertRet
import typingsSlinky.atJimpPlugins.atJimpPluginsMod.MaskRet
import typingsSlinky.atJimpPlugins.atJimpPluginsMod.NormalizeRet
import typingsSlinky.atJimpPlugins.atJimpPluginsMod.Plugins
import typingsSlinky.atJimpPlugins.atJimpPluginsMod.PrintRet
import typingsSlinky.atJimpPlugins.atJimpPluginsMod.ResizeRet
import typingsSlinky.atJimpPlugins.atJimpPluginsMod.RotateRet
import typingsSlinky.atJimpPlugins.atJimpPluginsMod.ScaleRet
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/plugins", JSImport.Namespace)
@js.native
object atJimpPluginsMod extends js.Object {
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

