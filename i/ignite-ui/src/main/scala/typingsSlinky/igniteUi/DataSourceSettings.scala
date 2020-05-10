package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSettings
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * If set to true, the following behavior will take place:
  	 * if a new row is added, and then deleted, there will be no transaction added to the log
  	 * if an edit is made to a row or cell, then the value is brought back to its original value, the transaction should be removed
  	 * Note: This option takes effect only when autoCommit is set to false.
  	 *
  	 */
  var aggregateTransactions: js.UndefOr[Boolean] = js.native
  /**
  	 * If auto commit is true, data will be automatically commited to the data source, once a value or a batch of values are updated via saveChanges()
  	 *
  	 */
  var autoCommit: js.UndefOr[Boolean] = js.native
  /**
  	 * Callback function to call when data binding is complete
  	 *
  	 */
  var callback: js.UndefOr[js.Function] = js.native
  /**
  	 * Object on which to invoke the callback function
  	 *
  	 */
  var callee: js.UndefOr[js.Any] = js.native
  /**
  	 * This is the normalized (transformed) resulting data, after it's fetched from the data source
  	 *
  	 */
  var data: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Client-side dataBinding event. Can be a string pointing to a function name, or an object pointing to a function
  	 *
  	 */
  var dataBinding: js.UndefOr[js.Any] = js.native
  /**
  	 * Client-side dataBound event. Can be a string pointing to a function name, or an object pointing to a function
  	 *
  	 */
  var dataBound: js.UndefOr[js.Any] = js.native
  /**
  	 * This is the source of data - non normalized. Can be an array, can be reference to some JSON object, can be a DOM element for a HTML TABLE, or a function
  	 *
  	 */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
  	 * *** IMPORTANT DEPRECATED ***
  	 * A list of field definitions specifying the schema of the data source.
  	 * Field objects description: {name, [type], [xpath]}
  	 *
  	 */
  var fields: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Settings related to built-in filtering functionality
  	 *
  	 */
  var filtering: js.UndefOr[DataSourceSettingsFiltering] = js.native
  /**
  	 * Settings related to built-in group by functionality
  	 *
  	 */
  var groupby: js.UndefOr[DataSourceSettingsGroupby] = js.native
  /**
  	 * Setting this is only necessary when the data source is set to a table in string format. we need to create an invisible dummy data container in the body and append the table data to it
  	 *
  	 */
  var id: js.UndefOr[String] = js.native
  /**
  	 * If set to false will disable transformations on schema, even if it is defined locally in the javascript code
  	 *
  	 */
  var localSchemaTransform: js.UndefOr[Boolean] = js.native
  /**
  	 * This is the property in the dataView where actual resulting records will be put. (So the dataView will not be array but an object if this is defined), after the potential data source transformation
  	 *
  	 */
  var outputResultsName: js.UndefOr[String] = js.native
  /**
  	 * Settings related to built-in paging functionality
  	 *
  	 */
  var paging: js.UndefOr[DataSourceSettingsPaging] = js.native
  /**
  	 * The unique field identifier
  	 *
  	 */
  var primaryKey: js.UndefOr[String] = js.native
  /**
  	 * Specifies the HTTP verb to be used to issue the request
  	 *
  	 */
  var requestType: js.UndefOr[String] = js.native
  /**
  	 * Content type of the response. See http://api.jquery.com/jQuery.ajax/ => contentType
  	 *
  	 */
  var responseContentType: js.UndefOr[String] = js.native
  /**
  	 * Property in the response which specifies where the data records array will be held (if the response is wrapped)
  	 *
  	 */
  var responseDataKey: js.UndefOr[String] = js.native
  /**
  	 * Response type when a URL is set as the data source. See http://api.jquery.com/jQuery.ajax/ => dataType
  	 *
  	 *
  	 * Valid values:
  	 * "json"
  	 * "xml"
  	 * "html"
  	 * "script"
  	 * "jsonp"
  	 * "text"
  	 */
  var responseDataType: js.UndefOr[String] = js.native
  /**
  	 * Property in the response which specifies the total number of records in the backend (this is needed for paging)
  	 *
  	 */
  var responseTotalRecCountKey: js.UndefOr[String] = js.native
  /**
  	 * A function to call when row is added.
  	 * Function takes first argument item and second argument dataSource.
  	 * Use item.row to obtain reference to the added row.
  	 * Use item.rowId to get the row ID.
  	 * Use dataSource to obtain reference to $.ig.DataSource.
  	 *
  	 */
  var rowAdded: js.UndefOr[js.Function] = js.native
  /**
  	 * A function to call when row is deleted.
  	 * Use item.row to obtain reference to the deleted row.
  	 * Use item.rowId to get the row ID.
  	 * Use item.rowIndex to get the row index.
  	 * Use dataSource to obtain reference to $.ig.DataSource.
  	 *
  	 */
  var rowDeleted: js.UndefOr[js.Function] = js.native
  /**
  	 * A function to call when row is inserted.
  	 * Function takes first argument item and second argument dataSource.
  	 * Use item.row to obtain reference to the inserted row.
  	 * Use item.rowId to get the row ID.
  	 * Use item.rowIndex to get the row index.
  	 * Use dataSource to obtain reference to $.ig.DataSource.
  	 *
  	 */
  var rowInserted: js.UndefOr[js.Function] = js.native
  /**
  	 * A function to call when row is updated (edited).
  	 * Function takes first argument item and second argument dataSource.
  	 * Use item.rowIndex to get the row index.
  	 * Use item.newRow to obtain reference to the updated row.
  	 * Use item.oldRow to obtain reference to the row that was updated.
  	 * Use dataSource to obtain reference to $.ig.DataSource.
  	 *
  	 */
  var rowUpdated: js.UndefOr[js.Function] = js.native
  /**
  	 * A schema object that defines which fields from the data to bind to
  	 *
  	 */
  var schema: js.UndefOr[js.Any] = js.native
  /**
  	 * If true, will serialize the transaction log of updated values - if any - whenever commit is performed via a remote request.
  	 *
  	 */
  var serializeTransactionLog: js.UndefOr[Boolean] = js.native
  /**
  	 * Settings related to built-in sorting functionality
  	 *
  	 */
  var sorting: js.UndefOr[DataSourceSettingsSorting] = js.native
  /**
  	 * Settings related to built-in summaries functionality
  	 *
  	 */
  var summaries: js.UndefOr[DataSourceSettingsSummaries] = js.native
  /**
  	 * Type of the data source
  	 *
  	 *
  	 * Valid values:
  	 * "json" Specifies that the data source is an already evaluated JSON (JavaScript object/array) or a string that can be evaluated to JSON
  	 * "xml" Specifies that the data source is a XML Document object or a string that can be evaluated to XML
  	 * "unknown" Specifies that the data source is of unknown type. In that case it will be analyzed and automatically detected if possible
  	 * "array" Specifies that the data source is a simple array of objects.
  	 * "function" Specifies that the data source points to a function. During data binding the function will be called and the result will be assumed to be an array of objects
  	 * "htmlTableString" Specifies that the data source points to a string that represents a HTML table
  	 * "htmlTableId" Specifies that the data source points to an ID of a HTML Table element that's loaded on the page
  	 * "htmlTableDom" The data source points to a DOM object that is of TABLE type
  	 * "invalid" Set whenever data source is analyzed (in case its type is unknown) and the type cannot be detected
  	 * "remoteUrl" Specifies that the data source points to a remote URL, from which data will be retrieved using an AJAX call ($.ajax)
  	 * "htmlListDom" The data source points to a DOM object that is of UL/OL type
  	 * "htmlSelectDom" The data source points to a DOM object that is of SELECT type
  	 * "empty"
  	 */
  var `type`: js.UndefOr[String] = js.native
  /**
  	 * Specifies an update remote URL, to which an AJAX request will be made as soon as saveChages() is called.
  	 *
  	 */
  var updateUrl: js.UndefOr[String] = js.native
  /**
  	 * Event that is fired after URL parameters are encoded (When a remote request is done). Can point to a function name or the function object itself
  	 *
  	 */
  var urlParamsEncoded: js.UndefOr[js.Any] = js.native
  /**
  	 * Event that is fired before URL parameters are encoded. Can point to a function name or the function object itself
  	 *
  	 */
  var urlParamsEncoding: js.UndefOr[js.Any] = js.native
}

