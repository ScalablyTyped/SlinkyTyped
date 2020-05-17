package typingsSlinky.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typingsSlinky.angularUiBootstrap.anon.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatepickerPopupConfig extends IDatepickerConfig {
  /**
    * A list of alternate formats acceptable for manual entry.
    *
    * @default []
    */
  var altInputFormats: js.UndefOr[js.Array[String]] = js.native
  /**
    * Append the datepicker popup element to `body`, rather than inserting after `datepicker-popup`.
    *
    * @default false
    */
  var appendToBody: js.UndefOr[Boolean] = js.native
  /**
    * The text to display for the clear button.
    *
    * @default 'Clear'
    */
  var clearText: js.UndefOr[String] = js.native
  /**
    * Whether to close calendar when a date is chosen.
    *
    * @default true
    */
  var closeOnDateSelection: js.UndefOr[Boolean] = js.native
  /**
    * The text to display for the close button.
    *
    * @default 'Done'
    */
  var closeText: js.UndefOr[String] = js.native
  /**
    * The text to display for the current day button.
    *
    * @default 'Today'
    */
  var currentText: js.UndefOr[String] = js.native
  /**
    * The format for displayed dates.
    *
    * @default 'yyyy-MM-dd'
    */
  var datepickerPopup: js.UndefOr[String] = js.native
  /**
    * Allows overriding of default template of the popup.
    *
    * @default 'template/datepicker/popup.html'
    */
  var datepickerPopupTemplateUrl: js.UndefOr[String] = js.native
  /**
    * Allows overriding of default template of the datepicker used in popup.
    *
    * @default 'template/datepicker/popup.html'
    */
  var datepickerTemplateUrl: js.UndefOr[String] = js.native
  /**
    * Allows overriding of the default format for html5 date inputs.
    */
  var html5Types: js.UndefOr[Date] = js.native
  /**
    * Whether to focus the datepicker popup upon opening.
    *
    * @default true
    */
  var onOpenFocus: js.UndefOr[Boolean] = js.native
  /**
    * Passing in 'auto' separated by a space before the placement will enable auto positioning, e.g: "auto bottom-left". The popup will attempt to position where it fits in the closest scrollable ancestor.
    *
    * @default 'auto bottom-left'
    */
  var placement: js.UndefOr[String] = js.native
  /**
    * Whether to display a button bar underneath the datepicker.
    *
    * @default true
    */
  var showButtonBar: js.UndefOr[Boolean] = js.native
}

object IDatepickerPopupConfig {
  @scala.inline
  def apply(): IDatepickerPopupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatepickerPopupConfig]
  }
  @scala.inline
  implicit class IDatepickerPopupConfigOps[Self <: IDatepickerPopupConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltInputFormats(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altInputFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltInputFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altInputFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendToBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendToBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendToBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendToBody")(js.undefined)
        ret
    }
    @scala.inline
    def withClearText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearText")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnDateSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnDateSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnDateSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnDateSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeText")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentText")(js.undefined)
        ret
    }
    @scala.inline
    def withDatepickerPopup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datepickerPopup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatepickerPopup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datepickerPopup")(js.undefined)
        ret
    }
    @scala.inline
    def withDatepickerPopupTemplateUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datepickerPopupTemplateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatepickerPopupTemplateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datepickerPopupTemplateUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDatepickerTemplateUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datepickerTemplateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatepickerTemplateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datepickerTemplateUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml5Types(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html5Types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml5Types: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html5Types")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpenFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOpenFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withShowButtonBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showButtonBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowButtonBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showButtonBar")(js.undefined)
        ret
    }
  }
  
}

