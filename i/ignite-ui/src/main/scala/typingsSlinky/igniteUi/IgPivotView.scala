package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPivotView
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Configuration settings that will be assigned to the igPivotDataSelector widget.
  	 *
  	 */
  var dataSelectorOptions: js.UndefOr[IgPivotViewDataSelectorOptions] = js.native
  /**
  	 * Configuration settings for the panel containing the igPivotDataSelector.
  	 *
  	 */
  var dataSelectorPanel: js.UndefOr[IgPivotViewDataSelectorPanel] = js.native
  /**
  	 * An instance of $.ig.OlapXmlaDataSource or $.ig.OlapFlatDataSource.
  	 *
  	 */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
  	 * An object that will be used to create an instance of $.ig.OlapXmlaDataSource or $.ig.OlapFlatDataSource.
  	 * The provided value must contain an object with settings for one of the data source types - xmlaOptions or flatDataOptions.
  	 *
  	 */
  var dataSourceOptions: js.UndefOr[IgPivotViewDataSourceOptions] = js.native
  /**
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget height can be set in pixels (px) and percentage (%).
  	 * "number" The widget height can be set as a number.
  	 * "null" will stretch vertically to fit the parent, if no other heights are defined.
  	 */
  var height: js.UndefOr[String | Double] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  /**
  	 * Configuration settings that will be assigned to the igPivotGrid widget.
  	 *
  	 */
  var pivotGridOptions: js.UndefOr[IgPivotViewPivotGridOptions] = js.native
  /**
  	 * Configuration settings for the panel containing the igPivotGrid.
  	 *
  	 */
  var pivotGridPanel: js.UndefOr[IgPivotViewPivotGridPanel] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget width can be set in pixels (px) and percentage (%).
  	 * "number" The widget width can be set as a number.
  	 * "null" will stretch to fit the parent, if no other widths are defined.
  	 */
  var width: js.UndefOr[String | Double] = js.native
}

object IgPivotView {
  @scala.inline
  def apply(): IgPivotView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotView]
  }
  @scala.inline
  implicit class IgPivotViewOps[Self <: IgPivotView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSelectorOptions(value: IgPivotViewDataSelectorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSelectorOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSelectorOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSelectorOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSelectorPanel(value: IgPivotViewDataSelectorPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSelectorPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSelectorPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSelectorPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceOptions(value: IgPivotViewDataSourceOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotGridOptions(value: IgPivotViewPivotGridOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotGridOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotGridOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotGridOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotGridPanel(value: IgPivotViewPivotGridPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotGridPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotGridPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotGridPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withRegional(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

