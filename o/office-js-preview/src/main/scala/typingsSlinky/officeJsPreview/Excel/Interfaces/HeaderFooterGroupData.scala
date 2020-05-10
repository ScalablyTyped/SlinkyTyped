package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.HeaderFooterState
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Default
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.FirstAndDefault
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.FirstOddAndEven
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.OddAndEven
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `headerFooterGroup.toJSON()`. */
@js.native
trait HeaderFooterGroupData extends js.Object {
  /**
    *
    * The general header/footer, used for all pages unless even/odd or first page is specified.
    *
    * [Api set: ExcelApi 1.9]
    */
  var defaultForAllPages: js.UndefOr[HeaderFooterData] = js.native
  /**
    *
    * The header/footer to use for even pages, odd header/footer needs to be specified for odd pages.
    *
    * [Api set: ExcelApi 1.9]
    */
  var evenPages: js.UndefOr[HeaderFooterData] = js.native
  /**
    *
    * The first page header/footer, for all other pages general or even/odd is used.
    *
    * [Api set: ExcelApi 1.9]
    */
  var firstPage: js.UndefOr[HeaderFooterData] = js.native
  /**
    *
    * The header/footer to use for odd pages, even header/footer needs to be specified for even pages.
    *
    * [Api set: ExcelApi 1.9]
    */
  var oddPages: js.UndefOr[HeaderFooterData] = js.native
  /**
    *
    * Gets or sets the state of which headers/footers are set. See Excel.HeaderFooterState for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var state: js.UndefOr[HeaderFooterState | Default | FirstAndDefault | OddAndEven | FirstOddAndEven] = js.native
  /**
    *
    * Gets or sets a flag indicating if headers/footers are aligned with the page margins set in the page layout options for the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useSheetMargins: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets a flag indicating if headers/footers should be scaled by the page percentage scale set in the page layout options for the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useSheetScale: js.UndefOr[Boolean] = js.native
}

object HeaderFooterGroupData {
  @scala.inline
  def apply(): HeaderFooterGroupData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderFooterGroupData]
  }
  @scala.inline
  implicit class HeaderFooterGroupDataOps[Self <: HeaderFooterGroupData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultForAllPages(value: HeaderFooterData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultForAllPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultForAllPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultForAllPages")(js.undefined)
        ret
    }
    @scala.inline
    def withEvenPages(value: HeaderFooterData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evenPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvenPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evenPages")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstPage(value: HeaderFooterData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPage")(js.undefined)
        ret
    }
    @scala.inline
    def withOddPages(value: HeaderFooterData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oddPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOddPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oddPages")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: HeaderFooterState | Default | FirstAndDefault | OddAndEven | FirstOddAndEven): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSheetMargins(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSheetMargins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSheetMargins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSheetMargins")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSheetScale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSheetScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSheetScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSheetScale")(js.undefined)
        ret
    }
  }
  
}

