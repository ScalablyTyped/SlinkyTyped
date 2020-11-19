package typingsSlinky.officeUiFabricReact.swatchColorPickerBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISwatchColorPickerState extends js.Object {
  
  var selectedIndex: js.UndefOr[Double] = js.native
}
object ISwatchColorPickerState {
  
  @scala.inline
  def apply(): ISwatchColorPickerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISwatchColorPickerState]
  }
  
  @scala.inline
  implicit class ISwatchColorPickerStateOps[Self <: ISwatchColorPickerState] (val x: Self) extends AnyVal {
    
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
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedIndex: Self = this.set("selectedIndex", js.undefined)
  }
}
