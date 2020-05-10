package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlapXmlaDataSourceOptions
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * The catalog name.
  	 */
  var catalog: js.UndefOr[String] = js.native
  /**
  	 * A list of hierarchy names separated by comma (,). These will be the hierarchies in the columns of the data source.
  	 */
  var columns: js.UndefOr[String] = js.native
  /**
  	 * The name of the cube in the data source.
  	 */
  var cube: js.UndefOr[String] = js.native
  /**
  	 * Additional properties sent with every discover request.
  	 *             The object is treated as a key/value store where each property name is used as the key and the property value as the value.
  	 */
  var discoverProperties: js.UndefOr[js.Any] = js.native
  /**
  	 * Enables/disables caching of the XMLA result object.
  	 */
  var enableResultCache: js.UndefOr[Boolean] = js.native
  /**
  	 * Additional properties sent with every execute request.
  	 *             The object is treated as a key/value store where each property name is used as the key and the property value as the value.
  	 */
  var executeProperties: js.UndefOr[js.Any] = js.native
  /**
  	 * A list of hierarchy names separated by comma (,). These will be hierarchies in the filters of the data source.
  	 */
  var filters: js.UndefOr[String] = js.native
  /**
  	 * Specifies if the data is to be served by a XMLA remote provider.
  	 */
  var isRemote: js.UndefOr[Boolean] = js.native
  /**
  	 * Optional="true" a javascript object containing information about how the request to the xmla server should be processed
  	 */
  var mdxSettings: js.UndefOr[OlapXmlaDataSourceOptionsMdxSettings] = js.native
  /**
  	 * The name of the measure group in the data source.
  	 */
  var measureGroup: js.UndefOr[String] = js.native
  /**
  	 * A list of measure names separated by comma (,). These will be the measures of the data source.
  	 */
  var measures: js.UndefOr[String] = js.native
  /**
  	 * An object containing information about how the request to the XMLA server should be processed.
  	 */
  var requestOptions: js.UndefOr[OlapXmlaDataSourceOptionsRequestOptions] = js.native
  /**
  	 * A list of hierarchy names separated by comma (,). These will be the hierarchies in the rows of the data source.
  	 */
  var rows: js.UndefOr[String] = js.native
  /**
  	 * Optional="false" The URL of the XMLA server.
  	 */
  var serverUrl: js.UndefOr[String] = js.native
}

object OlapXmlaDataSourceOptions {
  @scala.inline
  def apply(): OlapXmlaDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapXmlaDataSourceOptions]
  }
  @scala.inline
  implicit class OlapXmlaDataSourceOptionsOps[Self <: OlapXmlaDataSourceOptions] (val x: Self) extends AnyVal {
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
    def withDiscoverProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discoverProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscoverProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discoverProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableResultCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResultCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableResultCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResultCache")(js.undefined)
        ret
    }
    @scala.inline
    def withExecuteProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecuteProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeProperties")(js.undefined)
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
    def withIsRemote(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRemote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRemote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRemote")(js.undefined)
        ret
    }
    @scala.inline
    def withMdxSettings(value: OlapXmlaDataSourceOptionsMdxSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdxSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdxSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdxSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureGroup")(js.undefined)
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
    def withRequestOptions(value: OlapXmlaDataSourceOptionsRequestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOptions")(js.undefined)
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
    def withServerUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverUrl")(js.undefined)
        ret
    }
  }
  
}

