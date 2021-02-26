package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshCacheOutput extends StObject {
  
  var FileShareARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.FileShareARN] = js.native
  
  var NotificationId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.NotificationId] = js.native
}
object RefreshCacheOutput {
  
  @scala.inline
  def apply(): RefreshCacheOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshCacheOutput]
  }
  
  @scala.inline
  implicit class RefreshCacheOutputMutableBuilder[Self <: RefreshCacheOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileShareARN(value: FileShareARN): Self = StObject.set(x, "FileShareARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileShareARNUndefined: Self = StObject.set(x, "FileShareARN", js.undefined)
    
    @scala.inline
    def setNotificationId(value: NotificationId): Self = StObject.set(x, "NotificationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationIdUndefined: Self = StObject.set(x, "NotificationId", js.undefined)
  }
}
