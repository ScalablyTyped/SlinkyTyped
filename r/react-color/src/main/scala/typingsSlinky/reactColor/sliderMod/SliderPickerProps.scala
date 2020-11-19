package typingsSlinky.reactColor.sliderMod

import typingsSlinky.reactColor.anon.PartialClassesSliderPicke
import typingsSlinky.reactColor.mod.ColorPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderPickerProps extends ColorPickerProps[SliderPicker] {
  
  @JSName("styles")
  var styles_SliderPickerProps: js.UndefOr[PartialClassesSliderPicke] = js.native
}
object SliderPickerProps {
  
  @scala.inline
  def apply(): SliderPickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderPickerProps]
  }
  
  @scala.inline
  implicit class SliderPickerPropsOps[Self <: SliderPickerProps] (val x: Self) extends AnyVal {
    
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
    def setStyles(value: PartialClassesSliderPicke): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
