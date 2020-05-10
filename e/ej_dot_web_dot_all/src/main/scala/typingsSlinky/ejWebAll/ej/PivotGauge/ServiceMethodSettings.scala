package typingsSlinky.ejWebAll.ej.PivotGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceMethodSettings extends js.Object {
  /** Allows the user to set the custom name for the service method responsible for initializing PivotGauge.
    * @Default {InitializeGauge}
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

