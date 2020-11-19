package typingsSlinky.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object expressMod {
  
  type ExpressHandler = js.Function2[
    /* request */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* response */ typingsSlinky.express.mod.Response_[js.Any], 
    scala.Unit
  ]
}
