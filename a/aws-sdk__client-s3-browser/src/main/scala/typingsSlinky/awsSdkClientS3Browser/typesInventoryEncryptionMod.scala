package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.typesSsekmsMod.UnmarshalledSSEKMS
import typingsSlinky.awsSdkClientS3Browser.typesSsekmsMod._SSEKMS
import typingsSlinky.awsSdkClientS3Browser.typesSses3Mod.UnmarshalledSSES3
import typingsSlinky.awsSdkClientS3Browser.typesSses3Mod._SSES3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInventoryEncryptionMod {
  
  @js.native
  trait InventoryEncryption extends StObject {
    
    /**
      * <p>Specifies the use of SSE-KMS to encrypt delievered Inventory reports.</p>
      */
    var SSEKMS: js.UndefOr[_SSEKMS] = js.native
    
    /**
      * <p>Specifies the use of SSE-S3 to encrypt delievered Inventory reports.</p>
      */
    var SSES3: js.UndefOr[_SSES3] = js.native
  }
  object InventoryEncryption {
    
    @scala.inline
    def apply(): InventoryEncryption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InventoryEncryption]
    }
    
    @scala.inline
    implicit class InventoryEncryptionMutableBuilder[Self <: InventoryEncryption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSSEKMS(value: _SSEKMS): Self = StObject.set(x, "SSEKMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSEKMSUndefined: Self = StObject.set(x, "SSEKMS", js.undefined)
      
      @scala.inline
      def setSSES3(value: _SSES3): Self = StObject.set(x, "SSES3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSES3Undefined: Self = StObject.set(x, "SSES3", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledInventoryEncryption extends InventoryEncryption {
    
    /**
      * <p>Specifies the use of SSE-KMS to encrypt delievered Inventory reports.</p>
      */
    @JSName("SSEKMS")
    var SSEKMS_UnmarshalledInventoryEncryption: js.UndefOr[UnmarshalledSSEKMS] = js.native
    
    /**
      * <p>Specifies the use of SSE-S3 to encrypt delievered Inventory reports.</p>
      */
    @JSName("SSES3")
    var SSES3_UnmarshalledInventoryEncryption: js.UndefOr[UnmarshalledSSES3] = js.native
  }
  object UnmarshalledInventoryEncryption {
    
    @scala.inline
    def apply(): UnmarshalledInventoryEncryption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledInventoryEncryption]
    }
    
    @scala.inline
    implicit class UnmarshalledInventoryEncryptionMutableBuilder[Self <: UnmarshalledInventoryEncryption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSSEKMS(value: UnmarshalledSSEKMS): Self = StObject.set(x, "SSEKMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSEKMSUndefined: Self = StObject.set(x, "SSEKMS", js.undefined)
      
      @scala.inline
      def setSSES3(value: UnmarshalledSSES3): Self = StObject.set(x, "SSES3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSES3Undefined: Self = StObject.set(x, "SSES3", js.undefined)
    }
  }
}
