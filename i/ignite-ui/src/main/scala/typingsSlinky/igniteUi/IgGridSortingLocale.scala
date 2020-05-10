package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridSortingLocale
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Ascending text used for header title.
  	 *
  	 */
  var ascending: js.UndefOr[String] = js.native
  /**
  	 * Descending text used for header title.
  	 *
  	 */
  var descending: js.UndefOr[String] = js.native
  /**
  	 * Specifies the text shown in the feature chooser item for sorting in ascending order (displayed only on touch environment).
  	 *
  	 */
  var featureChooserSortAsc: js.UndefOr[String] = js.native
  /**
  	 * Specifies the text shown in the feature chooser item for sorting in descending order (displayed only on touch environment).
  	 *
  	 */
  var featureChooserSortDesc: js.UndefOr[String] = js.native
  /**
  	 * Specifies the text of the feature chooser sorting button.
  	 *
  	 */
  var featureChooserText: js.UndefOr[String] = js.native
  /**
  	 * Specifies text of button which applies changes in modal dialog.
  	 *
  	 */
  var modalDialogButtonApplyText: js.UndefOr[String] = js.native
  /**
  	 * Specifies text of button which cancels the changes in the advanced sorting modal dialog.
  	 *
  	 */
  var modalDialogButtonCancelText: js.UndefOr[String] = js.native
  /**
  	 * Specifies caption for each ascending sorted column in multiple sorting dialog.
  	 *
  	 */
  var modalDialogCaptionButtonAsc: js.UndefOr[String] = js.native
  /**
  	 * Specifies caption for each descending sorted column in multiple sorting dialog.
  	 *
  	 */
  var modalDialogCaptionButtonDesc: js.UndefOr[String] = js.native
  /**
  	 * Specifies caption for unsort button in multiple sorting dialog.
  	 *
  	 */
  var modalDialogCaptionButtonUnsort: js.UndefOr[String] = js.native
  /**
  	 * Specifies caption text for multiple sorting dialog.
  	 *
  	 */
  var modalDialogCaptionText: js.UndefOr[String] = js.native
  /**
  	 * Specifies reset button text in the modal dialog.
  	 *
  	 */
  var modalDialogResetButton: js.UndefOr[String] = js.native
  /**
  	 * Specifies sortby button text for each unsorted column in multiple sorting dialog.
  	 *
  	 */
  var modalDialogSortByButtonText: js.UndefOr[String] = js.native
  /**
  	 * Custom sorted column tooltip in [igTemplating](http://www.igniteui.com/help/igtemplating-overview) format.
  	 *
  	 */
  var sortedColumnTooltip: js.UndefOr[String] = js.native
  /**
  	 * Unsorted column tooltip.
  	 *
  	 */
  var unsortedColumnTooltip: js.UndefOr[String] = js.native
}

object IgGridSortingLocale {
  @scala.inline
  def apply(): IgGridSortingLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridSortingLocale]
  }
  @scala.inline
  implicit class IgGridSortingLocaleOps[Self <: IgGridSortingLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAscending(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAscending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascending")(js.undefined)
        ret
    }
    @scala.inline
    def withDescending(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descending")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureChooserSortAsc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserSortAsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureChooserSortAsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserSortAsc")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureChooserSortDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserSortDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureChooserSortDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureChooserSortDesc")(js.undefined)
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
    def withModalDialogButtonApplyText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogButtonApplyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogButtonApplyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogButtonApplyText")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogButtonCancelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogButtonCancelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogButtonCancelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogButtonCancelText")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogCaptionButtonAsc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionButtonAsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogCaptionButtonAsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionButtonAsc")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogCaptionButtonDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionButtonDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogCaptionButtonDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionButtonDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogCaptionButtonUnsort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionButtonUnsort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogCaptionButtonUnsort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionButtonUnsort")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogCaptionText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogCaptionText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionText")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogResetButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogResetButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogResetButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogResetButton")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogSortByButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogSortByButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogSortByButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogSortByButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withSortedColumnTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortedColumnTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortedColumnTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortedColumnTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsortedColumnTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsortedColumnTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsortedColumnTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsortedColumnTooltip")(js.undefined)
        ret
    }
  }
  
}

