package typingsSlinky.passportDashGoogleDashOauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashGoogleDashOauth2Mod {
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
  import typingsSlinky.passportDashGoogleDashOauth2.Anon_Accesstoken

  type VerifyCallback = js.Function3[
    /* error */ js.Any, 
    /* user */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[VerifyOptions], 
    Unit
  ]
  type VerifyFunction = js.Function4[
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* profile */ js.Any, 
    /* done */ VerifyCallback, 
    Unit
  ]
  type VerifyFunctionWithRequest = js.Function5[
    /* req */ Request[ParamsDictionary], 
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* profile */ js.Any, 
    /* done */ VerifyCallback, 
    Unit
  ]
  type VerifyFunctionWithRequestAndParams = js.Function6[
    /* req */ Request[ParamsDictionary], 
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* params */ Anon_Accesstoken, 
    /* profile */ js.Any, 
    /* done */ VerifyCallback, 
    Unit
  ]
}
