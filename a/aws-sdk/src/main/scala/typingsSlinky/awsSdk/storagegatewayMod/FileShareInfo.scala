package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileShareInfo extends StObject {
  
  var FileShareARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.FileShareARN] = js.native
  
  var FileShareId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.FileShareId] = js.native
  
  var FileShareStatus: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.FileShareStatus] = js.native
  
  var FileShareType: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.FileShareType] = js.native
  
  var GatewayARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayARN] = js.native
}
object FileShareInfo {
  
  @scala.inline
  def apply(): FileShareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileShareInfo]
  }
  
  @scala.inline
  implicit class FileShareInfoMutableBuilder[Self <: FileShareInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileShareARN(value: FileShareARN): Self = StObject.set(x, "FileShareARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileShareARNUndefined: Self = StObject.set(x, "FileShareARN", js.undefined)
    
    @scala.inline
    def setFileShareId(value: FileShareId): Self = StObject.set(x, "FileShareId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileShareIdUndefined: Self = StObject.set(x, "FileShareId", js.undefined)
    
    @scala.inline
    def setFileShareStatus(value: FileShareStatus): Self = StObject.set(x, "FileShareStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileShareStatusUndefined: Self = StObject.set(x, "FileShareStatus", js.undefined)
    
    @scala.inline
    def setFileShareType(value: FileShareType): Self = StObject.set(x, "FileShareType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileShareTypeUndefined: Self = StObject.set(x, "FileShareType", js.undefined)
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
