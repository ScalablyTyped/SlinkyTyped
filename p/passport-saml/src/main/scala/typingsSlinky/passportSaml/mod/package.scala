package typingsSlinky.passportSaml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CertCallback = js.Function1[
    /* callback */ js.Function2[
      /* err */ js.Error | scala.Null, 
      /* cert */ js.UndefOr[java.lang.String | js.Array[java.lang.String]], 
      scala.Unit
    ], 
    scala.Unit
  ]
  
  type VerifiedCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  
  type VerifyWithRequest = js.Function3[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* profile */ typingsSlinky.passportSaml.mod.Profile, 
    /* done */ typingsSlinky.passportSaml.mod.VerifiedCallback, 
    scala.Unit
  ]
  
  type VerifyWithoutRequest = js.Function2[
    /* profile */ typingsSlinky.passportSaml.mod.Profile, 
    /* done */ typingsSlinky.passportSaml.mod.VerifiedCallback, 
    scala.Unit
  ]
}
