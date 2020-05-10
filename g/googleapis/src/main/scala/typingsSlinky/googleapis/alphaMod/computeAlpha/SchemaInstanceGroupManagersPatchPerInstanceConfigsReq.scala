package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * InstanceGroupManagers.patchPerInstanceConfigs
  */
@js.native
trait SchemaInstanceGroupManagersPatchPerInstanceConfigsReq extends js.Object {
  /**
    * The list of per-instance configs to insert or patch on this managed
    * instance group.
    */
  var perInstanceConfigs: js.UndefOr[js.Array[SchemaPerInstanceConfig]] = js.native
}

object SchemaInstanceGroupManagersPatchPerInstanceConfigsReq {
  @scala.inline
  def apply(): SchemaInstanceGroupManagersPatchPerInstanceConfigsReq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersPatchPerInstanceConfigsReq]
  }
  @scala.inline
  implicit class SchemaInstanceGroupManagersPatchPerInstanceConfigsReqOps[Self <: SchemaInstanceGroupManagersPatchPerInstanceConfigsReq] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPerInstanceConfigs(value: js.Array[SchemaPerInstanceConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perInstanceConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerInstanceConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perInstanceConfigs")(js.undefined)
        ret
    }
  }
  
}

