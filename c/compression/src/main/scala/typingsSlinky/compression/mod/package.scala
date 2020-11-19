package typingsSlinky.compression

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * A function to decide if the response should be considered for compression.
    */
  type CompressionFilter = js.Function2[
    /* req */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* res */ typingsSlinky.express.mod.Response_[js.Any], 
    scala.Boolean
  ]
}
