package typingsSlinky.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * An interface representing all PivotFilters currently applied to a given PivotField.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait PivotFilters extends js.Object {
  /**
    *
    * The PivotField's currently applied date filter. Null if none is applied.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dateFilter: js.UndefOr[PivotDateFilter] = js.native
  /**
    *
    * The PivotField's currently applied label filter. Null if none is applied.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var labelFilter: js.UndefOr[PivotLabelFilter] = js.native
  /**
    *
    * The PivotField's currently applied manual filter. Null if none is applied.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var manualFilter: js.UndefOr[PivotManualFilter] = js.native
  /**
    *
    * The PivotField's currently applied value filter. Null if none is applied.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var valueFilter: js.UndefOr[PivotValueFilter] = js.native
}

object PivotFilters {
  @scala.inline
  def apply(): PivotFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotFilters]
  }
  @scala.inline
  implicit class PivotFiltersOps[Self <: PivotFilters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateFilter(value: PivotDateFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFilter(value: PivotLabelFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withManualFilter(value: PivotManualFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withValueFilter(value: PivotValueFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFilter")(js.undefined)
        ret
    }
  }
  
}

