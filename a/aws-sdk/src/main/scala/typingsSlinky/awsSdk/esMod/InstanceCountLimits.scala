package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceCountLimits extends js.Object {
  var MaximumInstanceCount: js.UndefOr[typingsSlinky.awsSdk.esMod.MaximumInstanceCount] = js.native
  var MinimumInstanceCount: js.UndefOr[typingsSlinky.awsSdk.esMod.MinimumInstanceCount] = js.native
}

object InstanceCountLimits {
  @scala.inline
  def apply(): InstanceCountLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceCountLimits]
  }
  @scala.inline
  implicit class InstanceCountLimitsOps[Self <: InstanceCountLimits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximumInstanceCount(value: MaximumInstanceCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumInstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumInstanceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumInstanceCount(value: MinimumInstanceCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumInstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumInstanceCount")(js.undefined)
        ret
    }
  }
  
}

