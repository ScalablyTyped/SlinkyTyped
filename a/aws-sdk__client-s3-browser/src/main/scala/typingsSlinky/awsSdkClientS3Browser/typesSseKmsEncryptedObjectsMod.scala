package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Disabled
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSseKmsEncryptedObjectsMod {
  
  @js.native
  trait SseKmsEncryptedObjects extends StObject {
    
    /**
      * <p>The replication for KMS encrypted S3 objects is disabled if status is not Enabled.</p>
      */
    var Status: Enabled | Disabled | String = js.native
  }
  object SseKmsEncryptedObjects {
    
    @scala.inline
    def apply(Status: Enabled | Disabled | String): SseKmsEncryptedObjects = {
      val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
      __obj.asInstanceOf[SseKmsEncryptedObjects]
    }
    
    @scala.inline
    implicit class SseKmsEncryptedObjectsMutableBuilder[Self <: SseKmsEncryptedObjects] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: Enabled | Disabled | String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledSseKmsEncryptedObjects = SseKmsEncryptedObjects
}
