package typingsSlinky.passportCognito

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-cognito", "Strategy")
  @js.native
  class Strategy protected ()
    extends typingsSlinky.passport.mod.Strategy {
    def this(options: CognitoStrategyOptions, verify: CognitoVerifyFunction) = this()
    
    def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
  }
  
  @js.native
  trait CognitoStrategyOptions extends StObject {
    
    var clientId: String = js.native
    
    var region: String = js.native
    
    var userPoolId: String = js.native
  }
  object CognitoStrategyOptions {
    
    @scala.inline
    def apply(clientId: String, region: String, userPoolId: String): CognitoStrategyOptions = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CognitoStrategyOptions]
    }
    
    @scala.inline
    implicit class CognitoStrategyOptionsMutableBuilder[Self <: CognitoStrategyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPoolId(value: String): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
    }
  }
  
  type CognitoVerifyFunction = js.Function5[
    /* accessToken */ String, 
    /* idToken */ String, 
    /* refreshToken */ String, 
    /* user */ js.Object, 
    /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], Unit], 
    js.Any
  ]
}
