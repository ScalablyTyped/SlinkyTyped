package typingsSlinky.passportLocal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type VerifyFunction = js.Function3[
    /* username */ java.lang.String, 
    /* password */ java.lang.String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[typingsSlinky.passportLocal.mod.IVerifyOptions], 
      scala.Unit
    ], 
    scala.Unit
  ]
  
  type VerifyFunctionWithRequest = js.Function4[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* username */ java.lang.String, 
    /* password */ java.lang.String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[typingsSlinky.passportLocal.mod.IVerifyOptions], 
      scala.Unit
    ], 
    scala.Unit
  ]
}
