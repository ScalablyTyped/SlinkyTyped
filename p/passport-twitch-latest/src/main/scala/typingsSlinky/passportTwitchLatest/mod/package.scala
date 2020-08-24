package typingsSlinky.passportTwitchLatest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Optional[T, K /* <: /* keyof T */ java.lang.String */] = (typingsSlinky.std.Omit[T, K]) with typingsSlinky.std.Partial[T]
  type VerifyFunction = js.Function4[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* profile */ typingsSlinky.passportTwitchLatest.mod.TwitchProfile, 
    /* verified */ typingsSlinky.passportOauth2.mod.VerifyCallback, 
    scala.Unit
  ]
  type VerifyFunctionWithRequest = js.Function5[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* profile */ typingsSlinky.passportTwitchLatest.mod.TwitchProfile, 
    /* verified */ typingsSlinky.passportOauth2.mod.VerifyCallback, 
    scala.Unit
  ]
  type VerifyFunctionWithRequestResults = js.Function6[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* results */ js.Any, 
    /* profile */ typingsSlinky.passportTwitchLatest.mod.TwitchProfile, 
    /* verified */ typingsSlinky.passportOauth2.mod.VerifyCallback, 
    scala.Unit
  ]
  type VerifyFunctionWithResults = js.Function5[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* results */ js.Any, 
    /* profile */ typingsSlinky.passportTwitchLatest.mod.TwitchProfile, 
    /* verified */ typingsSlinky.passportOauth2.mod.VerifyCallback, 
    scala.Unit
  ]
}
