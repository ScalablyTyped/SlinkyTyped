package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridSummariesColumnSetting
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Enables disables summaries for the column
  	 *
  	 */
  var allowSummaries: js.UndefOr[Boolean] = js.native
  /**
  	 * Column index. Can be used in place of column key. The preferred way of populating a column setting is to always use the column keys as identifiers
  	 *
  	 */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
  	 * Column key. This is a required property in every column setting if columnIndex is not set
  	 *
  	 */
  var columnKey: js.UndefOr[String] = js.native
  /**
  	 * Check defaultSummaryOperands
  	 *
  	 */
  var summaryOperands: js.UndefOr[js.Array[IgGridSummariesColumnSettingSummaryOperand]] = js.native
}

object IgGridSummariesColumnSetting {
  @scala.inline
  def apply(): IgGridSummariesColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridSummariesColumnSetting]
  }
  @scala.inline
  implicit class IgGridSummariesColumnSettingOps[Self <: IgGridSummariesColumnSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSummaries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSummaries")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryOperands(value: js.Array[IgGridSummariesColumnSettingSummaryOperand]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryOperands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryOperands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryOperands")(js.undefined)
        ret
    }
  }
  
}

