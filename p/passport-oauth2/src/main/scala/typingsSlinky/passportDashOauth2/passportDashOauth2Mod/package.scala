package typingsSlinky.passportDashOauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashOauth2Mod {
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type StateStoreStoreCallback = js.Function2[/* err */ js.Error | Null, /* state */ js.Any, Unit]
  type StateStoreVerifyCallback = js.Function3[/* err */ js.Error, /* ok */ Boolean, /* state */ js.Any, Unit]
  type Strategy = OAuth2Strategy
  type VerifyCallback = js.Function3[
    /* err */ js.UndefOr[js.Error | Null], 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    Unit
  ]
  type VerifyFunction = (js.Function4[
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* profile */ js.Any, 
    /* verified */ VerifyCallback, 
    Unit
  ]) | (js.Function5[
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* results */ js.Any, 
    /* profile */ js.Any, 
    /* verified */ VerifyCallback, 
    Unit
  ])
  type VerifyFunctionWithRequest = (js.Function5[
    /* req */ Request[ParamsDictionary], 
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* profile */ js.Any, 
    /* verified */ VerifyCallback, 
    Unit
  ]) | (js.Function6[
    /* req */ Request[ParamsDictionary], 
    /* accessToken */ String, 
    /* refreshToken */ String, 
    /* results */ js.Any, 
    /* profile */ js.Any, 
    /* verified */ VerifyCallback, 
    Unit
  ])
}
