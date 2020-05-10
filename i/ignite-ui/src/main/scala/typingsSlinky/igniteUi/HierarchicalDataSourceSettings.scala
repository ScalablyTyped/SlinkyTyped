package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HierarchicalDataSourceSettings
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  var autogenerate: js.UndefOr[Boolean] = js.native
  var callback: js.UndefOr[js.Any] = js.native
  var callee: js.UndefOr[js.Any] = js.native
  var data: js.UndefOr[js.Array[_]] = js.native
  var dataBinding: js.UndefOr[js.Any] = js.native
  var dataBound: js.UndefOr[js.Any] = js.native
  var dataSource: js.UndefOr[js.Any] = js.native
  var defaultChildrenDataProperty: js.UndefOr[String] = js.native
  var filtering: js.UndefOr[HierarchicalDataSourceSettingsFiltering] = js.native
  var initialDataBindDepth: js.UndefOr[Double] = js.native
  var localSchemaTransform: js.UndefOr[Boolean] = js.native
  var maxDataBindDepth: js.UndefOr[Double] = js.native
  var odata: js.UndefOr[Boolean] = js.native
  var paging: js.UndefOr[HierarchicalDataSourceSettingsPaging] = js.native
  var requestType: js.UndefOr[String] = js.native
  var responseContentType: js.UndefOr[js.Any] = js.native
  var responseDataType: js.UndefOr[js.Any] = js.native
  /**
  	 * All of the rest - paging, sorting, filtering, can be defined in the layouts definition, which will "override" the parent defs
  	 * IMPORTANT:  if there is no paging, sorting or filtering, an instance of $.ig.DataSource won't be created for child row islands
  	 */
  var schema: js.UndefOr[HierarchicalDataSourceSettingsSchema] = js.native
  var sorting: js.UndefOr[HierarchicalDataSourceSettingsSorting] = js.native
  /**
  	 * Other options
  	 */
  var `type`: js.UndefOr[String] = js.native
  var urlParamsEncoded: js.UndefOr[js.Any] = js.native
  var urlParamsEncoding: js.UndefOr[js.Any] = js.native
}

object HierarchicalDataSourceSettings {
  @scala.inline
  def apply(): HierarchicalDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchicalDataSourceSettings]
  }
  @scala.inline
  implicit class HierarchicalDataSourceSettingsOps[Self <: HierarchicalDataSourceSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutogenerate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autogenerate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutogenerate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autogenerate")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withCallee(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callee")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[_]): Self = {
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
    def withDataBinding(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBound(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.undefined)
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
    def withDefaultChildrenDataProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultChildrenDataProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultChildrenDataProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultChildrenDataProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withFiltering(value: HierarchicalDataSourceSettingsFiltering): Self = {
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
    def withInitialDataBindDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDataBindDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialDataBindDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDataBindDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalSchemaTransform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localSchemaTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalSchemaTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localSchemaTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDataBindDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDataBindDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDataBindDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDataBindDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withOdata(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("odata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("odata")(js.undefined)
        ret
    }
    @scala.inline
    def withPaging(value: HierarchicalDataSourceSettingsPaging): Self = {
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
    def withRequestType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseContentType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseContentType")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseDataType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDataType")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: HierarchicalDataSourceSettingsSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withSorting(value: HierarchicalDataSourceSettingsSorting): Self = {
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
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlParamsEncoded(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlParamsEncoded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlParamsEncoded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlParamsEncoded")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlParamsEncoding(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlParamsEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlParamsEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlParamsEncoding")(js.undefined)
        ret
    }
  }
  
}

