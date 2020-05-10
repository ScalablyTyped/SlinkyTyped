package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridSummariesColumnSettingSummaryOperand
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * If it is false the summary operand will be shown in dropdown but it will not be made calculation
  	 *
  	 */
  var active: js.UndefOr[Boolean] = js.native
  /**
  	 * Specifies a format that will be applied to the current summary operant.
  	 * When this option is not set, the [format](ui.iggrid#options:columns.format) of the column it is in will taken into account.
  	 * When this option and the column [format](ui.iggrid#options:columns.format) is not set, the regional settings will be taken depending on the [autoFormat](ui.iggrid#options:autoFormat) option.
  	 * If the column type is not specified in the [autoFormat](ui.iggrid#options:autoFormat) option and no format is set for both column and summary operand, no formatting is applied.
  	 *
  	 */
  var format: js.UndefOr[String] = js.native
  /**
  	 * Specifies the order of elements in dropdown. It is recommended to set order of custom operands and to be greater or equal to 5
  	 *
  	 */
  var order: js.UndefOr[Double] = js.native
  /**
  	 * Text of the summary method which is shown in summary cell
  	 *
  	 */
  var rowDisplayLabel: js.UndefOr[String] = js.native
  /**
  	 * Name of the custom summary function which should be executed when type is custom
  	 *
  	 */
  var summaryCalculator: js.UndefOr[String] = js.native
  /**
  	 * Set type of summary operand
  	 *
  	 *
  	 * Valid values:
  	 * "count" calculate count of result rows for the specified column
  	 * "min" calculate min of result rows for the specified column
  	 * "max" calculate max of result rows for the specified column
  	 * "sum" calculate sum of result rows for the specified column
  	 * "avg" calculate average of result rows for the specified column
  	 * "custom" calculate custom function (specified by summaryCalculator property) of result rows for the specified column
  	 */
  var `type`: js.UndefOr[String] = js.native
}

object IgGridSummariesColumnSettingSummaryOperand {
  @scala.inline
  def apply(): IgGridSummariesColumnSettingSummaryOperand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridSummariesColumnSettingSummaryOperand]
  }
  @scala.inline
  implicit class IgGridSummariesColumnSettingSummaryOperandOps[Self <: IgGridSummariesColumnSettingSummaryOperand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDisplayLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDisplayLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowDisplayLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDisplayLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryCalculator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryCalculator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryCalculator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryCalculator")(js.undefined)
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

