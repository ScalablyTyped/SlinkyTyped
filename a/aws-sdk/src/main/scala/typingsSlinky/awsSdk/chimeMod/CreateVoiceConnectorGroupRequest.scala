package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVoiceConnectorGroupRequest extends StObject {
  
  /**
    * The name of the Amazon Chime Voice Connector group.
    */
  var Name: VoiceConnectorGroupName = js.native
  
  /**
    * The Amazon Chime Voice Connectors to route inbound calls to.
    */
  var VoiceConnectorItems: js.UndefOr[VoiceConnectorItemList] = js.native
}
object CreateVoiceConnectorGroupRequest {
  
  @scala.inline
  def apply(Name: VoiceConnectorGroupName): CreateVoiceConnectorGroupRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVoiceConnectorGroupRequest]
  }
  
  @scala.inline
  implicit class CreateVoiceConnectorGroupRequestMutableBuilder[Self <: CreateVoiceConnectorGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: VoiceConnectorGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorItems(value: VoiceConnectorItemList): Self = StObject.set(x, "VoiceConnectorItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnectorItemsUndefined: Self = StObject.set(x, "VoiceConnectorItems", js.undefined)
    
    @scala.inline
    def setVoiceConnectorItemsVarargs(value: VoiceConnectorItem*): Self = StObject.set(x, "VoiceConnectorItems", js.Array(value :_*))
  }
}
