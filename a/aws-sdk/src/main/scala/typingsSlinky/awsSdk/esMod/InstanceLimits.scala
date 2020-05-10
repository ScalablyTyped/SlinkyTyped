package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceLimits extends js.Object {
  var InstanceCountLimits: js.UndefOr[typingsSlinky.awsSdk.esMod.InstanceCountLimits] = js.native
}

object InstanceLimits {
  @scala.inline
  def apply(): InstanceLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceLimits]
  }
  @scala.inline
  implicit class InstanceLimitsOps[Self <: InstanceLimits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceCountLimits(value: InstanceCountLimits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCountLimits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceCountLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCountLimits")(js.undefined)
        ret
    }
  }
  
}

