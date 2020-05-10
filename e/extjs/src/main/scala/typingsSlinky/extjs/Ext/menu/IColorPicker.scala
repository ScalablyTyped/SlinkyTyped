package typingsSlinky.extjs.Ext.menu

import typingsSlinky.extjs.Ext.picker.IColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColorPicker extends IMenu {
  /** [Config Option] (Boolean) */
  var hideOnClick: js.UndefOr[Boolean] = js.native
  /** [Property] (Ext.picker.Color) */
  var picker: js.UndefOr[IColor] = js.native
  /** [Config Option] (String) */
  var pickerId: js.UndefOr[String] = js.native
}

object IColorPicker {
  @scala.inline
  def apply(): IColorPicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColorPicker]
  }
  @scala.inline
  implicit class IColorPickerOps[Self <: IColorPicker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHideOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPicker(value: IColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picker")(js.undefined)
        ret
    }
    @scala.inline
    def withPickerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerId")(js.undefined)
        ret
    }
  }
  
}

