package typingsSlinky.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointFilter extends StObject {
  
  /**
    * Specifies a date after which the returned endpoint or endpoints were created.
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.native
  
  /**
    * Specifies a date before which the returned endpoint or endpoints were created.
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.native
  
  /**
    * The Amazon Resource Number (ARN) of the model to which the endpoint is attached.
    */
  var ModelArn: js.UndefOr[ComprehendModelArn] = js.native
  
  /**
    * Specifies the status of the endpoint being returned. Possible values are: Creating, Ready, Updating, Deleting, Failed.
    */
  var Status: js.UndefOr[EndpointStatus] = js.native
}
object EndpointFilter {
  
  @scala.inline
  def apply(): EndpointFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointFilter]
  }
  
  @scala.inline
  implicit class EndpointFilterMutableBuilder[Self <: EndpointFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimeAfter(value: js.Date): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    @scala.inline
    def setCreationTimeBefore(value: js.Date): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    @scala.inline
    def setModelArn(value: ComprehendModelArn): Self = StObject.set(x, "ModelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelArnUndefined: Self = StObject.set(x, "ModelArn", js.undefined)
    
    @scala.inline
    def setStatus(value: EndpointStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
