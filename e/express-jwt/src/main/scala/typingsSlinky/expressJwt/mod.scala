package typingsSlinky.expressJwt

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.express.mod.Request_
import typingsSlinky.expressJwt.anon.FnCall
import typingsSlinky.expressJwt.anon.Message
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.node.Buffer
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-jwt", JSImport.Namespace)
  @js.native
  def apply(options: Options): RequestHandler = js.native
  
  @JSImport("express-jwt", "UnauthorizedError")
  @js.native
  class UnauthorizedError protected () extends Error {
    def this(code: ErrorCode, error: Message) = this()
    
    var code: ErrorCode = js.native
    
    var inner: Message = js.native
    
    @JSName("name")
    var name_UnauthorizedError: typingsSlinky.expressJwt.expressJwtStrings.UnauthorizedError = js.native
    
    var status: Double = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.expressJwt.expressJwtStrings.revoked_token
    - typingsSlinky.expressJwt.expressJwtStrings.invalid_token
    - typingsSlinky.expressJwt.expressJwtStrings.credentials_bad_scheme
    - typingsSlinky.expressJwt.expressJwtStrings.credentials_bad_format
    - typingsSlinky.expressJwt.expressJwtStrings.credentials_required
  */
  trait ErrorCode extends StObject
  object ErrorCode {
    
    @scala.inline
    def credentials_bad_format: typingsSlinky.expressJwt.expressJwtStrings.credentials_bad_format = "credentials_bad_format".asInstanceOf[typingsSlinky.expressJwt.expressJwtStrings.credentials_bad_format]
    
    @scala.inline
    def credentials_bad_scheme: typingsSlinky.expressJwt.expressJwtStrings.credentials_bad_scheme = "credentials_bad_scheme".asInstanceOf[typingsSlinky.expressJwt.expressJwtStrings.credentials_bad_scheme]
    
    @scala.inline
    def credentials_required: typingsSlinky.expressJwt.expressJwtStrings.credentials_required = "credentials_required".asInstanceOf[typingsSlinky.expressJwt.expressJwtStrings.credentials_required]
    
    @scala.inline
    def invalid_token: typingsSlinky.expressJwt.expressJwtStrings.invalid_token = "invalid_token".asInstanceOf[typingsSlinky.expressJwt.expressJwtStrings.invalid_token]
    
    @scala.inline
    def revoked_token: typingsSlinky.expressJwt.expressJwtStrings.revoked_token = "revoked_token".asInstanceOf[typingsSlinky.expressJwt.expressJwtStrings.revoked_token]
  }
  
  type GetTokenCallback = js.Function1[/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], js.Any]
  
  type IsRevokedCallback = js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* payload */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* revoked */ js.UndefOr[Boolean], Unit], 
    Unit
  ]
  
  @js.native
  trait Options
    extends /* property */ StringDictionary[js.Any] {
    
    var credentialsRequired: js.UndefOr[Boolean] = js.native
    
    var getToken: js.UndefOr[GetTokenCallback] = js.native
    
    var isRevoked: js.UndefOr[IsRevokedCallback] = js.native
    
    var requestProperty: js.UndefOr[String] = js.native
    
    var secret: secretType | SecretCallback | SecretCallbackLong = js.native
    
    var userProperty: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(secret: secretType | SecretCallback | SecretCallbackLong): Options = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCredentialsRequired(value: Boolean): Self = StObject.set(x, "credentialsRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsRequiredUndefined: Self = StObject.set(x, "credentialsRequired", js.undefined)
      
      @scala.inline
      def setGetToken(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => js.Any): Self = StObject.set(x, "getToken", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTokenUndefined: Self = StObject.set(x, "getToken", js.undefined)
      
      @scala.inline
      def setIsRevoked(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* payload */ js.Any, /* done */ js.Function2[/* err */ js.Any, /* revoked */ js.UndefOr[Boolean], Unit]) => Unit
      ): Self = StObject.set(x, "isRevoked", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIsRevokedUndefined: Self = StObject.set(x, "isRevoked", js.undefined)
      
      @scala.inline
      def setRequestProperty(value: String): Self = StObject.set(x, "requestProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestPropertyUndefined: Self = StObject.set(x, "requestProperty", js.undefined)
      
      @scala.inline
      def setSecret(value: secretType | SecretCallback | SecretCallbackLong): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretFunction3(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* payload */ js.Any, /* done */ js.Function2[/* err */ js.Any, /* secret */ js.UndefOr[secretType], Unit]) => Unit
      ): Self = StObject.set(x, "secret", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSecretFunction4(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* header */ js.Any, /* payload */ js.Any, /* done */ js.Function2[/* err */ js.Any, /* secret */ js.UndefOr[secretType], Unit]) => Unit
      ): Self = StObject.set(x, "secret", js.Any.fromFunction4(value))
      
      @scala.inline
      def setUserProperty(value: String): Self = StObject.set(x, "userProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPropertyUndefined: Self = StObject.set(x, "userProperty", js.undefined)
    }
  }
  
  @js.native
  trait RequestHandler
    extends typingsSlinky.expressServeStaticCore.mod.RequestHandler[ParamsDictionary, js.Any, js.Any, Query] {
    
    def unless(): typingsSlinky.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def unless(options: js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], Boolean]): typingsSlinky.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def unless(options: typingsSlinky.expressUnless.mod.Options): typingsSlinky.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
    @JSName("unless")
    var unless_Original: FnCall = js.native
  }
  
  type SecretCallback = js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* payload */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* secret */ js.UndefOr[secretType], Unit], 
    Unit
  ]
  
  type SecretCallbackLong = js.Function4[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* header */ js.Any, 
    /* payload */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* secret */ js.UndefOr[secretType], Unit], 
    Unit
  ]
  
  type secretType = String | Buffer
}
