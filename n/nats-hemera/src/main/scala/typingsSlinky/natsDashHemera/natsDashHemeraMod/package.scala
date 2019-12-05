package typingsSlinky.natsDashHemera

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object natsDashHemeraMod {
  type ActHandler = js.ThisFunction2[
    /* this */ Hemera[ClientRequest, ClientResponse], 
    /* error */ js.Error, 
    /* response */ ClientResult, 
    Unit
  ]
  type ClientResult = js.Any
  type NoContext = Null
  type NodeCallback = js.Function2[/* error */ js.UndefOr[js.Error | Null], /* success */ js.UndefOr[js.Any], Unit]
  type Plugin = js.Function
  type Request = Null
  type Response = Null
}
