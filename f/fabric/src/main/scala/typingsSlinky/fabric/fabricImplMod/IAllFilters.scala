package typingsSlinky.fabric.fabricImplMod

import typingsSlinky.fabric.anon.FromObject
import typingsSlinky.fabric.anon.Instantiable
import typingsSlinky.fabric.anon.InstantiableFromObject
import typingsSlinky.fabric.anon.InstantiableIBrightnessFilter
import typingsSlinky.fabric.anon.InstantiableIColorMatrix
import typingsSlinky.fabric.anon.InstantiableIContrastFilter
import typingsSlinky.fabric.anon.InstantiableIConvoluteFilter
import typingsSlinky.fabric.anon.InstantiableIGradientTransparencyFilter
import typingsSlinky.fabric.anon.InstantiableIGrayscaleFilter
import typingsSlinky.fabric.anon.InstantiableIInvertFilter
import typingsSlinky.fabric.anon.InstantiableIMaskFilter
import typingsSlinky.fabric.anon.InstantiableIMultiplyFilter
import typingsSlinky.fabric.anon.InstantiableINoiseFilter
import typingsSlinky.fabric.anon.InstantiableIPixelateFilter
import typingsSlinky.fabric.anon.InstantiableIRemoveWhiteFilter
import typingsSlinky.fabric.anon.InstantiableIResizeFilter
import typingsSlinky.fabric.anon.InstantiableISaturationFilter
import typingsSlinky.fabric.anon.InstantiableISepia2Filter
import typingsSlinky.fabric.anon.InstantiableISepiaFilter
import typingsSlinky.fabric.anon.InstantiableITintFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////
// Filters
////////////////////////////////////////////////////////////
@js.native
trait IAllFilters extends js.Object {
  var BaseFilter: Instantiable = js.native
  var BlendColor: FromObject = js.native
  var BlendImage: InstantiableFromObject = js.native
  var Brightness: InstantiableIBrightnessFilter = js.native
  var ColorMatrix: InstantiableIColorMatrix = js.native
  var Contrast: InstantiableIContrastFilter = js.native
  var Convolute: InstantiableIConvoluteFilter = js.native
  var GradientTransparency: InstantiableIGradientTransparencyFilter = js.native
  var Grayscale: InstantiableIGrayscaleFilter = js.native
  var Invert: InstantiableIInvertFilter = js.native
  var Mask: InstantiableIMaskFilter = js.native
  var Multiply: InstantiableIMultiplyFilter = js.native
  var Noise: InstantiableINoiseFilter = js.native
  var Pixelate: InstantiableIPixelateFilter = js.native
  var RemoveWhite: InstantiableIRemoveWhiteFilter = js.native
  var Resize: InstantiableIResizeFilter = js.native
  var Saturation: InstantiableISaturationFilter = js.native
  var Sepia: InstantiableISepiaFilter = js.native
  var Sepia2: InstantiableISepia2Filter = js.native
  var Tint: InstantiableITintFilter = js.native
}

object IAllFilters {
  @scala.inline
  def apply(
    BaseFilter: Instantiable,
    BlendColor: FromObject,
    BlendImage: InstantiableFromObject,
    Brightness: InstantiableIBrightnessFilter,
    ColorMatrix: InstantiableIColorMatrix,
    Contrast: InstantiableIContrastFilter,
    Convolute: InstantiableIConvoluteFilter,
    GradientTransparency: InstantiableIGradientTransparencyFilter,
    Grayscale: InstantiableIGrayscaleFilter,
    Invert: InstantiableIInvertFilter,
    Mask: InstantiableIMaskFilter,
    Multiply: InstantiableIMultiplyFilter,
    Noise: InstantiableINoiseFilter,
    Pixelate: InstantiableIPixelateFilter,
    RemoveWhite: InstantiableIRemoveWhiteFilter,
    Resize: InstantiableIResizeFilter,
    Saturation: InstantiableISaturationFilter,
    Sepia: InstantiableISepiaFilter,
    Sepia2: InstantiableISepia2Filter,
    Tint: InstantiableITintFilter
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
    def withBaseFilter(value: Instantiable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlendColor(value: FromObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlendColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlendImage(value: InstantiableFromObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlendImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrightness(value: InstantiableIBrightnessFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Brightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorMatrix(value: InstantiableIColorMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContrast(value: InstantiableIContrastFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Contrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConvolute(value: InstantiableIConvoluteFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Convolute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradientTransparency(value: InstantiableIGradientTransparencyFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GradientTransparency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrayscale(value: InstantiableIGrayscaleFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Grayscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvert(value: InstantiableIInvertFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Invert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMask(value: InstantiableIMaskFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiply(value: InstantiableIMultiplyFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Multiply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoise(value: InstantiableINoiseFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Noise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelate(value: InstantiableIPixelateFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pixelate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveWhite(value: InstantiableIRemoveWhiteFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveWhite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResize(value: InstantiableIResizeFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaturation(value: InstantiableISaturationFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Saturation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSepia(value: InstantiableISepiaFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sepia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSepia2(value: InstantiableISepia2Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sepia2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTint(value: InstantiableITintFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

