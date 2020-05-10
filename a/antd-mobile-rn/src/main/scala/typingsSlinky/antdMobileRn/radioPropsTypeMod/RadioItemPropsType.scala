package typingsSlinky.antdMobileRn.radioPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioItemPropsType extends RadioPropsType {
  var onClick: js.UndefOr[js.Function0[_]] = js.native
  var radioProps: js.UndefOr[js.Object] = js.native
}

object RadioItemPropsType {
  @scala.inline
  def apply(): RadioItemPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioItemPropsType]
  }
  @scala.inline
  implicit class RadioItemPropsTypeOps[Self <: RadioItemPropsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClick(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withRadioProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadioProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioProps")(js.undefined)
        ret
    }
  }
  
}

