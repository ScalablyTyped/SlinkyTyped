package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDynamicThingGroupResponse extends js.Object {
  
  /**
    * The dynamic thing group version.
    */
  var version: js.UndefOr[Version] = js.native
}
object UpdateDynamicThingGroupResponse {
  
  @scala.inline
  def apply(): UpdateDynamicThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDynamicThingGroupResponse]
  }
  
  @scala.inline
  implicit class UpdateDynamicThingGroupResponseOps[Self <: UpdateDynamicThingGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVersion(value: Version): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
