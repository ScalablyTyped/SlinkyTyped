package typingsSlinky.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response object that may be returned from a callback function (e.g., a form response handler)
  * to perform one or more actions on the client. Some combinations of actions are not supported.
  *
  *     // An action that opens a link
  *     var actionResponse = CardService.newActionResponseBuilder()
  *         .setOpenLink(CardService.newOpenLink()
  *             .setUrl("https://www.google.com"))
  *         .build();
  *
  *     // An action that shows a notification.
  *     var actionResponse = CardService.newActionResponseBuilder()
  *         .setNotification(CardService.newNotification()
  *             .setText("Some info to display to user"))
  *         .build();
  *
  *     // An action that shows an additional card. It also sets a flag to indicate that the original
  *     // state data has changed.
  *
  *     var cardBuilder = CardService.newCardBuilder();
  *     // Build card ...
  *     var actionResponse = CardService.newActionResponseBuilder()
  *         .setNavigation(CardService.newNavigation()
  *             .pushCard(cardBuilder.build()))
  *         .setStateChanged(true)
  *         .build();
  */
@js.native
trait ActionResponse extends StObject {
  
  def printJson(): String = js.native
}
object ActionResponse {
  
  @scala.inline
  def apply(printJson: () => String): ActionResponse = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
    __obj.asInstanceOf[ActionResponse]
  }
  
  @scala.inline
  implicit class ActionResponseMutableBuilder[Self <: ActionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrintJson(value: () => String): Self = StObject.set(x, "printJson", js.Any.fromFunction0(value))
  }
}
