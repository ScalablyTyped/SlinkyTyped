package typingsSlinky.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAbortIncompleteMultipartUploadMod {
  
  @js.native
  trait AbortIncompleteMultipartUpload extends StObject {
    
    /**
      * <p>Indicates the number of days that must pass since initiation for Lifecycle to abort an Incomplete Multipart Upload.</p>
      */
    var DaysAfterInitiation: js.UndefOr[Double] = js.native
  }
  object AbortIncompleteMultipartUpload {
    
    @scala.inline
    def apply(): AbortIncompleteMultipartUpload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbortIncompleteMultipartUpload]
    }
    
    @scala.inline
    implicit class AbortIncompleteMultipartUploadMutableBuilder[Self <: AbortIncompleteMultipartUpload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDaysAfterInitiation(value: Double): Self = StObject.set(x, "DaysAfterInitiation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysAfterInitiationUndefined: Self = StObject.set(x, "DaysAfterInitiation", js.undefined)
    }
  }
  
  type UnmarshalledAbortIncompleteMultipartUpload = AbortIncompleteMultipartUpload
}
