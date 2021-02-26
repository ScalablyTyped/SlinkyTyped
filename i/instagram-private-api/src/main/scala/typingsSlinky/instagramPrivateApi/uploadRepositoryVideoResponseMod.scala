package typingsSlinky.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadRepositoryVideoResponseMod {
  
  @js.native
  trait UploadRepositoryVideoResponseRootObject extends StObject {
    
    var status: String = js.native
    
    var xsharing_nonces: UploadRepositoryVideoResponseXsharingNonces = js.native
  }
  object UploadRepositoryVideoResponseRootObject {
    
    @scala.inline
    def apply(status: String, xsharing_nonces: UploadRepositoryVideoResponseXsharingNonces): UploadRepositoryVideoResponseRootObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], xsharing_nonces = xsharing_nonces.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadRepositoryVideoResponseRootObject]
    }
    
    @scala.inline
    implicit class UploadRepositoryVideoResponseRootObjectMutableBuilder[Self <: UploadRepositoryVideoResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsharing_nonces(value: UploadRepositoryVideoResponseXsharingNonces): Self = StObject.set(x, "xsharing_nonces", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UploadRepositoryVideoResponseXsharingNonces extends StObject
}
