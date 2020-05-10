package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormItemLayout extends js.Object {
  var componentHeight: js.UndefOr[Double | String] = js.native
  var componentWidth: js.UndefOr[Double | String] = js.native
  var horizontal: js.UndefOr[Boolean] = js.native
  var info: js.UndefOr[String] = js.native
  var titleFontSize: js.UndefOr[Double | String] = js.native
}

object FormItemLayout {
  @scala.inline
  def apply(): FormItemLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormItemLayout]
  }
  @scala.inline
  implicit class FormItemLayoutOps[Self <: FormItemLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFontSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontSize")(js.undefined)
        ret
    }
  }
  
}

