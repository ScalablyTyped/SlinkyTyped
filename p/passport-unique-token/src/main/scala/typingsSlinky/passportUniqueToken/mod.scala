package typingsSlinky.passportUniqueToken

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.passportUniqueToken.passportUniqueTokenBooleans.`false`
import typingsSlinky.passportUniqueToken.passportUniqueTokenBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-unique-token", "Strategy")
  @js.native
  class Strategy protected ()
    extends typingsSlinky.passport.mod.Strategy {
    def this(verify: VerifyFunction) = this()
    def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
    def this(options: StrategyOptions, verify: VerifyFunction) = this()
    
    def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
  }
  
  @js.native
  trait StrategyOptions extends StObject {
    
    var failedOnMissing: js.UndefOr[Boolean] = js.native
    
    var passReqToCallback: js.UndefOr[`false`] = js.native
    
    var tokenField: js.UndefOr[String] = js.native
    
    var tokenHeader: js.UndefOr[String] = js.native
    
    var tokenParams: js.UndefOr[String] = js.native
    
    var tokenQuery: js.UndefOr[String] = js.native
  }
  object StrategyOptions {
    
    @scala.inline
    def apply(): StrategyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrategyOptions]
    }
    
    @scala.inline
    implicit class StrategyOptionsMutableBuilder[Self <: StrategyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailedOnMissing(value: Boolean): Self = StObject.set(x, "failedOnMissing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailedOnMissingUndefined: Self = StObject.set(x, "failedOnMissing", js.undefined)
      
      @scala.inline
      def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      @scala.inline
      def setTokenField(value: String): Self = StObject.set(x, "tokenField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenFieldUndefined: Self = StObject.set(x, "tokenField", js.undefined)
      
      @scala.inline
      def setTokenHeader(value: String): Self = StObject.set(x, "tokenHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenHeaderUndefined: Self = StObject.set(x, "tokenHeader", js.undefined)
      
      @scala.inline
      def setTokenParams(value: String): Self = StObject.set(x, "tokenParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenParamsUndefined: Self = StObject.set(x, "tokenParams", js.undefined)
      
      @scala.inline
      def setTokenQuery(value: String): Self = StObject.set(x, "tokenQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenQueryUndefined: Self = StObject.set(x, "tokenQuery", js.undefined)
    }
  }
  
  @js.native
  trait StrategyOptionsWithRequest extends StObject {
    
    var failedOnMissing: js.UndefOr[Boolean] = js.native
    
    var passReqToCallback: `true` = js.native
    
    var tokenField: js.UndefOr[String] = js.native
    
    var tokenHeader: js.UndefOr[String] = js.native
    
    var tokenParams: js.UndefOr[String] = js.native
    
    var tokenQuery: js.UndefOr[String] = js.native
  }
  object StrategyOptionsWithRequest {
    
    @scala.inline
    def apply(passReqToCallback: `true`): StrategyOptionsWithRequest = {
      val __obj = js.Dynamic.literal(passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptionsWithRequest]
    }
    
    @scala.inline
    implicit class StrategyOptionsWithRequestMutableBuilder[Self <: StrategyOptionsWithRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailedOnMissing(value: Boolean): Self = StObject.set(x, "failedOnMissing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailedOnMissingUndefined: Self = StObject.set(x, "failedOnMissing", js.undefined)
      
      @scala.inline
      def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenField(value: String): Self = StObject.set(x, "tokenField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenFieldUndefined: Self = StObject.set(x, "tokenField", js.undefined)
      
      @scala.inline
      def setTokenHeader(value: String): Self = StObject.set(x, "tokenHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenHeaderUndefined: Self = StObject.set(x, "tokenHeader", js.undefined)
      
      @scala.inline
      def setTokenParams(value: String): Self = StObject.set(x, "tokenParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenParamsUndefined: Self = StObject.set(x, "tokenParams", js.undefined)
      
      @scala.inline
      def setTokenQuery(value: String): Self = StObject.set(x, "tokenQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenQueryUndefined: Self = StObject.set(x, "tokenQuery", js.undefined)
    }
  }
  
  type VerifyFunction = js.Function2[
    /* token */ String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[VerifyOptions], 
      Unit
    ], 
    Unit
  ]
  
  type VerifyFunctionWithRequest = js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* token */ String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[VerifyOptions], 
      Unit
    ], 
    Unit
  ]
  
  @js.native
  trait VerifyOptions extends StObject {
    
    var message: String = js.native
  }
  object VerifyOptions {
    
    @scala.inline
    def apply(message: String): VerifyOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyOptions]
    }
    
    @scala.inline
    implicit class VerifyOptionsMutableBuilder[Self <: VerifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
