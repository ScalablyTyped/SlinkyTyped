package typingsSlinky.easyXHeaders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressMod {
  type Errback = js.Function1[/* err */ js.Error, scala.Unit]
  type ErrorRequestHandler = js.Function4[
    /* err */ js.Any, 
    /* req */ typingsSlinky.easyXHeaders.expressMod.Request, 
    /* res */ typingsSlinky.easyXHeaders.expressMod.Response, 
    /* next */ js.Function, 
    js.Any
  ]
  type Handler = typingsSlinky.easyXHeaders.expressMod.RequestHandler
  type RequestHandler = js.Function3[
    /* req */ typingsSlinky.easyXHeaders.expressMod.Request, 
    /* res */ typingsSlinky.easyXHeaders.expressMod.Response, 
    /* next */ js.Function, 
    js.Any
  ]
  type RequestParamHandler = js.Function4[
    /* req */ typingsSlinky.easyXHeaders.expressMod.Request, 
    /* res */ typingsSlinky.easyXHeaders.expressMod.Response, 
    /* next */ js.Function, 
    /* param */ js.Any, 
    js.Any
  ]
}
