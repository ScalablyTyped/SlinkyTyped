package typingsSlinky.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLabelColor extends js.Object {
  var labelColor: js.UndefOr[String] = js.native
  var labelDisabledColor: js.UndefOr[String] = js.native
  var thumbDisabledColor: js.UndefOr[String] = js.native
  var thumbOffColor: js.UndefOr[String] = js.native
  var thumbOnColor: js.UndefOr[String] = js.native
  var thumbRequiredColor: js.UndefOr[String] = js.native
  var trackDisabledColor: js.UndefOr[String] = js.native
  var trackOffColor: js.UndefOr[String] = js.native
  var trackOnColor: js.UndefOr[String] = js.native
  var trackRequiredColor: js.UndefOr[String] = js.native
}

object AnonLabelColor {
  @scala.inline
  def apply(): AnonLabelColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLabelColor]
  }
  @scala.inline
  implicit class AnonLabelColorOps[Self <: AnonLabelColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withThumbDisabledColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbDisabledColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbDisabledColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbDisabledColor")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbOffColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbOffColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbOffColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbOffColor")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbOnColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbOnColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbOnColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbOnColor")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbRequiredColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbRequiredColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbRequiredColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbRequiredColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackDisabledColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackDisabledColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackDisabledColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackDisabledColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackOffColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackOffColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackOffColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackOffColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackOnColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackOnColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackOnColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackOnColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackRequiredColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackRequiredColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackRequiredColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackRequiredColor")(js.undefined)
        ret
    }
  }
  
}

