package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointSendConfiguration extends StObject {
  
  /**
    * The body of the message. If specified, this value overrides the default message body.
    */
  var BodyOverride: js.UndefOr[string] = js.native
  
  /**
    * A map of custom attributes to attach to the message for the address. Attribute names are case sensitive. For a push notification, this payload is added to the data.pinpoint object. For an email or text message, this payload is added to email/SMS delivery receipt event attributes.
    */
  var Context: js.UndefOr[MapOfString] = js.native
  
  /**
    * The raw, JSON-formatted string to use as the payload for the message. If specified, this value overrides all other values for the message.
    */
  var RawContent: js.UndefOr[string] = js.native
  
  /**
    * A map of the message variables to merge with the variables specified for the default message (DefaultMessage.Substitutions). The variables specified in this map take precedence over all other variables.
    */
  var Substitutions: js.UndefOr[MapOfListOfString] = js.native
  
  /**
    * The title or subject line of the message. If specified, this value overrides the default message title or subject line.
    */
  var TitleOverride: js.UndefOr[string] = js.native
}
object EndpointSendConfiguration {
  
  @scala.inline
  def apply(): EndpointSendConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointSendConfiguration]
  }
  
  @scala.inline
  implicit class EndpointSendConfigurationMutableBuilder[Self <: EndpointSendConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodyOverride(value: string): Self = StObject.set(x, "BodyOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyOverrideUndefined: Self = StObject.set(x, "BodyOverride", js.undefined)
    
    @scala.inline
    def setContext(value: MapOfString): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "Context", js.undefined)
    
    @scala.inline
    def setRawContent(value: string): Self = StObject.set(x, "RawContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawContentUndefined: Self = StObject.set(x, "RawContent", js.undefined)
    
    @scala.inline
    def setSubstitutions(value: MapOfListOfString): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
    
    @scala.inline
    def setTitleOverride(value: string): Self = StObject.set(x, "TitleOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleOverrideUndefined: Self = StObject.set(x, "TitleOverride", js.undefined)
  }
}
