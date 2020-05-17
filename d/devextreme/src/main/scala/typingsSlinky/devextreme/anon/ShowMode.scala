package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.always
import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.onHover
import typingsSlinky.devextreme.devextremeStrings.top
import typingsSlinky.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowMode extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.ui.format] = js.native
  var position: js.UndefOr[bottom | top] = js.native
  var showMode: js.UndefOr[always | onHover] = js.native
}

object ShowMode {
  @scala.inline
  def apply(): ShowMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowMode]
  }
  @scala.inline
  implicit class ShowModeOps[Self <: ShowMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatFunction1(value: /* value */ Double | js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormat(value: format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: bottom | top): Self = {
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
    def withShowMode(value: always | onHover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMode")(js.undefined)
        ret
    }
  }
  
}

