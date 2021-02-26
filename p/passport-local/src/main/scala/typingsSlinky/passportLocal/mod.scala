package typingsSlinky.passportLocal

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.passportLocal.passportLocalBooleans.`false`
import typingsSlinky.passportLocal.passportLocalBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-local", "Strategy")
  @js.native
  class Strategy protected ()
    extends typingsSlinky.passportStrategy.mod.Strategy {
    def this(verify: VerifyFunction) = this()
    def this(options: IStrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
    def this(options: IStrategyOptions, verify: VerifyFunction) = this()
  }
  
  @js.native
  trait IStrategyOptions extends StObject {
    
    var passReqToCallback: js.UndefOr[`false`] = js.native
    
    var passwordField: js.UndefOr[String] = js.native
    
    var session: js.UndefOr[Boolean] = js.native
    
    var usernameField: js.UndefOr[String] = js.native
  }
  object IStrategyOptions {
    
    @scala.inline
    def apply(): IStrategyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStrategyOptions]
    }
    
    @scala.inline
    implicit class IStrategyOptionsMutableBuilder[Self <: IStrategyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      @scala.inline
      def setPasswordField(value: String): Self = StObject.set(x, "passwordField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordFieldUndefined: Self = StObject.set(x, "passwordField", js.undefined)
      
      @scala.inline
      def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setUsernameField(value: String): Self = StObject.set(x, "usernameField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameFieldUndefined: Self = StObject.set(x, "usernameField", js.undefined)
    }
  }
  
  @js.native
  trait IStrategyOptionsWithRequest extends StObject {
    
    var passReqToCallback: `true` = js.native
    
    var passwordField: js.UndefOr[String] = js.native
    
    var session: js.UndefOr[Boolean] = js.native
    
    var usernameField: js.UndefOr[String] = js.native
  }
  object IStrategyOptionsWithRequest {
    
    @scala.inline
    def apply(passReqToCallback: `true`): IStrategyOptionsWithRequest = {
      val __obj = js.Dynamic.literal(passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStrategyOptionsWithRequest]
    }
    
    @scala.inline
    implicit class IStrategyOptionsWithRequestMutableBuilder[Self <: IStrategyOptionsWithRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordField(value: String): Self = StObject.set(x, "passwordField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordFieldUndefined: Self = StObject.set(x, "passwordField", js.undefined)
      
      @scala.inline
      def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setUsernameField(value: String): Self = StObject.set(x, "usernameField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameFieldUndefined: Self = StObject.set(x, "usernameField", js.undefined)
    }
  }
  
  @js.native
  trait IVerifyOptions extends StObject {
    
    var message: String = js.native
  }
  object IVerifyOptions {
    
    @scala.inline
    def apply(message: String): IVerifyOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[IVerifyOptions]
    }
    
    @scala.inline
    implicit class IVerifyOptionsMutableBuilder[Self <: IVerifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyFunction = js.Function3[
    /* username */ String, 
    /* password */ String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[IVerifyOptions], 
      Unit
    ], 
    Unit
  ]
  
  type VerifyFunctionWithRequest = js.Function4[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* username */ String, 
    /* password */ String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[IVerifyOptions], 
      Unit
    ], 
    Unit
  ]
}
