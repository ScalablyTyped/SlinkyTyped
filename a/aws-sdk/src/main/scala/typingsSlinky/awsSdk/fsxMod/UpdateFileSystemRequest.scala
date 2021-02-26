package typingsSlinky.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFileSystemRequest extends StObject {
  
  /**
    * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent updates. This string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
    */
  var ClientRequestToken: js.UndefOr[typingsSlinky.awsSdk.fsxMod.ClientRequestToken] = js.native
  
  /**
    * Identifies the file system that you are updating.
    */
  var FileSystemId: typingsSlinky.awsSdk.fsxMod.FileSystemId = js.native
  
  var LustreConfiguration: js.UndefOr[UpdateFileSystemLustreConfiguration] = js.native
  
  /**
    * Use this parameter to increase the storage capacity of an Amazon FSx for Windows File Server file system. Specifies the storage capacity target value, GiB, for the file system you're updating. The storage capacity target value must be at least 10 percent (%) greater than the current storage capacity value. In order to increase storage capacity, the file system needs to have at least 16 MB/s of throughput capacity. You cannot make a storage capacity increase request if there is an existing storage capacity increase request in progress. For more information, see Managing Storage Capacity.
    */
  var StorageCapacity: js.UndefOr[typingsSlinky.awsSdk.fsxMod.StorageCapacity] = js.native
  
  /**
    * The configuration updates for an Amazon FSx for Windows File Server file system.
    */
  var WindowsConfiguration: js.UndefOr[UpdateFileSystemWindowsConfiguration] = js.native
}
object UpdateFileSystemRequest {
  
  @scala.inline
  def apply(FileSystemId: FileSystemId): UpdateFileSystemRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFileSystemRequest]
  }
  
  @scala.inline
  implicit class UpdateFileSystemRequestMutableBuilder[Self <: UpdateFileSystemRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLustreConfiguration(value: UpdateFileSystemLustreConfiguration): Self = StObject.set(x, "LustreConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLustreConfigurationUndefined: Self = StObject.set(x, "LustreConfiguration", js.undefined)
    
    @scala.inline
    def setStorageCapacity(value: StorageCapacity): Self = StObject.set(x, "StorageCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageCapacityUndefined: Self = StObject.set(x, "StorageCapacity", js.undefined)
    
    @scala.inline
    def setWindowsConfiguration(value: UpdateFileSystemWindowsConfiguration): Self = StObject.set(x, "WindowsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsConfigurationUndefined: Self = StObject.set(x, "WindowsConfiguration", js.undefined)
  }
}
