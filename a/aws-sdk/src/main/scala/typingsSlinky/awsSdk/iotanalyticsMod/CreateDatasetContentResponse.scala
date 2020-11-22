package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDatasetContentResponse extends js.Object {
  
  /**
    * The version ID of the dataset contents that are being created.
    */
  var versionId: js.UndefOr[DatasetContentVersion] = js.native
}
object CreateDatasetContentResponse {
  
  @scala.inline
  def apply(): CreateDatasetContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatasetContentResponse]
  }
  
  @scala.inline
  implicit class CreateDatasetContentResponseOps[Self <: CreateDatasetContentResponse] (val x: Self) extends AnyVal {
    
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
    def setVersionId(value: DatasetContentVersion): Self = this.set("versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("versionId", js.undefined)
  }
}
