package typingsSlinky.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonFilterColor extends js.Object {
  var buttonFilterColor: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var disabledTextColor: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var fontWeight: js.UndefOr[Double] = js.native
  var primaryTextColor: js.UndefOr[String] = js.native
  var secondaryTextColor: js.UndefOr[String] = js.native
  var textColor: js.UndefOr[String] = js.native
}

object ButtonFilterColor {
  @scala.inline
  def apply(): ButtonFilterColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonFilterColor]
  }
  @scala.inline
  implicit class ButtonFilterColorOps[Self <: ButtonFilterColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonFilterColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonFilterColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonFilterColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonFilterColor")(js.undefined)
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
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryTextColor")(js.undefined)
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

