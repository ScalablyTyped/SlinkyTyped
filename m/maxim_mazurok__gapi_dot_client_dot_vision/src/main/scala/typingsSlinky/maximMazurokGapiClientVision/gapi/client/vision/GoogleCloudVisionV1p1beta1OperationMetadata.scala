package typingsSlinky.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p1beta1OperationMetadata extends js.Object {
  
  /** The time when the batch request was received. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Current state of the batch operation. */
  var state: js.UndefOr[String] = js.native
  
  /** The time when the operation result was last updated. */
  var updateTime: js.UndefOr[String] = js.native
}
object GoogleCloudVisionV1p1beta1OperationMetadata {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p1beta1OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p1beta1OperationMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p1beta1OperationMetadataOps[Self <: GoogleCloudVisionV1p1beta1OperationMetadata] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