object DataSourceSettings {
  @scala.inline
  def apply(): DataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettings]
  }
  @scala.inline
  implicit class DataSourceSettingsOps[Self <: DataSourceSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregateTransactions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateTransactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregateTransactions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateTransactions")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCommit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCommit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCommit")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: js.Function): Self = {
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
    def withFields(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFiltering(value: DataSourceSettingsFiltering): Self = {
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
    def withGroupby(value: DataSourceSettingsGroupby): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupby: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupby")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withOutputResultsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputResultsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputResultsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputResultsName")(js.undefined)
        ret
    }
    @scala.inline
    def withPaging(value: DataSourceSettingsPaging): Self = {
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
    def withPrimaryKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(js.undefined)
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
    def withResponseContentType(value: String): Self = {
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
    def withResponseDataKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDataKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseDataKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseDataKey")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseDataType(value: String): Self = {
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
    def withResponseTotalRecCountKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTotalRecCountKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseTotalRecCountKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTotalRecCountKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRowAdded(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAdded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDeleted(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withRowInserted(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowInserted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowInserted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowInserted")(js.undefined)
        ret
    }
    @scala.inline
    def withRowUpdated(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: js.Any): Self = {
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
    def withSerializeTransactionLog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeTransactionLog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerializeTransactionLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeTransactionLog")(js.undefined)
        ret
    }
    @scala.inline
    def withSorting(value: DataSourceSettingsSorting): Self = {
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
    def withSummaries(value: DataSourceSettingsSummaries): Self = {
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
    def withUpdateUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUrl")(js.undefined)
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

