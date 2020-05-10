package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHsmConfigurationResult extends js.Object {
  var HsmConfiguration: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.HsmConfiguration] = js.native
}

object CreateHsmConfigurationResult {
  @scala.inline
  def apply(): CreateHsmConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHsmConfigurationResult]
  }
  @scala.inline
  implicit class CreateHsmConfigurationResultOps[Self <: CreateHsmConfigurationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHsmConfiguration(value: HsmConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmConfiguration")(js.undefined)
        ret
    }
  }
  
}

