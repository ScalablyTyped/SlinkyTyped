package typingsSlinky.cassandraDriver

import typingsSlinky.cassandraDriver.anon.AuthorizationId
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authMod {
  
  object auth {
    
    @JSImport("cassandra-driver/lib/auth", "auth.DseGssapiAuthProvider")
    @js.native
    class DseGssapiAuthProvider () extends AuthProvider {
      def this(gssOptions: AuthorizationId) = this()
    }
    
    @JSImport("cassandra-driver/lib/auth", "auth.DsePlainTextAuthProvider")
    @js.native
    class DsePlainTextAuthProvider protected () extends AuthProvider {
      def this(username: String, password: String) = this()
      def this(username: String, password: String, authorizationId: String) = this()
    }
    
    @JSImport("cassandra-driver/lib/auth", "auth.PlainTextAuthProvider")
    @js.native
    class PlainTextAuthProvider protected () extends AuthProvider {
      def this(username: String, password: String) = this()
    }
    
    @js.native
    trait AuthProvider extends StObject {
      
      def newAuthenticator(endpoint: String, name: String): Authenticator = js.native
    }
    object AuthProvider {
      
      @scala.inline
      def apply(newAuthenticator: (String, String) => Authenticator): AuthProvider = {
        val __obj = js.Dynamic.literal(newAuthenticator = js.Any.fromFunction2(newAuthenticator))
        __obj.asInstanceOf[AuthProvider]
      }
      
      @scala.inline
      implicit class AuthProviderMutableBuilder[Self <: AuthProvider] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNewAuthenticator(value: (String, String) => Authenticator): Self = StObject.set(x, "newAuthenticator", js.Any.fromFunction2(value))
      }
    }
    
    @js.native
    trait Authenticator extends StObject {
      
      def evaluateChallenge(challenge: Buffer, callback: js.Function): Unit = js.native
      
      def initialResponse(callback: js.Function): Unit = js.native
      
      def onAuthenticationSuccess(): Unit = js.native
      def onAuthenticationSuccess(token: Buffer): Unit = js.native
    }
  }
}
