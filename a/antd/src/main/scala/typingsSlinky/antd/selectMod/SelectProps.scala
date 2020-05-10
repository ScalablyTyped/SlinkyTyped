package typingsSlinky.antd.selectMod

import typingsSlinky.antd.antdStrings.multiple
import typingsSlinky.antd.antdStrings.tags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof antd.antd/lib/select.InternalSelectProps<VT>, 'inputIcon' | 'mode' | 'getInputElement' | 'backfill'> ]: antd.antd/lib/select.InternalSelectProps<VT>[P]} */ @js.native
trait SelectProps[VT] extends js.Object {
  var mode: js.UndefOr[multiple | tags] = js.native
}

object SelectProps {
  @scala.inline
  def apply[VT](): SelectProps[VT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectProps[VT]]
  }
  @scala.inline
  implicit class SelectPropsOps[Self[vt] <: SelectProps[vt], VT] (val x: Self[VT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[VT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[VT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[VT] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[VT] with Other]
    @scala.inline
    def withMode(value: multiple | tags): Self[VT] = {
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
  }
  
}

