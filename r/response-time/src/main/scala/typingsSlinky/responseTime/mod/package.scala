package typingsSlinky.responseTime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ResponseTimeFunction = js.Function3[
    /* request */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* response */ typingsSlinky.node.httpMod.ServerResponse, 
    /* time */ scala.Double, 
    js.Any
  ]
}
