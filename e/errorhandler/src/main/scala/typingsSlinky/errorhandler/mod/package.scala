package typingsSlinky.errorhandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type LoggingCallback = js.Function4[
    /* err */ js.Error, 
    /* str */ java.lang.String, 
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* res */ typingsSlinky.express.mod.Response_[js.Any], 
    scala.Unit
  ]
}
