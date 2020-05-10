package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashboardPublishOptions extends js.Object {
  /**
    * Ad hoc (one-time) filtering option.
    */
  var AdHocFilteringOption: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.AdHocFilteringOption] = js.native
  /**
    * Export to .csv option.
    */
  var ExportToCSVOption: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.ExportToCSVOption] = js.native
  /**
    * Sheet controls option.
    */
  var SheetControlsOption: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.SheetControlsOption] = js.native
}

object DashboardPublishOptions {
  @scala.inline
  def apply(): DashboardPublishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardPublishOptions]
  }
  @scala.inline
  implicit class DashboardPublishOptionsOps[Self <: DashboardPublishOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdHocFilteringOption(value: AdHocFilteringOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdHocFilteringOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdHocFilteringOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdHocFilteringOption")(js.undefined)
        ret
    }
    @scala.inline
    def withExportToCSVOption(value: ExportToCSVOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportToCSVOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportToCSVOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportToCSVOption")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetControlsOption(value: SheetControlsOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SheetControlsOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetControlsOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SheetControlsOption")(js.undefined)
        ret
    }
  }
  
}

