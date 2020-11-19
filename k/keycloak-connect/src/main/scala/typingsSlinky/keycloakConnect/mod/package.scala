package typingsSlinky.keycloakConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type SpecHandler = js.Function3[
    /* token */ typingsSlinky.keycloakConnect.mod.Token, 
    /* request */ typingsSlinky.express.mod.Request_[
      typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typingsSlinky.expressServeStaticCore.mod.Query
    ], 
    /* response */ typingsSlinky.express.mod.Response_[js.Any], 
    scala.Boolean
  ]
}
