package typingsSlinky.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourcePagerOptions extends js.Object {
  /** Allows to set the page number in the categorical axis to be loaded by default.
    * @Default {1}
    */
  var categoricalCurrentPage: js.UndefOr[Double] = js.native
  /** Allows to set the number of categorical columns to be displayed in each page on applying the paging.
    * @Default {0}
    */
  var categoricalPageSize: js.UndefOr[Double] = js.native
  /** Allows to set the page number in the series axis to be loaded by default.
    * @Default {1}
    */
  var seriesCurrentPage: js.UndefOr[Double] = js.native
  /** Allows to set the number of series rows to be displayed in each page on applying the paging.
    * @Default {0}
    */
  var seriesPageSize: js.UndefOr[Double] = js.native
}

object DataSourcePagerOptions {
  @scala.inline
  def apply(): DataSourcePagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourcePagerOptions]
  }
  @scala.inline
  implicit class DataSourcePagerOptionsOps[Self <: DataSourcePagerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoricalCurrentPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoricalCurrentPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoricalCurrentPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoricalCurrentPage")(js.undefined)
        ret
    }
    @scala.inline
    def withCategoricalPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoricalPageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoricalPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoricalPageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesCurrentPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesCurrentPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesCurrentPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesCurrentPage")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesPageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesPageSize")(js.undefined)
        ret
    }
  }
  
}

