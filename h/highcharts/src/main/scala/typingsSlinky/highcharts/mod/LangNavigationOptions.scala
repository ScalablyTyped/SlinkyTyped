package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LangNavigationOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Translations for all field names used in popup.
    */
  var popup: js.UndefOr[js.Object | LangNavigationPopupOptions] = js.native
}

object LangNavigationOptions {
  @scala.inline
  def apply(): LangNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangNavigationOptions]
  }
  @scala.inline
  implicit class LangNavigationOptionsOps[Self <: LangNavigationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPopup(value: js.Object | LangNavigationPopupOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(js.undefined)
        ret
    }
  }
  
}

