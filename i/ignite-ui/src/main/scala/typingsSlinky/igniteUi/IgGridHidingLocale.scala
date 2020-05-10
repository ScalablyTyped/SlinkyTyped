package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridHidingLocale
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies the text of the button which applies changes in the modal dialog.
  	 *
  	 */
  var columnChooserButtonApplyText: js.UndefOr[String] = js.native
  /**
  	 * Specifies the text of the button which cancels changes in the modal dialog.
  	 *
  	 */
  var columnChooserButtonCancelText: js.UndefOr[String] = js.native
  /**
  	 * The caption of the column chooser dialog.
  	 *
  	 */
  var columnChooserCaptionLabel: js.UndefOr[String] = js.native
  /**
  	 * The close button tooltip of the column chooser dialog.
  	 *
  	 */
  var columnChooserCloseButtonTooltip: js.UndefOr[String] = js.native
  /**
  	 * The text used in the drop down tools menu(Feature Chooser) to launch the column chooser dialog.
  	 *
  	 */
  var columnChooserDisplayText: js.UndefOr[String] = js.native
  /**
  	 * The text used in the column chooser to hide column.
  	 *
  	 */
  var columnChooserHideText: js.UndefOr[String] = js.native
  /**
  	 * Text label for reset button.
  	 *
  	 */
  var columnChooserResetButtonLabel: js.UndefOr[String] = js.native
  /**
  	 * The text used in the column chooser to show column.
  	 *
  	 */
  var columnChooserShowText: js.UndefOr[String] = js.native
  /**
  	 * The text used in the drop down tools menu(Feature Chooser) to hide a column.
  	 *
  	 */
  var columnHideText: js.UndefOr[String] = js.native
  /**
  	 * The text displayed in the tooltip of the hidden column indicator.
  	 *
  	 */
  var hiddenColumnIndicatorTooltipText: js.UndefOr[String] = js.native
  /**
  	 * Specifies the hiding column icon tooltip.
  	 *
  	 */
  var hideColumnIconTooltip: js.UndefOr[String] = js.native
}

object IgGridHidingLocale {
  @scala.inline
  def apply(): IgGridHidingLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridHidingLocale]
  }
  @scala.inline
  implicit class IgGridHidingLocaleOps[Self <: IgGridHidingLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnChooserButtonApplyText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserButtonApplyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnChooserButtonApplyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserButtonApplyText")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserButtonCancelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserButtonCancelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnChooserButtonCancelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserButtonCancelText")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserCaptionLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserCaptionLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnChooserCaptionLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserCaptionLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserCloseButtonTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserCloseButtonTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnChooserCloseButtonTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserCloseButtonTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserDisplayText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserDisplayText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnChooserDisplayText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserDisplayText")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserHideText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserHideText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnChooserHideText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserHideText")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserResetButtonLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserResetButtonLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnChooserResetButtonLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserResetButtonLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooserShowText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserShowText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnChooserShowText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooserShowText")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHideText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHideText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnHideText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHideText")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenColumnIndicatorTooltipText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenColumnIndicatorTooltipText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenColumnIndicatorTooltipText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenColumnIndicatorTooltipText")(js.undefined)
        ret
    }
    @scala.inline
    def withHideColumnIconTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideColumnIconTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideColumnIconTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideColumnIconTooltip")(js.undefined)
        ret
    }
  }
  
}

