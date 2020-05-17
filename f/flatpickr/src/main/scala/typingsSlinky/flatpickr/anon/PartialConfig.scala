package typingsSlinky.flatpickr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<flatpickr.flatpickr/dist/plugins/monthSelect.Config> */
@js.native
trait PartialConfig extends js.Object {
  var altFormat: js.UndefOr[String] = js.native
  var dateFormat: js.UndefOr[String] = js.native
  var shorthand: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[String] = js.native
}

object PartialConfig {
  @scala.inline
  def apply(): PartialConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfig]
  }
  @scala.inline
  implicit class PartialConfigOps[Self <: PartialConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withShorthand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shorthand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShorthand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shorthand")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

