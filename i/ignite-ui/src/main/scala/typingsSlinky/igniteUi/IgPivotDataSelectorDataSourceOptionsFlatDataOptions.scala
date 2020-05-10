package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPivotDataSelectorDataSourceOptionsFlatDataOptions
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies any valid data source accepted by $.ig.DataSource, or an instance of an $.ig.DataSource itself.
  	 */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
  	 * Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
  	 */
  var dataSourceType: js.UndefOr[String] = js.native
  /**
  	 * Specifies a remote URL accepted by $.ig.DataSource in order to request data from it.
  	 */
  var dataSourceUrl: js.UndefOr[String] = js.native
  /**
  	 * Optional="false" An object containing processing instructions for the $.ig.DataSource data.
  	 */
  var metadata: js.UndefOr[IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadata] = js.native
  /**
  	 * See $.ig.DataSource.
  	 * string Specifies the name of the property in which data records are held if the response is wrapped.
  	 * null Option is ignored.
  	 */
  var responseDataKey: js.UndefOr[String] = js.native
  /**
  	 * String Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
  	 * null Option is ignored.
  	 */
  var responseDataType: js.UndefOr[String] = js.native
}

object IgPivotDataSelectorDataSourceOptionsFlatDataOptions {
  @scala.inline
  def apply(): IgPivotDataSelectorDataSourceOptionsFlatDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotDataSelectorDataSourceOptionsFlatDataOptions]
  }
  @scala.inline
  implicit class IgPivotDataSelectorDataSourceOptionsFlatDataOptionsOps[Self <: IgPivotDataSelectorDataSourceOptionsFlatDataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDataSourceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceType")(js.undefined)
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
    def withMetadata(value: IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
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
  }
  
}

