package typingsSlinky.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a response that makes changes to the calendar event that the user is currently editing in reaction to an action taken in the UI, such as a button click.
  */
@js.native
trait CalendarEventActionResponse extends StObject {
  
  def printJson(): String = js.native
}
object CalendarEventActionResponse {
  
  @scala.inline
  def apply(printJson: () => String): CalendarEventActionResponse = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
    __obj.asInstanceOf[CalendarEventActionResponse]
  }
  
  @scala.inline
  implicit class CalendarEventActionResponseMutableBuilder[Self <: CalendarEventActionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrintJson(value: () => String): Self = StObject.set(x, "printJson", js.Any.fromFunction0(value))
  }
}
