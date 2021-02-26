package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The button object that appears at the bottom of a card.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButton extends StObject {
  
  /**
    * Required. Action to take when a user taps on the button.
    */
  var openUriAction: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction] = js.native
  
  /**
    * Required. The title of the button.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButton {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButton]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenUriAction(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction): Self = StObject.set(x, "openUriAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUriActionUndefined: Self = StObject.set(x, "openUriAction", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
