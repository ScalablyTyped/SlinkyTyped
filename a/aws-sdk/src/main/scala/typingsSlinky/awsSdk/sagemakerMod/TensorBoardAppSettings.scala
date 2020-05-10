package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TensorBoardAppSettings extends js.Object {
  /**
    * The instance type and quantity.
    */
  var DefaultResourceSpec: js.UndefOr[ResourceSpec] = js.native
}

object TensorBoardAppSettings {
  @scala.inline
  def apply(): TensorBoardAppSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TensorBoardAppSettings]
  }
  @scala.inline
  implicit class TensorBoardAppSettingsOps[Self <: TensorBoardAppSettings] (val x: Self) extends AnyVal {
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

