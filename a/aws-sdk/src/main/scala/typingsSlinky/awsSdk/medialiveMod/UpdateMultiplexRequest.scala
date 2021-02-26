package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMultiplexRequest extends StObject {
  
  /**
    * ID of the multiplex to update.
    */
  var MultiplexId: string = js.native
  
  /**
    * The new settings for a multiplex.
    */
  var MultiplexSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.MultiplexSettings] = js.native
  
  /**
    * Name of the multiplex.
    */
  var Name: js.UndefOr[string] = js.native
}
object UpdateMultiplexRequest {
  
  @scala.inline
  def apply(MultiplexId: string): UpdateMultiplexRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMultiplexRequest]
  }
  
  @scala.inline
  implicit class UpdateMultiplexRequestMutableBuilder[Self <: UpdateMultiplexRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiplexId(value: string): Self = StObject.set(x, "MultiplexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplexSettings(value: MultiplexSettings): Self = StObject.set(x, "MultiplexSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplexSettingsUndefined: Self = StObject.set(x, "MultiplexSettings", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
