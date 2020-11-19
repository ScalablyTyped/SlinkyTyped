package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Optional. Contains information about a button.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageCardButton extends js.Object {
  
  /**
    * Optional. The text to send back to the Dialogflow API or a URI to open.
    */
  var postback: js.UndefOr[String] = js.native
  
  /**
    * Optional. The text to show on the button.
    */
  var text: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageCardButton {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageCardButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageCardButton]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageCardButtonOps[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageCardButton] (val x: Self) extends AnyVal {
    
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
    def setPostback(value: String): Self = this.set("postback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostback: Self = this.set("postback", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
