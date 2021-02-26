package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultMessage extends StObject {
  
  /**
    * The default body of the message.
    */
  var Body: js.UndefOr[string] = js.native
  
  /**
    * The default message variables to use in the message. You can override these default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOfString] = js.native
}
object DefaultMessage {
  
  @scala.inline
  def apply(): DefaultMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultMessage]
  }
  
  @scala.inline
  implicit class DefaultMessageMutableBuilder[Self <: DefaultMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: string): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    @scala.inline
    def setSubstitutions(value: MapOfListOfString): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
  }
}
