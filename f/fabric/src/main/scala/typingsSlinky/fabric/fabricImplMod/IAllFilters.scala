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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaseFilter(value: Instantiable): Self = this.set("BaseFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendColor(value: FromObject): Self = this.set("BlendColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendImage(value: InstantiableFromObject): Self = this.set("BlendImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightness(value: InstantiableIBrightnessFilter): Self = this.set("Brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorMatrix(value: InstantiableIColorMatrix): Self = this.set("ColorMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContrast(value: InstantiableIContrastFilter): Self = this.set("Contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvolute(value: InstantiableIConvoluteFilter): Self = this.set("Convolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientTransparency(value: InstantiableIGradientTransparencyFilter): Self = this.set("GradientTransparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrayscale(value: InstantiableIGrayscaleFilter): Self = this.set("Grayscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvert(value: InstantiableIInvertFilter): Self = this.set("Invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMask(value: InstantiableIMaskFilter): Self = this.set("Mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiply(value: InstantiableIMultiplyFilter): Self = this.set("Multiply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoise(value: InstantiableINoiseFilter): Self = this.set("Noise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelate(value: InstantiableIPixelateFilter): Self = this.set("Pixelate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveWhite(value: InstantiableIRemoveWhiteFilter): Self = this.set("RemoveWhite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResize(value: InstantiableIResizeFilter): Self = this.set("Resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaturation(value: InstantiableISaturationFilter): Self = this.set("Saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSepia(value: InstantiableISepiaFilter): Self = this.set("Sepia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSepia2(value: InstantiableISepia2Filter): Self = this.set("Sepia2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTint(value: InstantiableITintFilter): Self = this.set("Tint", value.asInstanceOf[js.Any])
  }
}
