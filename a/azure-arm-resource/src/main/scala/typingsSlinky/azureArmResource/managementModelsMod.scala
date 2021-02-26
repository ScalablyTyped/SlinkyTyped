package typingsSlinky.azureArmResource

import typingsSlinky.msRestAzure.mod.CloudErrorParameters
import typingsSlinky.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object managementModelsMod {
  
  @JSImport("azure-arm-resource/lib/management/models", "BaseResource")
  @js.native
  class BaseResource ()
    extends typingsSlinky.msRestAzure.mod.BaseResource
  
  @JSImport("azure-arm-resource/lib/management/models", "CloudError")
  @js.native
  class CloudError protected ()
    extends typingsSlinky.msRestAzure.mod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
  
  @js.native
  trait ErrorDetails extends StObject {
    
    var code: js.UndefOr[String] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var target: js.UndefOr[String] = js.native
  }
  object ErrorDetails {
    
    @scala.inline
    def apply(): ErrorDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorDetails]
    }
    
    @scala.inline
    implicit class ErrorDetailsMutableBuilder[Self <: ErrorDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait ErrorResponse extends StObject {
    
    var error: js.UndefOr[ErrorDetails] = js.native
  }
  object ErrorResponse {
    
    @scala.inline
    def apply(): ErrorResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorResponse]
    }
    
    @scala.inline
    implicit class ErrorResponseMutableBuilder[Self <: ErrorResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: ErrorDetails): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
  
  @js.native
  trait ManagementGroup extends StObject {
    
    var details: js.UndefOr[ManagementGroupDetailsProperties] = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    val id: js.UndefOr[String] = js.native
    
    val name: js.UndefOr[String] = js.native
    
    var tenantId: js.UndefOr[String] = js.native
    
    val `type`: js.UndefOr[String] = js.native
  }
  object ManagementGroup {
    
    @scala.inline
    def apply(): ManagementGroup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagementGroup]
    }
    
    @scala.inline
    implicit class ManagementGroupMutableBuilder[Self <: ManagementGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: ManagementGroupDetailsProperties): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ManagementGroupChildInfo extends StObject {
    
    var childId: js.UndefOr[String] = js.native
    
    var childType: js.UndefOr[String] = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var tenantId: js.UndefOr[String] = js.native
  }
  object ManagementGroupChildInfo {
    
    @scala.inline
    def apply(): ManagementGroupChildInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagementGroupChildInfo]
    }
    
    @scala.inline
    implicit class ManagementGroupChildInfoMutableBuilder[Self <: ManagementGroupChildInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildId(value: String): Self = StObject.set(x, "childId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildIdUndefined: Self = StObject.set(x, "childId", js.undefined)
      
      @scala.inline
      def setChildType(value: String): Self = StObject.set(x, "childType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildTypeUndefined: Self = StObject.set(x, "childType", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  @js.native
  trait ManagementGroupDetailsProperties extends StObject {
    
    var managementGroupType: js.UndefOr[String] = js.native
    
    var parent: js.UndefOr[ParentGroupInfo] = js.native
    
    var updatedBy: js.UndefOr[String] = js.native
    
    var updatedTime: js.UndefOr[js.Date] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
  object ManagementGroupDetailsProperties {
    
    @scala.inline
    def apply(): ManagementGroupDetailsProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagementGroupDetailsProperties]
    }
    
    @scala.inline
    implicit class ManagementGroupDetailsPropertiesMutableBuilder[Self <: ManagementGroupDetailsProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setManagementGroupType(value: String): Self = StObject.set(x, "managementGroupType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManagementGroupTypeUndefined: Self = StObject.set(x, "managementGroupType", js.undefined)
      
      @scala.inline
      def setParent(value: ParentGroupInfo): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setUpdatedBy(value: String): Self = StObject.set(x, "updatedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedByUndefined: Self = StObject.set(x, "updatedBy", js.undefined)
      
      @scala.inline
      def setUpdatedTime(value: js.Date): Self = StObject.set(x, "updatedTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedTimeUndefined: Self = StObject.set(x, "updatedTime", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait ManagementGroupInfo extends StObject {
    
    var displayName: js.UndefOr[String] = js.native
    
    val id: js.UndefOr[String] = js.native
    
    val name: js.UndefOr[String] = js.native
    
    var tenantId: js.UndefOr[String] = js.native
    
    val `type`: js.UndefOr[String] = js.native
  }
  object ManagementGroupInfo {
    
    @scala.inline
    def apply(): ManagementGroupInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagementGroupInfo]
    }
    
    @scala.inline
    implicit class ManagementGroupInfoMutableBuilder[Self <: ManagementGroupInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ManagementGroupListResult extends Array[ManagementGroupInfo] {
    
    val nextLink: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait ManagementGroupRecursiveChildInfo extends StObject {
    
    var childId: js.UndefOr[String] = js.native
    
    var childType: js.UndefOr[String] = js.native
    
    var children: js.UndefOr[js.Array[ManagementGroupRecursiveChildInfo]] = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var tenantId: js.UndefOr[String] = js.native
  }
  object ManagementGroupRecursiveChildInfo {
    
    @scala.inline
    def apply(): ManagementGroupRecursiveChildInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagementGroupRecursiveChildInfo]
    }
    
    @scala.inline
    implicit class ManagementGroupRecursiveChildInfoMutableBuilder[Self <: ManagementGroupRecursiveChildInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildId(value: String): Self = StObject.set(x, "childId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildIdUndefined: Self = StObject.set(x, "childId", js.undefined)
      
      @scala.inline
      def setChildType(value: String): Self = StObject.set(x, "childType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildTypeUndefined: Self = StObject.set(x, "childType", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[ManagementGroupRecursiveChildInfo]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ManagementGroupRecursiveChildInfo*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  @js.native
  trait ManagementGroupWithChildren extends StObject {
    
    var children: js.UndefOr[js.Array[ManagementGroupChildInfo]] = js.native
    
    var details: js.UndefOr[ManagementGroupDetailsProperties] = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    val id: js.UndefOr[String] = js.native
    
    val name: js.UndefOr[String] = js.native
    
    var tenantId: js.UndefOr[String] = js.native
    
    val `type`: js.UndefOr[String] = js.native
  }
  object ManagementGroupWithChildren {
    
    @scala.inline
    def apply(): ManagementGroupWithChildren = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagementGroupWithChildren]
    }
    
    @scala.inline
    implicit class ManagementGroupWithChildrenMutableBuilder[Self <: ManagementGroupWithChildren] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ManagementGroupChildInfo]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ManagementGroupChildInfo*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDetails(value: ManagementGroupDetailsProperties): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ManagementGroupWithHierarchy extends StObject {
    
    var children: js.UndefOr[js.Array[ManagementGroupRecursiveChildInfo]] = js.native
    
    var details: js.UndefOr[ManagementGroupDetailsProperties] = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    val id: js.UndefOr[String] = js.native
    
    val name: js.UndefOr[String] = js.native
    
    var tenantId: js.UndefOr[String] = js.native
    
    val `type`: js.UndefOr[String] = js.native
  }
  object ManagementGroupWithHierarchy {
    
    @scala.inline
    def apply(): ManagementGroupWithHierarchy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagementGroupWithHierarchy]
    }
    
    @scala.inline
    implicit class ManagementGroupWithHierarchyMutableBuilder[Self <: ManagementGroupWithHierarchy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ManagementGroupRecursiveChildInfo]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ManagementGroupRecursiveChildInfo*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDetails(value: ManagementGroupDetailsProperties): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Operation extends StObject {
    
    var display: js.UndefOr[OperationDisplay] = js.native
    
    val name: js.UndefOr[String] = js.native
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
    
    val operation: js.UndefOr[String] = js.native
    
    val provider: js.UndefOr[String] = js.native
    
    val resource: js.UndefOr[String] = js.native
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
    
    val nextLink: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait ParentGroupInfo extends StObject {
    
    var displayName: js.UndefOr[String] = js.native
    
    var parentId: js.UndefOr[String] = js.native
  }
  object ParentGroupInfo {
    
    @scala.inline
    def apply(): ParentGroupInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParentGroupInfo]
    }
    
    @scala.inline
    implicit class ParentGroupInfoMutableBuilder[Self <: ParentGroupInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    }
  }
}
