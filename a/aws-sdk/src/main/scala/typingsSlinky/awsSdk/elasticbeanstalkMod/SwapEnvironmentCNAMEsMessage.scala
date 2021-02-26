package typingsSlinky.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwapEnvironmentCNAMEsMessage extends StObject {
  
  /**
    * The ID of the destination environment.  Condition: You must specify at least the DestinationEnvironmentID or the DestinationEnvironmentName. You may also specify both. You must specify the SourceEnvironmentId with the DestinationEnvironmentId. 
    */
  var DestinationEnvironmentId: js.UndefOr[EnvironmentId] = js.native
  
  /**
    * The name of the destination environment.  Condition: You must specify at least the DestinationEnvironmentID or the DestinationEnvironmentName. You may also specify both. You must specify the SourceEnvironmentName with the DestinationEnvironmentName. 
    */
  var DestinationEnvironmentName: js.UndefOr[EnvironmentName] = js.native
  
  /**
    * The ID of the source environment.  Condition: You must specify at least the SourceEnvironmentID or the SourceEnvironmentName. You may also specify both. If you specify the SourceEnvironmentId, you must specify the DestinationEnvironmentId. 
    */
  var SourceEnvironmentId: js.UndefOr[EnvironmentId] = js.native
  
  /**
    * The name of the source environment.  Condition: You must specify at least the SourceEnvironmentID or the SourceEnvironmentName. You may also specify both. If you specify the SourceEnvironmentName, you must specify the DestinationEnvironmentName. 
    */
  var SourceEnvironmentName: js.UndefOr[EnvironmentName] = js.native
}
object SwapEnvironmentCNAMEsMessage {
  
  @scala.inline
  def apply(): SwapEnvironmentCNAMEsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwapEnvironmentCNAMEsMessage]
  }
  
  @scala.inline
  implicit class SwapEnvironmentCNAMEsMessageMutableBuilder[Self <: SwapEnvironmentCNAMEsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "DestinationEnvironmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationEnvironmentIdUndefined: Self = StObject.set(x, "DestinationEnvironmentId", js.undefined)
    
    @scala.inline
    def setDestinationEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "DestinationEnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationEnvironmentNameUndefined: Self = StObject.set(x, "DestinationEnvironmentName", js.undefined)
    
    @scala.inline
    def setSourceEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "SourceEnvironmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceEnvironmentIdUndefined: Self = StObject.set(x, "SourceEnvironmentId", js.undefined)
    
    @scala.inline
    def setSourceEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "SourceEnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceEnvironmentNameUndefined: Self = StObject.set(x, "SourceEnvironmentName", js.undefined)
  }
}
