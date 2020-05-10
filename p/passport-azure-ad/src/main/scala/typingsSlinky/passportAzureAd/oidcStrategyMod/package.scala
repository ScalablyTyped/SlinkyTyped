package typingsSlinky.passportAzureAd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oidcStrategyMod {
  type VerifyOIDCFunction = (js.Function2[
    /* profile */ typingsSlinky.passportAzureAd.oidcStrategyMod.IProfile, 
    /* done */ typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function3[
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* done */ typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function4[
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typingsSlinky.passportAzureAd.oidcStrategyMod.IProfile, 
    /* done */ typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function6[
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typingsSlinky.passportAzureAd.oidcStrategyMod.IProfile, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* done */ typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function7[
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typingsSlinky.passportAzureAd.oidcStrategyMod.IProfile, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* params */ js.Any, 
    /* done */ typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function8[
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typingsSlinky.passportAzureAd.oidcStrategyMod.IProfile, 
    /* jwtClaims */ js.Any, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* params */ js.Any, 
    /* done */ typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ])
  type VerifyOIDCFunctionWithReq = (js.Function3[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* profile */ typingsSlinky.passportAzureAd.oidcStrategyMod.IProfile, 
    /* done */ typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function4[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* done */ typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function5[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typingsSlinky.passportAzureAd.oidcStrategyMod.IProfile, 
    /* done */ typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function7[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typingsSlinky.passportAzureAd.oidcStrategyMod.IProfile, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* done */ typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function8[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typingsSlinky.passportAzureAd.oidcStrategyMod.IProfile, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* params */ js.Any, 
    /* done */ typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function9[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typingsSlinky.passportAzureAd.oidcStrategyMod.IProfile, 
    /* jwtClaims */ js.Any, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* params */ js.Any, 
    /* done */ typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ])
}
