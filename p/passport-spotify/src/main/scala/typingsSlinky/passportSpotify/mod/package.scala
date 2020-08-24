package typingsSlinky.passportSpotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type VerifyCallback = js.Function3[
    /* error */ js.UndefOr[js.Error | scala.Null], 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  type VerifyFunction = js.Function5[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* profile */ typingsSlinky.passportSpotify.mod.Profile, 
    /* done */ typingsSlinky.passportSpotify.mod.VerifyCallback, 
    /* expires_in */ js.UndefOr[scala.Double], 
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
    /* profile */ typingsSlinky.passportSpotify.mod.Profile, 
    /* done */ typingsSlinky.passportSpotify.mod.VerifyCallback, 
    /* expires_in */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
}
