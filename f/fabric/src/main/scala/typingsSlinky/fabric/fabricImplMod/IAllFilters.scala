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
@js.native
trait IAllFilters extends js.Object {
  var BaseFilter: AnonInstantiable = js.native
  var BlendColor: AnonFromObject = js.native
  var BlendImage: AnonInstantiableFromObject = js.native
  var Brightness: AnonInstantiableIBrightnessFilter = js.native
  var ColorMatrix: AnonInstantiableIColorMatrix = js.native
  var Contrast: AnonInstantiableIContrastFilter = js.native
  var Convolute: AnonInstantiableIConvoluteFilter = js.native
  var GradientTransparency: AnonInstantiableIGradientTransparencyFilter = js.native
  var Grayscale: AnonInstantiableIGrayscaleFilter = js.native
  var Invert: AnonInstantiableIInvertFilter = js.native
  var Mask: AnonInstantiableIMaskFilter = js.native
  var Multiply: AnonInstantiableIMultiplyFilter = js.native
  var Noise: AnonInstantiableINoiseFilter = js.native
  var Pixelate: AnonInstantiableIPixelateFilter = js.native
  var RemoveWhite: AnonInstantiableIRemoveWhiteFilter = js.native
  var Resize: AnonInstantiableIResizeFilter = js.native
  var Saturation: AnonInstantiableISaturationFilter = js.native
  var Sepia: AnonInstantiableISepiaFilter = js.native
  var Sepia2: AnonInstantiableISepia2Filter = js.native
  var Tint: AnonInstantiableITintFilter = js.native
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
  @scala.inline
  implicit class IAllFiltersOps[Self <: IAllFilters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseFilter(value: AnonInstantiable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlendColor(value: AnonFromObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlendColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlendImage(value: AnonInstantiableFromObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlendImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrightness(value: AnonInstantiableIBrightnessFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Brightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorMatrix(value: AnonInstantiableIColorMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContrast(value: AnonInstantiableIContrastFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Contrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConvolute(value: AnonInstantiableIConvoluteFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Convolute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradientTransparency(value: AnonInstantiableIGradientTransparencyFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GradientTransparency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrayscale(value: AnonInstantiableIGrayscaleFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Grayscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvert(value: AnonInstantiableIInvertFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Invert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMask(value: AnonInstantiableIMaskFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiply(value: AnonInstantiableIMultiplyFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Multiply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoise(value: AnonInstantiableINoiseFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Noise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelate(value: AnonInstantiableIPixelateFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pixelate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveWhite(value: AnonInstantiableIRemoveWhiteFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveWhite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResize(value: AnonInstantiableIResizeFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaturation(value: AnonInstantiableISaturationFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Saturation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSepia(value: AnonInstantiableISepiaFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sepia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSepia2(value: AnonInstantiableISepia2Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sepia2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTint(value: AnonInstantiableITintFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

