package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPivotDataSelectorDataSourceOptions
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * A list of hierarchy names separated by comma (,). These will be the hierarchies in the columns of the data source.
  	 */
  var columns: js.UndefOr[String] = js.native
  /**
  	 * A list of hierarchy names separated by comma (,). These will be hierarchies in the filters of the data source.
  	 */
  var filters: js.UndefOr[String] = js.native
  /**
  	 * Settings for creating an instance of $.ig.OlapFlatDataSource.
  	 */
  var flatDataOptions: js.UndefOr[IgPivotDataSelectorDataSourceOptionsFlatDataOptions] = js.native
  /**
  	 * A list of measure names separated by comma (,). These will be the measures of the data source.
  	 */
  var measures: js.UndefOr[String] = js.native
  /**
  	 * A list of hierarchy names separated by comma (,). These will be the hierarchies in the rows of the data source.
  	 */
  var rows: js.UndefOr[String] = js.native
  /**
  	 * Settings for creating an instance of $.ig.OlapXmlaDataSource.
  	 */
  var xmlaOptions: js.UndefOr[IgPivotDataSelectorDataSourceOptionsXmlaOptions] = js.native
}

object IgPivotDataSelectorDataSourceOptions {
  @scala.inline
  def apply(): IgPivotDataSelectorDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotDataSelectorDataSourceOptions]
  }
  @scala.inline
  implicit class IgPivotDataSelectorDataSourceOptionsOps[Self <: IgPivotDataSelectorDataSourceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: String): Self = {
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
    def withFilters(value: String): Self = {
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
    def withFlatDataOptions(value: IgPivotDataSelectorDataSourceOptionsFlatDataOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatDataOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlatDataOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatDataOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasures(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measures")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: String): Self = {
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
    def withXmlaOptions(value: IgPivotDataSelectorDataSourceOptionsXmlaOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlaOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlaOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlaOptions")(js.undefined)
        ret
    }
  }
  
}

