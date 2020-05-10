package typingsSlinky.rcPicker.interfaceMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Components extends js.Object {
  var button: js.UndefOr[ReactComponentClass[js.Object] | String] = js.native
  var rangeItem: js.UndefOr[ReactComponentClass[js.Object] | String] = js.native
}

object Components {
  @scala.inline
  def apply(): Components = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Components]
  }
  @scala.inline
  implicit class ComponentsOps[Self <: Components] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonFunctionComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonComponentClass(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButton(value: ReactComponentClass[js.Object] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeItemFunctionComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeItemComponentClass(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeItem(value: ReactComponentClass[js.Object] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeItem")(js.undefined)
        ret
    }
  }
  
}

