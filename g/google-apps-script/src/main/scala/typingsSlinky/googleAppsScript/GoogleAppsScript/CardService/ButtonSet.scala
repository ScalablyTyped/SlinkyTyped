package typingsSlinky.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holds a set of Button objects that are displayed in a row.
  *
  *     var textButton = CardService.newTextButton();
  *     // Finish building the text button...
  *
  *     var imageButton = CardService.newImageButton();
  *     // Finish building the image button...
  *
  *     var buttonSet = CardService.newButtonSet()
  *         .addButton(textButton)
  *         .addButton(imageButton);
  */
@js.native
trait ButtonSet extends StObject {
  
  def addButton(button: Button): ButtonSet = js.native
}
object ButtonSet {
  
  @scala.inline
  def apply(addButton: Button => ButtonSet): ButtonSet = {
    val __obj = js.Dynamic.literal(addButton = js.Any.fromFunction1(addButton))
    __obj.asInstanceOf[ButtonSet]
  }
  
  @scala.inline
  implicit class ButtonSetMutableBuilder[Self <: ButtonSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddButton(value: Button => ButtonSet): Self = StObject.set(x, "addButton", js.Any.fromFunction1(value))
  }
}
