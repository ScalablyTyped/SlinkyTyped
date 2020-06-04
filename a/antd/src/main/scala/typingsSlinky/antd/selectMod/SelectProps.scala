package typingsSlinky.antd.selectMod

import typingsSlinky.antd.antdStrings.multiple
import typingsSlinky.antd.antdStrings.tags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof antd.antd/lib/select.InternalSelectProps<VT>, 'inputIcon' | 'mode' | 'getInputElement' | 'backfill'> ]: antd.antd/lib/select.InternalSelectProps<VT>[P]} */ trait SelectProps[VT] extends js.Object {
  var mode: js.UndefOr[multiple | tags] = js.undefined
}

object SelectProps {
  @scala.inline
  def apply[VT](): SelectProps[VT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectProps[VT]]
  }
  @scala.inline
  implicit class SelectPropsOps[Self <: SelectProps[_], VT] (val x: Self with SelectProps[VT]) extends AnyVal {
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
    def setMode(value: multiple | tags): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

