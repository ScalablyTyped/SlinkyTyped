package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUploadBufferOutput extends StObject {
  
  /**
    * An array of the gateway's local disk IDs that are configured as working storage. Each local disk ID is specified as a string (minimum length of 1 and maximum length of 300). If no local disks are configured as working storage, then the DiskIds array is empty.
    */
  var DiskIds: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.DiskIds] = js.native
  
  var GatewayARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayARN] = js.native
  
  /**
    * The total number of bytes allocated in the gateway's as upload buffer.
    */
  var UploadBufferAllocatedInBytes: js.UndefOr[long] = js.native
  
  /**
    * The total number of bytes being used in the gateway's upload buffer.
    */
  var UploadBufferUsedInBytes: js.UndefOr[long] = js.native
}
object DescribeUploadBufferOutput {
  
  @scala.inline
  def apply(): DescribeUploadBufferOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUploadBufferOutput]
  }
  
  @scala.inline
  implicit class DescribeUploadBufferOutputMutableBuilder[Self <: DescribeUploadBufferOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiskIds(value: DiskIds): Self = StObject.set(x, "DiskIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskIdsUndefined: Self = StObject.set(x, "DiskIds", js.undefined)
    
    @scala.inline
    def setDiskIdsVarargs(value: DiskId*): Self = StObject.set(x, "DiskIds", js.Array(value :_*))
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    @scala.inline
    def setUploadBufferAllocatedInBytes(value: long): Self = StObject.set(x, "UploadBufferAllocatedInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadBufferAllocatedInBytesUndefined: Self = StObject.set(x, "UploadBufferAllocatedInBytes", js.undefined)
    
    @scala.inline
    def setUploadBufferUsedInBytes(value: long): Self = StObject.set(x, "UploadBufferUsedInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadBufferUsedInBytesUndefined: Self = StObject.set(x, "UploadBufferUsedInBytes", js.undefined)
  }
}
