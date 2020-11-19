package typingsSlinky.hapiAuthBearerToken

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Validate = js.Function3[
    /* request */ typingsSlinky.hapiHapi.mod.Request, 
    /* token */ java.lang.String, 
    /* h */ typingsSlinky.hapiHapi.mod.ResponseToolkit, 
    js.Promise[typingsSlinky.hapiAuthBearerToken.mod.ValidateReturn] | typingsSlinky.hapiAuthBearerToken.mod.ValidateReturn
  ]
}
