package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridExcelExporterSettingsGridFeatureOptions
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Indicates whether fixed columns will be applied in the exported table. This is set to none by default, but will change to applied if column fixing feature is defined in the igGrid.
  	 *
  	 *
  	 * Valid values:
  	 * "none" No column fixing will be applied in the excel document.
  	 * "applied" Column fixing will be applied in the excel document.
  	 */
  var columnfixing: js.UndefOr[String] = js.native
  /**
  	 * Indicates whether filtering will be applied in the exported table. this is set to none by default, but will change to applied if filtering feature is defined in the igGrid.
  	 *
  	 *
  	 * Valid values:
  	 * "none" No filtering will be applied in the excel document.
  	 * "applied" Filtering will be applied in the excel document.
  	 * "filteredRowsOnly" Filtering will be exported in the excel document.
  	 */
  var filtering: js.UndefOr[String] = js.native
  /**
  	 * Indicates whether hidden columns will be removed from the exported table. This is set to none by default, but will change to applied if hiding feature is defined in the igGrid.
  	 *
  	 *
  	 * Valid values:
  	 * "none" All hidden columns will be exported to the excel document.
  	 * "applied" Hidden columns will be exported as hidden in the excel document.
  	 * "visibleColumnsOnly" Only visible columns will be exported.
  	 */
  var hiding: js.UndefOr[String] = js.native
  /**
  	 * Indicates whether the rows on the current page or entire data will exported.
  	 *
  	 *
  	 * Valid values:
  	 * "currentPage" Only current page will be exported to the excel document.
  	 * "allRows" All pages will be exported to the excel document.
  	 */
  var paging: js.UndefOr[String] = js.native
  /**
  	 * Indicates whether sorting will be applied in the exported table. This is set_ to none by default, but will change to applied if sorting feature is defined in the igGrid.
  	 *
  	 *
  	 * Valid values:
  	 * "none" No sorting will be applied in the excel document.
  	 * "applied" Sorting will be applied in the excel document.
  	 */
  var sorting: js.UndefOr[String] = js.native
  /**
  	 * Indicates whether summaries will be added in the exported table. This is set to none by default, but will change to applied if summaries feature is defined in the igGrid.
  	 *
  	 *
  	 * Valid values:
  	 * "none" No summaries will be exported to the excel document.
  	 * "applied" Summaries will be exported to the excel document.
  	 */
  var summaries: js.UndefOr[String] = js.native
}

object GridExcelExporterSettingsGridFeatureOptions {
  @scala.inline
  def apply(): GridExcelExporterSettingsGridFeatureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridExcelExporterSettingsGridFeatureOptions]
  }
  @scala.inline
  implicit class GridExcelExporterSettingsGridFeatureOptionsOps[Self <: GridExcelExporterSettingsGridFeatureOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnfixing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnfixing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnfixing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnfixing")(js.undefined)
        ret
    }
    @scala.inline
    def withFiltering(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtering")(js.undefined)
        ret
    }
    @scala.inline
    def withHiding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiding")(js.undefined)
        ret
    }
    @scala.inline
    def withPaging(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paging")(js.undefined)
        ret
    }
    @scala.inline
    def withSorting(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaries(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaries")(js.undefined)
        ret
    }
  }
  
}

