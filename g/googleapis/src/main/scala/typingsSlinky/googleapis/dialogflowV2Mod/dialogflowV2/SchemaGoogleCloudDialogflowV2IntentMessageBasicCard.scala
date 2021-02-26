package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The basic card message. Useful for displaying information.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessageBasicCard extends StObject {
  
  /**
    * Optional. The collection of card buttons.
    */
  var buttons: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButton]] = js.native
  
  /**
    * Required, unless image is present. The body text of the card.
    */
  var formattedText: js.UndefOr[String] = js.native
  
  /**
    * Optional. The image for the card.
    */
  var image: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageImage] = js.native
  
  /**
    * Optional. The subtitle of the card.
    */
  var subtitle: js.UndefOr[String] = js.native
  
  /**
    * Optional. The title of the card.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudDialogflowV2IntentMessageBasicCard {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2IntentMessageBasicCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageBasicCard]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentMessageBasicCardMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2IntentMessageBasicCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setFormattedText(value: String): Self = StObject.set(x, "formattedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedTextUndefined: Self = StObject.set(x, "formattedText", js.undefined)
    
    @scala.inline
    def setImage(value: SchemaGoogleCloudDialogflowV2IntentMessageImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
