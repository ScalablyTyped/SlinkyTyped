package typingsSlinky.passportDashAzureDashAd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bearerDashStrategyMod {
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
  import typingsSlinky.passportDashAzureDashAd.commonMod.ITokenPayload
  import typingsSlinky.passportDashAzureDashAd.commonMod.VerifyCallback

  type VerifyBearerFunction = js.Function2[/* token */ ITokenPayload, /* done */ VerifyCallback, Unit]
  type VerifyBearerFunctionWithReq = js.Function3[
    /* req */ Request[ParamsDictionary], 
    /* token */ ITokenPayload, 
    /* done */ VerifyCallback, 
    Unit
  ]
}
