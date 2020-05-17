package typingsSlinky.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxColor extends js.Object {
  var boxColor: js.UndefOr[String] = js.native
  var checkedColor: js.UndefOr[String] = js.native
  var disabledColor: js.UndefOr[String] = js.native
  var labelColor: js.UndefOr[String] = js.native
  var labelDisabledColor: js.UndefOr[String] = js.native
  var requiredColor: js.UndefOr[String] = js.native
}

object BoxColor {
  @scala.inline
  def apply(): BoxColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxColor]
  }
  @scala.inline
  implicit class BoxColorOps[Self <: BoxColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoxColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckedColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedColor")(js.undefined)
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
    def withLabelColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelDisabledColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDisabledColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelDisabledColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDisabledColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredColor")(js.undefined)
        ret
    }
  }
  
}

