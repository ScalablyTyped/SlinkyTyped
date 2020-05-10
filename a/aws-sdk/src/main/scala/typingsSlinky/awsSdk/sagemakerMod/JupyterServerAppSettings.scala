package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JupyterServerAppSettings extends js.Object {
  /**
    * The instance type and quantity.
    */
  var DefaultResourceSpec: js.UndefOr[ResourceSpec] = js.native
}

object JupyterServerAppSettings {
  @scala.inline
  def apply(): JupyterServerAppSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JupyterServerAppSettings]
  }
  @scala.inline
  implicit class JupyterServerAppSettingsOps[Self <: JupyterServerAppSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultResourceSpec(value: ResourceSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultResourceSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultResourceSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultResourceSpec")(js.undefined)
        ret
    }
  }
  
}

