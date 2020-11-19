package typingsSlinky.passportAuth0

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type VerifyFunction = js.Function5[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* extraParams */ typingsSlinky.passportAuth0.mod.ExtraVerificationParams, 
    /* profile */ typingsSlinky.passportAuth0.mod.Profile, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[js.Any], 
      scala.Unit
    ], 
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
    /* extraParams */ typingsSlinky.passportAuth0.mod.ExtraVerificationParams, 
    /* profile */ typingsSlinky.passportAuth0.mod.Profile, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[js.Any], 
      scala.Unit
    ], 
    scala.Unit
  ]
}
