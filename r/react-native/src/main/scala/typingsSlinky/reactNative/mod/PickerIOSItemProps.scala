package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickerIOSItemProps extends js.Object {
  
  var label: js.UndefOr[String] = js.native
  
  var textColor: js.UndefOr[ProcessedColorValue] = js.native
  
  var value: js.UndefOr[String | Double] = js.native
}
object PickerIOSItemProps {
  
  @scala.inline
  def apply(): PickerIOSItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickerIOSItemProps]
  }
  
  @scala.inline
  implicit class PickerIOSItemPropsOps[Self <: PickerIOSItemProps] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setTextColor(value: ProcessedColorValue): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
