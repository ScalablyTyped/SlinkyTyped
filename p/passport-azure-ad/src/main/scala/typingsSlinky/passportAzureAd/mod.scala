package typingsSlinky.passportAzureAd

import typingsSlinky.passportAzureAd.bearerStrategyMod.IBearerStrategyOption
import typingsSlinky.passportAzureAd.bearerStrategyMod.IBearerStrategyOptionWithRequest
import typingsSlinky.passportAzureAd.bearerStrategyMod.VerifyBearerFunction
import typingsSlinky.passportAzureAd.bearerStrategyMod.VerifyBearerFunctionWithReq
import typingsSlinky.passportAzureAd.oidcStrategyMod.IOIDCStrategyOptionWithRequest
import typingsSlinky.passportAzureAd.oidcStrategyMod.IOIDCStrategyOptionWithoutRequest
import typingsSlinky.passportAzureAd.oidcStrategyMod.VerifyOIDCFunction
import typingsSlinky.passportAzureAd.oidcStrategyMod.VerifyOIDCFunctionWithReq
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-azure-ad", "BearerStrategy")
  @js.native
  class BearerStrategy protected ()
    extends typingsSlinky.passportAzureAd.bearerStrategyMod.BearerStrategy {
    def this(options: IBearerStrategyOptionWithRequest, verify: VerifyBearerFunctionWithReq) = this()
    def this(options: IBearerStrategyOption, verify: VerifyBearerFunction) = this()
  }
  
  @JSImport("passport-azure-ad", "OIDCStrategy")
  @js.native
  class OIDCStrategy protected ()
    extends typingsSlinky.passportAzureAd.oidcStrategyMod.OIDCStrategy {
    def this(options: IOIDCStrategyOptionWithRequest, verify: VerifyOIDCFunctionWithReq) = this()
    def this(options: IOIDCStrategyOptionWithoutRequest, verify: VerifyOIDCFunction) = this()
  }
}
