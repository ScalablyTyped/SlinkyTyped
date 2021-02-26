package typingsSlinky.passportRememberMeExtended

import typingsSlinky.express.mod.CookieOptions
import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.passport.mod.AuthenticateOptions
import typingsSlinky.passportRememberMeExtended.passportRememberMeExtendedBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-remember-me-extended", "Strategy")
  @js.native
  class Strategy protected ()
    extends typingsSlinky.passport.mod.Strategy {
    def this(verify: VerifyFunction, issue: IssueFunction) = this()
    def this(
      options: StrategyOptionWithRequest,
      verify: VerifyFunctionWithRequest,
      issue: IssueFunctionWithRequest
    ) = this()
    def this(options: StrategyOption, verify: VerifyFunction, issue: IssueFunction) = this()
    
    def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: AuthenticateOptions): Unit = js.native
  }
  
  type IssueFunction = js.Function2[
    /* user */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* token */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  
  type IssueFunctionWithRequest = js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* user */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* token */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  
  @js.native
  trait StrategyOption extends StObject {
    
    var cookie: js.UndefOr[CookieOptions] = js.native
    
    var key: js.UndefOr[String] = js.native
  }
  object StrategyOption {
    
    @scala.inline
    def apply(): StrategyOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrategyOption]
    }
    
    @scala.inline
    implicit class StrategyOptionMutableBuilder[Self <: StrategyOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookie(value: CookieOptions): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  @js.native
  trait StrategyOptionWithRequest extends StrategyOption {
    
    var passReqToCallback: `true` = js.native
  }
  object StrategyOptionWithRequest {
    
    @scala.inline
    def apply(passReqToCallback: `true`): StrategyOptionWithRequest = {
      val __obj = js.Dynamic.literal(passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptionWithRequest]
    }
    
    @scala.inline
    implicit class StrategyOptionWithRequestMutableBuilder[Self <: StrategyOptionWithRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassReqToCallback(value: `true`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyFunction = js.Function2[
    /* token */ js.Any, 
    /* done */ js.Function3[/* err */ js.Any, /* user */ js.UndefOr[js.Any], /* info */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  
  type VerifyFunctionWithRequest = js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* token */ js.Any, 
    /* done */ js.Function3[/* err */ js.Any, /* user */ js.UndefOr[js.Any], /* info */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
}
