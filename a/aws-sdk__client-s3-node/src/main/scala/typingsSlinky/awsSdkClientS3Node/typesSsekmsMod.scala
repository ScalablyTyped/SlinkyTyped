package typingsSlinky.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSsekmsMod {
  
  type UnmarshalledSSEKMS = _SSEKMS
  
  @js.native
  trait _SSEKMS extends StObject {
    
    /**
      * <p>Specifies the ID of the AWS Key Management Service (KMS) master encryption key to use for encrypting Inventory reports.</p>
      */
    var KeyId: String = js.native
  }
  object _SSEKMS {
    
    @scala.inline
    def apply(KeyId: String): _SSEKMS = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[_SSEKMS]
    }
    
    @scala.inline
    implicit class _SSEKMSMutableBuilder[Self <: _SSEKMS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    }
  }
}
