package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridGroupByLocale
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies the collapse groups button tooltip.
  	 *
  	 */
  var collapseTooltip: js.UndefOr[String] = js.native
  /**
  	 * Specifies the group by area text.
  	 *
  	 */
  var emptyGroupByAreaContent: js.UndefOr[String] = js.native
  /**
  	 * Specifies the text for the hyperlink which opens the GroupBy Dialog.
  	 *
  	 */
  var emptyGroupByAreaContentSelectColumns: js.UndefOr[String] = js.native
  /**
  	 * Specifies the caption for the hyperlink which opens the GroupBy Dialog.
  	 *
  	 */
  var emptyGroupByAreaContentSelectColumnsCaption: js.UndefOr[String] = js.native
  /**
  	 * Specifies the expand groups button tooltip.
  	 *
  	 */
  var expandTooltip: js.UndefOr[String] = js.native
  /**
  	 * Specifies text of button which apply changes in modal dialog.
  	 *
  	 */
  var modalDialogButtonApplyText: js.UndefOr[String] = js.native
  /**
  	 * Specifies text of button which cancel changes in modal dialog.
  	 *
  	 */
  var modalDialogButtonCancelText: js.UndefOr[String] = js.native
  /**
  	 * Specifies caption for each descending sorted column in GroupBy Dialog.
  	 *
  	 */
  var modalDialogCaptionButtonAsc: js.UndefOr[String] = js.native
  /**
  	 * Specifies caption for each descending sorted column in GroupBy Dialog.
  	 *
  	 */
  var modalDialogCaptionButtonDesc: js.UndefOr[String] = js.native
  /**
  	 * Specifies caption for ungroup button in GroupBy Dialog.
  	 *
  	 */
  var modalDialogCaptionButtonUngroup: js.UndefOr[String] = js.native
  /**
  	 * Specifies caption text for the GroupBy Dialog.
  	 *
  	 */
  var modalDialogCaptionText: js.UndefOr[String] = js.native
  /**
  	 * Specifies label for "Clear all" button in the GroupBy Dialog.
  	 *
  	 */
  var modalDialogClearAllButtonLabel: js.UndefOr[String] = js.native
  /**
  	 * Specifies caption of layouts dropdown button in the GroupBy Dialog.
  	 *
  	 */
  var modalDialogDropDownButtonCaption: js.UndefOr[String] = js.native
  /**
  	 * Specifies label for layouts dropdown in the GroupBy Dialog.
  	 *
  	 */
  var modalDialogDropDownLabel: js.UndefOr[String] = js.native
  /**
  	 * Specifies text for group button in GroupBy Dialog.
  	 *
  	 */
  var modalDialogGroupByButtonText: js.UndefOr[String] = js.native
  /**
  	 * Specifies name of the root layout which is shown for the layouts in the modal dialog tree.
  	 *
  	 */
  var modalDialogRootLevelHierarchicalGrid: js.UndefOr[String] = js.native
  /**
  	 * Specifies the remove group button tooltip.
  	 *
  	 */
  var removeButtonTooltip: js.UndefOr[String] = js.native
  /**
  	 * Specifies the summary icon title.
  	 *
  	 */
  var summaryIconTitle: js.UndefOr[String] = js.native
  /**
  	 * Specifies the summary row title.
  	 *
  	 */
  var summaryRowTitle: js.UndefOr[String] = js.native
}

object IgGridGroupByLocale {
  @scala.inline
  def apply(): IgGridGroupByLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridGroupByLocale]
  }
  @scala.inline
  implicit class IgGridGroupByLocaleOps[Self <: IgGridGroupByLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapseTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyGroupByAreaContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyGroupByAreaContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyGroupByAreaContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyGroupByAreaContent")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyGroupByAreaContentSelectColumns(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyGroupByAreaContentSelectColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyGroupByAreaContentSelectColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyGroupByAreaContentSelectColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyGroupByAreaContentSelectColumnsCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyGroupByAreaContentSelectColumnsCaption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyGroupByAreaContentSelectColumnsCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyGroupByAreaContentSelectColumnsCaption")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandTooltip")(js.undefined)
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
    def withModalDialogCaptionButtonUngroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionButtonUngroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogCaptionButtonUngroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogCaptionButtonUngroup")(js.undefined)
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
    def withModalDialogClearAllButtonLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogClearAllButtonLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogClearAllButtonLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogClearAllButtonLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogDropDownButtonCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogDropDownButtonCaption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogDropDownButtonCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogDropDownButtonCaption")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogDropDownLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogDropDownLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogDropDownLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogDropDownLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogGroupByButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogGroupByButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogGroupByButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogGroupByButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withModalDialogRootLevelHierarchicalGrid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogRootLevelHierarchicalGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialogRootLevelHierarchicalGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialogRootLevelHierarchicalGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveButtonTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeButtonTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveButtonTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeButtonTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryIconTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryIconTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryIconTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryIconTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryRowTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryRowTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryRowTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryRowTitle")(js.undefined)
        ret
    }
  }
  
}

