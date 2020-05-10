package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSettingsPaging
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Whether when a new page of data is requested we should append the new data to the existing data
  	 *
  	 */
  var appendPage: js.UndefOr[Boolean] = js.native
  /**
  	 * Paging is not enabled by default
  	 *
  	 */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Current page index
  	 *
  	 */
  var pageIndex: js.UndefOr[Double] = js.native
  /**
  	 * Denotes the name of the encoded URL parameter that will state what is the currently requested page index
  	 *
  	 */
  var pageIndexUrlKey: js.UndefOr[String] = js.native
  /**
  	 * Number of records on each page
  	 *
  	 */
  var pageSize: js.UndefOr[Double] = js.native
  /**
  	 * Denotes the name of the encoded URL parameter that will state what is the currently requested page size
  	 *
  	 */
  var pageSizeUrlKey: js.UndefOr[String] = js.native
  /**
  	 * Type for the paging operation
  	 *
  	 *
  	 * Valid values:
  	 * "local" Data is paged client-side.
  	 * "remote" A remote request is done and URL params encoded
  	 */
  var `type`: js.UndefOr[String] = js.native
}

object DataSourceSettingsPaging {
  @scala.inline
  def apply(): DataSourceSettingsPaging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettingsPaging]
  }
  @scala.inline
  implicit class DataSourceSettingsPagingOps[Self <: DataSourceSettingsPaging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendPage")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPageIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withPageIndexUrlKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIndexUrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageIndexUrlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIndexUrlKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSizeUrlKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeUrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSizeUrlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeUrlKey")(js.undefined)
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

