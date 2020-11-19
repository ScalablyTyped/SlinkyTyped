package typingsSlinky.passportAzureAd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object bearerStrategyMod {
  
  type VerifyBearerFunction = js.Function2[
    /* token */ typingsSlinky.passportAzureAd.commonMod.ITokenPayload, 
    /* done */ typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]
  
  type VerifyBearerFunctionWithReq = js.Function3[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* token */ typingsSlinky.passportAzureAd.commonMod.ITokenPayload, 
    /* done */ typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]
}
