package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridPagingLocale
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Leading label text for the drop down from where the page index can be switched.
  	 *
  	 */
  var currentPageDropDownLeadingLabel: js.UndefOr[String] = js.native
  /**
  	 * Tooltip text for the page index drop down.
  	 *
  	 */
  var currentPageDropDownTooltip: js.UndefOr[String] = js.native
  /**
  	 * Trailing label text for the drop down from where the page index can be switched.
  	 *
  	 */
  var currentPageDropDownTrailingLabel: js.UndefOr[String] = js.native
  /**
  	 * Text for the first page label.
  	 *
  	 */
  var firstPageLabelText: js.UndefOr[String] = js.native
  /**
  	 * Tooltip text for the first page button.
  	 *
  	 */
  var firstPageTooltip: js.UndefOr[String] = js.native
  /**
  	 * Text for the last page label.
  	 *
  	 */
  var lastPageLabelText: js.UndefOr[String] = js.native
  /**
  	 * Tooltip text for the last page button.
  	 *
  	 */
  var lastPageTooltip: js.UndefOr[String] = js.native
  /**
  	 * Text for the next page label.
  	 *
  	 */
  var nextPageLabelText: js.UndefOr[String] = js.native
  /**
  	 * Tooltip text for the next page button.
  	 *
  	 */
  var nextPageTooltip: js.UndefOr[String] = js.native
  /**
  	 * Text rendered in front of the page size dropdown, when [showPageSizeDropDown](ui.iggridpaging#options:showPageSizeDropDown) is set to true.
  	 *
  	 */
  var pageSizeDropDownLabel: js.UndefOr[String] = js.native
  /**
  	 * Tooltip text for the page size drop down.
  	 *
  	 */
  var pageSizeDropDownTooltip: js.UndefOr[String] = js.native
  /**
  	 * Trailing text for the page size dropdown, when [showPageSizeDropDown](ui.iggridpaging#options:showPageSizeDropDown) is set to true.
  	 *
  	 */
  var pageSizeDropDownTrailingLabel: js.UndefOr[String] = js.native
  /**
  	 * Tooltip text templates of buttons that navigate to a particular page. The format string follows the [igTemplating](http://www.igniteui.com/help/igtemplating-overview) style and syntax.
  	 * See also the [pageCountLimit](ui.iggridpaging#options:pageCountLimit) option.
  	 *
  	 */
  var pageTooltipFormat: js.UndefOr[String] = js.native
  /**
  	 * Custom pager records label template - in [igTemplating](http://www.igniteui.com/help/igtemplating-overview) style and syntax.
  	 *
  	 */
  var pagerRecordsLabelTemplate: js.UndefOr[String] = js.native
  /**
  	 * Tooltip text for the pager records label.
  	 *
  	 */
  var pagerRecordsLabelTooltip: js.UndefOr[String] = js.native
  /**
  	 * Text for the previous page label.
  	 *
  	 */
  var prevPageLabelText: js.UndefOr[String] = js.native
  /**
  	 * Tooltip text for the previous page button.
  	 *
  	 */
  var prevPageTooltip: js.UndefOr[String] = js.native
}

object IgGridPagingLocale {
  @scala.inline
  def apply(): IgGridPagingLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridPagingLocale]
  }
  @scala.inline
  implicit class IgGridPagingLocaleOps[Self <: IgGridPagingLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentPageDropDownLeadingLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageDropDownLeadingLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPageDropDownLeadingLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageDropDownLeadingLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentPageDropDownTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageDropDownTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPageDropDownTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageDropDownTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentPageDropDownTrailingLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageDropDownTrailingLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPageDropDownTrailingLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageDropDownTrailingLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstPageLabelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageLabelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstPageLabelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageLabelText")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstPageTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstPageTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withLastPageLabelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPageLabelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastPageLabelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPageLabelText")(js.undefined)
        ret
    }
    @scala.inline
    def withLastPageTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPageTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastPageTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPageTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageLabelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageLabelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageLabelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageLabelText")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSizeDropDownLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeDropDownLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSizeDropDownLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeDropDownLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSizeDropDownTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeDropDownTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSizeDropDownTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeDropDownTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSizeDropDownTrailingLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeDropDownTrailingLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSizeDropDownTrailingLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeDropDownTrailingLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withPageTooltipFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageTooltipFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageTooltipFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageTooltipFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withPagerRecordsLabelTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerRecordsLabelTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagerRecordsLabelTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerRecordsLabelTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withPagerRecordsLabelTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerRecordsLabelTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagerRecordsLabelTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerRecordsLabelTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevPageLabelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevPageLabelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevPageLabelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevPageLabelText")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevPageTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevPageTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevPageTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevPageTooltip")(js.undefined)
        ret
    }
  }
  
}

