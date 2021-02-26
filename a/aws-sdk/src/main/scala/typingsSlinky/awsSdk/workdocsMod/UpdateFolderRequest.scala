package typingsSlinky.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFolderRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  
  /**
    * The ID of the folder.
    */
  var FolderId: ResourceIdType = js.native
  
  /**
    * The name of the folder.
    */
  var Name: js.UndefOr[ResourceNameType] = js.native
  
  /**
    * The ID of the parent folder.
    */
  var ParentFolderId: js.UndefOr[ResourceIdType] = js.native
  
  /**
    * The resource state of the folder. Only ACTIVE and RECYCLED are accepted values from the API.
    */
  var ResourceState: js.UndefOr[ResourceStateType] = js.native
}
object UpdateFolderRequest {
  
  @scala.inline
  def apply(FolderId: ResourceIdType): UpdateFolderRequest = {
    val __obj = js.Dynamic.literal(FolderId = FolderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFolderRequest]
  }
  
  @scala.inline
  implicit class UpdateFolderRequestMutableBuilder[Self <: UpdateFolderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setFolderId(value: ResourceIdType): Self = StObject.set(x, "FolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ResourceNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setParentFolderId(value: ResourceIdType): Self = StObject.set(x, "ParentFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFolderIdUndefined: Self = StObject.set(x, "ParentFolderId", js.undefined)
    
    @scala.inline
    def setResourceState(value: ResourceStateType): Self = StObject.set(x, "ResourceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceStateUndefined: Self = StObject.set(x, "ResourceState", js.undefined)
  }
}
