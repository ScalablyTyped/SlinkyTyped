package typingsSlinky.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClockCircleColor extends js.Object {
  var accentColor: js.UndefOr[String] = js.native
  var clockCircleColor: js.UndefOr[String] = js.native
  var clockColor: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var headerColor: js.UndefOr[String] = js.native
  var selectColor: js.UndefOr[String] = js.native
  var selectTextColor: js.UndefOr[String] = js.native
  var textColor: js.UndefOr[String] = js.native
}

object AnonClockCircleColor {
  @scala.inline
  def apply(): AnonClockCircleColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonClockCircleColor]
  }
  @scala.inline
  implicit class AnonClockCircleColorOps[Self <: AnonClockCircleColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccentColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccentColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentColor")(js.undefined)
        ret
    }
    @scala.inline
    def withClockCircleColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockCircleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClockCircleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockCircleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withClockColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClockColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockColor")(js.undefined)
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
    def withHeaderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
  }
  
}

