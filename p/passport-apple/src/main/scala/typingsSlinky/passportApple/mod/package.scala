package typingsSlinky.passportApple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AppleAuthorizationParams = js.Object with typingsSlinky.passportApple.anon.Responsemode
  type Profile = org.scalablytyped.runtime.StringDictionary[js.Any]
  type VerifyCallback = js.Function3[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  type VerifyFunction = js.Function5[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* decodedIdToken */ typingsSlinky.passportApple.mod.DecodedIdToken, 
    /* profile */ typingsSlinky.passportApple.mod.Profile, 
    /* verified */ typingsSlinky.passportApple.mod.VerifyCallback, 
    scala.Unit
  ]
  type VerifyFunctionWithRequest = js.Function6[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* decodedIdToken */ typingsSlinky.passportApple.mod.DecodedIdToken, 
    /* profile */ typingsSlinky.passportApple.mod.Profile, 
    /* verified */ typingsSlinky.passportApple.mod.VerifyCallback, 
    scala.Unit
  ]
}
