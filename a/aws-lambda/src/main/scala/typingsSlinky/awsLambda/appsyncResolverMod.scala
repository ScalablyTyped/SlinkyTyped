package typingsSlinky.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsLambda.anon.FieldName
import typingsSlinky.awsLambda.anon.Headers
import typingsSlinky.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appsyncResolverMod {
  
  @js.native
  trait AppSyncIdentityCognito extends StObject {
    
    var claims: js.Any = js.native
    
    var defaultAuthStrategy: String = js.native
    
    var issuer: String = js.native
    
    var sourceIp: js.Array[String] = js.native
    
    var sub: String = js.native
    
    var username: String = js.native
  }
  object AppSyncIdentityCognito {
    
    @scala.inline
    def apply(
      claims: js.Any,
      defaultAuthStrategy: String,
      issuer: String,
      sourceIp: js.Array[String],
      sub: String,
      username: String
    ): AppSyncIdentityCognito = {
      val __obj = js.Dynamic.literal(claims = claims.asInstanceOf[js.Any], defaultAuthStrategy = defaultAuthStrategy.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], sourceIp = sourceIp.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppSyncIdentityCognito]
    }
    
    @scala.inline
    implicit class AppSyncIdentityCognitoMutableBuilder[Self <: AppSyncIdentityCognito] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClaims(value: js.Any): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultAuthStrategy(value: String): Self = StObject.set(x, "defaultAuthStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceIp(value: js.Array[String]): Self = StObject.set(x, "sourceIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceIpVarargs(value: String*): Self = StObject.set(x, "sourceIp", js.Array(value :_*))
      
      @scala.inline
      def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AppSyncIdentityIAM extends StObject {
    
    var accountId: String = js.native
    
    var cognitoIdentityAuthProvider: String = js.native
    
    var cognitoIdentityAuthType: String = js.native
    
    var cognitoIdentityId: String = js.native
    
    var cognitoIdentityPoolId: String = js.native
    
    var sourceIp: js.Array[String] = js.native
    
    var userArn: String = js.native
    
    var username: String = js.native
  }
  object AppSyncIdentityIAM {
    
    @scala.inline
    def apply(
      accountId: String,
      cognitoIdentityAuthProvider: String,
      cognitoIdentityAuthType: String,
      cognitoIdentityId: String,
      cognitoIdentityPoolId: String,
      sourceIp: js.Array[String],
      userArn: String,
      username: String
    ): AppSyncIdentityIAM = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], cognitoIdentityAuthProvider = cognitoIdentityAuthProvider.asInstanceOf[js.Any], cognitoIdentityAuthType = cognitoIdentityAuthType.asInstanceOf[js.Any], cognitoIdentityId = cognitoIdentityId.asInstanceOf[js.Any], cognitoIdentityPoolId = cognitoIdentityPoolId.asInstanceOf[js.Any], sourceIp = sourceIp.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppSyncIdentityIAM]
    }
    
    @scala.inline
    implicit class AppSyncIdentityIAMMutableBuilder[Self <: AppSyncIdentityIAM] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCognitoIdentityAuthProvider(value: String): Self = StObject.set(x, "cognitoIdentityAuthProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCognitoIdentityAuthType(value: String): Self = StObject.set(x, "cognitoIdentityAuthType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCognitoIdentityId(value: String): Self = StObject.set(x, "cognitoIdentityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCognitoIdentityPoolId(value: String): Self = StObject.set(x, "cognitoIdentityPoolId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceIp(value: js.Array[String]): Self = StObject.set(x, "sourceIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceIpVarargs(value: String*): Self = StObject.set(x, "sourceIp", js.Array(value :_*))
      
      @scala.inline
      def setUserArn(value: String): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AppSyncResolverEvent[T] extends StObject {
    
    var arguments: T = js.native
    
    var identity: js.UndefOr[AppSyncIdentityIAM | AppSyncIdentityCognito] = js.native
    
    var info: FieldName = js.native
    
    var request: Headers = js.native
    
    var source: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object AppSyncResolverEvent {
    
    @scala.inline
    def apply[T](arguments: T, info: FieldName, request: Headers): AppSyncResolverEvent[T] = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppSyncResolverEvent[T]]
    }
    
    @scala.inline
    implicit class AppSyncResolverEventMutableBuilder[Self <: AppSyncResolverEvent[_], T] (val x: Self with AppSyncResolverEvent[T]) extends AnyVal {
      
      @scala.inline
      def setArguments(value: T): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentity(value: AppSyncIdentityIAM | AppSyncIdentityCognito): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      @scala.inline
      def setInfo(value: FieldName): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: Headers): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: StringDictionary[js.Any]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  type AppSyncResolverHandler[T, V] = Handler[AppSyncResolverEvent[T], V | js.Array[V]]
}
