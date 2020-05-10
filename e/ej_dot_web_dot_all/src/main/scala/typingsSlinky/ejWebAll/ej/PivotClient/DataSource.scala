package typingsSlinky.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSource extends js.Object {
  /** In connection with an OLAP database, this property contains the database name as string to fetch the data from the given connection string.
    * @Default {â€œâ€}
    */
  var catalog: js.UndefOr[String] = js.native
  /** Lists out the items to be arranged in the columns section of the pivot client.
    * @Default {[]}
    */
  var columns: js.UndefOr[js.Array[DataSourceColumn]] = js.native
  /** Contains the respective cube name from the OLAP database as string type.
    * @Default {â€œâ€}
    */
  var cube: js.UndefOr[String] = js.native
  /** Provides the raw data source for the pivot client.
    * @Default {null}
    */
  var data: js.UndefOr[js.Any] = js.native
  /** Allows you to filter the members (by its name and values) through the advanced filtering (e.g., Microsoft Excel) option in the client-mode.
    * @Default {false}
    */
  var enableAdvancedFilter: js.UndefOr[Boolean] = js.native
  /** Lists out the items which supports filtering of values without displaying the members in UI of the pivot client.
    * @Default {[]}
    */
  var filters: js.UndefOr[js.Array[DataSourceFilter]] = js.native
  /** Allows to set the page size and current page number for each axis on applying the paging.
    * @Default {{}}
    */
  var pagerOptions: js.UndefOr[DataSourcePagerOptions] = js.native
  /** Sets the provider name for the pivot client to identify whether the provider is SSAS or Mondrian.
    * @Default {ssas}
    */
  var providerName: js.UndefOr[String] = js.native
  /** Sets a name to the report bound to the control.
    */
  var reportName: js.UndefOr[String] = js.native
  /** Lists out the items to be arranged in the rows section of the pivot client.
    * @Default {[]}
    */
  var rows: js.UndefOr[js.Array[DataSourceRow]] = js.native
  /** Allows to set the data source name to fetch the data from that.
    * @Default {â€œâ€}
    */
  var sourceInfo: js.UndefOr[String] = js.native
  /** Lists out the items which supports calculation in the pivot client.
    * @Default {[]}
    */
  var values: js.UndefOr[js.Array[DataSourceValue]] = js.native
}

object DataSource {
  @scala.inline
  def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  @scala.inline
  implicit class DataSourceOps[Self <: DataSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCatalog(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatalog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalog")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[DataSourceColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withCube(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cube")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCube: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cube")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAdvancedFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAdvancedFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAdvancedFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAdvancedFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[DataSourceFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withPagerOptions(value: DataSourcePagerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerName")(js.undefined)
        ret
    }
    @scala.inline
    def withReportName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportName")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[DataSourceRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[DataSourceValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

