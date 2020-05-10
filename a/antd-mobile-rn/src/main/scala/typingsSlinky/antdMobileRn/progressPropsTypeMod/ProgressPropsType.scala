package typingsSlinky.antdMobileRn.progressPropsTypeMod

import typingsSlinky.antdMobileRn.antdMobileRnStrings.fixed
import typingsSlinky.antdMobileRn.antdMobileRnStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressPropsType extends js.Object {
  var appearTransition: js.UndefOr[Boolean] = js.native
  var percent: js.UndefOr[Double] = js.native
  var position: js.UndefOr[fixed | normal] = js.native
  var unfilled: js.UndefOr[Boolean] = js.native
}

object ProgressPropsType {
  @scala.inline
  def apply(): ProgressPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressPropsType]
  }
  @scala.inline
  implicit class ProgressPropsTypeOps[Self <: ProgressPropsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppearTransition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppearTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: fixed | normal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withUnfilled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfilled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnfilled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfilled")(js.undefined)
        ret
    }
  }
  
}

