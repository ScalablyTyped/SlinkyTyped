package typingsSlinky.rcCascader.cascaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CascaderState extends js.Object {
  var activeValue: js.UndefOr[js.Array[String]] = js.native
  var popupVisible: js.UndefOr[Boolean] = js.native
  var prevProps: js.UndefOr[CascaderProps] = js.native
  var value: js.UndefOr[js.Array[String]] = js.native
}

object CascaderState {
  @scala.inline
  def apply(): CascaderState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CascaderState]
  }
  @scala.inline
  implicit class CascaderStateOps[Self <: CascaderState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveValue(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeValue")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevProps(value: CascaderProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevProps")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

