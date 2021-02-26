package typingsSlinky.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserFacingMessage extends StObject {
  
  /**
    * The default message displayed if no localized message is specified or the user's locale doesn't match with any of the localized messages. A default message must be provided if any
    * localized messages are provided.
    */
  var defaultMessage: js.UndefOr[String] = js.native
  
  /** A map containing pairs, where locale is a well-formed BCP 47 language (https://www.w3.org/International/articles/language-tags/) code, such as en-US, es-ES, or fr. */
  var localizedMessages: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientAndroidmanagement.maximMazurokGapiClientAndroidmanagementStrings.UserFacingMessage with TopLevel[js.Any]
  ] = js.native
}
object UserFacingMessage {
  
  @scala.inline
  def apply(): UserFacingMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserFacingMessage]
  }
  
  @scala.inline
  implicit class UserFacingMessageMutableBuilder[Self <: UserFacingMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultMessage(value: String): Self = StObject.set(x, "defaultMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultMessageUndefined: Self = StObject.set(x, "defaultMessage", js.undefined)
    
    @scala.inline
    def setLocalizedMessages(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientAndroidmanagement.maximMazurokGapiClientAndroidmanagementStrings.UserFacingMessage with TopLevel[js.Any]
    ): Self = StObject.set(x, "localizedMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizedMessagesUndefined: Self = StObject.set(x, "localizedMessages", js.undefined)
  }
}
