package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.AccessDenied
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.InternalServerError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUnprocessedIdentityIdMod {
  
  type UnmarshalledUnprocessedIdentityId = UnprocessedIdentityId
  
  @js.native
  trait UnprocessedIdentityId extends StObject {
    
    /**
      * <p>The error code indicating the type of error that occurred.</p>
      */
    var ErrorCode: js.UndefOr[AccessDenied | InternalServerError | String] = js.native
    
    /**
      * <p>A unique identifier in the format REGION:GUID.</p>
      */
    var IdentityId: js.UndefOr[String] = js.native
  }
  object UnprocessedIdentityId {
    
    @scala.inline
    def apply(): UnprocessedIdentityId = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnprocessedIdentityId]
    }
    
    @scala.inline
    implicit class UnprocessedIdentityIdMutableBuilder[Self <: UnprocessedIdentityId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorCode(value: AccessDenied | InternalServerError | String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
      
      @scala.inline
      def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    }
  }
}
