package typingsSlinky.officeUiFabricReact.swatchColorPickerBasicExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBasicSwatchColorPickerExampleState extends js.Object {
  var color: js.UndefOr[String] = js.native
  var color2: js.UndefOr[String] = js.native
  var previewColor: js.UndefOr[String] = js.native
  var previewColor2: js.UndefOr[String] = js.native
}

object IBasicSwatchColorPickerExampleState {
  @scala.inline
  def apply(): IBasicSwatchColorPickerExampleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBasicSwatchColorPickerExampleState]
  }
  @scala.inline
  implicit class IBasicSwatchColorPickerExampleStateOps[Self <: IBasicSwatchColorPickerExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withColor2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color2")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewColor2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewColor2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewColor2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewColor2")(js.undefined)
        ret
    }
  }
  
}

