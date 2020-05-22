package typingsSlinky.openidClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomHttpOptionsProvider = js.Function1[
    /* options */ typingsSlinky.openidClient.mod.HttpOptions, 
    typingsSlinky.openidClient.mod.HttpOptions
  ]
  type HttpOptions = typingsSlinky.got.mod.GotOptions[java.lang.String | scala.Null]
  type RetryFunction = js.Function2[/* retry */ scala.Double, /* error */ js.Error, scala.Double]
  type StrategyVerifyCallback[TUser] = js.Function2[
    /* tokenset */ typingsSlinky.openidClient.mod.TokenSet, 
    /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], scala.Unit], 
    scala.Unit
  ]
  type StrategyVerifyCallbackReq[TUser] = js.Function3[
    /* req */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* tokenset */ typingsSlinky.openidClient.mod.TokenSet, 
    /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], scala.Unit], 
    scala.Unit
  ]
  type StrategyVerifyCallbackReqUserInfo[TUser] = js.Function4[
    /* req */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* tokenset */ typingsSlinky.openidClient.mod.TokenSet, 
    /* userinfo */ typingsSlinky.openidClient.mod.UserinfoResponse, 
    /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], scala.Unit], 
    scala.Unit
  ]
  type StrategyVerifyCallbackUserInfo[TUser] = js.Function3[
    /* tokenset */ typingsSlinky.openidClient.mod.TokenSet, 
    /* userinfo */ typingsSlinky.openidClient.mod.UserinfoResponse, 
    /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], scala.Unit], 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.openidClient.openidClientStrings.access_token
    - typingsSlinky.openidClient.openidClientStrings.refresh_token
    - java.lang.String
  */
  type TokenTypeHint = typingsSlinky.openidClient.mod._TokenTypeHint | java.lang.String
}
