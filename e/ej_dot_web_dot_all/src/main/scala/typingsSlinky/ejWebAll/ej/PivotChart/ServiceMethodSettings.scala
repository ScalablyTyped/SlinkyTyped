package typingsSlinky.ejWebAll.ej.PivotChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceMethodSettings extends js.Object {
  /** Allows you to set the custom name for the service method that is responsible for drilling up/down in the pivot chart.
    * @Default {DrillChart}
    */
  var drillDown: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method which is responsible for exporting the pivot chart.
    * @Default {Export}
    */
  var exportPivotChart: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method which is responsible for initializing the pivot chart.
    * @Default {InitializeChart}
    */
  var initialize: js.UndefOr[String] = js.native
  /** Allows you to set the custom name for the service method which is responsible for navigating between pages in the paged pivot chart.
    * @Default {Paging}
    */
  var paging: js.UndefOr[String] = js.native
}

object ServiceMethodSettings {
  @scala.inline
  def apply(): ServiceMethodSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceMethodSettings]
  }
  @scala.inline
  implicit class ServiceMethodSettingsOps[Self <: ServiceMethodSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrillDown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrillDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillDown")(js.undefined)
        ret
    }
    @scala.inline
    def withExportPivotChart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportPivotChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportPivotChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportPivotChart")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.undefined)
        ret
    }
    @scala.inline
    def withPaging(value: String): Self = {
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
  }
  
}

