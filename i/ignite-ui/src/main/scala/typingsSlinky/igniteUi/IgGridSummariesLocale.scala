package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridSummariesLocale
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Text of the button Cancel in the summaries dropdown
  	 *
  	 */
  var dialogButtonCancelText: js.UndefOr[String] = js.native
  /**
  	 * Text of the button OK in the summaries dropdown
  	 *
  	 */
  var dialogButtonOKText: js.UndefOr[String] = js.native
  /**
  	 * Empty text template to be shown for empty cells
  	 *
  	 */
  var emptyCellText: js.UndefOr[String] = js.native
  /**
  	 * Get or set text that is shown in the feature chooser dropdown when summaries are hidden
  	 *
  	 */
  var featureChooserText: js.UndefOr[String] = js.native
  /**
  	 * Get or set text that is shown in the feauture chooser dropdown when summaries are shown
  	 *
  	 */
  var featureChooserTextHide: js.UndefOr[String] = js.native
  /**
  	 * Tooltip text for header cell button
  	 *
  	 */
  var summariesHeaderButtonTooltip: js.UndefOr[String] = js.native
}

object IgGridSummariesLocale {
  @scala.inline
  def apply(): IgGridSummariesLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridSummariesLocale]
  }
  @scala.inline
  implicit class IgGridSummariesLocaleOps[Self <: IgGridSummariesLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialogButtonCancelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogButtonCancelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogButtonCancelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogButtonCancelText")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogButtonOKText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogButtonOKText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogButtonOKText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogButtonOKText")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyCellText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyCellText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyCellText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyCellText")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureChooserText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureChooserText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserText")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureChooserTextHide(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserTextHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureChooserTextHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserTextHide")(js.undefined)
        ret
    }
    @scala.inline
    def withSummariesHeaderButtonTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summariesHeaderButtonTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummariesHeaderButtonTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summariesHeaderButtonTooltip")(js.undefined)
        ret
    }
  }
  
}

