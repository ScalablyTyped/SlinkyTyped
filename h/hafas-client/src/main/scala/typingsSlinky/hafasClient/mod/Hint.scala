package typingsSlinky.hafasClient.mod

import typingsSlinky.hafasClient.hafasClientStrings.`foreign-id`
import typingsSlinky.hafasClient.hafasClientStrings.`local-fare-zone`
import typingsSlinky.hafasClient.hafasClientStrings.`stop-dhid`
import typingsSlinky.hafasClient.hafasClientStrings.`stop-website`
import typingsSlinky.hafasClient.hafasClientStrings.`transit-authority`
import typingsSlinky.hafasClient.hafasClientStrings.hint
import typingsSlinky.hafasClient.hafasClientStrings.status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hint extends StObject {
  
  var code: js.UndefOr[String] = js.native
  
  var summary: js.UndefOr[String] = js.native
  
  var text: String = js.native
  
  var tripId: js.UndefOr[String] = js.native
  
  var `type`: hint | status | `foreign-id` | `local-fare-zone` | `stop-website` | `stop-dhid` | `transit-authority` = js.native
}
object Hint {
  
  @scala.inline
  def apply(
    text: String,
    `type`: hint | status | `foreign-id` | `local-fare-zone` | `stop-website` | `stop-dhid` | `transit-authority`
  ): Hint = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hint]
  }
  
  @scala.inline
  implicit class HintMutableBuilder[Self <: Hint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTripId(value: String): Self = StObject.set(x, "tripId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTripIdUndefined: Self = StObject.set(x, "tripId", js.undefined)
    
    @scala.inline
    def setType(
      value: hint | status | `foreign-id` | `local-fare-zone` | `stop-website` | `stop-dhid` | `transit-authority`
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
