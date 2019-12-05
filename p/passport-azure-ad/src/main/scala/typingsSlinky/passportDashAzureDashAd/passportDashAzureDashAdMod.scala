package typingsSlinky.passportDashAzureDashAd

import typingsSlinky.passportDashAzureDashAd.bearerDashStrategyMod.IBearerStrategyOption
import typingsSlinky.passportDashAzureDashAd.bearerDashStrategyMod.IBearerStrategyOptionWithRequest
import typingsSlinky.passportDashAzureDashAd.bearerDashStrategyMod.VerifyBearerFunction
import typingsSlinky.passportDashAzureDashAd.bearerDashStrategyMod.VerifyBearerFunctionWithReq
import typingsSlinky.passportDashAzureDashAd.oidcDashStrategyMod.IOIDCStrategyOptionWithRequest
import typingsSlinky.passportDashAzureDashAd.oidcDashStrategyMod.IOIDCStrategyOptionWithoutRequest
import typingsSlinky.passportDashAzureDashAd.oidcDashStrategyMod.VerifyOIDCFunction
import typingsSlinky.passportDashAzureDashAd.oidcDashStrategyMod.VerifyOIDCFunctionWithReq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-azure-ad", JSImport.Namespace)
@js.native
object passportDashAzureDashAdMod extends js.Object {
  @js.native
  class BearerStrategy protected ()
    extends typingsSlinky.passportDashAzureDashAd.bearerDashStrategyMod.BearerStrategy {
    def this(options: IBearerStrategyOptionWithRequest, verify: VerifyBearerFunctionWithReq) = this()
    def this(options: IBearerStrategyOption, verify: VerifyBearerFunction) = this()
  }
  
  @js.native
  class OIDCStrategy protected ()
    extends typingsSlinky.passportDashAzureDashAd.oidcDashStrategyMod.OIDCStrategy {
    def this(options: IOIDCStrategyOptionWithRequest, verify: VerifyOIDCFunctionWithReq) = this()
    def this(options: IOIDCStrategyOptionWithoutRequest, verify: VerifyOIDCFunction) = this()
  }
  
}

