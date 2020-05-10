package typingsSlinky.officeUiFabricReact.colorPickerBasicExampleMod

import typingsSlinky.officeUiFabricReact.interfacesMod.IColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBasicColorPickerExampleState extends js.Object {
  var alphaSliderHidden: Boolean = js.native
  var color: IColor = js.native
  var showPreview: Boolean = js.native
}

object IBasicColorPickerExampleState {
  @scala.inline
  def apply(alphaSliderHidden: Boolean, color: IColor, showPreview: Boolean): IBasicColorPickerExampleState = {
    val __obj = js.Dynamic.literal(alphaSliderHidden = alphaSliderHidden.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], showPreview = showPreview.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBasicColorPickerExampleState]
  }
  @scala.inline
  implicit class IBasicColorPickerExampleStateOps[Self <: IBasicColorPickerExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlphaSliderHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaSliderHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: IColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowPreview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPreview")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

