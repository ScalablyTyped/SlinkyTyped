package typingsSlinky.antd.selectMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antd.antdStrings.SECRET_COMBOBOX_MODE_DO_NOT_USE
import typingsSlinky.antd.antdStrings.multiple
import typingsSlinky.antd.antdStrings.tags
import typingsSlinky.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof antd.antd/lib/select.SelectProps<VT>, 'mode'> ]: antd.antd/lib/select.SelectProps<VT>[P]} */ @js.native
trait InternalSelectProps[VT] extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[multiple | tags | SECRET_COMBOBOX_MODE_DO_NOT_USE] = js.native
  var size: js.UndefOr[SizeType] = js.native
  var suffixIcon: js.UndefOr[TagMod[Any]] = js.native
}

object InternalSelectProps {
  @scala.inline
  def apply[VT](): InternalSelectProps[VT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalSelectProps[VT]]
  }
  @scala.inline
  implicit class InternalSelectPropsOps[Self[vt] <: InternalSelectProps[vt], VT] (val x: Self[VT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[VT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[VT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[VT] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[VT] with Other]
    @scala.inline
    def withBordered(value: Boolean): Self[VT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBordered: Self[VT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordered")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: multiple | tags | SECRET_COMBOBOX_MODE_DO_NOT_USE): Self[VT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self[VT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: SizeType): Self[VT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self[VT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffixIconReactElement(value: ReactElement): Self[VT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuffixIcon(value: TagMod[Any]): Self[VT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffixIcon: Self[VT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixIcon")(js.undefined)
        ret
    }
  }
  
}

