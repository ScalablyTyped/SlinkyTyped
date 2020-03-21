package typingsSlinky.fabric.fabricImplMod

import typingsSlinky.fabric.AnonFromObject
import typingsSlinky.fabric.AnonInstantiable
import typingsSlinky.fabric.AnonInstantiableFromObject
import typingsSlinky.fabric.AnonInstantiableIBrightnessFilter
import typingsSlinky.fabric.AnonInstantiableIColorMatrix
import typingsSlinky.fabric.AnonInstantiableIContrastFilter
import typingsSlinky.fabric.AnonInstantiableIConvoluteFilter
import typingsSlinky.fabric.AnonInstantiableIGradientTransparencyFilter
import typingsSlinky.fabric.AnonInstantiableIGrayscaleFilter
import typingsSlinky.fabric.AnonInstantiableIInvertFilter
import typingsSlinky.fabric.AnonInstantiableIMaskFilter
import typingsSlinky.fabric.AnonInstantiableIMultiplyFilter
import typingsSlinky.fabric.AnonInstantiableINoiseFilter
import typingsSlinky.fabric.AnonInstantiableIPixelateFilter
import typingsSlinky.fabric.AnonInstantiableIRemoveWhiteFilter
import typingsSlinky.fabric.AnonInstantiableIResizeFilter
import typingsSlinky.fabric.AnonInstantiableISaturationFilter
import typingsSlinky.fabric.AnonInstantiableISepia2Filter
import typingsSlinky.fabric.AnonInstantiableISepiaFilter
import typingsSlinky.fabric.AnonInstantiableITintFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////
// Filters
////////////////////////////////////////////////////////////
trait IAllFilters extends js.Object {
  var BaseFilter: AnonInstantiable
  var BlendColor: AnonFromObject
  var BlendImage: AnonInstantiableFromObject
  var Brightness: AnonInstantiableIBrightnessFilter
  var ColorMatrix: AnonInstantiableIColorMatrix
  var Contrast: AnonInstantiableIContrastFilter
  var Convolute: AnonInstantiableIConvoluteFilter
  var GradientTransparency: AnonInstantiableIGradientTransparencyFilter
  var Grayscale: AnonInstantiableIGrayscaleFilter
  var Invert: AnonInstantiableIInvertFilter
  var Mask: AnonInstantiableIMaskFilter
  var Multiply: AnonInstantiableIMultiplyFilter
  var Noise: AnonInstantiableINoiseFilter
  var Pixelate: AnonInstantiableIPixelateFilter
  var RemoveWhite: AnonInstantiableIRemoveWhiteFilter
  var Resize: AnonInstantiableIResizeFilter
  var Saturation: AnonInstantiableISaturationFilter
  var Sepia: AnonInstantiableISepiaFilter
  var Sepia2: AnonInstantiableISepia2Filter
  var Tint: AnonInstantiableITintFilter
}

object IAllFilters {
  @scala.inline
  def apply(
    BaseFilter: AnonInstantiable,
    BlendColor: AnonFromObject,
    BlendImage: AnonInstantiableFromObject,
    Brightness: AnonInstantiableIBrightnessFilter,
    ColorMatrix: AnonInstantiableIColorMatrix,
    Contrast: AnonInstantiableIContrastFilter,
    Convolute: AnonInstantiableIConvoluteFilter,
    GradientTransparency: AnonInstantiableIGradientTransparencyFilter,
    Grayscale: AnonInstantiableIGrayscaleFilter,
    Invert: AnonInstantiableIInvertFilter,
    Mask: AnonInstantiableIMaskFilter,
    Multiply: AnonInstantiableIMultiplyFilter,
    Noise: AnonInstantiableINoiseFilter,
    Pixelate: AnonInstantiableIPixelateFilter,
    RemoveWhite: AnonInstantiableIRemoveWhiteFilter,
    Resize: AnonInstantiableIResizeFilter,
    Saturation: AnonInstantiableISaturationFilter,
    Sepia: AnonInstantiableISepiaFilter,
    Sepia2: AnonInstantiableISepia2Filter,
    Tint: AnonInstantiableITintFilter
  ): IAllFilters = {
    val __obj = js.Dynamic.literal(BaseFilter = BaseFilter.asInstanceOf[js.Any], BlendColor = BlendColor.asInstanceOf[js.Any], BlendImage = BlendImage.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], ColorMatrix = ColorMatrix.asInstanceOf[js.Any], Contrast = Contrast.asInstanceOf[js.Any], Convolute = Convolute.asInstanceOf[js.Any], GradientTransparency = GradientTransparency.asInstanceOf[js.Any], Grayscale = Grayscale.asInstanceOf[js.Any], Invert = Invert.asInstanceOf[js.Any], Mask = Mask.asInstanceOf[js.Any], Multiply = Multiply.asInstanceOf[js.Any], Noise = Noise.asInstanceOf[js.Any], Pixelate = Pixelate.asInstanceOf[js.Any], RemoveWhite = RemoveWhite.asInstanceOf[js.Any], Resize = Resize.asInstanceOf[js.Any], Saturation = Saturation.asInstanceOf[js.Any], Sepia = Sepia.asInstanceOf[js.Any], Sepia2 = Sepia2.asInstanceOf[js.Any], Tint = Tint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAllFilters]
  }
}

