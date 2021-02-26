package typingsSlinky.actionsOnGoogle.apiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentMessageBasicCardButton extends StObject {
  
  var openUriAction: js.UndefOr[GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2IntentMessageBasicCardButton {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageBasicCardButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageBasicCardButton]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageBasicCardButtonMutableBuilder[Self <: GoogleCloudDialogflowV2IntentMessageBasicCardButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenUriAction(value: GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction): Self = StObject.set(x, "openUriAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUriActionUndefined: Self = StObject.set(x, "openUriAction", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
