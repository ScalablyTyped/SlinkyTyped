package typingsSlinky.passportGoogleOauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type VerifyCallback = js.Function3[
    /* error */ js.Any, 
    /* user */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[typingsSlinky.passportGoogleOauth2.mod.VerifyOptions], 
    scala.Unit
  ]
  type VerifyFunction = js.Function4[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* profile */ js.Any, 
    /* done */ typingsSlinky.passportGoogleOauth2.mod.VerifyCallback, 
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
    /* profile */ js.Any, 
    /* done */ typingsSlinky.passportGoogleOauth2.mod.VerifyCallback, 
    scala.Unit
  ]
  type VerifyFunctionWithRequestAndParams = js.Function6[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* params */ typingsSlinky.passportGoogleOauth2.anon.Accesstoken, 
    /* profile */ js.Any, 
    /* done */ typingsSlinky.passportGoogleOauth2.mod.VerifyCallback, 
    scala.Unit
  ]
}
