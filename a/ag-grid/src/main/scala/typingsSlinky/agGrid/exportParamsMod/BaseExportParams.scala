package typingsSlinky.agGrid.exportParamsMod

import typingsSlinky.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseExportParams extends js.Object {
  var allColumns: js.UndefOr[Boolean] = js.native
  var columnGroups: js.UndefOr[Boolean] = js.native
  var columnKeys: js.UndefOr[js.Array[String | Column]] = js.native
  var fileName: js.UndefOr[String] = js.native
  var onlySelected: js.UndefOr[Boolean] = js.native
  var onlySelectedAllPages: js.UndefOr[Boolean] = js.native
  var processCellCallback: js.UndefOr[js.Function1[/* params */ ProcessCellForExportParams, String]] = js.native
  var processHeaderCallback: js.UndefOr[js.Function1[/* params */ ProcessHeaderForExportParams, String]] = js.native
  var shouldRowBeSkipped: js.UndefOr[js.Function1[/* params */ ShouldRowBeSkippedParams, Boolean]] = js.native
  var skipFooters: js.UndefOr[Boolean] = js.native
  var skipGroups: js.UndefOr[Boolean] = js.native
  var skipHeader: js.UndefOr[Boolean] = js.native
  var skipPinnedBottom: js.UndefOr[Boolean] = js.native
  var skipPinnedTop: js.UndefOr[Boolean] = js.native
  var suppressQuotes: js.UndefOr[Boolean] = js.native
}

object BaseExportParams {
  @scala.inline
  def apply(): BaseExportParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseExportParams]
  }
  @scala.inline
  implicit class BaseExportParamsOps[Self <: BaseExportParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnGroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnKeys(value: js.Array[String | Column]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlySelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlySelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlySelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlySelected")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlySelectedAllPages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlySelectedAllPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlySelectedAllPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlySelectedAllPages")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessCellCallback(value: /* params */ ProcessCellForExportParams => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processCellCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProcessCellCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processCellCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessHeaderCallback(value: /* params */ ProcessHeaderForExportParams => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processHeaderCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProcessHeaderCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processHeaderCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldRowBeSkipped(value: /* params */ ShouldRowBeSkippedParams => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRowBeSkipped")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldRowBeSkipped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRowBeSkipped")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipFooters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFooters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipFooters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFooters")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipGroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipPinnedBottom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipPinnedBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipPinnedBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipPinnedBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipPinnedTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipPinnedTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipPinnedTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipPinnedTop")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressQuotes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressQuotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressQuotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressQuotes")(js.undefined)
        ret
    }
  }
  
}

