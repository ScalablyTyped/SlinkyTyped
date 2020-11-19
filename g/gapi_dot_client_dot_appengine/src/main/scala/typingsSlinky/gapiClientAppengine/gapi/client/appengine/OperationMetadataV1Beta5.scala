package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationMetadataV1Beta5 extends js.Object {
  
  /** Timestamp that this operation completed.@OutputOnly */
  var endTime: js.UndefOr[String] = js.native
  
  /** Timestamp that this operation was created.@OutputOnly */
  var insertTime: js.UndefOr[String] = js.native
  
  /** API method name that initiated this operation. Example: google.appengine.v1beta5.Version.CreateVersion.@OutputOnly */
  var method: js.UndefOr[String] = js.native
  
  /** Name of the resource that this operation is acting on. Example: apps/myapp/services/default.@OutputOnly */
  var target: js.UndefOr[String] = js.native
  
  /** User who requested this operation.@OutputOnly */
  var user: js.UndefOr[String] = js.native
}
object OperationMetadataV1Beta5 {
  
  @scala.inline
  def apply(): OperationMetadataV1Beta5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationMetadataV1Beta5]
  }
  
  @scala.inline
  implicit class OperationMetadataV1Beta5Ops[Self <: OperationMetadataV1Beta5] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setInsertTime(value: String): Self = this.set("insertTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertTime: Self = this.set("insertTime", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
