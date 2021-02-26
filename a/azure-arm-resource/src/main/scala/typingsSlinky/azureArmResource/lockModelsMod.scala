package typingsSlinky.azureArmResource

import typingsSlinky.msRestAzure.mod.CloudErrorParameters
import typingsSlinky.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lockModelsMod {
  
  @JSImport("azure-arm-resource/lib/lock/models", "BaseResource")
  @js.native
  class BaseResource ()
    extends typingsSlinky.msRestAzure.mod.BaseResource
  
  @JSImport("azure-arm-resource/lib/lock/models", "CloudError")
  @js.native
  class CloudError protected ()
    extends typingsSlinky.msRestAzure.mod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
  
  @js.native
  trait ManagementLockListResult extends Array[ManagementLockObject] {
    
    /**
      * The URL to use for getting the next set of results.
      */
    var nextLink: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait ManagementLockObject
    extends typingsSlinky.msRestAzure.mod.BaseResource {
    
    /**
      * The resource ID of the lock.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly. CanNotDelete
      * means authorized users are able to read and modify the resources, but not delete. ReadOnly
      * means authorized users can only read from a resource, but they can't modify or delete it.
      * Possible values include: 'NotSpecified', 'CanNotDelete', 'ReadOnly'
      */
    var level: String = js.native
    
    /**
      * The name of the lock.
      */
    val name: js.UndefOr[String] = js.native
    
    /**
      * Notes about the lock. Maximum of 512 characters.
      */
    var notes: js.UndefOr[String] = js.native
    
    /**
      * The owners of the lock.
      */
    var owners: js.UndefOr[js.Array[ManagementLockOwner]] = js.native
    
    /**
      * The resource type of the lock - Microsoft.Authorization/locks.
      */
    val `type`: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait ManagementLockOwner extends StObject {
    
    /**
      * The application ID of the lock owner.
      */
    var applicationId: js.UndefOr[String] = js.native
  }
  object ManagementLockOwner {
    
    @scala.inline
    def apply(): ManagementLockOwner = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagementLockOwner]
    }
    
    @scala.inline
    implicit class ManagementLockOwnerMutableBuilder[Self <: ManagementLockOwner] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationId(value: String): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
    }
  }
  
  @js.native
  trait Operation extends StObject {
    
    /**
      * The object that represents the operation.
      */
    var display: js.UndefOr[OperationDisplay] = js.native
    
    /**
      * Operation name: {provider}/{resource}/{operation}
      */
    var name: js.UndefOr[String] = js.native
  }
  object Operation {
    
    @scala.inline
    def apply(): Operation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Operation]
    }
    
    @scala.inline
    implicit class OperationMutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay(value: OperationDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait OperationDisplay extends StObject {
    
    /**
      * Operation type: Read, write, delete, etc.
      */
    var operation: js.UndefOr[String] = js.native
    
    /**
      * Service provider: Microsoft.Authorization
      */
    var provider: js.UndefOr[String] = js.native
    
    /**
      * Resource on which the operation is performed: Profile, endpoint, etc.
      */
    var resource: js.UndefOr[String] = js.native
  }
  object OperationDisplay {
    
    @scala.inline
    def apply(): OperationDisplay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OperationDisplay]
    }
    
    @scala.inline
    implicit class OperationDisplayMutableBuilder[Self <: OperationDisplay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
      
      @scala.inline
      def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    }
  }
  
  @js.native
  trait OperationListResult extends Array[Operation] {
    
    /**
      * URL to get the next set of operation list results if there are any.
      */
    var nextLink: js.UndefOr[String] = js.native
  }
}
