package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSettingsSorting
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * If the sorting type is local and applyToAllData is true, sorting will be performed on the whole data source that's present locally, otherwise only on the current dataView. If sorting type is remote, this setting doesn't have any effect.
  	 *
  	 */
  var applyToAllData: js.UndefOr[Boolean] = js.native
  /**
  	 * Specifies if sorting will be case sensitive or not. Works only for local sorting
  	 *
  	 */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /**
  	 * Custom comparison sorting function. Accepts the following arguments: fields, schema, booleand value whether sorting is ascending , convert function(please check option for customConvertFunc) and returns a value 0 indicating that values are equal, 1 indicating that val1 > val2 and -1 indicating that val1 < val2
  	 *
  	 */
  var compareFunc: js.UndefOr[js.Any] = js.native
  /**
  	 * Custom data value conversion function(called from sorting function). Accepts a value of the data cell and column key and should return the converted value
  	 *
  	 */
  var customConvertFunc: js.UndefOr[js.Any] = js.native
  /**
  	 * Custom sorting function that can point to either a string or a function object. When the function is called, the following arguments are passed: data array, fields (array of field definitions) , direction ("asc" or "desc"). The function should return a sorted data array
  	 *
  	 */
  var customFunc: js.UndefOr[js.Any] = js.native
  /**
  	 * Sorting direction
  	 *
  	 *
  	 * Valid values:
  	 * "none"
  	 * "asc"
  	 * "desc"
  	 */
  var defaultDirection: js.UndefOr[String] = js.native
  /**
  	 * When defaultDirection is different than "none", and defaultFields is specified, data will be initially sorted accordingly, directly after dataBind()
  	 *
  	 */
  var defaultFields: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Takes precedence over experssions, an "SQL-like" encoded expressions string  : see sort(). Example col2 > 100 ORDER BY asc
  	 *
  	 */
  var exprString: js.UndefOr[String] = js.native
  /**
  	 * A list of sorting expressions , consisting of the following keys (and their respective values): fieldName, direction and compareFunc (optional)
  	 *
  	 */
  var expressions: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * URL param value for ascending type of sorting. Default is null and uses OData conventions
  	 *
  	 */
  var sortUrlAscValueKey: js.UndefOr[String] = js.native
  /**
  	 * URL param value for descending type of sorting. Default is null and uses OData conventions
  	 *
  	 */
  var sortUrlDescValueKey: js.UndefOr[String] = js.native
  /**
  	 * URL param name which specifies how sorting expressions will be encoded in the URL. Default is null and uses OData conventions
  	 *
  	 */
  var sortUrlKey: js.UndefOr[String] = js.native
  /**
  	 * Specifies whether sorting will be applied locally or remotely (via a remote request)
  	 *
  	 *
  	 * Valid values:
  	 * "remote"
  	 * "local"
  	 */
  var `type`: js.UndefOr[String] = js.native
}

object DataSourceSettingsSorting {
  @scala.inline
  def apply(): DataSourceSettingsSorting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettingsSorting]
  }
  @scala.inline
  implicit class DataSourceSettingsSortingOps[Self <: DataSourceSettingsSorting] (val x: Self) extends AnyVal {
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
    def withCompareFunc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompareFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomConvertFunc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customConvertFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomConvertFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customConvertFunc")(js.undefined)
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
    def withDefaultDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDirection")(js.undefined)
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
    def withSortUrlAscValueKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortUrlAscValueKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortUrlAscValueKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortUrlAscValueKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSortUrlDescValueKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortUrlDescValueKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortUrlDescValueKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortUrlDescValueKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSortUrlKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortUrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortUrlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortUrlKey")(js.undefined)
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

