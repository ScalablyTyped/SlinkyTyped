package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSettingsSummaries
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * A list of column settings that specifies custom summaries options per column basis
  	 *
  	 */
  var columnSettings: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Key for retrieving data from the summaries response - used only when summaries are remote
  	 *
  	 */
  var summariesResponseKey: js.UndefOr[String] = js.native
  /**
  	 * Determines when the summary values are calculated
  	 *
  	 *
  	 * Valid values:
  	 * "priortofilteringandpaging"
  	 * "afterfilteringbeforepaging"
  	 * "afterfilteringandpaging"
  	 */
  var summaryExecution: js.UndefOr[String] = js.native
  /**
  	 * Url key for retrieving data from response - used only when summaries are remote
  	 *
  	 */
  var summaryExprUrlKey: js.UndefOr[String] = js.native
  /**
  	 * Specifies whether summaries will be applied locally or remotely (via a remote request)
  	 *
  	 *
  	 * Valid values:
  	 * "remote" A remote request is done and URL params encoded
  	 * "local" Data is paged client-side.
  	 */
  var `type`: js.UndefOr[String] = js.native
}

object DataSourceSettingsSummaries {
  @scala.inline
  def apply(): DataSourceSettingsSummaries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettingsSummaries]
  }
  @scala.inline
  implicit class DataSourceSettingsSummariesOps[Self <: DataSourceSettingsSummaries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnSettings(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSummariesResponseKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summariesResponseKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummariesResponseKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summariesResponseKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryExecution(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryExecution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryExecution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryExecution")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryExprUrlKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryExprUrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryExprUrlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryExprUrlKey")(js.undefined)
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

