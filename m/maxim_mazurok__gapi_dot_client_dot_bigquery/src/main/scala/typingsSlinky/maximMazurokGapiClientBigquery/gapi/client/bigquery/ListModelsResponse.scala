package typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListModelsResponse extends js.Object {
  
  /** Models in the requested dataset. Only the following fields are populated: model_reference, model_type, creation_time, last_modified_time and labels. */
  var models: js.UndefOr[js.Array[Model]] = js.native
  
  /** A token to request the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListModelsResponse {
  
  @scala.inline
  def apply(): ListModelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListModelsResponse]
  }
  
  @scala.inline
  implicit class ListModelsResponseOps[Self <: ListModelsResponse] (val x: Self) extends AnyVal {
    
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
    def setModelsVarargs(value: Model*): Self = this.set("models", js.Array(value :_*))
    
    @scala.inline
    def setModels(value: js.Array[Model]): Self = this.set("models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModels: Self = this.set("models", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
