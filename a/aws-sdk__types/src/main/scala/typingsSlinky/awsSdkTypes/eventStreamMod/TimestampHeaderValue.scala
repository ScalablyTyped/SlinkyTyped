package typingsSlinky.awsSdkTypes.eventStreamMod

import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimestampHeaderValue extends MessageHeaderValue {
  
  var `type`: timestamp = js.native
  
  var value: js.Date = js.native
}
object TimestampHeaderValue {
  
  @scala.inline
  def apply(`type`: timestamp, value: js.Date): TimestampHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestampHeaderValue]
  }
  
  @scala.inline
  implicit class TimestampHeaderValueMutableBuilder[Self <: TimestampHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: timestamp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
