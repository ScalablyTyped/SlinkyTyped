package typingsSlinky.atHapiBasic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiBasicMod {
  import typingsSlinky.atHapiHapi.atHapiHapiMod.Request
  import typingsSlinky.atHapiHapi.atHapiHapiMod.ResponseToolkit

  type Validate = js.Function4[
    /* request */ Request, 
    /* username */ String, 
    /* password */ String, 
    /* h */ ResponseToolkit, 
    js.Promise[ValidateResponse | ValidateCustomResponse]
  ]
}
