package typingsSlinky.hapiAuthBasic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Validate = js.Function4[
    /* request */ typingsSlinky.hapi.mod.Request, 
    /* username */ java.lang.String, 
    /* password */ java.lang.String, 
    /* h */ typingsSlinky.hapi.mod.ResponseToolkit, 
    js.Promise[
      typingsSlinky.hapiAuthBasic.mod.ValidateResponse | typingsSlinky.hapiAuthBasic.mod.ValidateCustomResponse
    ]
  ]
}
