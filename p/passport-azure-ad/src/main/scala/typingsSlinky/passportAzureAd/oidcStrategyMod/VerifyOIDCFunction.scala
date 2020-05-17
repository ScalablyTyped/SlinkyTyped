package typingsSlinky.passportAzureAd.oidcStrategyMod

import typingsSlinky.passportAzureAd.commonMod.VerifyCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function2[
/ * profile * / typingsSlinky.passportAzureAd.oidcStrategyMod.IProfile, 
/ * done * / typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
scala.Unit]
  - js.Function3[
/ * iss * / java.lang.String, 
/ * sub * / java.lang.String, 
/ * done * / typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
scala.Unit]
  - js.Function4[
/ * iss * / java.lang.String, 
/ * sub * / java.lang.String, 
/ * profile * / typingsSlinky.passportAzureAd.oidcStrategyMod.IProfile, 
/ * done * / typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
scala.Unit]
  - js.Function6[
/ * iss * / java.lang.String, 
/ * sub * / java.lang.String, 
/ * profile * / typingsSlinky.passportAzureAd.oidcStrategyMod.IProfile, 
/ * access_token * / java.lang.String, 
/ * refresh_token * / java.lang.String, 
/ * done * / typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
scala.Unit]
  - js.Function7[
/ * iss * / java.lang.String, 
/ * sub * / java.lang.String, 
/ * profile * / typingsSlinky.passportAzureAd.oidcStrategyMod.IProfile, 
/ * access_token * / java.lang.String, 
/ * refresh_token * / java.lang.String, 
/ * params * / js.Any, 
/ * done * / typingsSlinky.passportAzureAd.commonMod.VerifyCallback, 
scala.Unit]
  - js.Function8[
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
trait VerifyOIDCFunction extends js.Object

object VerifyOIDCFunction {
  @scala.inline
  implicit def apply(value: js.Function2[/* profile */ IProfile, /* done */ VerifyCallback, Unit]): VerifyOIDCFunction = value.asInstanceOf[VerifyOIDCFunction]
  @scala.inline
  implicit def apply(value: js.Function3[/* iss */ String, /* sub */ String, /* done */ VerifyCallback, Unit]): VerifyOIDCFunction = value.asInstanceOf[VerifyOIDCFunction]
  @scala.inline
  implicit def apply(
    value: js.Function4[
      /* iss */ String, 
      /* sub */ String, 
      /* profile */ IProfile, 
      /* done */ VerifyCallback, 
      Unit
    ]
  ): VerifyOIDCFunction = value.asInstanceOf[VerifyOIDCFunction]
  @scala.inline
  implicit def apply(
    value: js.Function6[
      /* iss */ String, 
      /* sub */ String, 
      /* profile */ IProfile, 
      /* access_token */ String, 
      /* refresh_token */ String, 
      /* done */ VerifyCallback, 
      Unit
    ]
  ): VerifyOIDCFunction = value.asInstanceOf[VerifyOIDCFunction]
  @scala.inline
  implicit def apply(
    value: js.Function7[
      /* iss */ String, 
      /* sub */ String, 
      /* profile */ IProfile, 
      /* access_token */ String, 
      /* refresh_token */ String, 
      /* params */ js.Any, 
      /* done */ VerifyCallback, 
      Unit
    ]
  ): VerifyOIDCFunction = value.asInstanceOf[VerifyOIDCFunction]
  @scala.inline
  implicit def apply(
    value: js.Function8[
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
  ): VerifyOIDCFunction = value.asInstanceOf[VerifyOIDCFunction]
}

