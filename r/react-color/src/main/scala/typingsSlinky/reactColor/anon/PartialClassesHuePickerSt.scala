package typingsSlinky.reactColor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<reactcss.reactcss.Classes<react-color.react-color/lib/components/hue/Hue.HuePickerStylesProps>> */
@js.native
trait PartialClassesHuePickerSt extends js.Object {
  
  var default: js.UndefOr[PartialHuePickerStylesPro] = js.native
}
object PartialClassesHuePickerSt {
  
  @scala.inline
  def apply(): PartialClassesHuePickerSt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesHuePickerSt]
  }
  
  @scala.inline
  implicit class PartialClassesHuePickerStOps[Self <: PartialClassesHuePickerSt] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: PartialHuePickerStylesPro): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
  }
}
