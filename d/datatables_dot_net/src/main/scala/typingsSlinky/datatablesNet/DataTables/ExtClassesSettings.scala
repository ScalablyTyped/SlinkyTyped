package typingsSlinky.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtClassesSettings extends js.Object {
  /**
    * Default Value:
    * dataTables_filter
    */
  var sFilter: js.UndefOr[String] = js.native
  var sFilterInput: js.UndefOr[String] = js.native
  var sFooterTH: js.UndefOr[String] = js.native
  var sHeaderTH: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_info
    */
  var sInfo: js.UndefOr[String] = js.native
  var sJUIFooter: js.UndefOr[String] = js.native
  var sJUIHeader: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_length
    */
  var sLength: js.UndefOr[String] = js.native
  var sLengthSelect: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * no-footer
    */
  var sNoFooter: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * paginate_button
    */
  var sPageButton: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * current
    */
  var sPageButtonActive: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * disabled
    */
  var sPageButtonDisabled: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_paginate paging_
    */
  var sPaging: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_processing
    */
  var sProcessing: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_empty
    */
  var sRowEmpty: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_scrollBody
    */
  var sScrollBody: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_scrollFoot
    */
  var sScrollFoot: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_scrollFootInner
    */
  var sScrollFootInner: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_scrollHead
    */
  var sScrollHead: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_scrollHeadInner
    */
  var sScrollHeadInner: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_scroll
    */
  var sScrollWrapper: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * sorting_asc
    */
  var sSortAsc: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * sorting_
    */
  var sSortColumn: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * sorting_desc
    */
  var sSortDesc: js.UndefOr[String] = js.native
  var sSortIcon: js.UndefOr[String] = js.native
  var sSortJUI: js.UndefOr[String] = js.native
  var sSortJUIAsc: js.UndefOr[String] = js.native
  var sSortJUIAscAllowed: js.UndefOr[String] = js.native
  var sSortJUIDesc: js.UndefOr[String] = js.native
  var sSortJUIDescAllowed: js.UndefOr[String] = js.native
  var sSortJUIWrapper: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * sorting
    */
  var sSortable: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * sorting_asc_disabled
    */
  var sSortableAsc: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * sorting_desc_disabled
    */
  var sSortableDesc: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * sorting_disabled
    */
  var sSortableNone: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * even
    */
  var sStripeEven: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * odd
    */
  var sStripeOdd: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTable
    */
  var sTable: js.UndefOr[String] = js.native
  /**
    * Default Value:
    * dataTables_wrapper
    */
  var sWrapper: js.UndefOr[String] = js.native
}

object ExtClassesSettings {
  @scala.inline
  def apply(): ExtClassesSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtClassesSettings]
  }
  @scala.inline
  implicit class ExtClassesSettingsOps[Self <: ExtClassesSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withSFilterInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sFilterInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSFilterInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sFilterInput")(js.undefined)
        ret
    }
    @scala.inline
    def withSFooterTH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sFooterTH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSFooterTH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sFooterTH")(js.undefined)
        ret
    }
    @scala.inline
    def withSHeaderTH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sHeaderTH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSHeaderTH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sHeaderTH")(js.undefined)
        ret
    }
    @scala.inline
    def withSInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSJUIFooter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sJUIFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSJUIFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sJUIFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withSJUIHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sJUIHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSJUIHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sJUIHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withSLength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sLength")(js.undefined)
        ret
    }
    @scala.inline
    def withSLengthSelect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sLengthSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSLengthSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sLengthSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withSNoFooter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sNoFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSNoFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sNoFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withSPageButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sPageButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSPageButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sPageButton")(js.undefined)
        ret
    }
    @scala.inline
    def withSPageButtonActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sPageButtonActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSPageButtonActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sPageButtonActive")(js.undefined)
        ret
    }
    @scala.inline
    def withSPageButtonDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sPageButtonDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSPageButtonDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sPageButtonDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSPaging(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sPaging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSPaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sPaging")(js.undefined)
        ret
    }
    @scala.inline
    def withSProcessing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sProcessing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSProcessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sProcessing")(js.undefined)
        ret
    }
    @scala.inline
    def withSRowEmpty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sRowEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSRowEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sRowEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withSScrollBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sScrollBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSScrollBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sScrollBody")(js.undefined)
        ret
    }
    @scala.inline
    def withSScrollFoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sScrollFoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSScrollFoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sScrollFoot")(js.undefined)
        ret
    }
    @scala.inline
    def withSScrollFootInner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sScrollFootInner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSScrollFootInner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sScrollFootInner")(js.undefined)
        ret
    }
    @scala.inline
    def withSScrollHead(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sScrollHead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSScrollHead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sScrollHead")(js.undefined)
        ret
    }
    @scala.inline
    def withSScrollHeadInner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sScrollHeadInner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSScrollHeadInner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sScrollHeadInner")(js.undefined)
        ret
    }
    @scala.inline
    def withSScrollWrapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sScrollWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSScrollWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sScrollWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withSSortAsc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortAsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSortAsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortAsc")(js.undefined)
        ret
    }
    @scala.inline
    def withSSortColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSortColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withSSortDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSortDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withSSortIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSortIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSSortJUI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortJUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSortJUI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortJUI")(js.undefined)
        ret
    }
    @scala.inline
    def withSSortJUIAsc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortJUIAsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSortJUIAsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortJUIAsc")(js.undefined)
        ret
    }
    @scala.inline
    def withSSortJUIAscAllowed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortJUIAscAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSortJUIAscAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortJUIAscAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withSSortJUIDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortJUIDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSortJUIDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortJUIDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withSSortJUIDescAllowed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortJUIDescAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSortJUIDescAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortJUIDescAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withSSortJUIWrapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortJUIWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSortJUIWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortJUIWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withSSortable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortable")(js.undefined)
        ret
    }
    @scala.inline
    def withSSortableAsc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortableAsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSortableAsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortableAsc")(js.undefined)
        ret
    }
    @scala.inline
    def withSSortableDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortableDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSortableDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortableDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withSSortableNone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortableNone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSortableNone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSortableNone")(js.undefined)
        ret
    }
    @scala.inline
    def withSStripeEven(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sStripeEven")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSStripeEven: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sStripeEven")(js.undefined)
        ret
    }
    @scala.inline
    def withSStripeOdd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sStripeOdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSStripeOdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sStripeOdd")(js.undefined)
        ret
    }
    @scala.inline
    def withSTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sTable")(js.undefined)
        ret
    }
    @scala.inline
    def withSWrapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sWrapper")(js.undefined)
        ret
    }
  }
  
}

