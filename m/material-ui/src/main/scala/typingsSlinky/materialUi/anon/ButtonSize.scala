package typingsSlinky.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonSize extends js.Object {
  var buttonSize: js.UndefOr[Double] = js.native
  var color: js.UndefOr[String] = js.native
  var disabledColor: js.UndefOr[String] = js.native
  var disabledTextColor: js.UndefOr[String] = js.native
  var iconColor: js.UndefOr[String] = js.native
  var miniSize: js.UndefOr[Double] = js.native
  var secondaryColor: js.UndefOr[String] = js.native
  var secondaryIconColor: js.UndefOr[String] = js.native
}

object ButtonSize {
  @scala.inline
  def apply(): ButtonSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonSize]
  }
  @scala.inline
  implicit class ButtonSizeOps[Self <: ButtonSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonSize")(js.undefined)
        ret
    }
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
    def withDisabledColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withIconColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMiniSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miniSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiniSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miniSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryIconColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryIconColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryIconColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryIconColor")(js.undefined)
        ret
    }
  }
  
}

