package typingsSlinky.pulsarClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CertificatePath extends StObject {
    
    var certificatePath: String = js.native
    
    var privateKeyPath: String = js.native
  }
  object CertificatePath {
    
    @scala.inline
    def apply(certificatePath: String, privateKeyPath: String): CertificatePath = {
      val __obj = js.Dynamic.literal(certificatePath = certificatePath.asInstanceOf[js.Any], privateKeyPath = privateKeyPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificatePath]
    }
    
    @scala.inline
    implicit class CertificatePathMutableBuilder[Self <: CertificatePath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificatePath(value: String): Self = StObject.set(x, "certificatePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyPath(value: String): Self = StObject.set(x, "privateKeyPath", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Token extends StObject {
    
    var token: String = js.native
  }
  object Token {
    
    @scala.inline
    def apply(token: String): Token = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
