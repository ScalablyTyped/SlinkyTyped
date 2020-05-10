package typingsSlinky.ejWebAll.ej.PivotTreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceMethodSettings extends js.Object {
  /** Allows the user to set the custom name for the service method responsible for drilling up/down operation in PivotTreeMap.
    * @Default {DrillTreeMap}
    */
  var drillDown: js.UndefOr[String] = js.native
  /** Allows the user to set the custom name for the service method responsible for initializing PivotTreeMap.
    * @Default {InitializeTreemap}
    */
  var initialize: js.UndefOr[String] = js.native
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
  }
  
}

