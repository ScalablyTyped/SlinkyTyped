package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSettingsFiltering
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * If the type of paging/sorting/filtering is local and applyToAllData is true, filtering will be performed on the whole data source that's present locally, otherwise only on the current dataView. if type is remote, this setting doesn't have any effect.
  	 *
  	 */
  var applyToAllData: js.UndefOr[Boolean] = js.native
  /**
  	 * Enables or disables case sensitive filtering on the data. Works only for local filtering
  	 *
  	 */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /**
  	 * An object containing custom defined filtering conditions as objects.
  	 *
  	 */
  var customConditions: js.UndefOr[js.Any] = js.native
  /**
  	 * Can point to either a string or a function object. The parameters that are passed are 1) the data array to be filtered, 2) the filtering expression definitions. Should return an array of the filtered data
  	 *
  	 */
  var customFunc: js.UndefOr[js.Any] = js.native
  /**
  	 * Data will be initially filtered accordingly, directly after dataBind()
  	 *
  	 */
  var defaultFields: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * An "SQL-like' encoded expressions string. Takes precedence over "expressions". Example: col2 > 100; col2 LIKE %test%
  	 *
  	 */
  var exprString: js.UndefOr[String] = js.native
  /**
  	 * A list of expression objects, containing the following key-value pairs: fieldName, expression (search string), condition , and logic (AND/OR)
  	 *
  	 */
  var expressions: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Url key that will be encoded in the request if remote filtering is performed. Default value of null implies OData-style URL encoding. Please see http://www.odata.org/developers/protocols/uri-conventions for details
  	 *
  	 */
  var filterExprUrlKey: js.UndefOr[String] = js.native
  /**
  	 * Url key that will be encoded in the request, specifying if the filtering logic will be AND or OR
  	 *
  	 */
  var filterLogicUrlKey: js.UndefOr[String] = js.native
  /**
  	 * Filtering type.
  	 *
  	 * Valid values:
  	 * "remote" Parameters will be encoded and it's up to the backend to interpred them from the response.
  	 * "local" The data will be filtered automatically client-side
  	 */
  var `type`: js.UndefOr[String] = js.native
}

object DataSourceSettingsFiltering {
  @scala.inline
  def apply(): DataSourceSettingsFiltering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettingsFiltering]
  }
  @scala.inline
  implicit class DataSourceSettingsFilteringOps[Self <: DataSourceSettingsFiltering] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyToAllData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyToAllData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyToAllData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyToAllData")(js.undefined)
        ret
    }
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomConditions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customConditions")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomFunc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFields(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFields")(js.undefined)
        ret
    }
    @scala.inline
    def withExprString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exprString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExprString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exprString")(js.undefined)
        ret
    }
    @scala.inline
    def withExpressions(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressions")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterExprUrlKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterExprUrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterExprUrlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterExprUrlKey")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterLogicUrlKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterLogicUrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterLogicUrlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterLogicUrlKey")(js.undefined)
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
  }
  
}

