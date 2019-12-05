package typingsSlinky.hapiDashAuthDashBasic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hapiDashAuthDashBasicMod {
  import typingsSlinky.hapi.hapiMod.Request
  import typingsSlinky.hapi.hapiMod.ResponseToolkit

  type Validate = js.Function4[
    /* request */ Request, 
    /* username */ String, 
    /* password */ String, 
    /* h */ ResponseToolkit, 
    js.Promise[ValidateResponse | ValidateCustomResponse]
  ]
}
