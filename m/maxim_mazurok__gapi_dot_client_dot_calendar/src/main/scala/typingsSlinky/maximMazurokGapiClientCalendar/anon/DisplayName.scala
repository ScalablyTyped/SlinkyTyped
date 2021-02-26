package typingsSlinky.maximMazurokGapiClientCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayName extends StObject {
  
  /** The organizer's name, if available. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The organizer's email address, if available. It must be a valid email address as per RFC5322. */
  var email: js.UndefOr[String] = js.native
  
  /** The organizer's Profile ID, if available. It corresponds to the id field in the People collection of the Google+ API */
  var id: js.UndefOr[String] = js.native
  
  /** Whether the organizer corresponds to the calendar on which this copy of the event appears. Read-only. The default is False. */
  var self: js.UndefOr[Boolean] = js.native
}
object DisplayName {
  
  @scala.inline
  def apply(): DisplayName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayName]
  }
  
  @scala.inline
  implicit class DisplayNameMutableBuilder[Self <: DisplayName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
  }
}
