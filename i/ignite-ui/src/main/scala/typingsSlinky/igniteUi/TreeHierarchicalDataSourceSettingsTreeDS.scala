package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeHierarchicalDataSourceSettingsTreeDS
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Property name of the array of child data in a hierarchical data source.
  	 */
  var childDataKey: js.UndefOr[String] = js.native
  /**
  	 * Specifies a custom function to be called when requesting data to the server - usually when expanding/collapsing record. If set the function should return the encoded URL. It takes as parameters: data record(type: object), expand - (type: bool).
  	 *
  	 */
  var customEncodeUrlFunc: js.UndefOr[js.Function] = js.native
  /**
  	 * The name of the property that keeps track of the level in the hierarchy.Defaults to __ig_options.dataLevel.
  	 */
  var dataLevelKey: js.UndefOr[String] = js.native
  /**
  	 * Specifies a remote URL as a data source, from which data will be retrieved using an AJAX call ($.ajax)
  	 */
  var dataSourceUrl: js.UndefOr[String] = js.native
  /**
  	 * Specifies if data is loaded on demand from a remote server. Default is false.
  	 */
  var enableRemoteLoadOnDemand: js.UndefOr[Boolean] = js.native
  /**
  	 * The name of the property that keeps track of the expansion state of a data item. Defaults to __ig_options.expanded.
  	 */
  var expandedKey: js.UndefOr[String] = js.native
  /**
  	 * Configure datasource filtering settings.
  	 */
  var filtering: js.UndefOr[TreeHierarchicalDataSourceSettingsTreeDSFiltering] = js.native
  /**
  	 * Unique identifier used in a self-referencing flat data source. Used with primaryKey to create a relationship among flat data sources.
  	 */
  var foreignKey: js.UndefOr[String] = js.native
  /**
  	 * Specifies the depth down to which the tree grid would be expanded upon initial render. To expand all rows set value to -1. Default is -1.
  	 */
  var initialExpandDepth: js.UndefOr[Double] = js.native
  /**
  	 * If set to TRUE it is expected that the source of data is normalized and transformed(has set dataLevel and expansion state). The source of data is used as flatDataView. Usually used when the paging is remote and paging mode is allLevels, or features are remote(and the processing of the returned result should be made on the server)
  	 *
  	 */
  var initialFlatDataView: js.UndefOr[Boolean] = js.native
  /**
  	 * Configure datasource paging settings.
  	 */
  var paging: js.UndefOr[TreeHierarchicalDataSourceSettingsTreeDSPaging] = js.native
  /**
  	 * If true save expansion states in internal list and send it to the server. Applying to one of the main constraint of the REST architecture  Stateless Interactions - client specific data(like expansion states) should NOT be stored on the server
  	 *
  	 */
  var persistExpansionStates: js.UndefOr[Boolean] = js.native
  /**
  	 * *** IMPORTANT DEPRECATED *** Use the dataLevelKey option instead.
  	 * The name of the property that keeps track of the level in the hierarchy.Defaults to __ig_options.dataLevel.
  	 */
  var propertyDataLevel: js.UndefOr[String] = js.native
  /**
  	 * *** IMPORTANT DEPRECATED *** Use the expandedKey option instead.
  	 * The name of the property that keeps track of the expansion state of a data item. Defaults to __ig_options.expanded.
  	 */
  var propertyExpanded: js.UndefOr[String] = js.native
  /**
  	 * Specifies a custom function to be called when the remote request for data has finished.
  	 */
  var requestDataCallback: js.UndefOr[js.Function] = js.native
  /**
  	 * Specifies a custom function to be called when the remote request for data has finished with an error.
  	 */
  var requestDataErrorCallback: js.UndefOr[js.Function] = js.native
  /**
  	 * Specifies a custom function to be called when the remote request for data has finished successfully.
  	 */
  var requestDataSuccessCallback: js.UndefOr[js.Function] = js.native
  /**
  	 * Configure datasource sorting settings.
  	 */
  var sorting: js.UndefOr[TreeHierarchicalDataSourceSettingsTreeDSSorting] = js.native
}

object TreeHierarchicalDataSourceSettingsTreeDS {
  @scala.inline
  def apply(): TreeHierarchicalDataSourceSettingsTreeDS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeHierarchicalDataSourceSettingsTreeDS]
  }
  @scala.inline
  implicit class TreeHierarchicalDataSourceSettingsTreeDSOps[Self <: TreeHierarchicalDataSourceSettingsTreeDS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildDataKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childDataKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildDataKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childDataKey")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomEncodeUrlFunc(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customEncodeUrlFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomEncodeUrlFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customEncodeUrlFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLevelKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLevelKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLevelKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLevelKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRemoteLoadOnDemand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRemoteLoadOnDemand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRemoteLoadOnDemand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRemoteLoadOnDemand")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withFiltering(value: TreeHierarchicalDataSourceSettingsTreeDSFiltering): Self = {
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
    def withForeignKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForeignKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignKey")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialExpandDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialExpandDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialExpandDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialExpandDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialFlatDataView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFlatDataView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialFlatDataView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFlatDataView")(js.undefined)
        ret
    }
    @scala.inline
    def withPaging(value: TreeHierarchicalDataSourceSettingsTreeDSPaging): Self = {
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
    def withPersistExpansionStates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistExpansionStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistExpansionStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistExpansionStates")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyDataLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyDataLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyDataLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyDataLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyExpanded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestDataCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestDataCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestDataCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestDataCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestDataErrorCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestDataErrorCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestDataErrorCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestDataErrorCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestDataSuccessCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestDataSuccessCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestDataSuccessCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestDataSuccessCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withSorting(value: TreeHierarchicalDataSourceSettingsTreeDSSorting): Self = {
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
  }
  
}

