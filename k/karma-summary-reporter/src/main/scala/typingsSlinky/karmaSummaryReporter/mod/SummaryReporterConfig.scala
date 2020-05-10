package typingsSlinky.karmaSummaryReporter.mod

import typingsSlinky.karmaSummaryReporter.karmaSummaryReporterStrings.all
import typingsSlinky.karmaSummaryReporter.karmaSummaryReporterStrings.failed
import typingsSlinky.karmaSummaryReporter.karmaSummaryReporterStrings.skipped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SummaryReporterConfig extends js.Object {
  /**
    * Shows a overview column in the results table, showing the total result of a test over all browsers
    * ("failed" if the test failed anywhere, ...)
    */
  var overviewColumn: js.UndefOr[Boolean] = js.native
  /**
    * Select which tests are displayed in the summary:
    * * 'failed': Only show tests that failed in some browser (default)
    * * 'skipped': Additionally show tests that got skipped in some browser
    * * 'all': Show all test, also ones that didn't fail specLength
    */
  var show: js.UndefOr[failed | skipped | all] = js.native
  /**
    * Space reserved to display the spec label (width of the first column in the results table).
    */
  var specLength: js.UndefOr[Double] = js.native
}

object SummaryReporterConfig {
  @scala.inline
  def apply(): SummaryReporterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummaryReporterConfig]
  }
  @scala.inline
  implicit class SummaryReporterConfigOps[Self <: SummaryReporterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverviewColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overviewColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverviewColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overviewColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: failed | skipped | all): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specLength")(js.undefined)
        ret
    }
  }
  
}

