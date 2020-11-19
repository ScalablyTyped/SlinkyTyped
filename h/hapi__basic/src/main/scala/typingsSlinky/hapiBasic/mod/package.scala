package typingsSlinky.hapiBasic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Validate = js.Function4[
    /* request */ typingsSlinky.hapiHapi.mod.Request, 
    /* username */ java.lang.String, 
    /* password */ java.lang.String, 
    /* h */ typingsSlinky.hapiHapi.mod.ResponseToolkit, 
    js.Promise[
      typingsSlinky.hapiBasic.mod.ValidateResponse | typingsSlinky.hapiBasic.mod.ValidateCustomResponse
    ]
  ]
}
