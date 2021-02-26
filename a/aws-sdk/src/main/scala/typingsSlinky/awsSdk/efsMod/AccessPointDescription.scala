package typingsSlinky.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessPointDescription extends StObject {
  
  /**
    * The unique Amazon Resource Name (ARN) associated with the access point.
    */
  var AccessPointArn: js.UndefOr[typingsSlinky.awsSdk.efsMod.AccessPointArn] = js.native
  
  /**
    * The ID of the access point, assigned by Amazon EFS.
    */
  var AccessPointId: js.UndefOr[typingsSlinky.awsSdk.efsMod.AccessPointId] = js.native
  
  /**
    * The opaque string specified in the request to ensure idempotent creation.
    */
  var ClientToken: js.UndefOr[typingsSlinky.awsSdk.efsMod.ClientToken] = js.native
  
  /**
    * The ID of the EFS file system that the access point applies to.
    */
  var FileSystemId: js.UndefOr[typingsSlinky.awsSdk.efsMod.FileSystemId] = js.native
  
  /**
    * Identifies the lifecycle phase of the access point.
    */
  var LifeCycleState: js.UndefOr[typingsSlinky.awsSdk.efsMod.LifeCycleState] = js.native
  
  /**
    * The name of the access point. This is the value of the Name tag.
    */
  var Name: js.UndefOr[typingsSlinky.awsSdk.efsMod.Name] = js.native
  
  /**
    * Identified the AWS account that owns the access point resource.
    */
  var OwnerId: js.UndefOr[AwsAccountId] = js.native
  
  /**
    * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access point that is used for all file operations by NFS clients using the access point.
    */
  var PosixUser: js.UndefOr[typingsSlinky.awsSdk.efsMod.PosixUser] = js.native
  
  /**
    * The directory on the Amazon EFS file system that the access point exposes as the root directory to NFS clients using the access point.
    */
  var RootDirectory: js.UndefOr[typingsSlinky.awsSdk.efsMod.RootDirectory] = js.native
  
  /**
    * The tags associated with the access point, presented as an array of Tag objects.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.efsMod.Tags] = js.native
}
object AccessPointDescription {
  
  @scala.inline
  def apply(): AccessPointDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPointDescription]
  }
  
  @scala.inline
  implicit class AccessPointDescriptionMutableBuilder[Self <: AccessPointDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPointArn(value: AccessPointArn): Self = StObject.set(x, "AccessPointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPointArnUndefined: Self = StObject.set(x, "AccessPointArn", js.undefined)
    
    @scala.inline
    def setAccessPointId(value: AccessPointId): Self = StObject.set(x, "AccessPointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPointIdUndefined: Self = StObject.set(x, "AccessPointId", js.undefined)
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemIdUndefined: Self = StObject.set(x, "FileSystemId", js.undefined)
    
    @scala.inline
    def setLifeCycleState(value: LifeCycleState): Self = StObject.set(x, "LifeCycleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifeCycleStateUndefined: Self = StObject.set(x, "LifeCycleState", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOwnerId(value: AwsAccountId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setPosixUser(value: PosixUser): Self = StObject.set(x, "PosixUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosixUserUndefined: Self = StObject.set(x, "PosixUser", js.undefined)
    
    @scala.inline
    def setRootDirectory(value: RootDirectory): Self = StObject.set(x, "RootDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootDirectoryUndefined: Self = StObject.set(x, "RootDirectory", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
