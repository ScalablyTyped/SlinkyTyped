package typingsSlinky.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsContaineranalysisV1alpha1OperationMetadata extends js.Object {
  
  /** Output only. The time this operation was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. The time that this operation was marked completed or failed. */
  var endTime: js.UndefOr[String] = js.native
}
object GoogleDevtoolsContaineranalysisV1alpha1OperationMetadata {
  
  @scala.inline
  def apply(): GoogleDevtoolsContaineranalysisV1alpha1OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsContaineranalysisV1alpha1OperationMetadata]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsContaineranalysisV1alpha1OperationMetadataOps[Self <: GoogleDevtoolsContaineranalysisV1alpha1OperationMetadata] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
  }
}
