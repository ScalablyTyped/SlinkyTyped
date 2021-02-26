package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNamespaceResponse extends StObject {
  
  /**
    * The ARN of the QuickSight namespace you created. 
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.Arn] = js.native
  
  /**
    * The AWS Region that you want to use for the free SPICE capacity for the new namespace. This is set to the region that you run CreateNamespace in. 
    */
  var CapacityRegion: js.UndefOr[String] = js.native
  
  /**
    * The status of the creation of the namespace. This is an asynchronous process. A status of CREATED means that your namespace is ready to use. If an error occurs, it indicates if the process is retryable or non-retryable. In the case of a non-retryable error, refer to the error message for follow-up tasks.
    */
  var CreationStatus: js.UndefOr[NamespaceStatus] = js.native
  
  /**
    * Specifies the type of your user identity directory. Currently, this supports users with an identity type of QUICKSIGHT.
    */
  var IdentityStore: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.IdentityStore] = js.native
  
  /**
    * The name of the new namespace that you created.
    */
  var Name: js.UndefOr[Namespace] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}
object CreateNamespaceResponse {
  
  @scala.inline
  def apply(): CreateNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNamespaceResponse]
  }
  
  @scala.inline
  implicit class CreateNamespaceResponseMutableBuilder[Self <: CreateNamespaceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCapacityRegion(value: String): Self = StObject.set(x, "CapacityRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityRegionUndefined: Self = StObject.set(x, "CapacityRegion", js.undefined)
    
    @scala.inline
    def setCreationStatus(value: NamespaceStatus): Self = StObject.set(x, "CreationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationStatusUndefined: Self = StObject.set(x, "CreationStatus", js.undefined)
    
    @scala.inline
    def setIdentityStore(value: IdentityStore): Self = StObject.set(x, "IdentityStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityStoreUndefined: Self = StObject.set(x, "IdentityStore", js.undefined)
    
    @scala.inline
    def setName(value: Namespace): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
