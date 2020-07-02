package typingsSlinky.antd.selectMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.antdStrings.SECRET_COMBOBOX_MODE_DO_NOT_USE
import typingsSlinky.antd.antdStrings.multiple
import typingsSlinky.antd.antdStrings.tags
import typingsSlinky.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof antd.antd/lib/select.SelectProps<VT>, 'mode'> ]: antd.antd/lib/select.SelectProps<VT>[P]} */ trait InternalSelectProps[VT] extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[multiple | tags | SECRET_COMBOBOX_MODE_DO_NOT_USE] = js.undefined
  var size: js.UndefOr[SizeType] = js.undefined
  var suffixIcon: js.UndefOr[ReactElement] = js.undefined
}

object InternalSelectProps {
  @scala.inline
  def apply[VT](): InternalSelectProps[VT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalSelectProps[VT]]
  }
  @scala.inline
  implicit class InternalSelectPropsOps[Self <: InternalSelectProps[_], VT] (val x: Self with InternalSelectProps[VT]) extends AnyVal {
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
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
    @scala.inline
    def setMode(value: multiple | tags | SECRET_COMBOBOX_MODE_DO_NOT_USE): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setSize(value: SizeType): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSuffixIconReactElement(value: ReactElement): Self = this.set("suffixIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuffixIcon(value: ReactElement): Self = this.set("suffixIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffixIcon: Self = this.set("suffixIcon", js.undefined)
  }
  
}

