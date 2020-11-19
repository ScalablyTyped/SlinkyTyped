package typingsSlinky.passportHttpBearer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type VerifyFunction = js.Function2[
    /* token */ java.lang.String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[typingsSlinky.passportHttpBearer.mod.IVerifyOptions | java.lang.String], 
      scala.Unit
    ], 
    scala.Unit
  ]
  
  type VerifyFunctionWithRequest = js.Function3[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* token */ java.lang.String, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[typingsSlinky.passportHttpBearer.mod.IVerifyOptions | java.lang.String], 
      scala.Unit
    ], 
    scala.Unit
  ]
}
