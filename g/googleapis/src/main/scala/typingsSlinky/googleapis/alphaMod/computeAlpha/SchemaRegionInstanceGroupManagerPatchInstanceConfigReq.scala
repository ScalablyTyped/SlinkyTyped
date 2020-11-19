package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RegionInstanceGroupManagers.patchPerInstanceConfigs
  */
@js.native
trait SchemaRegionInstanceGroupManagerPatchInstanceConfigReq extends js.Object {
  
  /**
    * The list of per-instance configs to insert or patch on this managed
    * instance group.
    */
  var perInstanceConfigs: js.UndefOr[js.Array[SchemaPerInstanceConfig]] = js.native
}
object SchemaRegionInstanceGroupManagerPatchInstanceConfigReq {
  
  @scala.inline
  def apply(): SchemaRegionInstanceGroupManagerPatchInstanceConfigReq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagerPatchInstanceConfigReq]
  }
  
  @scala.inline
  implicit class SchemaRegionInstanceGroupManagerPatchInstanceConfigReqOps[Self <: SchemaRegionInstanceGroupManagerPatchInstanceConfigReq] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPerInstanceConfigsVarargs(value: SchemaPerInstanceConfig*): Self = this.set("perInstanceConfigs", js.Array(value :_*))
    
    @scala.inline
    def setPerInstanceConfigs(value: js.Array[SchemaPerInstanceConfig]): Self = this.set("perInstanceConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerInstanceConfigs: Self = this.set("perInstanceConfigs", js.undefined)
  }
}
