package typingsSlinky.googleAuthLibrary

import typingsSlinky.googleAuthLibrary.anon.Xgoogiamauthorityselector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iamMod {
  
  @JSImport("google-auth-library/build/src/auth/iam", "IAMAuth")
  @js.native
  class IAMAuth protected () extends StObject {
    /**
      * IAM credentials.
      *
      * @param selector the iam authority selector
      * @param token the token
      * @constructor
      */
    def this(selector: String, token: String) = this()
    
    /**
      * Acquire the HTTP headers required to make an authenticated request.
      */
    def getRequestHeaders(): Xgoogiamauthorityselector = js.native
    
    var selector: String = js.native
    
    var token: String = js.native
  }
  
  @js.native
  trait RequestMetadata extends StObject {
    
    var `x-goog-iam-authority-selector`: String = js.native
    
    var `x-goog-iam-authorization-token`: String = js.native
  }
  object RequestMetadata {
    
    @scala.inline
    def apply(`x-goog-iam-authority-selector`: String, `x-goog-iam-authorization-token`: String): RequestMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("x-goog-iam-authority-selector")(`x-goog-iam-authority-selector`.asInstanceOf[js.Any])
      __obj.updateDynamic("x-goog-iam-authorization-token")(`x-goog-iam-authorization-token`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestMetadata]
    }
    
    @scala.inline
    implicit class RequestMetadataMutableBuilder[Self <: RequestMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setX-goog-iam-authority-selector`(value: String): Self = StObject.set(x, "x-goog-iam-authority-selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setX-goog-iam-authorization-token`(value: String): Self = StObject.set(x, "x-goog-iam-authorization-token", value.asInstanceOf[js.Any])
    }
  }
}
