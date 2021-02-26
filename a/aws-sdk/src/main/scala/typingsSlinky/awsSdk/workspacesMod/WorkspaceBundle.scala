package typingsSlinky.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceBundle extends StObject {
  
  /**
    * The bundle identifier.
    */
  var BundleId: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.BundleId] = js.native
  
  /**
    * The compute type. For more information, see Amazon WorkSpaces Bundles.
    */
  var ComputeType: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.ComputeType] = js.native
  
  /**
    * A description.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.Description] = js.native
  
  /**
    * The image identifier of the bundle.
    */
  var ImageId: js.UndefOr[WorkspaceImageId] = js.native
  
  /**
    * The last time that the bundle was updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the bundle.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The owner of the bundle. This is the account identifier of the owner, or AMAZON if the bundle is provided by AWS.
    */
  var Owner: js.UndefOr[BundleOwner] = js.native
  
  /**
    * The size of the root volume.
    */
  var RootStorage: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.RootStorage] = js.native
  
  /**
    * The size of the user storage.
    */
  var UserStorage: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.UserStorage] = js.native
}
object WorkspaceBundle {
  
  @scala.inline
  def apply(): WorkspaceBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceBundle]
  }
  
  @scala.inline
  implicit class WorkspaceBundleMutableBuilder[Self <: WorkspaceBundle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleId(value: BundleId): Self = StObject.set(x, "BundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdUndefined: Self = StObject.set(x, "BundleId", js.undefined)
    
    @scala.inline
    def setComputeType(value: ComputeType): Self = StObject.set(x, "ComputeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeTypeUndefined: Self = StObject.set(x, "ComputeType", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setImageId(value: WorkspaceImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOwner(value: BundleOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    @scala.inline
    def setRootStorage(value: RootStorage): Self = StObject.set(x, "RootStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootStorageUndefined: Self = StObject.set(x, "RootStorage", js.undefined)
    
    @scala.inline
    def setUserStorage(value: UserStorage): Self = StObject.set(x, "UserStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserStorageUndefined: Self = StObject.set(x, "UserStorage", js.undefined)
  }
}
