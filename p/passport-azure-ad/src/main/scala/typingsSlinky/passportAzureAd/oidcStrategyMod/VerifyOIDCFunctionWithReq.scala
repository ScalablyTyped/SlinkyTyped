package typingsSlinky.passportAzureAd.oidcStrategyMod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.passportAzureAd.commonMod.VerifyCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function3[
/ * req * / typingsSlinky.express.mod.Request_[
  typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
  js.Any, 
  js.Any, 
  typingsSlinky.expressServeStaticCore.mod.Query
], 
/ * profile * / typingsSlinky.passportAzureAd.oidcStrategyMod.IProfile, 
/ * done * / typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
scala.Unit]
  - js.Function4[
/ * req * / typingsSlinky.express.mod.Request_[
  typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
  js.Any, 
  js.Any, 
  typingsSlinky.expressServeStaticCore.mod.Query
], 
/ * iss * / java.lang.String, 
/ * sub * / java.lang.String, 
/ * done * / typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
scala.Unit]
  - js.Function5[
/ * req * / typingsSlinky.express.mod.Request_[
  typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
  js.Any, 
  js.Any, 
  typingsSlinky.expressServeStaticCore.mod.Query
], 
/ * iss * / java.lang.String, 
/ * sub * / java.lang.String, 
/ * profile * / typingsSlinky.passportAzureAd.oidcStrategyMod.IProfile, 
/ * done * / typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
scala.Unit]
  - js.Function7[
/ * req * / typingsSlinky.express.mod.Request_[
  typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
  js.Any, 
  js.Any, 
  typingsSlinky.expressServeStaticCore.mod.Query
], 
/ * iss * / java.lang.String, 
/ * sub * / java.lang.String, 
/ * profile * / typingsSlinky.passportAzureAd.oidcStrategyMod.IProfile, 
/ * access_token * / java.lang.String, 
/ * refresh_token * / java.lang.String, 
/ * done * / typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
scala.Unit]
  - js.Function8[
/ * req * / typingsSlinky.express.mod.Request_[
  typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
  js.Any, 
  js.Any, 
  typingsSlinky.expressServeStaticCore.mod.Query
], 
/ * iss * / java.lang.String, 
/ * sub * / java.lang.String, 
/ * profile * / typingsSlinky.passportAzureAd.oidcStrategyMod.IProfile, 
/ * access_token * / java.lang.String, 
/ * refresh_token * / java.lang.String, 
/ * params * / js.Any, 
/ * done * / typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
scala.Unit]
  - js.Function9[
/ * req * / typingsSlinky.express.mod.Request_[
  typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
  js.Any, 
  js.Any, 
  typingsSlinky.expressServeStaticCore.mod.Query
], 
/ * iss * / java.lang.String, 
/ * sub * / java.lang.String, 
/ * profile * / typingsSlinky.passportAzureAd.oidcStrategyMod.IProfile, 
/ * jwtClaims * / js.Any, 
/ * access_token * / java.lang.String, 
/ * refresh_token * / java.lang.String, 
/ * params * / js.Any, 
/ * done * / typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
scala.Unit]
*/
trait VerifyOIDCFunctionWithReq extends js.Object

object VerifyOIDCFunctionWithReq {
  @scala.inline
  implicit def apply(
    value: js.Function3[
      /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
      /* profile */ IProfile, 
      /* done */ VerifyCallback, 
      Unit
    ]
  ): VerifyOIDCFunctionWithReq = value.asInstanceOf[VerifyOIDCFunctionWithReq]
  @scala.inline
  implicit def apply(
    value: js.Function4[
      /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
      /* iss */ String, 
      /* sub */ String, 
      /* done */ VerifyCallback, 
      Unit
    ]
  ): VerifyOIDCFunctionWithReq = value.asInstanceOf[VerifyOIDCFunctionWithReq]
  @scala.inline
  implicit def apply(
    value: js.Function5[
      /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
      /* iss */ String, 
      /* sub */ String, 
      /* profile */ IProfile, 
      /* done */ VerifyCallback, 
      Unit
    ]
  ): VerifyOIDCFunctionWithReq = value.asInstanceOf[VerifyOIDCFunctionWithReq]
  @scala.inline
  implicit def apply(
    value: js.Function7[
      /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
      /* iss */ String, 
      /* sub */ String, 
      /* profile */ IProfile, 
      /* access_token */ String, 
      /* refresh_token */ String, 
      /* done */ VerifyCallback, 
      Unit
    ]
  ): VerifyOIDCFunctionWithReq = value.asInstanceOf[VerifyOIDCFunctionWithReq]
  @scala.inline
  implicit def apply(
    value: js.Function8[
      /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
      /* iss */ String, 
      /* sub */ String, 
      /* profile */ IProfile, 
      /* access_token */ String, 
      /* refresh_token */ String, 
      /* params */ js.Any, 
      /* done */ VerifyCallback, 
      Unit
    ]
  ): VerifyOIDCFunctionWithReq = value.asInstanceOf[VerifyOIDCFunctionWithReq]
  @scala.inline
  implicit def apply(
    value: js.Function9[
      /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
      /* iss */ String, 
      /* sub */ String, 
      /* profile */ IProfile, 
      /* jwtClaims */ js.Any, 
      /* access_token */ String, 
      /* refresh_token */ String, 
      /* params */ js.Any, 
      /* done */ VerifyCallback, 
      Unit
    ]
  ): VerifyOIDCFunctionWithReq = value.asInstanceOf[VerifyOIDCFunctionWithReq]
}

