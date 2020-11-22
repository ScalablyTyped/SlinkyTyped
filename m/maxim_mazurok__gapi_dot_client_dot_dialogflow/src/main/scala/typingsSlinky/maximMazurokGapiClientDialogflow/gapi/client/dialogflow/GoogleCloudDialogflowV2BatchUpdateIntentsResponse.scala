package typingsSlinky.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2BatchUpdateIntentsResponse extends js.Object {
  
  /** The collection of updated or created intents. */
  var intents: js.UndefOr[js.Array[GoogleCloudDialogflowV2Intent]] = js.native
}
object GoogleCloudDialogflowV2BatchUpdateIntentsResponse {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2BatchUpdateIntentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2BatchUpdateIntentsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2BatchUpdateIntentsResponseOps[Self <: GoogleCloudDialogflowV2BatchUpdateIntentsResponse] (val x: Self) extends AnyVal {
    
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
    def setIntentsVarargs(value: GoogleCloudDialogflowV2Intent*): Self = this.set("intents", js.Array(value :_*))
    
    @scala.inline
    def setIntents(value: js.Array[GoogleCloudDialogflowV2Intent]): Self = this.set("intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntents: Self = this.set("intents", js.undefined)
  }
}
