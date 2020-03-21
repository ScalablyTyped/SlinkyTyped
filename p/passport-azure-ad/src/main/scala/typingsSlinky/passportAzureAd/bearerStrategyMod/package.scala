package typingsSlinky.passportAzureAd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bearerStrategyMod {
  type VerifyBearerFunction = js.Function2[
    /* token */ typingsSlinky.passportAzureAd.commonMod.ITokenPayload, 
    /* done */ typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]
  type VerifyBearerFunctionWithReq = js.Function3[
    /* req */ typingsSlinky.express.mod.Request_[typingsSlinky.expressServeStaticCore.mod.ParamsDictionary], 
    /* token */ typingsSlinky.passportAzureAd.commonMod.ITokenPayload, 
    /* done */ typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]
}
