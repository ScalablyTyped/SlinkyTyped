package typingsSlinky.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response object that may be returned from a method that creates universal action.
  *
  *     // A universal action that opens a link.
  *     var openLinkUniversalAction = CardService.newUniversalActionResponseBuilder()
  *         .setOpenLink(CardService.newOpenLink()
  *             .setUrl("https://www.google.com"))
  *             .build();
  *
  *     var cardBuilder1 = CardService.newCardBuilder();
  *     var cardBuilder2 = CardService.newCardBuilder();
  *     // Finish building the cards ...
  *
  *     // A universal action that shows two static cards.
  *     var cardsUniversalAction = CardService.newUniversalActionResponseBuilder()
  *         .displayAddOnCards([
  *             cardBuilder1.build();
  *             cardBuilder2.build();
  *         ]).build();
  */
@js.native
trait UniversalActionResponse extends StObject {
  
  def printJson(): String = js.native
}
object UniversalActionResponse {
  
  @scala.inline
  def apply(printJson: () => String): UniversalActionResponse = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
    __obj.asInstanceOf[UniversalActionResponse]
  }
  
  @scala.inline
  implicit class UniversalActionResponseMutableBuilder[Self <: UniversalActionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrintJson(value: () => String): Self = StObject.set(x, "printJson", js.Any.fromFunction0(value))
  }
}
