package typingsSlinky.expressBunyanLogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type FormatFunction = js.Function1[/* meta */ js.Any, java.lang.String]
  
  type IncludesFunction = js.Function2[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* res */ typingsSlinky.express.mod.Response_[js.Any], 
    js.Any
  ]
  
  type LevelFunction = js.Function3[
    /* status */ scala.Double, 
    /* err */ js.Error | scala.Null, 
    /* meta */ js.Any, 
    java.lang.String
  ]
  
  type RequestIdGenFunction = js.Function1[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    java.lang.String
  ]
}
