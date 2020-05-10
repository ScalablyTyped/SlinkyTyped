package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridExcelExporterSettings
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * An array of strings containing the keys for the columns that will not be exported.
  	 *
  	 */
  var columnsToSkip: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Indicates whether all sublevel data will be exported, or only data under expanded rows.
  	 *
  	 *
  	 * Valid values:
  	 * "allRows" All sublevel data will be exported.
  	 * "expandedRows" Only data under expanded rows will be exported.
  	 */
  var dataExportMode: js.UndefOr[String] = js.native
  /**
  	 * Specifies the name of the excel file that will be generated.
  	 *
  	 */
  var fileName: js.UndefOr[String] = js.native
  /**
  	 * List of export settings which can be used with Grid Excel exporter
  	 */
  var gridFeatureOptions: js.UndefOr[GridExcelExporterSettingsGridFeatureOptions] = js.native
  /**
  	 * Indicates whether excel table styles will be the same as grid styles. This is set to applied by default. Custom grid themes are not supported.
  	 *
  	 *
  	 * Valid values:
  	 * "none" The styles from the grid are not applied to the table region.
  	 * "applied" The styles from the grid are applied to the table region.
  	 */
  var gridStyling: js.UndefOr[String] = js.native
  /**
  	 * List of strings containing the keys for the worksheet columns which will not be applied any filtering
  	 *
  	 */
  var skipFilteringOn: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Specifies the excel table style region. The following table styles are available:
  	 * TableStyleMedium[1-28]
  	 * TableStyleLight[1-21]
  	 * TableStyleDark[1-11]
  	 *
  	 */
  var tableStyle: js.UndefOr[String] = js.native
  /**
  	 * Specifies the worksheet name where the igGrid will be exported.
  	 *
  	 */
  var worksheetName: js.UndefOr[String] = js.native
}

object GridExcelExporterSettings {
  @scala.inline
  def apply(): GridExcelExporterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridExcelExporterSettings]
  }
  @scala.inline
  implicit class GridExcelExporterSettingsOps[Self <: GridExcelExporterSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnsToSkip(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsToSkip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnsToSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsToSkip")(js.undefined)
        ret
    }
    @scala.inline
    def withDataExportMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataExportMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataExportMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataExportMode")(js.undefined)
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
    def withGridFeatureOptions(value: GridExcelExporterSettingsGridFeatureOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridFeatureOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridFeatureOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridFeatureOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withGridStyling(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridStyling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridStyling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridStyling")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipFilteringOn(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFilteringOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipFilteringOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFilteringOn")(js.undefined)
        ret
    }
    @scala.inline
    def withTableStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withWorksheetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksheetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorksheetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksheetName")(js.undefined)
        ret
    }
  }
  
}

